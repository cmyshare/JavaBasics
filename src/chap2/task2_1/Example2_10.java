package chap2.task2_1;
//例题2_10计算圆的面积和周长
public class Example2_10 {
	public static void main(String[] args) {
		double r = 8.5; // 赋值语句
		double length, area; // 声明语句
		length = 2 * Math.PI * r; //Math类库的常量PI
		area = Math.PI * r * r;
		System.out.println("圆周长为:" + length);// 方法调用语句
		System.out.println("圆面积为:" + area);

		//java中除了表达式语句，还有声明语句和流程控制语句
	}
}
