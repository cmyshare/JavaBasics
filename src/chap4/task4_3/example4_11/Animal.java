package chap4.task4_3.example4_11;

abstract class Animal {
	String str;
	Animal(String s) {  //定义抽象类的一般方法-构造方法
		str = s;
		System.out.println("animal:"+str);
	}
	abstract void eat(); //定义抽象方法
}
