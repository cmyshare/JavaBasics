/**
 * 单元4 继承与多态
 * 任务4  多用户租金计算
 * 客户类User、求租客户类HireUser、出租客户类RentUser、
 * 求租客户信息接口类UserDAO、求租客户信息处理业务类HireUserDAOImp、测试类HireUserTest3
 * 添加求租客户信息方法-接口编程
 * 添加求租客户的信息测试-定义方法
 * 技术：接口编程、运用继承、方法重载、方法重写。
 * */

package chap4.task4_4.practice4_4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import chap4.task4_4.practice4_4.bean.HireUser;
import chap4.task4_4.practice4_4.dao.HireUserDAOImp;

public class HireUserTest3 {
	// 校验是否是数字
	public boolean isDigit(String input) {
		boolean flag = true;
		//将输入的字符串转换成字符数组
		char[] inputs = input.toCharArray();
		for (int i = 0; i < inputs.length; i++) {
			char c = inputs[i];
			// 判断字符是否数字 Character.isDigit()方法
			if (!Character.isDigit(c)) {
				flag = false;
				break;
			} else {
				continue;
			}
		}
		return flag;
	}

	// 邮箱校验
	public boolean checkEmail(String email) {
		boolean flag = false;
		try {
			//检查对比的字符串数据
			String check = "^([a-z0-9A-Z]+[-|.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?.)+[a-zA-Z]{2,}$";
			//字符串比较函数Pattern.compile(check)
			Pattern regex = Pattern.compile(check);
			//邮箱比较函数regex.matcher(email)
			Matcher matcher = regex.matcher(email);
			//调用邮箱比较函数matcher.matches()
			flag = matcher.matches();
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}

	// QQ号码校验
	public boolean checkQQ(String myQQstr) {
		boolean flag = false;
		String regex = "[1-9][0-9]{4,14}";
		//调用字符串对比函数matches(regex)
		if (myQQstr.matches(regex)) {
			flag = true;
		}
		return flag;
	}

	// 18位身份证校验，校验规制：18位，出生年份：1930-2013 ，月份：01-12 ，日期：1-31
	public boolean checkCardID(String cardID) {
		boolean flag = true;
		// 判断输入身份证号码的长度是否是18位
		if (cardID.length() == 18) {
			String yearStr = cardID.substring(6, 10);
			String monthStr = cardID.substring(10, 12);
			String dayStr = cardID.substring(12, 14);

			// 判断身份证中的年、月、日是否正确
			flag = this.checkDate(yearStr, monthStr, dayStr);
		} else {
			System.out.println("您输入的身份证号码：" + cardID + " 长度不对！");
		}

		return flag;
	}

	// 检查身份证中年月日是否合法
	public boolean checkDate(String yearStr, String monthStr, String dayStr) {
		boolean flag = true;
		// 判断月份是否在1930-2013之间
		int year = Integer.parseInt(yearStr);
		System.out.println("year=" + year);
		if (year < 1930 || year > 2013) {
			flag = false;
			System.out.println("您输入的身份证的年份不在1930-2013之间");
		}

		// 判断月份是否合法
		char c = monthStr.charAt(0);
		if (c == '0') {// 如果月份小于10，去除0
			monthStr = monthStr.substring(1);
		}

		int month = Integer.parseInt(monthStr);
		if (month < 1 || month > 12) {
			flag = false;
			System.out.println("您输入的身份证的月份不正确！");
		}

		// 判断日期是否合法 返回索引处的字符
		char d = dayStr.charAt(0);
		if (d == '0') {// 如果月份小于10，去除0
			//返回从索引开始直到最后的全部字符
			dayStr = dayStr.substring(1);
		}
        //将String类型转换成int类型
		int day = Integer.parseInt(dayStr);

		//Calendar的子类GregorianCalendar，可以实现日历功能
		GregorianCalendar gc = new GregorianCalendar(year, month, day);
		// 判断是否是闰年isLeapYear()函数
		boolean isLeap = gc.isLeapYear(year);

		// 月份是1、3、5、7、8、10、12，day在1-31之间
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10 || month == 12) {
			if (day < 1 || day > 31) {
				flag = false;
				System.out.println("您输入的身份证中的日期不正确！");
			}
		}

		// 月份是2、4、6、9、11，day在1-30之间
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day < 1 || day > 30) {
				flag = false;
				System.out.println("您输入的身份证中的日期不正确！");
			}
		}

		// 闰年并且月份是2月，day在1-29之间
		if (isLeap && month == 2) {
			if (day < 1 || day > 29) {
				flag = false;
				System.out.println("您输入的身份证中的日期不正确！");
			}
		}

		// 不是闰年月份是2月，day在1-28之间
		if (!isLeap && month == 2) {
			if (day < 1 || day > 28) {
				flag = false;
				System.out.println("您输入的身份证中的日期不正确！");
			}
		}
		return flag;
	}

	// 输入的字符串转换为日期类型
	public Date strTransDate(String inputDate) {
		//根据SimpleDateFormat构造函数实例化SimpleDateFormat对象 赋值给DateFormat对象
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			//根据构造函数中的格式，解析字符串日期为date类型 出错抛出ParseException异常
			date = dateFormat.parse(inputDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	// 输入求租客户信息：增加输入校验
	public HireUser inutHireUserInfo() {
		//定义输入函数对象Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入求租客户编号:");
		int userID = sc.nextInt();//输入整型

		System.out.println("请输入求租客户姓名：");
		String userName = sc.next();//输入字符串（以空格作为分隔符）

		System.out.println("请输入求租客户性别：");
		String sexStr = sc.next();
		char sex = sexStr.charAt(0);

		System.out.println("请输入求租客户电话：");
		String phone = sc.next();

		// 校验phone
		boolean checkPhone = this.isDigit(phone);
		if (!checkPhone) {
			System.out.println("您输入的电话不正确");
		}

		System.out.println("请输入求租客户家庭电话：");
		String homePhone = sc.next();

		System.out.println("请输入求租客户邮箱：");
		String email = sc.next();

		// 校验邮箱
		boolean checkEmail = this.checkEmail(email);
		if (!checkEmail) {
			System.out.println("您输入的邮箱不正确！");
		}

		System.out.println("请输入求租客户QQ号码：");
		String qq = sc.next();

		// 校验QQ号码
		boolean checkQq = this.checkQQ(qq);
		if (!checkQq) {
			System.out.println("您输入的的QQ号码不正确！");
		}

		System.out.println("请输入求租客户身份证号码：");
		String cardID = sc.next();

		// 校验身份证号码
		boolean checkCardID = this.checkCardID(cardID);
		if (!checkCardID) {
			System.out.println("您输入的身份证号码不正确");
		}

		System.out.println("请输入求租客户编号：");
		String hirePersonNo = sc.next();

		// 记录日期
		System.out.println("请输入记录日期，格式：yyyy-MM-dd");
		String recordDateStr = sc.next();
		// 输入的字符串转换为日期类型
		Date recordDate = this.strTransDate(recordDateStr);

		// 创建求租客户对象
		HireUser hireUser = new HireUser();
		hireUser.setUserID(userID);
		hireUser.setUserName(userName);
		hireUser.setSex("" + sex);
		hireUser.setPhone(phone);
		hireUser.setHomePhone(homePhone);
		hireUser.setEmail(email);
		hireUser.setQq(qq);
		hireUser.setCardID(cardID);
		hireUser.setHirePersonNo(hirePersonNo);
		hireUser.setRecordDate(recordDate);

		return hireUser;
	}

	public static void main(String[] args) {
		// 创建HireUserTest3对象
		HireUserTest3 ht = new HireUserTest3();
		System.out.println("添加求租客户信息！");
		// 输入求租客户信息
		HireUser hireUser = ht.inutHireUserInfo();

		HireUserDAOImp hireUserDAOImp = new HireUserDAOImp();
		// 判断求租客户是否存在
		boolean isExist = hireUserDAOImp.isExist(hireUser);
		if (isExist) {// 求租客户已经存在
			System.out.println("您的输入有错误，该用户已经存在");
		} else {// 求租客户不存在
			// 添加求租客户信息
			hireUserDAOImp.insertUser(hireUser);
			System.out.println("添加求租客户信息成功！");
		}
	}
}
