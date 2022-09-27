package chap8.task8_4.Example8_15;

/**
 * 例题8-15 线程join方法示例 A.join()执行后，再执行其他线程
 * 注意：多线程中run()方法中对文件读写 避免发生冲突互斥 采用互斥锁的机制
 */

public class JoinTest {
	public static void main(String[] args) {
		System.out.println("爸爸和儿子的故事");
		//实例化线程对象 并启动父亲线程
		//加入son.join()，子执行后 父才执行
		Thread father = new Thread(new FatherThread());
		father.start();
	}
}
