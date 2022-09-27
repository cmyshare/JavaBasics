package chap3.task3_3;
//例题3_13this引用自身和成员方法
public class ThisDemo3 {
	ThisDemo3 instance; //定义声明对象 创建一个对象=实例化/初始化一个类

	public ThisDemo3() {
		instance = this; // this代表自身对象
		this.test(); // this引用成员方法
	}

	public void test() {
		System.out.println(this); //输出自身对象
	}

	public static void main(String[] args) {
		ThisDemo3 thisDemo3=new ThisDemo3(); //在实例化过程中,自动调用无参/有参构造
	}
}

