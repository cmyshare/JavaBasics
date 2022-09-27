package chap5.task5_2;

import java.util.LinkedList;

/**
 * 例题5_6 运用LinkedList模拟队列结构(Queue)
 * 队列只允许在一端插入-队尾Rear，而在另一端删除-对头Front的运算受限的线性表。队列为先进先出-FIFO表。
 */
public class Example5_5 {
	// 创建LinkedList对象 私有
	private LinkedList list = new LinkedList();

	// 入队 每加一个之前，整体往左移动一个位置
	public void put(Object o) {
		list.addLast(o);
	}

	// 出队：使用removeFirst()方法，返回队列中第一个数据，然后将它从队列中删除
	public Object get() {
		return list.removeFirst();
	}

	// 队列是否为空
	public boolean empty() {
		return list.isEmpty();
	}

	public static void main(String[] args) {

		Example5_5 queue = new Example5_5();
		// 入队
		queue.put("王小二"); //第一个入队列，为队头
		queue.put("张小三");
		queue.put("李小四"); //最后一个入队列，为队尾

		// 出队
		System.out.println("出队元素：" + queue.get());
		System.out.println("出队元素：" + queue.get());
		System.out.println("出队元素：" + queue.get());

		// 判断队列是否为空
		System.out.println("队列是否为空：" + queue.empty());
	}
}