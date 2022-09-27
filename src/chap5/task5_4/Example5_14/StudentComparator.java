package chap5.task5_4.Example5_14;

import chap5.task5_4.Example5_12.Student;

import java.util.Comparator;

//定义动态比较类CollatorComparator，实现Comparator动态比较接口，定义自己的比较方式。
public class StudentComparator implements Comparator<Student> {
	//根据学生年龄比较
	public int compare(Student stu1, Student stu2) {
		if (stu1.getAge() > stu2.getAge()) {
			return 1;
		} else if (stu1.getAge() < stu2.getAge()) {
			return -1;
		}
		return 0;
	}
}