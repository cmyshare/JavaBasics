/**
 * 单元4 继承与多态
 * 任务2  多用户租金计算
 * 求租客户信息类设计
 * 房屋租赁管理系统中客户有求租客户、出租客户。
 * 先设计一个客户类Customer，在设计它的两个子类：求租客户类HireUser、出租客户类。提高代码复用率。
 * 运用继承、方法重写, 新增有参构造，对象类型转换。
 * */

package chap4.task4_2.practice4_2;

import java.util.Date;
public class HireUser1 extends Customer1 {
	//覆盖父类的属性
	private int userID; //ID
	public  String userName;//客户姓名
	private char sex;//性别
	protected String phone;//联系电话
	private String homePhone;//家庭电话
	private String email;//邮箱
	private String qq;//QQ号码
	private String cardID;//身份证号码
	private String address;//家庭住址

	//新增属性
	private String hirePersonNo;//求租人编号
	private Date recordDate;//登记日期

	public HireUser1(){
		super(); //调用继承的父类 无参构造
		System.out.println("这是求租客户类无参构造方法！");
	}

	//带参数的构造方法
	public HireUser1(int userID, String userName, char sex, String phone,
					 String homePhone, String email, String qq, String cardID,
					 String address, String hirePersonNo, Date recordDate) {
		//继承父类的构造方法
		super(userID, userName, sex, phone,homePhone, email, qq,cardID,address);
		this.hirePersonNo = hirePersonNo;
		this.recordDate = recordDate;
		System.out.println("这是求租客户类构造方法！");
	}

	public String getHirePersonNo() {
		return hirePersonNo;
	}

	public void setHirePersonNo(String hirePersonNo) {
		this.hirePersonNo = hirePersonNo;
	}

	public Date getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	//重写显示用户姓名方法
	public void showUserName(){
		super.showUserName();
		System.out.println("这是求租客户类显示用户的方法");
	}
}