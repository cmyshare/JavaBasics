package chap5.task5_4.Example5_13;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/**
 * 例题5_13TreeMap类的方法测试-动态绑定排序
 * 提供了按排序顺序存储关键字/值对的方法，元素按照关键字升序排序，允许快速检索。
 */

public class Example5_13 {
	public static void main(String[] args) {
		//创建一个比较对象CollatorComparator
		CollatorComparator comparator = new CollatorComparator();

		//创建TreeMap对象 使用树实现Map接口，提供了按排列顺序存储key-value对的方法，允许快速检索。
		//元素按照 关键字 默认升序排序。
		TreeMap map = new TreeMap(comparator);

		//添加数字元素到map中
		for (int i = 0; i < 10; i++) {
			String s = "" + (int) (Math.random() * 1000);
			map.put(s, s);
		}

		//添加字符字符串到map中
		map.put("abcd", "abcd");
		map.put("Abc", "Abc");
		map.put("bbb", "bbb");
		map.put("BBBB", "BBBB");
		map.put("eeee", "eeee");

		//添加汉字字符串到map中
		map.put("北京", "北京");
		map.put("中国", "中国");
		map.put("上海", "上海");
		map.put("厦门", "厦门");
		map.put("香港", "香港");

		//遍历TreeMap对象
		Set set=map.entrySet();
		Iterator it = set.iterator();
		int count = 1;
		while(it.hasNext())
		{
			Map.Entry entry=(Map.Entry)it.next();
			//数字排在最前，英文字母其次，汉字则按照拼音进行排序。混合元素集合排序。
			System.out.println("映射的键是：   "+entry.getKey()+"     值是："+entry.getValue());
			if (count % 5 == 0) {
				System.out.println("");
			}
			count++;
		}
	}
}