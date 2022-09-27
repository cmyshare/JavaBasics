package chap2.task2_4;
//例题2_20声明一个整型数组并对它初始化，输出各元素的值和其总和。
public class Example2_20 {
	public static void main(String args[]) {
		//静态初始化
		int a[] = { 1, 2, 3 }; // 定义、创建、初始化数组
		int i, sum = 0;

		for (i = 0; i < a.length; i++)
			sum = sum + a[i]; // 获取数组元素并进行累加

		for (i = 0; i < a.length; i++)
			System.out.println(" a["+ i +"]=" + a[i]); // 获取数组元素并输出其值  " + i + "在字符串中嵌套输出变量
		System.out.println(" sum=" + sum);

		//动态初始化
		int b[]; //定义一个数组变量
		b=new int[6]; //创建数组对象，分配内存单元。
		for (int j = 0; j < 6; j++) {
			b[j]=j;
			System.out.println(b[j]);
		}
	}
}
