package scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author cmy
 * @version 1.0
 * @date 2022/5/4 16:33
 * @description next方式接收字符串
 */
public class nextString {
    /**
     * Scanner next获取用户的输入字符串
     * 输入：hello world
     * 输出：hello
     * 原因：空格作为结束符了
     */
    //public static void main(String[] args) throws IOException {
    //    // 从键盘接收数据
    //    Scanner scan = new Scanner(System.in);
    //    // next方式接收字符串
    //    System.out.println("next方式接收：");
    //    // 判断是否还有输入
    //    if (scan.hasNext()) {
    //        //获取一行字符串
    //        String str1 = scan.next();
    //        System.out.println("输入的数据为：" + str1);
    //    }
    //    //关闭Scanner
    //    scan.close();
    //}

    /**
     * Scanner nextLine获取用户的输入字符串
     * 输入：hello world
     * 输出：hello world
     * 原因：空格作为内容获取
     */
    //public static void main(String[] args) {
    //    // 从键盘接收数据
    //    Scanner scan = new Scanner(System.in);
    //    // nextLine方式接收字符串
    //    System.out.println("nextLine方式接收：");
    //    // 判断是否还有输入
    //    if (scan.hasNextLine()) {
    //        //获取一行字符串
    //        String str2 = scan.nextLine();
    //        System.out.println("输入的数据为：" + str2);
    //    }
    //    scan.close();
    //}

    /**
     * next() 与 nextLine() 区别
     * next():
     * 1、一定要读取到有效字符后才可以结束输入。
     * 2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
     * 3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
     * next() 不能得到带有空格的字符串。
     *
     * nextLine()：
     * 1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
     * 2、可以获得空白。
     */

    /**
     * Scanner 获取float int double byte short long特定类型的数据
     * 使用 nextXxx() 来读取 Xxx类型的数据
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据
        int i = 0;
        float f = 0.0f;
        System.out.print("输入整数：");
        if (scan.hasNextInt()) {
            // 判断输入的是否是整数
            i = scan.nextInt();
            // 接收整数
            System.out.println("整数数据：" + i);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是整数！");
        }
        System.out.print("输入小数：");
        if (scan.hasNextFloat()) {
            // 判断输入的是否是小数
            f = scan.nextFloat();
            // 接收小数
            System.out.println("小数数据：" + f);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是小数！");
        }
        scan.close();
    }

}
