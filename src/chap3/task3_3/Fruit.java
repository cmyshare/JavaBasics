package chap3.task3_3;
//例题3_10定义一个水果类——类的构造方法示例
public class Fruit {
	public String color; // 定义颜色成员变量

	// 定义构造方法
	public Fruit() {
		color = "绿色"; // 对变量color进行初始化
	}

	public void harvest() { // 定义收获的方法  重载构造方法
		String color = "红色"; // 定义颜色局部变量
		System.out.println("水果是：" + color + "的！");
		System.out.println("水果已经收获……");
		System.out.println("水果原来是：" + this.color + "的！");
	}

	public static void main(String[] args) {
		// 声明Fruit类的一个对象fruit，并为其分配内存  对象声明-对象实例化
		Fruit myfruit = new Fruit();
		myfruit.harvest(); // 调用Fruit类的harvest()方法
	}
}
