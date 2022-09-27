package chap3.task3_2;
//例题3_5测试成员变量修饰符的作用
//FieldTest类，子类，没有任何修饰符，默认访问权限，可以在同包下其他类访问
class FieldTest {
	//private int num = 5;// 私有作用域，本类可见
	//public int num = 5;// 工共作用域，所有包/类可见
	protected int num = 5;// 受保护作用域，同包/同类/不同类可见

	public int get() { // 公共作用域，get 方法返回成员变量num的值
		return num;
	}
}

//主类，每个Java程序的主类必须是public,主类名=文件名
public class Example3_5 {
	//子类中的输出类-静态方法
	public static void main(String[] args) {
		FieldTest ft = new FieldTest();
		int t = ft.get(); // 正确访问
		int s=ft.num; //不能访问FieldTest类中私有成员变量num
		System.out.println("t=" + t);
		System.out.println("s="+s);
	}
}
