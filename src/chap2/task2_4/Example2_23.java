package chap2.task2_4;
//例题2_23定义一个不规则的二维数组，输出其行数的元素个数，并求数组所有元素的和
public class Example2_23 {
	public static void main(String args[]) {
		int b[][] = { { 11 }, { 21, 22 }, { 31, 32, 33, 34 } };
		//System.out.println(b[0][1]); //空出部分不会自动补0
		int sum = 0;
		System.out.println("数组b的行数：" + b.length);
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "]行的数据个数：" + b[i].length);
			for (int j = 0; j < b[i].length; j++) {
				sum = sum + b[i][j];
			}
		}
		System.out.println("数组元素的总和：" + sum);
	}
}
