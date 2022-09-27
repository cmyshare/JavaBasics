/**
 * 出租人信息
 */

package chap4.task4_4.practice4_4.bean;

public class RentUser extends User {
	private String rentPersonNo;//出租人编号
	private int houseID;//房源ID
	private String recordDate;//登记日期
    //无参构造
	public RentUser() {
		super();
	}
    //方法重载
	public RentUser(int userID) {
		super(userID);
	}
    //有参构造-方法重载
	public RentUser(int userID, String userName, String cardID,
					String rentPersonNo) {
		super(userID, userName, cardID);  //调用父类的构造方法
		this.rentPersonNo = rentPersonNo;
	}

	public String getRentPersonNo() {
		return rentPersonNo;
	}

	public void setRentPersonNo(String rentPersonNo) {
		this.rentPersonNo = rentPersonNo;
	}

	public int getHouseID() {
		return houseID;
	}

	public void setHouseID(int houseID) {
		this.houseID = houseID;
	}

	public String getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(String recordDate) {
		this.recordDate = recordDate;
	}


}