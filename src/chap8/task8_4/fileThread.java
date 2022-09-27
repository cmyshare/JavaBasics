package chap8.task8_4;

/**
 * @author cmy
 * @version 1.0
 * @date 2022/3/31 17:31
 * @description 多线程文件读写 避免发生冲突互斥 采用互斥锁的机制
 *
 */

/**
 * 没加锁前 两个线程同步实现count自增。正确count值为2000，但线程冲突，就会小于2000
 */
//public class fileThread {
//    public static void main(String[] args) throws Exception {
//        Thread aThread = new thread1();
//        Thread bThread = new thread2();
//        aThread.start();
//        bThread.start();
//        aThread.join();
//        bThread.join();
//        System.out.println(num.count);
//    }
//}
//
//class num {
//    public static int count = 0;
//}
//
//class thread1 extends Thread{
//    @Override
//    public void run() {
//        for(int i = 0;i<1000;i++) {
//            num.count ++;
//        }
//        System.out.println("thread1 over!");
//    }
//}
//
//class thread2 extends Thread{
//    @Override
//    public void run() {
//        for(int i = 0;i<1000;i++) {
//            num.count ++;
//        }
//        System.out.println("thread2 over!");
//    }
//}

/**
 * 加锁后
 * synchronized 控制多个并发线程的访问 多线程访问冲突的解决方式 实现同步
 * 表示用Counter.lock实例作为锁，两个线程在执行各自的synchronized(lock)代码块时，
 * 必须先获得锁，才能进入代码块进行。执行结束后，在synchronized语句块结束会自动释放锁。
 * 这样一来，对count变量进行读写就不可能同时进行。
 */
public class fileThread {
    public static void main(String[] args) throws Exception {
        Thread aThread = new thread1();
        Thread bThread = new thread2();
        aThread.start();
        bThread.start();
        aThread.join();
        bThread.join();
        System.out.println(num.count);
    }
}

//需要被同步的代码、共享数据、同步监视器锁(任何一个类的对象可当锁，要求多个线程必须共用一个锁)
class num {
    public static final Object lock = new Object();
    public static int count = 0;
}

class thread1 extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<1000;i++)
            synchronized (num.lock) {   //注意加锁对象必须是同一个实例
                num.count ++;
            }
        System.out.println("thread1 over!");
    }
}

class thread2 extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<1000;i++)
            synchronized (num.lock) {    //注意加锁对象必须是同一个实例
                num.count ++;
            }
        System.out.println("thread2 over!");
    }
}
