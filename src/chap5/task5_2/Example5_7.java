package chap5.task5_2;

import java.util.EmptyStackException;
import java.util.Stack;
//例题5_7 向堆栈Stack中添加元素并弹出

public class Example5_7 {
	public static void main(String[] args) {
		Stack stack1 = new Stack();// 构造一个空堆栈stack1
		try {
			stack1.push(new Integer(0)); //堆栈底
			stack1.push(new Integer(1));
			stack1.push(new Integer(2));
			stack1.push(new Integer(3));
			stack1.push(new Integer(4)); //堆栈顶

			System.out.print((Integer) stack1.pop()+"\n"); //默认输出时，末尾是没有换行符的。
			System.out.print("  "+(Integer) stack1.pop());
			System.out.print("  "+(Integer) stack1.pop());
			System.out.print("  "+(Integer) stack1.pop());
			System.out.print("  "+(Integer) stack1.pop()); //pop返回栈顶元素并删除

			System.out.print(stack1.empty()); //peek只返回栈顶元素,在堆栈为空时，抛出异常。

		} catch (EmptyStackException e) {
			e.printStackTrace();
		}
	}
}