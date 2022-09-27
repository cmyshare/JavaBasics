package chap2.task2_3;
//例题2_16计算1到10的平方，并输出这10个数得平方和。使用do while循环
public class Example2_16 {
	public static void main(String[] args) {
		int sum = 0, i = 1, temp;
		do {
			temp = i * i;
			System.out.print(temp + " ");
			sum += temp;
			i++;
		} while (i <= 10);
		System.out.println();
		System.out.println(sum);
	}
}
