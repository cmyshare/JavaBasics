package chap5.task5_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * //例题5_9HashSet类的方法测试
 */
public class Example5_9 {
	public static void main(String[] args) {
		// 创建HashSet对象
		Set set = new HashSet();

		// set中添加元素
		set.add("Aaron");
		set.add("Abel");
		set.add("Adam");

		//输出set中元素数目
		System.out.println("set.size=" + set.size());

		//添加一个已存在元素，不会报错，只是添加无效。
		set.add("Abel");
		System.out.println("添加与存在的元素后的set.size=" + set.size());

		// HashSet元素的遍历
		Iterator iterator = set.iterator();
		System.out.println("set集合中的元素是：");
		//循环是否存在另一个可访问的元素iterator.hasNext()
		while (iterator.hasNext()) {
			//返回要访问的下一个元素iterator.next()
			System.out.print(iterator.next() + " ");
		}
	}
}