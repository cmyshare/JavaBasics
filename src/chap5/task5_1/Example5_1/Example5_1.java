package chap5.task5_1.Example5_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//例题5_1Collection接口方法测试，对学生类对象进行添加、删除等操作。
public class Example5_1 {
	public static void main(String[] args) {

		//创建学生对象
		Student stu1 = new Student();

		stu1.setStuNo("0908233111");
		stu1.setStuName("陈君祥");
		stu1.setStuAge(21);
		stu1.setStuAddress("江苏徐州");

		Student stu2 = new Student();
		stu2.setStuNo("0908233112");
		stu2.setStuName("章家其");
		stu2.setStuAge(22);
		stu2.setStuAddress("江苏南京");

		//创建集合对象
		//ArrayList 类是一个可以动态修改的数组，与普通数组的区别就是它是没有固定大小的限制，可以添加或删除元素。
		//ArrayList 继承了 AbstractList ，并实现了 List 接口。
		Collection collection = new ArrayList();


		//add()添加对象
		collection.add(stu1);
		collection.add(stu2);
		System.out.println("after add object:");
		System.out.println("collection.size()=" + collection.size()); //size()判断集合中元素个数

		// 取出对象
		// 1定义迭代器对象collection.iterator()
		// 2循环并判断选择对象iterator.hasNext()
		// 3访问对象iterator.next()
		Iterator iterator=collection.iterator();
		while (iterator.hasNext()){
			Object object=iterator.next();
			Student student=(Student) object; //父对象->子对象
			System.out.println("对象："+student.getStuName());
		}


		//remove()删除对象
		collection.remove(stu1);
		System.out.println("after remove stu1 :");
		System.out.println("collection.size()=" + collection.size());

		//isEmpty()判断集合是否为空
		boolean isEmpty = collection.isEmpty();
		System.out.println("集合是否为空：" + isEmpty);

		//contains()判断集合中是否包含某个对象
		boolean isContains = collection.contains(stu2);
		System.out.println("集合是否包含stu2：" + isContains);

		//清除集合内对象
		collection.clear();
		System.out.println("afeter clear:");
		System.out.println("collection.size()=" + collection.size());
	}
}
