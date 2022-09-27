package chap4.task4_3.example4_13;

import chap4.task4_3.example4_14.PrintMessage;
//例题4_14编写一个实现接口PrintMessage的类，并编写一个测试程序进行测试
public class MyPrint implements PrintMessage{  //实现接口的类MyPrint

	private String[] message ; //类中的成员变量message  字符串数组
	private int i; //类中的成员变量i

	public MyPrint(){ // MyPrint类的构造方法
		message = new String[3];
		i = 0;
		this.putMessage("Hello world!"); //使用MyPrint类的方法
		this.putMessage("Hello China!");
		this.putMessage("Hello JIANGZHOU!");
	}
	public void putMessage(String str) {  //类中的方法
		message[i++] = str;
	}
	public void printAllMessage(){  //实现接口中的方法
		for (int k = 0; k < message.length; k++) {
			System.out.println(message[k]);
		}
	}
	public void printLastMessage(){ //实现接口中的方法
		System.out.println(message[message.length - 1]);
	}
	public void printFirstMessage(){  //实现接口中的方法
		System.out.println(message[0]);
	}
}