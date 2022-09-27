package chap4.task4_2.example4_8;
//例题4_8测试对象转型，定义父类Person、子类Student和Teacher
public class Person {
	String name;

	public void talk() {
	}// 把父类中的覆盖情况去掉，则子类中的方法不再可见

	public void listen() {
		System.out.println("a person is listening..");
	}
}
