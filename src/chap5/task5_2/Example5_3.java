package chap5.task5_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//例题5_3ArrayList类的方法测试
public class Example5_3 {
	public static void main(String[] args) {

		// 创建ArrayList对象
		List list = new ArrayList();

		// 将指定的元素添加到此列表的尾部
		list.add("王小二");
		list.add("张小三");
		list.add("李小四");
		list.add("陈小六");
		list.add("赵小八");

		System.out.println("list.size=" + list.size());

		// 将指定的元素插入此列表中的指定位
		list.add(2, "孙小五");
		System.out.println("after insert 孙小五");
		System.out.println("list.size=" + list.size());

		// 返回此列表中指定位置上的元素
		String user = (String) list.get(2);
		System.out.println("user=" + user);

		// 返回此列表中首次出现的指定元素的索引，或如果此列表不包含元素，则返回 -1
		int index = list.indexOf("张小三");
		System.out.println("index=" + index);

		// 返回此列表中最后一次出现的指定元素的索引，如果列表不包含索引，则返回 -1。
		int lastIndex = list.lastIndexOf("张小三");
		System.out.println("lastIndex=" + lastIndex);

		// 如果此列表中没有元素，则返回 true
		System.out.println("列表是否为空：" + list.isEmpty());

		// 移除此列表中指定位置上的元素
		list.remove(2);
		System.out.println("after remove index=2");
		System.out.println("list.size=" + list.size());

		// 移除此列表中首次出现的指定元素（如果存在）
		list.remove("张小三");
		System.out.println("after remove 张小三");
		System.out.println("list.size=" + list.size());

		// 按适当顺序（从第一个到最后一个元素）返回包含此列表中所有元素的数组。
		System.out.println("list.toArray遍历****");
		Object[] users = (Object[]) list.toArray();
		for (int i = 0; i < users.length; i++) {
			System.out.print(users[i] + "  ");
		}
		System.out.println();

		// ArrayList遍历方法一
		System.out.println("ArrayList中元素遍历方法一list.get(i)****");
		for (int i = 0; i < list.size(); i++) {
			// 返回此列表中指定位置上的元素
			String userName = (String) list.get(i);
			System.out.print(userName + "   ");
		}

		// ArrayList遍历方法二 iterator列表迭代器
		System.out.println("\nArrayList中元素遍历方法二list.iterator()*****");
		Iterator iterator = list.iterator();

		while (iterator.hasNext()) {
			String userName = (String) iterator.next();
			System.out.print(userName + "   ");
		}

		System.out.println("\n清除列表中所有元素******");
		//清除列表中所有元素
		list.clear();
		System.out.println("after clear list");
		System.out.println("list.size=" + list.size());
	}
}