package chap4.task4_3.example4_11;
//例题4_11抽象类和抽象方法示例
public class Test {
	public static void main(String args[]) {
		Animal h = new Horse("马");
		Animal d = new Dog("狗");
		h.eat();
		d.eat();
	}
}
