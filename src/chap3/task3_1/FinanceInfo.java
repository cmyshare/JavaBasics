/**
 * 单元3 面向对象程序设计
 * 任务1 FinanceInfo 财务信息类设计 FinanceInfoTest 创建财务信息类对象
 * 财务信息类的成员变量包括公司名称、定金收入、押金收入、租金收入、其他收入、员工成本、房租、水电、税收及其他费用
 * 财务信息类的成员方法包括收入计算、成本计算、净收入计算
 */

package chap3.task3_1;
//类的命名，首字母大写，第一单词应该是名词
//财务信息类
public class FinanceInfo {
	private String companyName;// 公司名称
	private double earnestIncome;// 定金收入
	private double depositIncome;// 押金收入
	private double rentIncome;// 租金收入
	private double otherIncome;// 其它收入
	private double staffCost;// 员工成本
	private double rentCost;// 店面房租
	private double hydropowerCost;// 水电成本
	private double taxCost;// 税收费用
	private double otherCost;// 其它费用

	// 以下为getXXX和setXXX方法 get是有返回值-得到值，set是无返回值-放入值
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getEarnestIncome() {
		return earnestIncome;
	}

	public void setEarnestIncome(double earnestIncome) {
		this.earnestIncome = earnestIncome;
	}

	public double getDepositIncome() {
		return depositIncome;
	}

	public void setDepositIncome(double depositIncome) {
		this.depositIncome = depositIncome;
	}

	public double getRentIncome() {
		return rentIncome;
	}

	public void setRentIncome(double rentIncome) {
		this.rentIncome = rentIncome;
	}

	public double getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(double otherIncome) {
		this.otherIncome = otherIncome;
	}

	public double getStaffCost() {
		return staffCost;
	}

	public void setStaffCost(double staffCost) {
		this.staffCost = staffCost;
	}

	public double getRentCost() {
		return rentCost;
	}

	public void setRentCost(double rentCost) {
		this.rentCost = rentCost;
	}

	public double getHydropowerCost() {
		return hydropowerCost;
	}

	public void setHydropowerCost(double hydropowerCost) {
		this.hydropowerCost = hydropowerCost;
	}

	public double getTaxCost() {
		return taxCost;
	}

	public void setTaxCost(double taxCost) {
		this.taxCost = taxCost;
	}

	public double getOtherCost() {
		return otherCost;
	}

	public void setOtherCost(double otherCost) {
		this.otherCost = otherCost;
	}

	// 收入计算-成员方法
	public double calIncome() {
		double sumIncome = earnestIncome + depositIncome + rentIncome
				+ otherIncome;
		return sumIncome;
	}

	// 成本计算-成员方法
	public double calCost() {
		double sumCost = staffCost + rentCost + hydropowerCost + taxCost
				+ otherCost;
		return sumCost;
	}

	// 净收入计算
	public double calNetIncome() {
		System.out.println(companyName + "的净收入计算结果：");
		double netIncome = calIncome() - calCost();
		return netIncome;
	}
}
