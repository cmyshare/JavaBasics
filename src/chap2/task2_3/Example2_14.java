package chap2.task2_3;
//例题2_14计算1到10的平方，并输出这10个数得平方和。使用for循环
public class Example2_14 {
	public static void main(String[] args) {
		int sum = 0;
		int temp;
		for (int i = 1; i <= 10; i++) {
			temp = i * i;
			System.out.print(temp + " ");  //使用+ " "让每个值之间有一个空格距离
			sum += temp;
		}
		System.out.println(); //输出空内容，起到换行作用。
		System.out.println(sum);
	}
}
