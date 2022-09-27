package chap5.task5_3.Example5_10;

import javax.jnlp.ClipboardService;
import java.util.*;

/**
 * 例题5_10Comparable接口使用测试-静态绑定排序
 * 把集合中元素排成自然顺序，先名称、再年龄
 */

public class Example5_10 {
	public static void main(String[] args) {
		Set<Customer> set = new HashSet<Customer>();
		//compareTo(Object o)方法把集合排序成自然顺序，从大到小，从长到短。
		Customer customer1 = new Customer("Tom", 17);
		Customer customer2 = new Customer("Tony", 16);
		Customer customer3 = new Customer("Tony1", 15);
		set.add(customer1);
		set.add(customer2);
		set.add(customer3);

		System.out.println(set.size());
		//System.out.println(customer1.compareTo(customer2)); //返回-1，表示目前对象1在对象2前面(自然排序前)
		System.out.println(set);
	}
}
