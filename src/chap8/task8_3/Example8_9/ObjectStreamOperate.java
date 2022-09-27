package chap8.task8_3.Example8_9;

import chap8.task8_3.Example8_8.Student;

import java.io.*;

/**
 * 例8-9 将若干个学生对象写入到文件中，再从该文件中读取出来下显示在控制台
 * 学生对象必须实现序列化
 * ObjectInputStream 对象输入流 从数据输入流中读取序列化对象
 * ObjectOutputStream 对象输出流 将一个对象写入到目标设备上
 * 对象输入输出流 构造方法套接在文件字节输入输出流上
 * 可以用于网络传输
 * 如果希望将对象保存在硬盘上，或者在网络间传输，这是需要将一个对象序列化为字节序列，这个过程就叫做对象的序列化操作。
 * 相应的，如果需要将该字节序列再转换为对应的对象，这个过程就是反序列化。
 *
 * 注意 在反序列化时，出现编码解析内容异常 出现乱码 解决：将txt的格式改为utf-8
 */

public class ObjectStreamOperate {
	public static void main(String[] args) {
		File file=new File("F:\\intellij2020-1\\idea\\JavaBook\\src\\chap8\\task8_3\\Example8_9\\student1.dat");
		try {
			if(!file.exists())
			{
				file.createNewFile();
			}
			//定义文件字节输出流、对象输出流
			FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);//创建对象输出流
			//创建序列化的对象
			Student s1=new Student();
			s1.setStuNO(1);
			s1.setStuName("lili");
			s1.setSex("f");
			s1.setAge(20);
			s1.setScore(85.0);

			Student s2=new Student();
			s2.setStuNO(2);
			s2.setStuName("tom\t");
			s2.setSex("m");
			s2.setAge(19);
			s2.setScore(95.0);

			Student s3=new Student();
			s3.setStuNO(3);
			s3.setStuName("peter");
			s3.setSex("m");
			s3.setAge(21);
			s3.setScore(75.0);

			System.out.println("开始向文件写对象");
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.writeObject(s3);
			oos.close();
			System.out.println("写文件写结束");

			//定义文件字节输入流、对象输入流
			FileInputStream fis=new FileInputStream(file);
			ObjectInputStream ois=new ObjectInputStream(fis);

			//toString在Object对象中 当我们打印一个对象的引用时，实际是默认调用这个对象的toString()方法

			System.out.println("开始从文件读对象");
			//对象转换
			Student  stu1=(Student) ois.readObject();
			System.out.println(stu1);
			Student  stu2=(Student) ois.readObject();
			System.out.println(stu2);
			Student  stu3=(Student) ois.readObject();
			System.out.println(stu3);
			ois.close();
			System.out.println("读文件写结束");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}