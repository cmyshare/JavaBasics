/**
 * 单元3 面向对象程序设计
 * 任务3 FinanceInfo2 财务信息类设计 FinanceInfo2Test 创建测试类进行测试 使用构造方法(有参/无参构造)设计。
 * 财务信息类的成员变量包括公司名称、定金收入、押金收入、租金收入、其他收入、员工成本、房租、水电、税收及其他费用
 * 财务信息类的成员方法包括收入计算、成本计算、净收入计算
 */

package chap3.task3_3;

import java.util.Scanner;

public class FinanceInfo2Test {
	public static void main(String[] args) {
		// 1:使用无参数构造方法创建财务信息对象
		FinanceInfo2 financeInfo = new FinanceInfo2();
		// 创建输入流对象
		Scanner sc = new Scanner(System.in);

		// 获取输入的财务信息
		System.out.println("请输入公司名称：");
		String companyName = sc.next();

		System.out.println("请输入定金收入:");
		double earnestIncome = sc.nextDouble();

		System.out.println("请输入押金收入：");
		double depositIncome = sc.nextDouble();

		System.out.println("请输入租金收入：");
		double rentIncome = sc.nextDouble();

		System.out.println("请输入其它收入：");
		double otherIncome = sc.nextDouble();

		System.out.println("请输入员工成本：");
		double staffCost = sc.nextDouble();

		System.out.println("请输入店面房租：");
		double rentCost = sc.nextDouble();

		System.out.println("请输入水电成本：");
		double hydropowerCost = sc.nextDouble();

		System.out.println("请输入税收费用：");
		double taxCost = sc.nextDouble();

		System.out.println("请输入其它费用：");
		double otherCost = sc.nextDouble();

		// 设置财务信息
		financeInfo.setCompanyName(companyName);
		financeInfo.setEarnestIncome(earnestIncome);
		financeInfo.setDepositIncome(depositIncome);
		financeInfo.setRentIncome(rentIncome);
		financeInfo.setOtherIncome(otherIncome);
		financeInfo.setStaffCost(staffCost);
		financeInfo.setRentCost(rentCost);
		financeInfo.setHydropowerCost(hydropowerCost);
		financeInfo.setTaxCost(taxCost);
		financeInfo.setOtherCost(otherCost);
		// 调用收入计算方法
		double sumIncome = financeInfo.calIncome();
		System.out.println("收入=" + sumIncome);
		// 调用成本计算方法
		double sumCost = financeInfo.calCost();
		System.out.println("成本=" + sumCost);
		// 调用净收入计算方法
		double netIncome = financeInfo.calNetIncome();
		System.out.println("净收入=" + netIncome);

		// 2：使用带参数的构造方法创建财务信息类
		FinanceInfo2 financeInfo2 = new FinanceInfo2(companyName,
				earnestIncome, depositIncome, rentIncome, otherIncome,
				staffCost, rentCost, hydropowerCost, taxCost, otherCost);
		// 调用收入计算方法
		System.out.println("收入=" + financeInfo2.calIncome());
		// 调用成本计算方法
		System.out.println("成本=" + financeInfo2.calCost());
		// 调用净收入计算方法
		System.out.println("净收入=" + financeInfo2.calNetIncome());
	}
}
