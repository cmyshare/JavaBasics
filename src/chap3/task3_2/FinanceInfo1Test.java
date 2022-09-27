/**
 * 单元3 面向对象程序设计
 * 任务2 FinanceInfo1 财务信息类设计 FinanceInfo1Test 创建测试类进行测试 使用static修饰符。
 * 财务信息类的成员变量包括公司名称、定金收入、押金收入、租金收入、其他收入、员工成本、房租、水电、税收及其他费用
 * 财务信息类的成员方法包括收入计算、成本计算、净收入计算
 */

package chap3.task3_2;

public class FinanceInfo1Test {

	public static void main(String[] args) {
		// 初始化 给财务信息类中对象赋值 直接通过类名调用
		FinanceInfo1.init();

		// 调用收入计算方法
		System.out.println("收入=" + FinanceInfo1.calIncome());

		// 调用成本计算方法
		System.out.println("成本=" + FinanceInfo1.calCost());

		// 调用净收入计算方法
		System.out.println("净收入=" + FinanceInfo1.calNetIncome());

	}
}
