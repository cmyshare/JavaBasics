package chap8.task8_3.Example8_7;

import java.io.*;

/**
 * 例8-7 定义学生信息，将这些信息变量保存到student.dat中，
 * 再将这些信息从文件中读取出来显示在控制台上
 * 基本输入输出直流 只能读取写入 字节字符，但不能读写JAVA基本类型数据
 * 过滤器流就是有目标过滤字节或字符的数据流
 * 数据流属于过滤器流的一种 构造方法 套接在文件输入输出流上
 * 常用于网络传输
 */

public class DataStreamOperate {
	public static void main(String[] args) {
		int outSno=10,inSno;
		//保存学号、姓名、性别、年龄、成绩 定义输入 输出变量
		String outName="zlh",inName;
		char outSex='f',inSex;
		int outAge=20,inAge;
		double outScore=90.0,inScore;

		try {
			File file=new File("F:\\intellij2020-1\\idea\\JavaBook\\src\\chap8\\task8_3\\Example8_7\\student.dat");
			if(!file.exists()){
				file.createNewFile();
			}

			FileOutputStream fos=new FileOutputStream(file);
			//创建数据输出流对象-向字节输出流写入基本类型数据
			DataOutputStream dos=new DataOutputStream(fos);
			System.out.println("开始写文件：");
			dos.writeInt(outSno);
			dos.writeUTF(outName);
			dos.writeChar(outSex);
			dos.writeInt(outAge);
			dos.writeDouble(outScore);
			dos.close(); //关闭数据输出流 最晚打开最早关闭
			fos.close(); //关闭文件字节输出流
			System.out.println("写文件结束");

			/**
			 * 注意读取写入 数据顺序要一致
			 */

			FileInputStream fis=new FileInputStream(file);
			//创建数据输入流对象 从字节输入流中读取基本类型数据
			DataInputStream dis=new DataInputStream(fis);
			System.out.println("开始读文件：");
			inSno=dis.readInt();
			inName=dis.readUTF();
			inSex=dis.readChar();
			inAge=dis.readInt();
			inScore=dis.readDouble();
			dis.close();
			fis.close();
			System.out.println("读文件结束");

			System.out.println("从文件中读出的内容是：");
			//字符串拼接
			System.out.println("学号是"+inSno+"姓名是"+inName+"性别是"+inScore+"年龄是"+inAge+"成绩是"+inScore);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
