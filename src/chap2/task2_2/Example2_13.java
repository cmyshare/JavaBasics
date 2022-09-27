package chap2.task2_2;

import java.util.Scanner;
//例题2_13switch语句的使用示例(注意其中break语句的作用)
//判断输入的值是否为闰年，确定二月天数。
public class Example2_13 {
	public static void main(String[] args) {
		int year;
		int month;
		int days = 0;
		System.out.print("请输入年份和月份:");

		Scanner in = new Scanner(System.in); // 从键盘输入年份和月份数据 调用Scanner函数对象
		year = in.nextInt();
		month = in.nextInt();

		switch (month) {
			case 2: // 判断是否闰年，确定2月份天数
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
					days = 29; //是闰年
				else
					days = 28; //不是闰年
				break;

			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;

			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			default:
				System.out.println("月份数据非法！");
		}
		System.out.println(year + "年" + month + "月有" + days + "天");
	}
}
