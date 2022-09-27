///**
// * 单元2 Java 语言基础
// * 任务1  租金计算界面设计
// * 设计要点：
// * 1.租金计算界面
// * 2.数据类型：整型 、双精度类型、字符型、布尔型
// * 3.类型转换
// * 4.数据操作
// * 5.表达式
// */
//
//package chap2.task2_1;
//
//import java.util.Scanner; //使用java.util包。import java.util.*;
//
//public class RentCalculateBound {
//
//	public static void main(String[] args) {
//
//		System.out.println("欢迎使用房屋租赁租金计算工作！");
//		System.out.println("选择进行的操作类型：1.用户类型选择  2.单个用户租金计算   3.多用户租金计算   4.退出");
//
//		//使用Scanner类 构造Scanner类对象，它附属于标准输入流System.in
//		Scanner sc = new Scanner(System.in);
//
//		//常用的next()方法系列：nextInt():输入整数
//		//nextLine():输入字符串
//		//nextDouble():输入双精度数
//		//next():输入字符串（以空格作为分隔符）
//
//		// 获取输入的数字：整型
//		int act = sc.nextInt();
//
//		// 判断输入的是什么数字
//		boolean actResult = act == 1 || act == 2 || act == 3 || act == 4;
//
//		// 条件表达式判断输入的数字的范围
//		String result = actResult ? "您选择的是1-4" : "您的选择不在1-4范围内";
//		System.out.println(result);
//
//		// 输入求租用户的姓名
//		System.out.println("请输入用户名姓名：");
//		String userName = sc.next();
//		System.out.println("求租用户姓名=" + userName);
//
//		// 输入求租用户的性别
//		System.out.println("请输入求租用户性别：ture  or  false");
//		boolean sex = sc.nextBoolean();
//		System.out.println("性别=" + (sex ? '男' : '女'));
//
//		// 计算租金
//		System.out.println("计算租金");
//
//		// 租金包括三个部分：房租、物业费、其它费用
//		System.out.println("请输入房屋出租费用：");
//		double houseRent = sc.nextDouble();
//
//		System.out.println("请输入物业费用:");
//		float propertyCost = sc.nextFloat();
//
//		System.out.println("请输入其它费用：");
//		int otherCost = sc.nextInt();
//
//		// 数据类型自动转换
//		double rent = houseRent + propertyCost + otherCost;
//		System.out.println("租金=" + rent);
//	}
//}
