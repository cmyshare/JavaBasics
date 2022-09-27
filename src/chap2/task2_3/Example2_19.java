package chap2.task2_3;
//例题2_19使用foreach语句对数组进行遍历。
public class Example2_19 {
	public static void main(String []args)
	{
		int arr[]={1,2,3,4,5}; //定义一个一维数组
		System.out.println("一维数组中的元素分别为：");
		//for增强型语句，称为foreach，任何foreach可改为for
		for(int a :arr)
		{
			System.out.println(a+"\n");  //每一个输出语句中末尾都有一个\n
		}
	}
}
