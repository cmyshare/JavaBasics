package chap8.task8_4.Example8_10;

/**
 * 例8-10 应用继承Thread类创建线程
 */

public class MyThread extends Thread {
	//重写run()方法 定义创建
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("invoke MyThread "+i+ " run method");
			try {
				//线程休眠时间间隔
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {  // main方法测试线程的创建与启动
		// 实例化MyThread的对象 继承了Thread 直接new对象MyThread
		MyThread myThread = new MyThread();
		myThread.start();	// 调用myThread对象的start方法启动一个线程
	}
}
