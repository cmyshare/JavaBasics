package chap8.task8_2.Example8_6;
import java.io.*;

/**
 * 使用缓冲字符输入输出流 完成文件的复制
 * BufferedInputStream 从文件字符输入流 读取文本
 * BufferedOutputStream 将文本写入 文件字符输出流
 * 构造方法 套接在文件字符输入输出流上
 *
 * 输入输出 都新增了一个操作行的功能readline()、newline()
 * readline() 读到一行的终止符
 * newline()写入一个分行符，但不同操作系统，换行符不同 window-"/r/n" linux-"\n" macos-"\r"
 */
public class BufferReaderAndWriter {

	public static void main(String[] args) {
		try {
			File srcFile = new File("F:\\intellij2020-1\\idea\\JavaBook\\src\\chap8\\task8_2\\Example8_6\\demo6.txt");
			File desFile = new File("F:\\intellij2020-1\\idea\\JavaBook\\src\\chap8\\task8_2\\Example8_6\\demo61.txt");
			if (!srcFile.exists()) {
				srcFile.createNewFile();
			}
			if (!desFile.exists()) {
				desFile.createNewFile();
			}
			FileReader fr = new FileReader(srcFile);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(desFile);
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println("复制文件：" + srcFile.length() + "字节");
			String str="";
			while((str=br.readLine())!=null)
			{
				bw.write(str);
				bw.newLine();
			}
			bw.flush();
			// 关闭流
			br.close();
			bw.close();
			System.out.println("复制完成");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("using: java UseFileStream src des");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}