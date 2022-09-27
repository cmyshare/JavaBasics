package chap4.task4_4;
//例题4_15三角函数实例
public class example4_15 {
	public static void main(String args[]) {
		System.out.println("60度的正弦值："+Math.sin(Math.PI/3));//取60度的正弦
		System.out.println("180度的余弦值："+Math.cos(Math.PI));//取180度的余弦
		System.out.println("90度的正切值："+Math.tan(Math.PI/2));//取90度的正切
		System.out.println("0的反正弦值："+Math.asin(0));//取0的反正弦
		System.out.println("1的反余弦值："+Math.acos(1));//取1的反余弦
		System.out.println("1的反正切值："+Math.atan(1));//取1的反正切
		//弧度的定义是：两条射线从圆心向圆周射出，形成一个夹角和夹角正对的一段弧。
		//当这段弧长正好等于圆的半径时，两条射线的夹角大小为1弧度。

        //圆弧长公式：弧长=nπr/180  n就是角度数，即圆心角n所对应的弧长。
		//用弧度求扇形面积公式：S=|α| r^2/2 二分之一倍的α角的大小，与半径的平方之积。
		//半径为r的扇形面积为nºπr²/360º

		//把度化成弧度的公式：弧度＝度×π/180 单位rad
		System.out.println("45度的弧度值："+Math.toRadians(45));//取45度的弧度值 角度->弧度
		//把弧度化成度的公式：度＝弧度×180°/π
		System.out.println("п/2的角度值："+Math.toDegrees(Math.PI/2));//取п/2的角度值 弧度->角度
	}
}
