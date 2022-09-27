package chap5.task5_2.Example5_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
//例5_6 List及ListIterator接口的使用
public class Example5_6 {
	List list1 = new LinkedList();
	List list2 = new ArrayList();
	ListIterator it;

	//无参构造
	public Example5_6() {
		Student ZhangSan = new Student("张三", 90);

		// 顺序插入元素
		System.out.println("-----------[演示1] 顺序插入元素---------------------");
		list1.add(0, ZhangSan);
		list1.add(1, "张三");
		list1.add(2, "李四");
		list1.add(3, new Student("王武", 85));
		list1.add(4, new Student("赵榴", 76));
		list1.add(5, ZhangSan);
		printCollection(list1);

		// 删除元素（对于LinkedList 建议使用迭代器遍历删除）
		System.out.println("-----------[演示2] 删除元素---------------------");
		it = list1.listIterator();
		while (it.hasNext()) {
			Object o = it.next();
			if (o instanceof String) {
				System.out.println("String 对象 [ " + o + " ] ——从列表中清除！");
				it.remove();
			}
		}

		// //使用循环遍历时，要考虑删除元素后的索引变化，因此需要使用逆序循环。
		// for (int i=5;i>-1;i--) {
		// if (list1.get(i) instanceof String){
		// System.out.println("String 对象 [ "+list1.remove(i)
		// +" ] ——从列表中清除！");
		// }
		// }
		printCollection(list1);
		// 逆序插入元素 将元素加到尾部
		System.out.println("-----------[演示3] 逆序插入元素--------------------");
		list2.add(0, ZhangSan);
		list2.add(0, "李四");
		printCollection(list2);

		// 插入列表 从index=0开始，将list1列表元素加入list2中
		System.out.println("-----------[演示4] 插入列表---------------------");
        list2.addAll(0,list1);

		printCollection(list2);

		// 定位元素
		System.out.println("-----------[演示5] 定位元素---------------------");
		System.out.println("首个 [ " + ZhangSan + " ] 对象位于"
				+ list2.indexOf(ZhangSan));
		System.out.println("末个 [ " + ZhangSan + " ] 对象位于"
				+ list2.lastIndexOf(ZhangSan));

		// 截取子列表
		System.out.println("-----------[演示6] 截取子列表---------------------");

//		System.out.println("1:"+list1.size()); //列表1长度
//		System.out.println("2:"+list2.size());
		list1 = list2.subList(1,5);
		printCollection(list1);
	}

	//输出集合方法
	private void printCollection(List list) {
		it = list.listIterator();
		int n = 0;
		while (it.hasNext()) {
			System.out.println(n + ":" + it.next());
			n++;
		}
	}

	public static void main(String[] args) {
		new Example5_6(); //实例化 调用无参构造
	}
}