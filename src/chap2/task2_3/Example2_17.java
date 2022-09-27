package chap2.task2_3;
//例题2_17在循环中使用break语句
public class Example2_17 {
	public static void main(String[] args) {
		int x = 1;
		while (x < 10) {
			System.out.println(" 进入循环，x的初始值为：" + x);
			switch (x) {
				case 0:
					System.out.println(" 进入switch语句，x=" + x);
					break;
				case 1:
					System.out.println(" 进入switch语句，x=" + x);
					break;
				case 2:
					System.out.println(" 进入switch语句，x=" + x);
					break;
			}
			if (x == 5) {
				break; //使用break终止循环的执行
			}
			x++;
			System.out.println(" 跳出switch语句，但还在循环中.");
		}
	}
}
