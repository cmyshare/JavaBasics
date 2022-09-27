package chap5.task5_2;

import java.util.*;

/**
 * 例题5_4运用LinkedList 链接列表 模拟栈结构(Stack)
 * 插入、删除的一端为栈顶Top。另一端为栈底Bottom。栈为后进先出的线性表-LIFO表。
 */

public class Example5_4 {
	// 创建LinkedList对象 private私有作用域，只能在本类中有效。
	private LinkedList list = new LinkedList();

	// 入栈 每加一个之前，整体往右移动一个位置
	public void push(Object o) {
		list.addFirst(o);
	}

	// 出栈 栈顶为开头元素
	public Object pop() {
		return list.removeFirst();
	}

	// 获取栈顶元素
	public Object peek() {
		return list.getFirst();
	}

	// 栈是否为空
	public boolean empty() {
		return list.isEmpty();
	}

	public static void main(String[] args) {
		//因为方法不是类方法，所以要实例化后，才能被使用
		Example5_4 stack = new Example5_4();

		// 入栈
		stack.push("王小二"); //第1个进栈，作为栈底。
		stack.push("张小三");
		stack.push("李小四"); //最后1个进栈，作为栈顶。

		// 出栈
		System.out.println("出栈元素：" + stack.pop());

		// 显示栈顶元素
		System.out.println("栈顶元素：" + stack.peek());

		// 出栈
		System.out.println("出栈元素：" + stack.pop());

		// 显示栈顶元素
		System.out.println("栈顶元素：" + stack.peek());

		System.out.println("栈是否为空：" + stack.empty());
	}
}