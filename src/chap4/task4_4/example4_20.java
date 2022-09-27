package chap4.task4_4;

import java.util.Date;
//例题4_20获取当前时间
public class example4_20 {
	public static void main(String[] args) {
		//直接输出Date类型对象
		Date d = new Date();
		System.out.println(d);
		//将字符串格式的时间转为Date
		String ds="2021-3-29 21:07";
		System.out.println(ds.valueOf(ds));
	}
}
