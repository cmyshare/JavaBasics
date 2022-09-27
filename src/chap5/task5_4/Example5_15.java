package chap5.task5_4;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * 例题5_15 Collections集合类的工具 使用测试
 * 主要针对List和Set集合
 */
public class Example5_15 {
	public static void main(String[] args) {
		//实例化一个链接列表，存放String类型数据
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");

		// 创建一个逆序的比较器-自定义
		Comparator<String> r = Collections.reverseOrder();
		// 通过逆序的比较器进行排序
		Collections.sort(list, r);
		System.out.println("逆序的比较器进行排序******");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("反顺序******");
		// 反顺序-上面反、这里反——得正
		Collections.reverse(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}


		System.out.println("打乱顺序******");
		// 打乱顺序
		Collections.shuffle(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("输出最大和最小的数******");
		// 输出最大和最小的数
		System.out.println(Collections.max(list) + ":" + Collections.min(list));
	}
}
