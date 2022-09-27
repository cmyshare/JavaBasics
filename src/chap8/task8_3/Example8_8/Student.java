package chap8.task8_3.Example8_8;

import java.io.Serializable;

/**
 * 例8-8 定义序列化的学生类
 * 对象序列化 就是 把一个对象变为二进制的数据流的一种方法，实现对象的传输存储
 * 对象实现Serializable接口 就完成对象序列化-》序列化对象
 */

public class Student implements Serializable{//实现了序列化接口
	private int stuNO;
	private String stuName;
	private String sex;
	private int age;
	private double score;
	public Student() {
		super();
	}
	public int getStuNO() {
		return stuNO;
	}
	public void setStuNO(int stuNO) {
		this.stuNO = stuNO;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}

	// toString在Object对象中 当我们打印一个对象的引用时，实际是默认调用这个对象的toString()方法
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "学号是"+this.getStuNO()+"\t姓名是"+this.getStuName()+"\t性别是"+this.getSex()+"\t年龄是"+this.getAge()+"\t成绩是"+this.getScore();
	}

}