package chap8.task8_1.Example8_3;

import java.io.*;

/**
 * 例8_3 用FileOutputStream类 向文件中写入数据
 * 文件字节输出流 操作 向目标文件写入数据
 * 注意捕捉异常
 */
public class FileOutputStreamOperate {
	public static void main(String[] args) {
		try {
			//实例化一个文件File，不存在自动创建一个空的
			File file = new File("F:\\intellij2020-1\\idea\\JavaBook\\src\\chap8\\task8_1\\Example8_3\\demo3.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(file);
			// 写一个整数，该整数范围最好在-128~127字节，否则其高位数据被丢失
			fos.write(97);
			// 写一个字节数组,或者部分
			byte b[] = { 'a', 'b', 'c', 'd', 'e' };
			fos.write(b);
			fos.write(b, 0, 2); //局部写入
			// 写一个字符串
			fos.write("hello world!".getBytes()); // 把字符串转化为字节数组并写入到流中
			// 关闭文件字节输出流
			fos.close();

			//通过文件字节输入流读取
			byte[] buf = new byte[1024];
			//通过文件字节输入流 构造方法 创建输入流对象
			FileInputStream fis = new FileInputStream(file);
			int len = fis.read(buf); // 读取内容到字节数组中
			// String构造函数 把字节数组转化为字符串
			System.out.println(new String(buf, 0, len));
			System.out.println(buf); //输出字节
			// 关闭文件字节输入流
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
