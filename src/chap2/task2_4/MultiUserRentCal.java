/**
 * 单元2 Java 语言基础
 * 任务4  多用户租金计算
 * 【多用户租金计算】：可以连续计算多个用户的租金，将租金计算结构保存到二维数组中。
 * 设计要点：
 *1.计算多用户的租金，用户的信息和租金信息保存到数组中；
 *2.使用二维数组保存用户信息:usersRent[][]  n*1
 *  行：租金
 *  列：用户姓名
 *3.多用户租金姓名userNames[]
 */

package chap2.task2_4;

import java.util.Scanner;

public class MultiUserRentCal {

	// 初始化多用户租金   定义多维数组usersRent，确定用户数量。
	public double[][] initMutliUserRent() {

		System.out.println("请输入用户数量：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //输入int类型
		double[][] usersRent = new double[1][n];

		return usersRent;
	}

	// 初始化多用户姓名  定义一维数组userNames，确定N个用户的姓名。
	public String[] initMultiUserName(double[][] usersRent) {

		int len = usersRent[0].length; //多维数组第1行的列数=用户个数
		String[] userNames = new String[len]; //确定userNames数组对象，分配存储单元。
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < userNames.length; i++) {
			System.out.println("输入第" + (i + 1) + "个用户名：");
			String userName = sc.next();
			userNames[i] = userName;
		}

		return userNames;
	}

	// 计算总的 租金
	public double calculateTotalRent() {
		double totalRent = 0; // 总的租金
		Scanner sc = new Scanner(System.in);

		// 月租金
		System.out.println("请输入月租金：");
		double monthRent = sc.nextDouble();

		// 租多少个月
		System.out.println("请输入租房时间（以月为单位）：");
		int month = sc.nextInt();

		// 物业费用
		System.out.println("请输入物业费用：");
		double propertyCost = sc.nextDouble();

		// 其它费用
		System.out.println("请输入其它费用：");
		double otherCost = sc.nextDouble();

		totalRent += monthRent * month;
		totalRent += propertyCost * month;
		totalRent += otherCost;

		return totalRent;
	}

	// 计算多用户的租金
	public double[][] calCulMultiUserRent(double[][] usersRent) {
		for (int i = 0; i < usersRent.length; i++) { //行数

			for (int j = 0; j < usersRent[i].length; j++) { //次行的列数，赋值
				System.out.println("输入第" + (j + 1) + "个用户租金：");
				usersRent[i][j] = this.calculateTotalRent();  //通过this.函数名调用 计算总的 租金calculateTotalRent函数
			}
		}
		return usersRent;
	}

	// 显示多用户租金信息
	public void showMultiUserRent(String[] userNames, double[][] usersRent) {
		int len = userNames.length;

		// 显示多用户姓名
		for (int i = 0; i < len; i++) {
			System.out.print(userNames[i] + "          ");
		}
		System.out.println("");

		// 显示多用户租金
		for (int j = 0; j < len; j++) {
			System.out.print(usersRent[0][j] + "   |   ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		// 创建多用户租金计算对象
		MultiUserRentCal multiUserRentCal = new MultiUserRentCal();

		System.out.println("欢迎您使用房屋租赁（多用户）租金计算工具");
		// 初始化多用户租金
		double[][] usersRent = multiUserRentCal.initMutliUserRent();

		// 初始化多用户姓名
		String[] userNames = multiUserRentCal.initMultiUserName(usersRent);

		// 计算多用户租金
		usersRent = multiUserRentCal.calCulMultiUserRent(usersRent);

		// 显示多用户租金信息
		multiUserRentCal.showMultiUserRent(userNames, usersRent);
	}

}
