package chap2.task2_1;
//例2_4常量和变量的使用
public class Example2_4 {

	//成员变量(类中)、局部变量(类的方法中)
	//static关键字-静态变量\静态方法\代码块\嵌套类
	//用final定义常量
    static final double PI=3.14; //静态常量，必须赋初值
	static int member=23;  //静态变量 ，赋初值
	public static void main(String[] args) {
		final int part=123;
		member=24;
		System.out.println(part*member*PI);
	}
}
