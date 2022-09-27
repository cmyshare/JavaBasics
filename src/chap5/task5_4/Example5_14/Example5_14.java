package chap5.task5_4.Example5_14;

import chap5.task5_4.Example5_12.Student;

import java.util.Arrays;
/**
 * 例题5_14 Comparator接口的方法测试_根据学生年龄排序
 */

public class Example5_14 {
	public static void main(String[] args) {
		// 创建学生对象
		Student stu1 = new Student();
		stu1.setName("one");
		stu1.setAge(18);

		Student stu2 = new Student();
		stu2.setName("two");
		stu2.setAge(20);

		Student stu3 = new Student();
		stu3.setName("three");
		stu3.setAge(19);

		// 创建学生对象数组
		Student[] students = { stu1, stu2, stu3 };

		// 显示排序前的学生对象数组
		System.out.println("排序前学生信息");
		for (int i = 0; i < students.length; i++) {
			Student stu = (Student) students[i];
			System.out.print(stu.getName() + ":" + stu.getAge() + "   ");
		}
		System.out.println("");

		// 根据学生年龄排序 Arrays的排序函数sort(数据，自定义的Comparator动态比较接口实现类)
		Arrays.sort(students, new StudentComparator()); //递增

		// 显示排序后的学生对象数组
		System.out.println("排序后学生信息");
		for (int i = 0; i < students.length; i++) {
			Student stu = (Student) students[i];
			System.out.print(stu.getName() + ":" + stu.getAge() + "   ");
		}
	}
}