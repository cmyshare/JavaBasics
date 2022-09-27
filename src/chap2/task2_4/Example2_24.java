package chap2.task2_4;
import java.util.Scanner;

//例题2_24定义一个一维数组存储10个学生名字，定义一个二维数组存放这10个学生的6门课的成绩
public class Example2_24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//复合类型的数组
		String[] name = { "lili", "tom", "jack", "susan", "wendy", "tommy", "neil", "paul", "richie", "roger" };// 存储学生的名字
		int[][] grade = { { 50, 60, 70, 80, 90, 10 },
				{ 40, 90, 80, 60, 40, 70 }, { 60, 80, 70, 60, 40, 90 },
				{ 50, 60, 70, 80, 90, 10 }, { 60, 80, 70, 60, 40, 90 },
				{ 60, 70, 80, 90, 70, 70 }, { 60, 80, 70, 60, 40, 90 },
				{ 60, 80, 70, 60, 40, 90 }, { 70, 80, 90, 70, 70, 70 },
				{ 60, 80, 70, 60, 40, 90 } };// 存储学生各科成绩

		System.out.println("输入要查询成绩的学生名字：");
		String chioce = input.nextLine(); //输入字符串
		for (int i = 0; i < 10; i++) {
			//配对输入值是谁
			if (name[i].equals(chioce)) {
				System.out.println("学生：" + name[i] + " 的成绩如下：");
				System.out.println("C程序设计：" + grade[i][0] + "物理："
						+ grade[i][1] + "英语:" + grade[i][2] + "高数:"
						+ grade[i][3] + "体育:" + grade[i][4] + "政治:"
						+ grade[i][5] + "\n");
				break;
			}
		}
		System.out.println("******************************************************");

		System.out.println("输入要查询不及格人数的科目序号\n");
		System.out.println("1,C程序设计 2,物理  3,英语  4,高数  5,体育  6,政治 ");
		int ch = input.nextInt(); //输入int类型。
		int time = 0;
		System.out.println("不及格的名单为：");
		for (int i = 0; i < 10; i++) {
			if (grade[i][ch - 1] < 60) {
				time++;
				switch (i) {
					case 0: System.out.println(name[i]);
						break;
					case 1: System.out.println(name[i]);
						break;
					case 2: System.out.println(name[i]);
						break;
					case 3: System.out.println(name[i]);
						break;
					case 4: System.out.println(name[i]);
						break;
					case 5: System.out.println(name[i]);
						break;
					case 6: System.out.println(name[i]);
						break;
					case 7: System.out.println(name[i]);
						break;
					case 8: System.out.println(name[i]);
						break;
					case 9: System.out.println(name[i]);
						break;
				}
			}
		}
		System.out.println("该科目不及格人数为:" + time);
	}
}
