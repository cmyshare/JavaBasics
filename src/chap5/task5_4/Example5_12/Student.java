package chap5.task5_4.Example5_12;

public class Student {
	private String no;
	private String name;
	private int age;
	private String address;

	public Student() {
		//但没有继承类时，每个类默认继承Object类。super()调用Object类的无参构造方法
		super();
	}

	public Student(String no, String name, int age, String address) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//重写hashCode方法-使用hashCode方法为Student对象计算哈希值
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((no == null) ? 0 : no.hashCode());
		return result;
	}

	//重写equals方法-判断x与y是否相等-内容相等
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no == null) {
			if (other.no != null)
				return false;
		} else if (!no.equals(other.no))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "学生学号：   " + this.getNo() + "学生姓名：   " + this.getName()
				+ "学生年龄：   " + this.getAge() + "学生地址：   " + this.getAddress();
	}
}