package chap5.task5_3.Example5_10;

//模型类实现Comparable接口 把集合排序成自然排序
public class Customer implements Comparable {
	private String name;
	private int age;

	public Customer(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// 重写equals方法
		if (this == obj) //地址比对
			return true;
		if (!(obj instanceof Customer))
			return false;
		final Customer other = (Customer) obj;
		if (this.name.equals(other.getName()) && this.age == other.getAge()) //内容比对
			return true;
		else
			return false;
	}

	//重写Comparable接口下的compareTo(Object o)方法
	//把集合排序成自然顺序，从大到小，从长到短。
	public int compareTo(Object o) {
		Customer other = (Customer) o;
		// 先按照name属性排序
		if (this.name.compareTo(other.getName()) > 0)
			return 1; //在o后面
		if (this.name.compareTo(other.getName()) < 0)
			return -1; //在o前面
		// 再按照age属性排序
		if (this.age > other.getAge())
			return 1; //在o后面
		if (this.age < other.getAge())
			return -1; //在o前面
		return 0; //位置相同
	}

	//hashCode()方法，提供快速定位集合中元素的位置，提高查询/插入速度。
	@Override
	public int hashCode() {
		// 重写equals方法必须重写hashCode方法
		int result;
		//name不为空 取出哈希值
		result = (name == null ? 0 : name.hashCode());
		result = 29 * result + age;
		return result;
	}

	//输出Customer对象时，自动调用toString方法输出相关内容
	public String toString() {
		return "姓名：" + this.getName() + "  年龄:" + this.getAge();
	}
}