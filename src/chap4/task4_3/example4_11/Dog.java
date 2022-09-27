package chap4.task4_3.example4_11;

class Dog extends Animal {
	String str;

	Dog(String s) {
		//调用父类的有参构造
		super(s);
	}
    //继承了抽象类，就必须实现抽象类的子类
	void eat() {
		System.out.println("狗吃骨头！");
	}
}
