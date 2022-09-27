package chap4.task4_2.example4_6;
//例题4_6super引用父类成员方法
//子类SubDemo2
public class SubDemo2 extends SuperDemo2 {
	public void print(int a) {
		super.print(a); //super关键字表示调用父类方法
		System.out.println("Sub Dem2");
	}

	public void t() {
		super.test(); //super可省略
		super.print(0); //不可省略，因为子类方法重写父类方法print()
	}
}
