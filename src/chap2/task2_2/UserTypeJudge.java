/**
 * 单元2 Java 语言基础
 * 任务2  用户类型选择
 * 设计要点：
 * 1.应用if else 判断输入的用户类型；
 * 2.使用switch 判断输入的用户类型；
 *
 */

package chap2.task2_2;

import java.util.Scanner;

public class UserTypeJudge {

	// 使用if else 判断用户类型 这里的void是空类型，无返回值。
	public void ifJudgeUserType(char c) {
		if (c == 'a') {
			System.out.println("您选择的是出租用户！");
		} else if (c == 'b') {
			System.out.println("您选择的是求租用户！");
		} else if (c == 'c') {
			System.out.println("您选择的是普通员工！");
		} else if (c == 'd') {
			System.out.println("您选择的是系统管理员！");
		} else {
			System.out.println("您的输入有错误，请重新输入！");
		}
	}

	// 使用switch判断用户类型
	public void switchJudgeUserType(int c) {
		switch (c) {
			case 1:
				System.out.println("您选择的是出租用户！");
				break;
			case 2:
				System.out.println("您选择的是求租用户！");
				break;
			case 3:
				System.out.println("您选择的是普通员工！");
				break;
			case 4:
				System.out.println("您选择的是系统管理员！");
				break;
			default:
				System.out.println("您的输入有错误，请重新输入！");
		}
	}

	//JAVA中的主函数，所有java程序的运行起点就是这个方法
	//public关键字 声明主函数
	//static关键字 告知编译器main函数是一个静态函数。
	//void关键字表明main()的返回值是无类型
	//参数args的主要作用是为程序使用者在命令行状态下与程序交互提供了一种手段。
	public static void main(String[] args) {
		// 创建UserTypeJudge对象
		UserTypeJudge userType = new UserTypeJudge();
		// 获得输入流对象
		Scanner sc = new Scanner(System.in);

		// 1:使用if else 判断用户类型
		System.out.println("使用if else 判断，判断类型：字符");
		System.out.println("请输入选择的用户类型： a:出租用户    b：求租用户");
		System.out.println("               c:普通员工    d:系统管理员 ");

		// 从控制台输入一个字符串，从字符串中获取字符 //next():输入字符串（以空格作为分隔符）
		String str = sc.next();
		char c = str.charAt(0);
		userType.ifJudgeUserType(c);
		System.out.println("...............................");

		// 2：使用switch判断用户类型
		System.out.println("请输入选择的用户类型： 1:出租用户    2：求租用户");
		System.out.println("               3:普通员工    4:系统管理员 ");
		System.out.println("使用switch 判断，判断类型：整型");
		System.out.println("请输入选择的用户类型：");
		int i = sc.nextInt(); // 获取输入的数字：整型
		userType.switchJudgeUserType(i);
	}

}
