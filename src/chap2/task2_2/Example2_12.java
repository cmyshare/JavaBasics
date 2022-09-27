package chap2.task2_2;
//例题2_12采用三种if形式,判断某一年是不是闰年
public class Example2_12 {
	public static void main(String args[]) {
		// 第一种形式
		int year = 2000;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
		// 第二种形式 闰年-能被4和400整除，不能被100整除，一真即真。
		year = 2011;
		boolean leap;
		if (year % 4 != 0) {
			leap = false;
		} else if (year % 100 != 0) {
			leap = true;
		} else if (year % 400 != 0) {
			leap = false;
		} else {
			leap = true;
		}
		if (leap == true) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
		// 第三种形式
		year = 2012;
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				leap = true;
			} else if (year % 400 == 0) {
				leap = true;
			}
		} else {
			leap = false;
		}
		if (leap == true) {
			System.out.println(year + "  is a leap year.");
		} else {
			System.out.println(year + "  is not a leap year.");
		}
	}
}
