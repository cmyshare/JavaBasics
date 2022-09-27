package chap8.task8_2.Example8_5;

import java.io.*;

/**
 * 使用缓冲字节输入输出流 完成文件的复制
 * BufferedInputStream 从文件字节输入流 读取文本
 * BufferedOutputStream 将文本写入 文件字节输出流
 * 构造方法 套接在文件字节输入输出流上
 */
public class BufferedStreamOperate {
	public static void main(String[] args) {
		try {
			File srcFile = new File("F:\\intellij2020-1\\idea\\JavaBook\\src\\chap8\\task8_2\\Example8_5\\demo5.txt");
			File desFile = new File("F:\\intellij2020-1\\idea\\JavaBook\\src\\chap8\\task8_2\\Example8_5\\demo51.txt");
			if (!srcFile.exists()) {
				srcFile.createNewFile();
			}
			if (!desFile.exists()) {
				desFile.createNewFile();
			}
			FileInputStream fis = new FileInputStream(srcFile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream(desFile);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			System.out.println("复制文件：" + srcFile.length() + "字节");
			byte data[] = new byte[(int) srcFile.length()];
			while (bis.read(data) != -1) {
				bos.write(data);
			}
			// 将缓冲区中的数据全部写出
			bos.flush();
			// 关闭流
			bis.close();
			bos.close();
			System.out.println("复制完成");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("using: java UseFileStream src des");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
