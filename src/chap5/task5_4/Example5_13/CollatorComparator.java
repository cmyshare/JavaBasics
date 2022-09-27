package chap5.task5_4.Example5_13;

import java.text.CollationKey;
import java.text.Collator;
import java.util.Comparator;

//定义动态比较类CollatorComparator，实现Comparator动态比较接口，定义自己的比较方式。
public class CollatorComparator implements Comparator {

/**	Collator类简介
 * Collator 类执行区分语言环境的 String 比较。使用此类可为自然语言文本构建搜索和排序例程。
 * Collator 主要处理：规范化的典型等效 字符、多层次的比较。
 * 主要是用来对区域敏感性的字符串比较的，对本地化字符串进行排序。
 * Collator 是一个抽象基类。其子类实现具体的整理策略。Java 平台目前提供了RuleBasedCollator子类，它适用于很多种语言。还可以创建其他子类，以处理更多的专门需要。
 * 与其他区分语言环境的类一样，可以使用静态工厂方法 getInstance 来为给定的语言环境获得适当的 Collator 对象。如果需要理解特定整理策略的细节或者需要修改策略，只需查看 Collator 的子类即可。*/

//https://blog.csdn.net/u013249965/article/details/52507343

	// Collator.getInstance():获得当前默认语言环境的 Collator。
	Collator collator = Collator.getInstance();

	//实例化 Collator，并获取当前语言环境，通过重写比较器 Comparator。比较两个参数，返回比较结果。
	public int compare(Object element1, Object element2) {
		CollationKey key1 = collator.getCollationKey(element1.toString());
		CollationKey key2 = collator.getCollationKey(element2.toString());
		return key1.compareTo(key2);
	}
}
