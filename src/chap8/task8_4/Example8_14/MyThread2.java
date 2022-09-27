package chap8.task8_4.Example8_14;

//定义一个线程 run方法中为执行内容

public class MyThread2 implements Runnable {
	private String name;
	MyThread2(String s) {
		this.name = s;
	}
	public void run() {
		for (int i = 1; i <= 6; i++) {
			System.out.println(name + ": " + i);
			if (i % 2 == 0) {
				//阻塞状态 让出CPU使用权、运行态变成就绪态，让给下个线程
				Thread.yield();
			}
		}
	}
}
