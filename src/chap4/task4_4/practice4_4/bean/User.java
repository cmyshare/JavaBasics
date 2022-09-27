package chap4.task4_4.practice4_4.bean;

public class User {   //用户类
	private int userID; //ID
	private String userName;//姓名
	private String sex;//性别
	private String phone;//手机
	private String homePhone;//家庭电话
	private String email;//邮箱
	private String qq;//QQ
	private String cardID;//身份证号码
    //无参构造
	public User() {
		super();
	}
	//方法重载
	public User(int userID) {
		super();
		this.userID = userID;  //为userID赋值
	}
	//有参构造-方法重载
	public User(int userID, String userName, String cardID) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.cardID = cardID;
	}
	public User(int userID, String userName, String sex, String phone,
				String homePhone, String email, String qq, String cardID) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.sex = sex;
		this.phone = phone;
		this.homePhone = homePhone;
		this.email = email;
		this.qq = qq;
		this.cardID = cardID;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
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

}
