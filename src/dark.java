import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class dark {
    public static void main(String[] args) {
        ExecutorService full = Executors.newFixedThreadPool(10); // Создаём пул потоков с
        // фиксированным количеством потоков
        for(int i=0;i<10;i++){ // заполнение массива
            Runnable count = new Parallel(i*1000, (i+1)*1000); // создание объекта
            full.execute(count);
        }
        full.shutdown();
        try{
            if(!full.awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS)){
                full.shutdownNow();
            }
        } catch (Exception e){
            e.printStackTrace();
            full.shutdownNow();
        }
        int min = Parallel.minArray[0];
        int max = Parallel.maxArray[0];
        for(int i=0;i<10;i++){
            if(Parallel.minArray[i]<min) {
                min = Parallel.minArray[i];
            }
            if(Parallel.maxArray[i]>max){
                max = Parallel.maxArray[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}

class Parallel implements Runnable {
    static public int[] map = new int[10000]; // создание массива
    static public int[] minArray = new int[10];
    static public int[] maxArray = new int[10];
    int bandMin = 0; // минимальный диапазон
    int bandMax = 10; // максимальный диапазон
    int min; // минимальное значение массива
    int max; // максимальное значение массива
    static int count = 0;

    Parallel(int bandMin, int bandMax) {
        this.bandMin = bandMin;
        this.bandMax = bandMax;
    }

    static{ // запускается один раз, запускается до использования статичных данных, запускается джавой автоматически
        for(int i=0;i<10000;i++){
            map[i] = i+1;
        }
    }

    @Override
    public void run() {
        min = map[bandMin];
        max = map[bandMin];
        for (int i = bandMin; i < bandMax; i++) {
            if (map[i] > max) {
                max = map[i];
            }
            if (map[i] < min) {
                min = map[i];
            }
        }
        synchronized (this){
            minArray[count] = min;
            maxArray[count] = max;
            count++;
        }
    }
}
