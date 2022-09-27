package chap4.task4_1.example4_2;
//父类_员工类
public class Employee {
	//成员变量
	int employeeID; //职工号
	String name; //职工姓名
	String address; //住址
	double pay; //工资
	//成员方法
	public Employee() {
		super();
	}

	public double getPay() {
		//计算职工工资
		return this.pay;
	}

	// get和set方法
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}
}