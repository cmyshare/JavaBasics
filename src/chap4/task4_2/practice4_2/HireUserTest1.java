///**
// * 单元4 继承与多态
// * 任务2  多用户租金计算
// * 求租客户信息类设计
// * 房屋租赁管理系统中客户有求租客户、出租客户。
// * 先设计一个客户类Customer，在设计它的两个子类：求租客户类HireUser、出租客户类。提高代码复用率。
// * 运用继承、方法重写, 新增有参构造，对象类型转换。
// * */
//
//package chap4.task4_2.practice4_2;
//
//import java.util.Date;
//public class HireUserTest1 {
//	public static void main(String[] args) {
//		// 1.测试构造方法继承
//		// 1.1 通过无参数的构造方法创建对象
//		System.out.println(" 通过无参数的构造方法创建对象!");
//		// 创建客户对象
//		Customer1 customer = new Customer1();
//		// 创建求租客户对象
//		HireUser1 hireUser = new HireUser1();
//
//		System.out.println("********************");
//		// 1.2 通过带参数的构造方法创建对象
//		System.out.println(" 通过带参数的构造方法创建对象!");
//		Customer1 customer1 = new Customer1(1001, "张宇", '男', "86338180",
//				"86338129", "zy@qq.com", "353068128", "32108199012251976",
//				"江苏省常州市武进区");
//		//登记日期
//		Date recordDate=new Date();
//		HireUser1 hireUser1=new HireUser1(1001, "张宇", '男', "86338180",
//				"86338129", "zy@qq.com", "353068128", "32108199012251976",
//				"江苏省常州市武进区","1001",recordDate);
//
//		System.out.println("********************");
//		//2.对象类型转换
//		//2.1 向上转型：父类引用了子类的对象
//		Customer1 customer2=new HireUser1();
//
//		customer2.setUserName("张辽");  //调用的是HireUser1的setUserName()方法
//		customer2.showUserName(); //调用的是HireUser1的showUserName()方法
//
//		System.out.println("********************");
//		//2.2向下转型：子类引用了父类的对象
//		Customer1 customer3=new HireUser1();
//		HireUser1 hireUser3=(HireUser1)customer3;
//		hireUser3.setUserName("孙权"); //调用的是HireUser1的setUserName()方法
//		hireUser3.showUserName(); //调用的是HireUser1的showUserName()方法
//	}
//}
