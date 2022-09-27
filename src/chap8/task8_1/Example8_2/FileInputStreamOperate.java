package chap8.task8_1.Example8_2;

import java.io.*;

/**
 * 使用文件字节输入流，从文件中读取一个字节数据、多个字节数据到程序中。
 */
public class FileInputStreamOperate {
	public static void main(String[] args) {
		//创建File文件对象
		File file=new File("F:\\intellij2020-1\\idea\\JavaBook\\src\\chap8\\task8_1\\Example8_2\\demo2.txt");
		try {
			//如果文件不存在，则创建文件
			if(!file.exists())
			{
				file.createNewFile();
			}
			//创建文件字节输入流，用来从文件中读取字节数据
			FileInputStream fis=new FileInputStream(file);
			//一次读一个字节
			System.out.println("以字节为单位读取文件内容，一次读一个字节："); 
			int tempbyte;
			//文件没有结束 如果等于-1表示当前位置没有数据 读到末尾
			while((tempbyte=fis.read()) !=-1 ){
			//输入控制台 一个字节
			 System.out.write(tempbyte);
			 ////输出控制台 一个字节
			 //System.out.print(tempbyte);
			}
			//关闭输入流
			fis.close();
			
			FileOutputStream fos=new FileOutputStream(file,true);

			//一次读取多个字节
			System.out.println("\n以字节为单位读取文件内容，一次读多个字节：");
			//创建文件字节输入流，用来从文件中读取字节数据
			fis=new FileInputStream(file);
			//定义 一个字节数组，一次读取64个字节
			byte[] tempbytes = new byte[64];
			//读入多个字节到字节数组中，byteread为一次读入的字节数 
			fis.read(tempbytes);
			//输入控制台 多个字节 从0到30位置
			System.out.write(tempbytes,0,30);

			//文件没有结束 如果等于-1表示当前位置没有数据 读到末尾
			while ((tempbyte = fis.read(tempbytes))!=-1){
			//输入控制台 多个字节 从0到30位置
			System.out.write(tempbytes,0,30);
			////输出控制台 多个字节
			//System.out.print(tempbytes);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
