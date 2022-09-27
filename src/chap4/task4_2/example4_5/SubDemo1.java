package chap4.task4_2.example4_5;
//例题4_5super引用父类构造方法
//子类SubDemo1
public class SubDemo1 extends SuperDemo1 {
	public SubDemo1() {
		super(); //可省略，调用父类构造方法1
	}

	public SubDemo1(int a) {
		super(a); //必须放在第一句，调用父类构造方法2
	}

	public SubDemo1(String s) {
		super(); //可省略，调用父类构造方法1
	}
}

