package chap4.task4_4;

import java.util.Calendar;
import java.util.GregorianCalendar;
//例题4_23 获取当前日期时间_使用日历功能
public class example4_23 {
	public static void main(String[] args) {
		GregorianCalendar gre = new GregorianCalendar(); // 获得实例
		//Calendar.YEAR等是Calendar中定义的静态字段 get()返回与静态字段有关的日期
		//日期字符串拼接
		String now = gre.get(Calendar.YEAR) + "-" + (gre.get(Calendar.MONTH) + 1)
				+ "-" + gre.get(Calendar.DATE) + " "
				+ gre.get(Calendar.HOUR_OF_DAY) + ":"
				+ gre.get(Calendar.MINUTE) + ":" + gre.get(Calendar.SECOND);

		System.out.println(now); //显示当前日期时间
		System.out.println(gre.getTimeInMillis()); //获得对象毫秒数
	}
}
