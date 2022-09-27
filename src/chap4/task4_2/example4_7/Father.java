package chap4.task4_2.example4_7;
//例题4_7构造方法的继承与调用顺序示例
class Father extends Grandpa {
	protected Father() {
		System.out.println("default Father");
	}

	public Father(String grandpaName, String fatherName) {
		super(grandpaName); //调用父类的构造方法 有参
		System.out.println(fatherName);
	}
}
