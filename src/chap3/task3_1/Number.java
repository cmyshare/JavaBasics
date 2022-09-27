package chap3.task3_1;
//例题3_4设计类Number，测试对象间的赋值。
public class Number {
	int i;
	public static void main(String[] args) {
		Number n1 = new Number();
		Number n2 = new Number();
		n1.i = 9;
		n2.i = 47;
		System.out.println("n1.i=" + n1.i + "\t\t" + "n2.i=" + n2.i);
		n1 = n2; //通过对象赋值后，n1 n2其实是一个对象，所以改变一个，另一个自动跟着变。
		System.out.println("n1.i=" + n1.i + "\t\t" + "n2.i=" + n2.i);
		n1.i = 27;
		System.out.println("n1.i=" + n1.i + "\t\t" + "n2.i=" + n2.i);
	}
}
