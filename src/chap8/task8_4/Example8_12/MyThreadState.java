package chap8.task8_4.Example8_12;

/**
 * 例8-12 线程状态转变示例
 * 新建-就绪-死亡-阻塞
 */

public class MyThreadState  implements Runnable {

	//1 在run()方法中定义线程
	public void run() {
		System.out.println("MyThread  start!");
		for(int i=0;i<5;i++){
			System.out.println("invoke MyThread run method");
		}
	}

	public static void main(String[] args) {
		//2 实例化线程对象
		Thread thread = new Thread(new MyThreadState());	// 新生状态
		//3 新建
		System.out.println("MyThread create!");
		thread.start();		// 就绪状态，获得CPU后就能运行

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//4 死亡停止 方法已经过期
		thread.stop();		// 死亡状态
		System.out.println("MyThread stop!");
	}
}
