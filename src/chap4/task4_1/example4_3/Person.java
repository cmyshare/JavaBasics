package chap4.task4_1.example4_3;

class Person {
	String id;
	String name="1";
	String address="1";

	public Person() {
	}

	public void showName() {
		System.out.println(name+","+address); //输出的是父类中name
	}
}

