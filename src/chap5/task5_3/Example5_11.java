package chap5.task5_3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/**
 * 例题5_11TreeSet类的方法测试-树型集合
 */
public class Example5_11 {
	public static void main(String[] args) {
		/**
		 * 创建TreeSet对象，它不仅是实现了Set接口，还是实现了java.util.SortedSet接口，遍历集合时递增顺序获取对象。
		 */
		Set set = new TreeSet();

		// set中添加元素   添加的对象必须实现Comparable接口,也可以是指定比较其递增排序。不然抛出RuntimeException错误
		set.add("jack");
		set.add("alen");
		set.add("rose");
		set.add("black");
		set.add("helo");

		System.out.println("set.size=" + set.size());

		// TreeSet中元素遍历(默认从小到大) TreeSet类让遍历集合时递增顺序获取对象(这里是按照首字母顺序排列)
		Iterator iterator = set.iterator();
		System.out.println("显示set中所有元素");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}