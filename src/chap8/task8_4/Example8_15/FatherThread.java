package chap8.task8_4.Example8_15;

//定义一个父亲线程FatherThread
public class FatherThread  implements Runnable {
	public void run() {
		System.out.println("爸爸想抽烟，发现烟抽完了");
		System.out.println("爸爸让儿子去买包红塔山");

		//实例化线程对象 并启动son线程
		Thread son = new Thread(new SonThread());
		son.start();

		System.out.println("爸爸等儿子买烟回来");
		try {
			//join含义：等待son线程执行完毕，father线程才继续执行
			son.join();
		}
		catch (InterruptedException e) {
			System.out.println("爸爸出门去找儿子跑哪去了");
			System.exit(1);
		}
		System.out.println("爸爸高兴的接过烟开始抽，并把零钱给了儿子");
	}
}
