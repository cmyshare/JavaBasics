package chap4.task4_1.example4_1;
//父类图形类Shape
public class Shape {
	String type; // 类别

	public void setType(String type) { // 成员方法，设置其图形类型
		this.type = type;
	}

	public String getType() {
		return type;
	}
}