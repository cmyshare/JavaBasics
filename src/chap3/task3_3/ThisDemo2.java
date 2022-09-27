package chap3.task3_3;
//例题3_12this引用构造方法
public class ThisDemo2 {
	int a;
	int b;
	public ThisDemo2() {
		this(0,'0'); // this(0)调用本类中的其他构造方法
	}

	public ThisDemo2(int a) {
		this.a = a;
	}

	public ThisDemo2(int a,int b) {
		this.a = a;
		this.b = b;
	}

	public ThisDemo2(int a,char b) {
		this.a = a;
		this.b = b;
	}
}
