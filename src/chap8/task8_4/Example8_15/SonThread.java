package chap8.task8_4.Example8_15;

//定义一个儿子线程SonThread
public class SonThread  implements Runnable {
	public void run() {
		String tabs="\t\t\t";
		System.out.println(tabs+"儿子出门去买烟");
		System.out.println(tabs+"儿子买烟需要3分钟");
		try {
			for (int i = 0; i < 3;) {
				Thread.sleep(500);
				System.out.println(tabs+"儿子出去第" + ++i + "分钟");
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(tabs+"儿子买烟回来了");
	}
}