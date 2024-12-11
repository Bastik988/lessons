import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class poolThread {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i=0;i<5;i++){
            Runnable worker = new Worker();
            executor.execute(worker);
        }
        executor.shutdown();
        try{
            if(!executor.awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS)){
                executor.shutdownNow();
            }
        } catch (Exception e){
            e.printStackTrace();
            executor.shutdownNow();
        }
    }
}

class Worker implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}