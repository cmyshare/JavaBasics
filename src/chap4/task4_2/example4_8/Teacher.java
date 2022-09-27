package chap4.task4_2.example4_8;
//例题4_8测试对象转型，定义父类Person、子类Student和Teacher
public class Teacher extends Person {
	String workNo; // 工号

	public void talk() {
		System.out.println("teacher is talking");
	}

	public void teach() {
		System.out.println("teacher is teaching..");
	}
}
