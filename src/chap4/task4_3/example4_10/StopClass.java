package chap4.task4_3.example4_10;
//通过方法重载实现静态多态。
//条件：只用方法重载
public class StopClass {
    public static void print(){
        System.out.println("print_1");
    }

    public static void print(int i){
        System.out.println("print_"+i);
    }

    public static void print(char c){
        System.out.println("print_"+c);
    }

    public static void main(String[] args) {
        //在类(静态)方法中，可以通过类名调用静态方法，不能访问非静态成员。
        print(); //这里类名可以省略
        print(2);
        print('3');
    }
}
