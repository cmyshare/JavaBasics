package chap8.task8_4.Example8_14;

/**
 * 例8-14 线程yield方法示例
 * 让出CPU资源给其他线程或程序运行
 */

public class YieldTest {
	public static void main(String[] args) {
		//构造2个线程对象
		Runnable r1 = new MyThread2("S1");
		Runnable r2 = new MyThread2("S2");
		//实例化线程对象 并启动
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

		//休眠2毫秒时间 打印输出的内容
		try {
			Thread.sleep(2);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
 		System.out.println("main method over!");
	}
}

