package chap2.task2_4;
//对数组元素进行查询，如果能找到，输出该元素的位置
public class Example2_22 {
	public static void main(String[] args) {
		int b = 46;
		int index = 0;
		int a[] = { 23, 56, 78, 12, 34, 90, 46, 22, 14, 79 };
		for (int i = 0; i < 10; i++) {
			System.out.print("\t" + a[i]);
			if (b == a[i])
				index = i;
		}
		System.out.print("\n");
		System.out.print("找到了该数，位置在第：" + (index + 1 + "号！")); //因为下标从0开始。
	}
}
