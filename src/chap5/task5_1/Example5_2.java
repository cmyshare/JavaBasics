package chap5.task5_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
//例题5_2使用Iterator遍历对象进行集合遍历
public class Example5_2 {
	public static void main(String[] args) {
		// 取出对象
		// 1定义迭代器对象collection.iterator()
		// 2循环并判断选择对象iterator.hasNext()
		// 3访问对象iterator.next()

		//创建集合对象
		Collection collection = new ArrayList();
		List list=new ArrayList();

		//添加集合元素
		collection.add("stu1");
		collection.add("stu2");
		collection.add("stu3");

		//获得一个迭代器对象:iterator
		Iterator iterator = collection.iterator();

		//iterator.hasNext()判断是否存在另一个可访问的元素
		while (iterator.hasNext()) {//遍历
			//iterator.next()返回要访问的下一个元素 返回Object。到达集合结尾，则抛出NoSuchElementException
			Object element = iterator.next();
			System.out.println("iterator = " + element);
		}

		if (collection.isEmpty()) {
			System.out.println("collection is Empty!");
		} else {
			System.out.println("collection is not Empty! size="
					+ collection.size());
		}

		//获得一个迭代器对象：iterator2
		Iterator iterator2 = collection.iterator();
		while (iterator2.hasNext()) {//移除元素
			Object element = iterator2.next();
			System.out.println("remove: " + element);
			//删除上次访问返回的对象，本方法必须紧跟在一个元素的访问后。
			// 上次访问后集合被修改，抛出错误IllegalStateException。
			iterator2.remove();
		}

		//获得一个迭代器对象:iterator3
		Iterator iterator3 = collection.iterator();
		if (!iterator3.hasNext()) {//察看是否还有元素
			System.out.println("没有元素了");
		}

		//判断集合是否为空
		if (collection.isEmpty()) {
			System.out.println("collection is Empty!");
		}
	}
}