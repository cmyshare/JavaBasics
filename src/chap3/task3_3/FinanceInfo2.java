/**
 * 单元3 面向对象程序设计
 * 任务3 FinanceInfo2 财务信息类设计 FinanceInfo2Test 创建测试类进行测试 使用构造方法(有参/无参构造)设计。
 * 财务信息类的成员变量包括公司名称、定金收入、押金收入、租金收入、其他收入、员工成本、房租、水电、税收及其他费用
 * 财务信息类的成员方法包括收入计算、成本计算、净收入计算
 */

package chap3.task3_3;

public class FinanceInfo2 {
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




	// 无参数构造方法
	public FinanceInfo2() {
		System.out.println("使用无参数构造方法创建财务信息对象！");
	}

	// 带参数构造方法
	public FinanceInfo2(String companyName, double earnestIncome,
						double depositIncome, double rentIncome, double otherIncome,
						double staffCost, double rentCost, double hydropowerCost,
						double taxCost, double otherCost) {
		//在类的继承中，子类的构造方法中默认会有super()语句存在，
		// 相当于执行父类的相应构造方法中的语句,可以有参/无参,即这样可以对父类进行初始化
		//https://zhidao.baidu.com/question/279318547.html
		super();
		System.out.println("使用带参数的构造方法创建财务信息类对象");
		this.companyName = companyName;
		this.earnestIncome = earnestIncome;
		this.depositIncome = depositIncome;
		this.rentIncome = rentIncome;
		this.otherIncome = otherIncome;
		this.staffCost = staffCost;
		this.rentCost = rentCost;
		this.hydropowerCost = hydropowerCost;
		this.taxCost = taxCost;
		this.otherCost = otherCost;
	}

	// 一组set/get属性方法

	// 收入计算
	public double calIncome() {
		double sumIncome = earnestIncome + depositIncome + rentIncome
				+ otherIncome;
		return sumIncome;
	}

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

	// 成本计算
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
