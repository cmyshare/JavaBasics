package scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author cmy
 * @version 1.0
 * @date 2022/5/4 16:41
 * @description 通过流的形式获取用户的输入
 */
public class bufferedReaderString {
    /**
     * 使用 BufferedReader 在控制台读取单个字符
     * 每次调用 read() 方法，它从输入流读取一个字符并把该字符作为整数值返回。
     * 当流结束的时候返回 -1。该方法抛出 IOException
     */
    //public static void main(String[] args) throws IOException {
    //    char c;
    //    //把 System.in 包装在一个 BufferedReader 对象中来创建一个字符流
    //    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //    System.out.println("输入字符, 按下 'q' 键退出。");
    //    // 逐一读取单个字符
    //    do {
    //        c = (char) br.read();
    //        System.out.println(c);
    //    } while (c != 'q');
    //}

    /**
     * 使用 BufferedReader 在控制台读取字符串
     * 从标准输入读取一个字符串需要使用 BufferedReader 的 readLine() 方法
     */
    public static void main(String[] args) throws IOException {
        // 把 System.in 包装在一个 BufferedReader 对象中来创建一个字符流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        // 逐一读取单个字符串
        do {
            str = br.readLine();
            System.out.println(str);
            //输入end退出
        } while (!str.equals("end"));
    }

    /**
     * 控制台输出 演示 System.out.write()
     * 由类 PrintStream 定义，System.out 是该类对象的一个引用。
     * PrintStream 继承了 OutputStream类，并且实现了方法 write()。
     * write() 方法不经常使用，因为 print() 和 println() 方法用起来更为方便
     */
    //public static void main(String[] args) {
    //    int b;
    //    b = 'A';
    //    System.out.write(b);
    //    System.out.write('\n');
    //
    //    System.out.println(b);
    //    System.out.println('\n');
    //}

}
