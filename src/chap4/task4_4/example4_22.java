package chap4.task4_4;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
//例题4_22 DateFormat实例
public class example4_22 {
	public static void main(String[] args) {
		//public DateFormat getDateTimeInstance(int dateStyle, int timeStyle, Locale aLocale)
		//dateStyle 日期类型
		//timeStyle 时间类型
		//aLocale 地区常数
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG, Locale.CHINA);
		System.out.println(df.format(new Date())); // 按中国格式显示日期时间
	}
}
