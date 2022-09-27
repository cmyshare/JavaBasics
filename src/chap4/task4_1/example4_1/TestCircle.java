package chap4.task4_1.example4_1;
//例题4_1求图形的面积和周长
public class TestCircle {
	public static void main(String[] args) {
		Circle myShape = new Circle();
		myShape.setType("圆"); // 调用超类的方法
		myShape.setRadius(5.2); // 调用子类的方法
		System.out.println("myShape的类别是:" + myShape.getType());
		double area = myShape.getArea();
		System.out.println("myShape的面积是:" + area);
		System.out.println("myShape的周长是:" + myShape.getPerimeter());
	}
}
