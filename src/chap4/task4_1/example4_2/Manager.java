package chap4.task4_1.example4_2;
//例题4_2设计并实现公司的职工类
//子类_管理者类
class Manager extends Employee{
	//新增自己的成员变量
	String response;   //职责
	String department;  //所在部门
	//定义自己的成员方法
	public void upPay(double p){
		pay=pay+p;  //这里的pay是Emplyee的变量
	}
	//由于管理者和普通职工计算工资方法不同，根据需要重新定义getPay()方法
	public double getPay()  { //计算管理者工资
		return this.pay*1.5;
	}

	//测试
	public static void main(String[] args) {
		Manager manager=new Manager();
		manager.upPay(100.0);
		System.out.println(manager.getPay());
	}
}
