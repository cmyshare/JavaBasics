package chap4.task4_1.example4_4;
//子类-Rectangle矩形类
class Rectangle extends Shape {
	private int left; // 矩形左上角X坐标
	private int top; // 矩形左上角Y坐标
	private int width; // 矩形长度
	private int height; // 矩形宽度

	public Rectangle(int l, int t, int w, int h) {// 构造方法
		super(2); // 调用父类的构造方法2
		left = l;
		top = t;
		width = w;
		height = h;
	}

	public void draw() {// 覆盖父类的draw()方法
		System.out.println("draw a Rectangle");
	}
}

