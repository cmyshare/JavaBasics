package chap2.task2_1;

//例2_6算术运算测试示例
public class Example2_6 {
	public static void main(String args[]) {
		int a = 5 + 4; // a=9
		int b = a * 2; // b=18
		int c = b / 4; // c=4 浮点数中除数为0，结果为NaN(非数)，整数中报错
		int d = b - c; // d=14
		int e = -d; // e=-14 负数
		int f = e % 4; // f=-2 负数求余
		double g = 18.4;
		double h = g % 4; // h=2.4 浮点数求余
		int i = 3;
		int j = i++; // i=4��j=3 先赋值再自增
		int k = ++i; // i=5��k=5 先自增再赋值
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
		System.out.println("e=" + e);
		System.out.println("f=" + f);
		System.out.println("g=" + g);
		System.out.println("h=" + h);
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		System.out.println("k=" + k);
	}
}
