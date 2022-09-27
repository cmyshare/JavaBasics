/**
 * 单元4 继承与多态
 * 任务1  多用户租金计算
 * 求租客户信息类设计
 * 房屋租赁管理系统中客户有求租客户、出租客户。
 * 先设计一个客户类Customer，在设计它的两个子类：求租客户类HireUser、出租客户类。提高代码复用率。
 * 运用继承、方法重写
 * */

package chap4.task4_1.practice4_1;
//客户类的设计
public class Customer {
	private int userID; //ID
	public  String userName;//客户姓名
	private char sex;//性别
	protected String phone;//联系电话
	private String homePhone;//家庭电话
	private String email;//邮箱
	private String qq;//QQ号码
	private String cardID;//身份证号码
	private String address;//家庭住址

	public Customer(){
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getCardID() {
		return cardID;
	}
	public void setCardID(String cardID) {
		this.cardID = cardID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//显示用户名信息
	public void showUserName(){
		System.out.println("客户的姓名："+userName);
	}
}