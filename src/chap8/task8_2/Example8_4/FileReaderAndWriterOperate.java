package chap8.task8_2.Example8_4;

import java.io.*;

/**
 * 例8-4 将一个文件中的小写字母改为大写字母后 复制到另一个文件中
 */
public class FileReaderAndWriterOperate {
	public static void main(String[] args) {
		try {
			File file1 = new File("F:\\intellij2020-1\\idea\\JavaBook\\src\\chap8\\task8_2\\Example8_4\\demo4.txt"); // 源文件

			File file2 = new File("F:\\intellij2020-1\\idea\\JavaBook\\src\\chap8\\task8_2\\Example8_4\\democopy.txt"); // 修改后的文件
			if (!file1.exists()) {
				file1.createNewFile();
			}
			if (!file2.exists()) {
				file2.createNewFile();
			}
			//创建文件字符输入流 从指定文件中读取字符数据
			FileReader fr = new FileReader(file1); // 从源文件读数据
			//创建文件字符输出流 将字符数据写入指定文件中 继承了文件字节输出流OutputStreamWriter
			FileWriter fw = new FileWriter(file2); // 将修改好的写入新文件
			//创建字符数组
			char charTemp[] = new char[128];

			int size = fr.read(charTemp);  //fr读入字符数组中，并返回读取数组的个数
			for (int k = 0; k < size; k++) {
				char ch = charTemp[k];
				if (ch >= 'a' && ch <= 'z') {  //将小写转换为大写
					charTemp[k] = (char) (ch - 32);
				}
			}
			fw.write(charTemp, 0, size);    //写入到新文件中
			fw.close();   //文件字符输出流必须要关闭，否则不能写
			fr.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
