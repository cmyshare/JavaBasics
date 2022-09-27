package chap4.task4_2.example4_8;
//例题4_8测试对象转型，定义父类Person、子类Student和Teacher
public class Student extends Person {
	String no; // 学号

	public void talk() {
		System.out.println("student is talking");
	}

	public void learn() {
		System.out.println("student is learning..");
	}

	public static void main(String[] args) {
		//实现向上转型，子类——>父类  丢失一些子类新增的变量和方法，但留下了子类继承或重写的变量和方法。自动转换。
		Person p=new Student(); //父类Person对象p引用子类Student新创建的对象。
		p.talk();
		//p.learn(); //丢失了

		//实现向下转型，父类——>子类  可以操作父类及子类的变量和方法。强制转换。
		Student s=(Student) p; //父类对象p赋给子类对象s，当前p是子类Student的引用。
		s.learn();

		//次向下转型错误 报java.lang.ClassCastException 强制转换无法实现。
		Person person=new Person(); //这里没有引用Student对象
		Student st=(Student)person;
		st.learn();
	}
}

