package chap4.task4_3.example4_14;

import chap4.task4_3.example4_13.MyPrint;
//例题4_14编写一个实现接口PrintMessage的类，并编写一个测试程序进行测试
public class Test {
	public static void main(String[] args) {
		MyPrint my = new MyPrint(); //定义MyPrint类的对象

		System.out.println("print all messages");
		my.printAllMessage(); //使用实现了的接口方法
		System.out.println("print the first messages");
		my.printFirstMessage(); //使用实现了的接口方法
		System.out.println("print the last messages");
		my.printLastMessage(); //使用实现了的接口方法
	}
}