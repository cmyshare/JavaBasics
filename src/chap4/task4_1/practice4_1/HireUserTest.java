//package chap4.task4_1.practice4_1;
///**
// * 单元4 继承与多态
// * 任务1  多用户租金计算
// * 求租客户信息类设计
// * 房屋租赁管理系统中客户有求租客户、出租客户。
// * 先设计一个客户类Customer，在设计它的两个子类：求租客户类HireUser、出租客户类。提高代码复用率。
// * 运用继承、方法重写
// * */
//
//
//public class HireUserTest {
//	public static void main(String[] args) {
//		//创建客户类对象
//		Customer customer=new Customer();
//		//创建求租客户类对象
//		HireUser hireUser=new HireUser();
//
//		//设置客户对象属性-客户类
//		customer.userName="王瑞";
//		customer.phone="86338180";
//		System.out.println("客户用户名="+customer.userName);
//		System.out.println("客户客户电话="+customer.phone);
//
//		//测试子类继承父类的属性(公共属性-租客户类
//		hireUser.userName="王旭东";
//		//测试子类继承父类的属性(保护属性）
//		hireUser.phone="86338183";
//		System.out.println("求租客户用户名="+hireUser.userName);
//		System.out.println("求租客户客户电话="+hireUser.phone);
//
//		//测试子类继承父类的方法
//		hireUser.setSex('男');
//		hireUser.setAddress("江苏常州市武进区");
//		System.out.println("求租客户性别="+hireUser.getSex());
//		System.out.println("求租客户地址="+hireUser.getAddress());
//
//		//测试子类覆盖父类的方法
//		customer.showUserName();
//		hireUser.showUserName();
//	}
//}
