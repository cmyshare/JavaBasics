package chap2.task2_4;
//例题2_21使用冒泡排序法，对已经数据从小到大排序。
public class Example2_21 {
	public static void main(String args[]) {
		int i, j;
		int intArray[] = { 4, 1, 5, 8, 9 };
		int len = intArray.length;

	/*	//循环实现冒泡排序-两两对换   每次找出最大值。
		for(i=0;i<intArray.length-1;i++) {

			for(j=0;j<intArray.length-i-1;j++) {

				if(intArray[j]>intArray[j+1]) { //改变>或<符号,改变排序
					int temp=intArray[j];
					intArray[j]=intArray[j+1];
					intArray[j+1]=temp;
				}

			}

		}*/

		for (i = 0; i < len - 1; i++)
			for (j = len - 1; j > i; j--)  //这里是数组最后一个数开始两两比较。

				if (intArray[j - 1] > intArray[j]) {
					int t = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = t;
				}
		//增强型for循环,遍历数组。
		for(int k:intArray){
			System.out.println(k + " ");
		}
	}
}
