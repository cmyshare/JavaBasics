package chap2.task2_3;
//例题2_15计算1到10的平方，并输出这10个数得平方和。使用while循环
public class Example2_15 {
	public static void main(String[] args) {
		int sum = 0, i = 1, temp;
		while (i <= 10) {
			temp = i * i;
			System.out.print(temp + " ");
			sum += temp;
			i++; // 改变循环控制变量值
		}
		System.out.println();
		System.out.println(sum);
	}
}
