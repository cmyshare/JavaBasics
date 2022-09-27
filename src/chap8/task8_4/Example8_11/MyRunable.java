package chap8.task8_4.Example8_11;

/**
 * 例8-11 通过Runable接口实现多线程 定义MyRunable类实现Runnable接口,并实现接口中的run方法。
 */

public class MyRunable implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("invoke MyThread "+i+ " run method");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {	// main方法测试线程的创建与启动
		// 建立MyRunable类的对象，以此对象为参数建立Thread类的对象
		// 采用接口更灵活， 实现多个接口
		Thread thread = new Thread(new MyRunable());
		thread.start();	// 调用thread对象的start方法启动一个线程
	}
}
