package chap8.task8_4.Example8_13;

/**
 * 例8-13 线程强制销毁示例
 * 因为Thread的stop、destory已经过时，可以用新的方法：
 * 1 在run方法中执行return线程-结束
 * 2 在while条件中设置一个标志位，等于false循环结束，线程也就结束
 */

public class MyRunable2 implements Runnable {

	private boolean isStop; //线程是否停止的标志位

	public void run() {
		System.out.println("Thread run!");
		//判断isStop是否为true
		while (!isStop){
			System.out.println("invoke MyRunable run method");
			try {
				//每次循环休眠 500毫秒
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void stop(){		//终止线程
		isStop=true;
		System.out.println("Thread stop!");
	}

	public static void main(String[] args) {
		//实例化线程对象
		MyRunable2 myRunable=new MyRunable2();
		Thread thread = new Thread(myRunable);
		//启动线程
		System.out.println("Thread create!");
		thread.start();

		//线程 休眠5秒后 结束
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}

		myRunable.stop();	//正确的停止线程的方法
	}
}