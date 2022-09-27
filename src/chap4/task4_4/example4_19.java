package chap4.task4_4;
//例题4_19StringBuffer的使用
public class example4_19 {
	public static void main(String[] args) {
		// StringBuffer的使用
		String s = "Hello java!";
		StringBuffer str = new StringBuffer();

		// 在str后添加字符(串)
		str.append(s).append("你好！").append("Java!");
		System.out.println(str);

		// 删除索引为0的位置的字符
		str.deleteCharAt(0);
		System.out.println(str);

		// 从索引为0的位置开始，截取11个字符 空格字符也算。
		s = str.substring(0, 11);
		System.out.println(s);

		// 使str内容反向
		str.reverse();
		System.out.println(str);

		// 在4索引后插入第二个参数的内容
		str.insert(4, "这是插入的字符");
		System.out.println(str);
	}
}