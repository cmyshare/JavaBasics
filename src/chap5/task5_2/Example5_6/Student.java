package chap5.task5_2.Example5_6;

public class Student {
	private String name;
	private int score;

	public Student() {
		super();
	}

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	//输出此对象时，默认直接调用了
	public String toString() {
		String s = name + " 成绩：" + score;
		return s;
	}
}
