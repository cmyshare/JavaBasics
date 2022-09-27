/**
 * 单元4 继承与多态
 * 任务1  多用户租金计算
 * 求租客户信息类设计
 * 房屋租赁管理系统中客户有求租客户、出租客户。
 * 先设计一个客户类Customer，在设计它的两个子类：求租客户类HireUser、出租客户类。提高代码复用率。
 * 运用继承、方法重写
 * */

package chap4.task4_1.practice4_1;
//求租客户类的设计
import java.util.Date;
public class HireUser extends Customer {
	private String HirePersonNo;//求租人编号
	private Date recordDate;//登记日期

	public HireUser(){
	}

	public String getHirePersonNo() {
		return HirePersonNo;
	}
	public void setHirePersonNo(String hirePersonNo) {
		HirePersonNo = hirePersonNo;
	}
	public Date getRecordDate() {
		return recordDate;
	}
	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}
}