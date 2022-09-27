package chap2.task2_1;
//例题2_9位运算使用示例
public class Example2_9 {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		// 先把数据变成二进制
		System.out.println(a & b); //按位与，一0即0
		System.out.println(a | b); //按位或，一1即1
		System.out.println(a ^ b); //按位异或，同为0，异为1
		System.out.println(b << 2); //按位左移2位
		System.out.println(b >> 2); //按位右移2位

		//条件运算符-三元运算
		int a1=1,b1=2,c1;
		c1=a1>b1?a1:b1;
		System.out.println(c1);

		//赋值运算符-等号 左变量 右表达式
		int a2;
		a2=5+3/2;
		System.out.println(a2);

	}
}
