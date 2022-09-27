package chap5.task5_3.Example5_8;

public class Point extends Object{
	private double x;
	private double y;

	public Point() {
		super(); //调用父类的无参构造
	}

	public Point(double x, double y) {
		super(); //调用父类的有参构造
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return this.x + " " + this.y;
	}

	//重写hashCode方法-使用hashCode方法计算哈希值？？？？？？？
	//这里重写的是Object类的hashCode()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		//计算哈希码值
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	//重写equals方法-判断x与y是否相等-内容相等？？？？？？？？？？？
	//这里重写的是Object类的equals(Object obj)
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //this代表对象Point
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Point other = (Point) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
}
