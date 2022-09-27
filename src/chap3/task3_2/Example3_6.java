package chap3.task3_2;
//例题3_6测试对实例成员和类成员的不同访问方式——静态变量使用示例
// Count子类  没有任何修饰符，默认访问权限，可以在同包下其他类访问
class Count {
	private int serial; // 实例变量
	static int counter = 0; // 类变量

	/**成员变量中必须有类型和变量名，成员方法中必须有类型和方法名()，类中必须有class和类名*/
//	//Count(){}=语句块功能
//	Count() {
//		counter++; // 实例计数器
//		serial = counter;
//	}

	//语句块{}代替
	{
		counter++; // 实例计数器
		serial = counter;
	}
	int getSerial() {
		return serial;
	}
	int getCounter() {
		return counter;
	}
}

public class Example3_6 {
	//在类方法(静态方法)中，不能直接访问类中的非静态成员
	//为什么main方法必须是static，因为main方法是程序入口点，执行main方法，此时是没有对象的。
	//因此main方法不可能是实例方法

//	static静态方法是存储在静态存储区内的，可以通过类.方法名直接进行调用，不需要进行实例化。
//	假设不使用static，那么main()方法在调用时必须先对其实例化，而main()做为程序的主入口显然不可能先对其实例化，
//	所以使用static修饰，可以更方便的直接用类.main()对其调用。

	public static void main(String args[]) {
		Count c1 = new Count();
		Count c2 = new Count();
		System.out.println("c1的serial值:" + c1.getSerial()); // 1
		System.out.println("c1的counter值:" + c1.getCounter());
		System.out.println("c2的sSerial值:" + c2.getSerial()); // 2
		System.out.println("c2的counter值:" + c2.getCounter());
		// System.out.println("类的serial值:"+Count.serial()); //不能通过类名访问非静态变量
		System.out.println("类的counter值:" + Count.counter); // 通过类名访问静态变量
	}
}
