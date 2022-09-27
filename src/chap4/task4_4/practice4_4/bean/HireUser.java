/**
 * 求租人信息
 */


package chap4.task4_4.practice4_4.bean;

import java.util.Date;

public class HireUser extends User {

	private String hirePersonNo;//求租人编号
	private Date recordDate;//登记日期


    //无参构造
	public HireUser() {
		super();
	}
    //有参构造
	public HireUser(int userID, String hirePersonNo) {
		super(userID);
		this.hirePersonNo = hirePersonNo;
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
}