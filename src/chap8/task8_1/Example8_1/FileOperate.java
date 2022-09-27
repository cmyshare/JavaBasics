package chap8.task8_1.Example8_1;

import java.io.*;

/**
 * 例8-1 new/del/copy/move操作文件
 * 通过JAVA 实现对 File 文件目录文件夹 文件 文件内容的增删改查、复制移动
 */
public class FileOperate {
	public FileOperate() {
	}
	public static void main(String args[]) {
		//	创建中文名时出现乱码 需要调整编码方式
		newFolder("F:\\intellij2020-1\\idea\\JavaBook\\src\\chap8\\task8_1\\Example8_1\\Folder");
		//当前目录
		newFile("F:\\intellij2020-1\\idea\\JavaBook\\src\\chap8\\task8_1\\Example8_1\\File.txt","这是文件内容");
		//文件重命名
		renameFile("F:\\intellij2020-1\\idea\\JavaBook\\src\\chap8\\task8_1\\Example8_1\\File.txt");
		//删除文件
		delFile("F:\\intellij2020-1\\idea\\JavaBook\\src\\chap8\\task8_1\\Example8_1\\FileRename.txt");
		//删除文件夹
		delFolder("F:\\intellij2020-1\\idea\\JavaBook\\src\\chap8\\task8_1\\Example8_1\\Folder");

	}

	//新建目录
	public static void newFolder(String folderPath) {
		//抛出异常
		try {
			//目录新建 new File(folderPath) 建立文件目录对象 根据路径
			File myFilePath = new File(folderPath);
			//判断路径是否存在
			if (!myFilePath.exists()) {
				//文件目录创建
				myFilePath.mkdir();
			}
		} catch (Exception e) {
			System.out.println("新建目录操作出错");
			e.printStackTrace();
		}
	}

	// 新建文件 文件名、文件内容
	public static void newFile(String filePathAndName, String fileContent) {

		try {
			//实例化File 建立文件对象 传入构造参数-文件名
			File myFilePath = new File(filePathAndName);
			//判断文件路径是否存在
			if (!myFilePath.exists()) {
				//创建新的文件
				myFilePath.createNewFile();
			}
			//实例化FileWriter写入文件路径 得到文件字符输出流
			FileWriter resultFile = new FileWriter(myFilePath);
			//resultFile作为对象写入文件 将对象的格式化表示打印到文本输出流。
			PrintWriter myFile = new PrintWriter(resultFile);
			//把内容写进入文件
			String strContent = fileContent;
			myFile.println(strContent);
			//关闭文件
			resultFile.close();

		} catch (Exception e) {
			System.out.println("新建目录操作出错");
			e.printStackTrace();
		}

	}

	//文件重命名
	public static void renameFile(String filePathAndName) {
		try {
			//新建文件对象，根据文件路径
			File myDelFile = new File(filePathAndName);
			//文件重命名
			myDelFile.renameTo(new File("F:\\intellij2020-1\\idea\\JavaBook\\src\\chap8\\task8_1\\Example8_1\\FileRename.txt"));
		} catch (Exception e) {
			System.out.println("删除文件操作出错");
			e.printStackTrace();
		}
	}

	//删除文件 
	public static void delFile(String filePathAndName) {
		try {
			//新建文件对象，根据文件路径
			File myDelFile = new File(filePathAndName);
			//文件删除
			myDelFile.delete();
		} catch (Exception e) {
			System.out.println("删除文件操作出错");
			e.printStackTrace();
		}
	}

	// 删除文件夹 
	public static void delFolder(String folderPath) {
		try {
			delAllFile(folderPath); //1 删除完里面所有内容
			File myFilePath = new File(folderPath); //通过folderPath得到
			myFilePath.delete(); //2 删除空文件夹目录本身
		} catch (Exception e) {
			System.out.println("删除文件夹操作出错");
			e.printStackTrace();
		}
	}

	//删除文件夹里面的所有文件 递归操作 根据路径删除
	public static void delAllFile(String path) {
		File file = new File(path);
		//如果文件不存在 返回
		if (!file.exists()) {
			return;
		}
		//如果不是文件目录 返回
		if (!file.isDirectory()) {
			return;
		}
		//如果是目录 就递归处理 用String列表
		String[] tempList = file.list();
		File temp = null;
		for (int i = 0; i < tempList.length; i++) {
			//如果是子目录，重新构造File处理 系统相关的默认名称分隔符，为方便起见表示为字符串。该字符串包含单个字符
			if (path.endsWith(File.separator)) {
				temp = new File(path + tempList[i]);
			} else {
				//反之 则加入File.separator 在linux正斜杠 在windows反斜杠
				temp = new File(path + File.separator + tempList[i]);
			}
			// 如果是文件就 删除
			if (temp.isFile()) {
				temp.delete();
			}
			//如果是目录 就递归删除
			if (temp.isDirectory()) {
				delAllFile(path + "/" + tempList[i]); //1 先删除文件夹里面的文件
				delFolder(path + "/" + tempList[i]); //2 再删除空文件夹
			}
		}
	}

	// 复制单个文件
	public static void copyFile(String oldPath, String newPath) {
		try {
			int bytesum = 0;
			int byteread = 0;
			File oldfile = new File(oldPath);
			if (oldfile.exists()) { //文件存在时
				//读入原文件 定义文件字节输入流  从数据源中把字节数据读取进来
				InputStream inStream = new FileInputStream(oldPath);
				//文件字节输出流 将字节数据局写到目标设备中 过滤流实现对不同类型数据操作
				FileOutputStream fs = new FileOutputStream(newPath);
				//定义字节数组 存放字节流数据
				byte[] buffer = new byte[1444];
				int length;
				//将数据 读取进字节数组buffer中
				while ((byteread = inStream.read(buffer)) != -1) {
					bytesum += byteread; //字节数 文件大小
					System.out.println(bytesum);
					//将数据写到字节数组中中
					fs.write(buffer, 0, byteread);
				}
				inStream.close();
			}
		} catch (Exception e) {
			System.out.println("复制单个文件操作出错");
			e.printStackTrace();
		}
	}

	//复制整个文件夹内容
	public static void copyFolder(String oldPath, String newPath) {
		try {
			(new File(newPath)).mkdirs(); //如果文件夹不存在 则建立新文件夹
			File a = new File(oldPath);
			String[] file = a.list();
			File temp = null;
			for (int i = 0; i < file.length; i++) {
				if (oldPath.endsWith(File.separator)) {
					temp = new File(oldPath + file[i]);
				} else {
					temp = new File(oldPath + File.separator + file[i]);
				}
				if (temp.isFile()) {
					FileInputStream input = new FileInputStream(temp);
					FileOutputStream output = new FileOutputStream(newPath
							+ "/" + (temp.getName()).toString());
					byte[] b = new byte[1024 * 5];
					int len;
					while ((len = input.read(b)) != -1) {
						output.write(b, 0, len);
					}
					output.flush();
					output.close();
					input.close();
				}
				if (temp.isDirectory()) {//如果是子文件夹
					copyFolder(oldPath + "/" + file[i], newPath + "/" + file[i]);
				}
			}
		} catch (Exception e) {
			System.out.println("复制整个文件夹内容操作出错");
			e.printStackTrace();
		}
	}

	//移动文件到指定目录
	public static void moveFile(String oldPath, String newPath) {
		copyFile(oldPath, newPath);
		delFile(oldPath);
	}

	//移动文件夹到指定目录
	public static void moveFolder(String oldPath, String newPath) {
		copyFolder(oldPath, newPath);
		delFolder(oldPath);
	}
}
