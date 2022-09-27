package chap4.task4_3.example4_10;
//例题4_10方法多态性示例
//动态多态条件：继承、重写、父类引用子列对象(对象类型转换——向上转型)
public class Test {
	public static void main(String args[]) {
		Shape s = new Shape(); //动态绑定为类Shape对象
		Shape c = new Circle(); //动态绑定为类Circle对象
		Shape e = new Ellipse(); // 动态绑定为类Ellipse对象

		s.draw(); //Shape对象访问父类Shape的方法
		c.draw(); //Shape对象访问子类Circle的方法
		e.draw(); //Shape对象访问子类Ellipse的方法
	}
}
