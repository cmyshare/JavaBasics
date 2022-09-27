package chap4.task4_2.example4_7;
//例题4_7构造方法的继承与调用顺序示例
public class Son extends Father {
	//执行顺讯：从最顶层父类，开始往下执行。
	public Son() {
		System.out.println("default Son");
	}

	public Son(String grandpaName, String fatherName, String sonName) {
		super(grandpaName, fatherName); //调用父类有参构造
		System.out.println(sonName);
	}

	public static void main(String args[]) {
		//先执行有参
		Son s1 = new Son("My Grandpa", "My Father", "My Son"); // ①创建子类对象1
		//再执行无参
		Son s2 = new Son(); // ②创建子类对象2
	}
}
