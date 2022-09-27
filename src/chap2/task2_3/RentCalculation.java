/**
 * 单元2 Java 语言基础
 * 任务3  租金计算
 * 设计要点：
 * 1.计算总的租金；
 * 2.计算个人租金；
 * 2.可以连续计算（计算多次）
 */

package chap2.task2_3;

import java.util.Scanner;

public class RentCalculation {   //只能有一个public class

	// 计算总的 租金
	public double calculateTotalRent() {
		double totalRent = 0; // 总的租金
		Scanner sc = new Scanner(System.in); //调用Scanner函数对象，加入System.in

		// 月租金
		System.out.println("请输入月租金：");
		double monthRent = sc.nextDouble(); //输入double类型

		// 租多少个月
		System.out.println("请输入租房时间（以月为单位）：");
		int month = sc.nextInt(); //输入int类型

		// 物业费用
		System.out.println("请输入物业费用：");
		double propertyCost = sc.nextDouble(); //输入double类型

		// 其它费用
		System.out.println("请输入其它费用：");
		double otherCost = sc.nextDouble(); //输入double类型

		totalRent += monthRent * month;
		totalRent += propertyCost * month;
		totalRent += otherCost;

		return totalRent;
	}

	//计算个人的月租金
	public double averageRent(double totalRent) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入合租人数：");
		// 月租金
		int numbers = sc.nextInt();
		return totalRent / numbers;
	}

	public static void main(String[] args) {
		//创建租金计算对象
		RentCalculation rentCal = new RentCalculation();

		Scanner sc = new Scanner(System.in);
		System.out.println("欢迎您使用房屋租赁管理系统租金计算工具!");

		//s1:while(){} 这种循环写法，不常用，像C语言的go to
		//s1像是整个while循环结构的假设别称
		s1: while (true) {
			//计算总的租金
			System.out.println("1:计算总的租金");
			double totalRent = rentCal.calculateTotalRent();
			System.out.println("总的租金是：" + totalRent);

			//计算个人租金
			System.out.println("2:计算个人租金");
			double averRent = rentCal.averageRent(totalRent);

			//个人租金取整
			averRent = Math.round(averRent); //调用math.round函数四舍五入
			System.out.println("个人的租金是：" + averRent);

			//是否继续
			System.out.println("是否继续：1：继续   2：退出");
			//for (;;){} 无限循环结构
			for (;;) {
				int nextAction = sc.nextInt(); //输入指示命令
				if (nextAction == 1) {
					continue s1;
				} else if (nextAction == 2) {
					break s1;
				} else {
					System.out.println("您的输入有错,请重新输入！");
					continue;
				}
			}
		}
		System.out.println("恭喜您，您已经成功退出啦！");
	}
}
