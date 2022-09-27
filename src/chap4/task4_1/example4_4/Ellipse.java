package chap4.task4_1.example4_4;
//子类-Ellipse椭圆类
class Ellipse extends Shape {
	private int centerX; // 圆心X坐标
	private int centerY; // 圆心Y坐标
	private int width; // 椭圆宽度
	private int height; // 椭圆高度

	public Ellipse(int x, int y, int w, int h) {// 构造方法
		super(); // 调用父类的构造方法1
		centerX = x;
		centerY = y;
		width = w;
		height = h;
	}

	public void draw() {// 覆盖父类的draw()方法
		System.out.println("draw a Ellipse");
	}
}
