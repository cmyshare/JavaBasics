package chap4.task4_1.example4_3;
//例题4_3变量隐藏测试
class Student extends Person {
	String address="2"; //重新定义父类变量
	String school="2";

	public Student() {
		//无参构造
	}

	public void showInfo(){
		showName();             //调用父类的方法
		System.out.println("Student:"+address+"Student:"+school);  //使用的是子类的address
	}

	//测试
	public static void main(String[] args) {
		Student student=new Student();
		student.showInfo();
	}

}
