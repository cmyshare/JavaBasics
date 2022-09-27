package chap8.task8_1.Example8_3;

import java.io.*;

/**
 * 例8_3 用FileOutputStream类读出 写入文件的数据
 */
public class FileInputOutputOperate {
	
	public static void main(String[] args){
		
		try{
			
			//创建文件
			File file=new File("demo.txt");
			if(!file.exists()){		
				file.createNewFile();
			}
			
			//写入文件
			FileOutputStream fos=new FileOutputStream(file,true);
			byte[] b="Hello,world".getBytes();
			fos.write(b);
			
			//从文件中读取
			FileInputStream fin=new FileInputStream(file);
			byte[] b1=new byte[50];
			int temp=0;
			String str="";
			while((temp=fin.read(b1))!=-1){		
				System.out.println(new String(b1));		
			}
			
			
			//关闭字节流
			fin.close();
			fos.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
