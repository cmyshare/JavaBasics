package chap4.task4_4;

import java.text.SimpleDateFormat;
import java.util.*;
//例题4_24  打印未来几年的10个黑色星期五_使用日历功能
public class example4_24 {
	public static void main(String[] args) {
		//Calendar类是一个抽象类，不能new实例化。但可以使用Calendar类static方法getInstance()初始化一个日历对象。
		Calendar cal = Calendar.getInstance();
		//实例化SimpleDateFormat对象设置日期格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd  EEEE");//设置日期格式
		cal.set(Calendar.DAY_OF_MONTH, 13);//设置日期为13号
		int n = 1;
		while (n <= 10) {
			//日历的变化都是有序的。
			System.out.println("输出当前日历"+sdf.format(cal.getTime()));
			//遇到星期五就分段输出结果。 调用静态字段Calendar.DAY_OF_WEEK-表示一周的第几天。
			if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {//如果是星期五
				Date date = cal.getTime();//获得日期，返回一个表示此Calendar时间值的Date对象
				System.out.println(sdf.format(date));//按照格式打印黑色星期五
				n++;
			}
			cal.add(Calendar.MONTH, 1);//月份增加1个月
		}
	}
}