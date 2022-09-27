package chap2.task2_1;
//例2_3布尔类型的使用
public class Example2_3 {
    public static void main(String[] args) {
        String a="123456"; /* 字符串类型 */
        char b='1';  /*字符类型 无符号16位 0-65536*/
        boolean c=true; /*布尔类型*/
        System.out.println(a+b); /*字符类型的连接*/
        System.out.println(c);

        //数据类型的转换 低级-高级(自动) 反之(强制)
        //低-高：(byte,short,char)-int-long-float-double

        // char-int
        char a1=(char)97;
        int b1='\u008a';
        int c1='a';
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);

        //instanceof关键字判断变量是否是目标类型 a instanceof int
        int i=1; //int类型变量
        System.out.println(getType(i)); //打印变量类型为int

	}
    public static String getType(Object o) { //获取变量类型方法
        return o.getClass().toString(); //使用int类型的getClass()方法
    }
}
