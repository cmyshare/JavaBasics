package chap4.task4_1.example4_4;
//例题4_4设计一个画图程序
public class Test {
	public static void main(String args[]) {
		Ellipse ellipse = new Ellipse(30, 30, 50, 60); // 创建子类Ellipse的对象
		//ellipse.setLineSize(2); // 调用父类方法重新设置lineSize 值为2
		System.out.println("LineSize of ellipse : " + ellipse.getLineSize());

		Rectangle rectangle = new Rectangle(0, 0, 20, 30); // 创建子类rectangle对象
		//rectangle.setLineSize(3); // 调用父类方法重新设置lineSize属性为3
		System.out.println("LineSize of rectangle : " + rectangle.getLineSize());
		ellipse.draw(); // 访问子类方法
		rectangle.draw(); // 访问子类方法
	}
}
