package chap5.task5_4.Example5_12;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * 例题5_12HashMap类的方法测试
 */

public class Example5_12 {
	public static void main(String[] args) {

		//创建HashMap对象
		Map map=new HashMap();

		//创建学生对象
		Student stu1=new Student();
		stu1.setNo("0908001");
		stu1.setName("张阳");
		stu1.setAge(20);
		stu1.setAddress("江苏徐州");

		Student stu2=new Student();
		stu2.setNo("0908002");
		stu2.setName("孙旭");
		stu2.setAge(19);
		stu2.setAddress("江苏常州");

		Student stu3=new Student();
		stu3.setNo("0908003");
		stu3.setName("李东");
		stu3.setAge(21);
		stu3.setAddress("江苏苏州");

		//以stuNo为key,student对象为value保存中map中   这里按年龄进行递增排序
		map.put(stu1.getNo(), stu1);
		map.put(stu2.getNo(), stu2);
		map.put(stu3.getNo(), stu3);

		System.out.println(map); //Student.toString方法输出格式

		//containsKey:如果此映射包含 对于指定键 的映射关系，则返回 true。
		boolean isContainsKey=map.containsKey(stu1.getNo());
		System.out.println("根据学生学号判断是否包含学生一:"+isContainsKey);

		//containsValue：如果此映射将一个或多个键映射到 指定值 ，则返回 true。
		boolean isContainsValue=map.containsValue(stu2);
		System.out.println("根据学生对象值判断是否包含学生二:"+isContainsValue);

		//get(Object key) ：返回指定键所映射的值。
		Student stu=(Student)map.get(stu3.getNo());
		System.out.println("stuName="+stu.getName());

		//entrySet() ：返回此映射所包含的映射关系key-value的 Set 视图。
		Set entry=map.entrySet();
		Iterator iterator=entry.iterator();
		System.out.println("映射关系");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

		//keySet() ：返回此映射中所包含的键key的 Set 视图。
		Set keys=map.keySet();
		System.out.println("map中的key");
		Iterator iterator1=keys.iterator();
		while(iterator1.hasNext()){
			System.out.println(iterator1.next());
		}

		//遍历HashMap中values 返回所有value组成的collection
		Collection stuValues=map.values();
		System.out.println("map中学生对象");

		Iterator iterator2=stuValues.iterator();
		while(iterator2.hasNext()){
			Student student=(Student)iterator2.next();
			System.out.println(student.getNo()+":"+student.getName()+":"
					+student.getAge()+":"+student.getAddress());
		}

		//remove(Object key) ：从此映射中移除指定键的映射关系（如果存在）。
		System.out.println("删除前 的 map.size="+map.size());
		map.remove(stu2.getNo());
		System.out.println("删除后的 map.size="+map.size());

		//clear() ：从此映射中移除所有映射关系。 size()表示key-value对的个数
		System.out.println("清除前 的 map.size="+map.size());
		map.clear();
		System.out.println("清除后的 map.size="+map.size());
	}
}