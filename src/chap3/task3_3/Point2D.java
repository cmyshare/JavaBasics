package chap3.task3_3;
//例题3_9构造方法声明示例
public class Point2D {
	private int x;
	private int y;

	// 定义无参构造
	public Point2D() {
	}

	// 定义带两个参数的构造方法
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
