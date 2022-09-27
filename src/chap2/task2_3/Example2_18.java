package chap2.task2_3;
//例题2_18break语句和continue语句的使用示例
public class Example2_18 {
	public static void main(String[] args) {
		String output = "";
		int count;
		for (count = 1; count <= 10; count++) {
			if (count == 4) {
				continue;
			}
			if (count == 9) {
				break;
			}
			//count是int类型，output是string类型。  int类使用+“ “转换成string类型 用” “拼接
			output += count++ + " ";
		}
		output += "\nBreak out of loop count at count =" + count; //循环内拼接完，一次输出。
		System.out.println(output);
	}
}
