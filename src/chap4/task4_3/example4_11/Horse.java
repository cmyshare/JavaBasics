package chap4.task4_3.example4_11;

class Horse extends Animal {
	String str;

	Horse(String s) {
		//调用父类的有参构造
		super(s);
	}
	//继承了抽象类，就必须实现抽象类的子类
	void eat(){ // 重写父类的抽象方法
		System.out.println("马吃草料！");
	}
}
