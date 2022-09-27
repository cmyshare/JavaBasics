package chap2.task2_1;
//例题2_7关系运算符使用实例
public class Example2_7 {
	public static void main(String[] args) {
		int n = 3;
		int m = 4;
		System.out.println();
		System.out.println("n<m is " + (n < m)); //结果True
		System.out.println("n=m is " + ((++n) == m)); //结果True
		System.out.println("n>m is " + ((++n) > m)); //结果True
		System.out.println("n is " + n); //n经过了两次自增

		//boolean类型只能进行==或!=比较
	}
}
