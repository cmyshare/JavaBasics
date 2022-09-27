package chap4.task4_2.example4_7;
//例题4_7构造方法的继承与调用顺序示例
class Grandpa {
	protected Grandpa() {
		System.out.println("default Grandpa");
	}

	public Grandpa(String name) {
		System.out.println(name);
	}
}
