public class potok {
    public static void main(String[] args) {
        int pim = 0;
//        MyThread1 rom = new MyThread1(0, 2500000);
//        MyThread1 roim = new MyThread1(2500000, 5000000);
//        MyThread1 rom2 = new MyThread1(5000000, 7500000);
//        MyThread1 rom3 = new MyThread1(7500000, 10000000);
        long time = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            pim += MyThread1.map[i];
        }
//        rom.start();
//        roim.start();
//        rom2.start();
//        rom3.start();
//
//        try {
//            rom.join();
//            roim.join();
//            rom2.join();
//            rom3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(MyThread1.result);
        System.out.println(System.currentTimeMillis() - time);
    }
}
class MyThread1 extends Thread{
    int index = 0;
    static int result = 0;
    int max = 100;
    static int[] map = new int[10000000];
    static {
        for (int k = 0; k < map.length; k++) {
            map[k] = 1;
        }
    }
    MyThread1(int index, int max){
        this.index = index;
        this.max = max;
    }
    @Override
    public void run(){
//        System.out.println(super.getName());
//            for (int i = 0; i < 10; i++) {
//                for (; index < max; index++) {
//                    synchronized (this) {
//                        result = map[index] + map[index + 1];
//                    }
//                    max = max + 100;
//                    index = index + 100;
//                }
        int mop = 0;

        for(int i=index;i<max;i++){
            mop += map[i];
        }
        synchronized (this){
            result += mop;
        }
    }
}