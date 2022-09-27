/**
 * 单元4 继承与多态
 * 任务4  多用户租金计算
 * 客户类User、求租客户类HireUser、出租客户类RentUser、
 * 求租客户信息接口类UserDAO、求租客户信息处理业务类HireUserDAOImp、测试类HireUserTest
 * 添加求租客户信息方法-接口编程
 * 添加求租客户的信息测试-定义方法
 * 技术：接口编程、运用继承、方法重载、方法重写。
 * */

package chap4.task4_3.practice4_3;

import java.util.*;

import chap4.task4_3.practice4_3.bean.HireUser;
import chap4.task4_3.practice4_3.dao.HireUserDAOImp;
public class HireUserTest {
	//输入求租客户信息
	public HireUser inutHireUserInfo(){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入客户ID:");
		int userID=sc.nextInt();

		System.out.println("请输入求租客户姓名：");
		String userName=sc.next();

		System.out.println("请输入求租客户性别：");
		String sex=sc.next();
		//	char sex=sexStr.charAt(0);

		System.out.println("请输入求租客户电话：");
		String phone=sc.next();

		System.out.println("请输入求租客户家庭电话：");
		String homePhone=sc.next();

		System.out.println("请输入求租客户邮箱：");
		String email=sc.next();

		System.out.println("请输入求租客户QQ号码：");
		String qq=sc.next();

		System.out.println("请输入求租客户身份证号码：");
		String cardID=sc.next();

		System.out.println("请输入求租客户编号：");
		String hirePersonNo=sc.next();

		//记录日期
		Date recordDate=new Date();

		//创建求租客户对象
		HireUser hireUser=new HireUser();
		hireUser.setUserID(userID);
		hireUser.setUserName(userName);
		hireUser.setSex(sex);
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
		//创建HireUserTest对象
		HireUserTest ht=new HireUserTest();

		System.out.println("添加求租客户信息！");
		//输入求租客户信息
		HireUser hireUser=ht.inutHireUserInfo();

		//创建求租客户管理业务类对象
		HireUserDAOImp hireUserDAOImp=new HireUserDAOImp ();

		//判断求租客户是否存在
		boolean isExist=hireUserDAOImp.isExist(hireUser);

		if(isExist){//求租客户已经存在
			System.out.println("您的输入有错误，该用户已经存在");
		}else{//求租客户不存在
			//添加求租客户信息
			hireUserDAOImp.insertUser(hireUser);
			System.out.println("添加求租客户信息成功！");
		}
	}
}