package chap3.task3_3;
//例题3_8方法重载示例
public class Example3_8 {
	public static void print(String str) {
		System.out.println("String=" + str);
	}

	public static void print(int i) {
		System.out.println("int=" + i);
	}

	public static void print(float i) {
		System.out.println("float=" + i);
	}

	public static void main(String[] args) {
		print("123"); //	通过方法名，直接调用类方法
		print(123);
		print(1.23f);
	}
}
