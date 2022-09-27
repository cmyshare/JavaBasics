package chap2.task2_1;
//例题2_11定义变量i和语句块内的局部变量j,观察i和j不同的作用域
public class Example2_11 {

	public static void main(String[] args) {
		int i = 0;
		//语句块{}和作用域
		{
			int j = 0;
			System.out.println(i+"\n"); // 语句块外定义的变量在语句块内具有可见性
			System.out.println(j); //转义字符以\开头，\n为换行符
		}
		i = 5;
		// j = 10; //j不可使用，语句块内定义的变量在语句块外不具有可见性
	}
}

