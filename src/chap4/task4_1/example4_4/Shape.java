package chap4.task4_1.example4_4;
//父类-Shape形状类
class Shape {
	protected int lineSize; // 线宽

	public Shape() {// 构造方法1
		lineSize = 1;
	}

	public Shape(int ls) {// 构造方法2
		lineSize = ls;
	}

	public void setLineSize(int ls) { // 设置线宽
		lineSize = ls;
	}

	public int getLineSize() {// 获得线宽
		return lineSize;
	}

	public void draw() { // 画图
		System.out.println("Draw a Shape");
	}
}
