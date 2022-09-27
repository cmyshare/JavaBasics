package chap4.task4_3.example4_14;
//例题4_13编写接口PrintMessage用来处理各种打印信息操作
public interface PrintMessage {//接口声明
	public int count = 10; //常量声明和赋值
	public void printAllMessage(); //抽象方法声明
	public void printLastMessage(); //抽象方法声明
	public void printFirstMessage(); //抽象方法声明
}
