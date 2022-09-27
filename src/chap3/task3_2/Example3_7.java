package chap3.task3_2;
//例题3_7测试类变量与实例变量的使用区别
public class Example3_7 {
	int i = 0; //实例变量
	static int j = 0; //类变量(静态变量) 是等程序结束时才释放静态存储区。

	public void print() {
		System.out.println("i=" + i);
		System.out.println("j=" + j);
	}

	public static void main(String[] args) {
		Example3_7 sv1 = new Example3_7();
		sv1.i++;
		sv1.j++;
		sv1.print();
		Example3_7 sv2 = new Example3_7();
		sv2.print();
	}
}
