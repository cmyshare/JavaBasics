package chap4.task4_2.example4_9;

import chap4.task4_2.example4_8.Person;
import chap4.task4_2.example4_8.Student;
import chap4.task4_2.example4_8.Teacher;
//例题4_9instanceof运算符的使用示例
public class UseOfInstanceof {
	public static void main(String[] args) {
		Person p1 = new Teacher(); // p1是父类对象，但是子类实例
		Person p2 = new Student(); // p2是父类对象，但是子类实例

		pleasetalk(p1); //调用子类Teacher中保留的talk
		pleasetalk(p2); //调用子类Student中保留的talk

		p1.listen(); //调用父类listen
		p2.listen();
		 //p1.teach(); //p1的teach方法是子类方法。不可见
		 //p2.learn(); //p2的learn方法是子类方法，不可见

		if (p1 instanceof Teacher) {
			System.out.println("she is a teacher!");
			((Teacher) p1).teach(); // 如果能够转换则让老师演示教学
		}
		if (p2 instanceof Student) {
			System.out.println("he is a Student!");
			((Student) p2).learn(); // 如果能够转换，则让学生演示学习
		}
		// p1.learn();//子类方法不可见
	}

	static void pleasetalk(Person p) {
		p.talk();
	}
}
