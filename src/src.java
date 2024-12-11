import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class src {
    public static void main(String[] args) {
        MyClass pom = new MyClass();
        MyThread t1 = new MyThread(pom);
        MyThread2 t2 = new MyThread2(pom);
        t1.start();
        t2.start();
//        int k = 0;
//        System.out.println(k++);
//        MyThread[] pom = new MyThread[100];
//        for(int i=0;i<pom.length;i++){
//            pom[i] = new MyThread();
//        }
//        for(MyThread pim: pom) {
//            pim.start();
//        }
//        try {
//            for(MyThread pam: pom){
//                pam.join();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(MyThread.rar);
    }
}

class Counter {
    private int count = 0;
    private final Lock lock = new ReentrantLock();  // создаем объект Lock

    public void increment() {
        lock.lock();  // захватываем блокировку
        try {
            count++;
            System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
        } finally {
            lock.unlock();  // обязательно освобождаем блокировку в блоке finally
        }
    }

    public int getCount() {
        return count;
    }
}
class MyThread2 extends Thread{
    MyClass a;
    Object loc1 = new Object();
    Object loc2 = new Object();

    public MyThread2(MyClass a) {
        this.a = a;
    }

    @Override
    public void run(){
        a.method1();
    }
}

class MyThread extends Thread{
    MyClass a;
    Object loc1 = new Object();
    Object loc2 = new Object();

    public MyThread(MyClass a) {
        this.a = a;
    }

    @Override
    public void run(){
//        System.out.println(super.getName());
//         synchronized (this){
//            for(int i=0;i<1000;i++){
//                rar++;
//            }
        //}
        a.method2();
    }

    public void method1(){
        synchronized (loc1){
            System.out.println("Метод1");
        }
    }
    public void method2(){
        synchronized (loc2){
            System.out.println("Метод2");
        }
    }

    public void method3(){
        synchronized (loc2){
            System.out.println("Метод2");
        }
    }
    static int rar = 0;
}

class MyClass {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();
    private final Lock lock = new ReentrantLock();  // создаем объект Lock
    private final Lock lock3 = new ReentrantLock();  // создаем объект Lock

    public void method1() {
        synchronized (lock1) {
                System.out.println("Method 1 locked lock1");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
            synchronized (lock2) {
                System.out.println("Method 1 locked lock2");
            }
        }
    }

    public void method2() {
        synchronized (lock2) {
            System.out.println("Method 2 locked lock2");
            try { Thread.sleep(50); } catch (InterruptedException e) {}
            synchronized (lock1) {
                System.out.println("Method 2 locked lock1");
            }
        }
    }
}
