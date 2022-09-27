package chap4.task4_1.example4_1;
//圆的子类Circle
public class Circle extends Shape {
	double radius; // 定义自己的成员变量

	public double getRadius() { // 定义自己的成员方法
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		double area = Math.PI * radius * radius; // 计算圆的面积
		return area;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius; // 计算并返回圆的周长
	}
}