package chap3.task3_3;
//例题3_11this引用成员变量
public class ThisDemo1 {
	private int a; //定私有作用域的成员变量a

	public ThisDemo1(int a) {
		this.a = a; // this.a表示引用该类的成员变量
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

//	参数a的作用范围为构造方法或方法内部。成员变量a的作用范围时类内部。
//	当变量作用范围重叠时，作用范围小的覆盖作用范围大的。
//	如果变量名不发生重叠，可以省略this。
}
