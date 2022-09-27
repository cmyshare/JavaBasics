package chap4.task4_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//例题4_21 SimpleDateFormat实例
public class example4_21{
	//throws Exception 抛出运行时的所有异常
	//throws ParseException 抛出运行时的ParseException异常
	public static void main(String[] args) throws ParseException {
		//根据SimpleDateFormat构造函数实例化SimpleDateFormat对象
		//通过Ctrl+B可以查看SimpleDateFormat源码
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d=new Date();
		//根据构造函数中的格式将Date对象输出为字符串。
		String DateString=sf.format(d); //返回类似的日期 2014-01-21 16:03:39
		System.out.println(DateString);
        //设置解析字符串日期时，是否严格检查日期字符串。true接收无效数字，false不接受无效数字并严格检查
		sf.setLenient(false);
		//根据构造函数中的格式，解析字符串日期为date类型，用来检验日期字符串
		sf.parse(DateString);
	}
}
