package chap2.task2_1;
//例2_1整型进制转换
public class Example2_1 {
    public static void main(String[] args) {
        byte a = 56; /* byte占8位(2^7~2^7-1) 以此类推*/
        System.out.println("hello world"+a);
        short b = 63;  /*short占16位*/
        System.out.println("hello world"+b);
        int c = 073; /* int占32位 073八进制数*/
        System.out.println(c);
        long d=0xa38f;  /*long占64位 0xa38f十六进制数*/
        System.out.println(d);
    }
}
