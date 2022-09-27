package chap2.task2_1;
//例2_5声明静态成员变量和实例变量
public class Example2_5 {

	//成员变量 在整个类中有效， 局部变量在方法中有效
	int x=1; /*实例变量*/
	static int y = 234; /* 静态变量 static*/
}

class print{
	public static void main(String[] args) {
		//定义时使用static 直接通过类名调用，成员变量或方法。但在static静态方法中，只能调用用这种方式静态的变量方法
		System.out.println(Example2_5.y);
		//没有static 需要实例化调用
		System.out.println(new Example2_5().x);
	}
}