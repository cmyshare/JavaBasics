/**
 * 单元3 面向对象程序设计
 * 任务2 FinanceInfo1 财务信息类设计 FinanceInfo1Test 创建财务信息类对象 使用static修饰符。
 * 财务信息类的成员变量包括公司名称、定金收入、押金收入、租金收入、其他收入、员工成本、房租、水电、税收及其他费用
 * 财务信息类的成员方法包括收入计算、成本计算、净收入计算
 */

package chap3.task3_2;

import java.util.Scanner;
public class FinanceInfo1 {
	private static String companyName;// 公司名称
	private static double earnestIncome;// 定金收入
	private static double depositIncome;// 押金收入
	private static double rentIncome;// 租金收入
	private static double otherIncome;// 其它收入
	private static double staffCost;// 员工成本
	private static double rentCost;// 店面房租
	private static double hydropowerCost;// 水电成本
	private static double taxCost;// 税收费用
	private static double otherCost;// 其它费用

	// 初始化
	public static void init() {
		// 创建输入流对象
		Scanner sc = new Scanner(System.in);

		// 获取输入的财务信息
		System.out.println("请输入公司名称：");
		companyName = sc.next();

		System.out.println("请输入定金收入:");
		earnestIncome = sc.nextDouble();

		System.out.println("请输入押金收入：");
		depositIncome = sc.nextDouble();

		System.out.println("请输入租金收入：");
		rentIncome = sc.nextDouble();

		System.out.println("请输入其它收入：");
		otherIncome = sc.nextDouble();

		System.out.println("请输入员工成本：");
		staffCost = sc.nextDouble();

		System.out.println("请输入店面房租：");
		rentCost = sc.nextDouble();

		System.out.println("请输入水电成本：");
		hydropowerCost = sc.nextDouble();

		System.out.println("请输入税收费用：");
		taxCost = sc.nextDouble();

		System.out.println("请输入其它费用：");
		otherCost = sc.nextDouble();
	}

	// 收入计算
	public static double calIncome() {
		double sumIncome = earnestIncome + depositIncome + rentIncome
				+ otherIncome;
		return sumIncome;
	}

	// 成本计算
	public static double calCost() {
		double sumCost = staffCost + rentCost + hydropowerCost + taxCost
				+ otherCost;
		return sumCost;
	}

	// 净收入计算
	public static double calNetIncome() {
		System.out.println(companyName + "的净收入计算结果：");
		double netIncome = calIncome() - calCost();
		return netIncome;
	}
}
