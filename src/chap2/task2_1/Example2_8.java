package chap2.task2_1;
//例题2_8逻辑运算使用示例
public class Example2_8 {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        boolean result1 = (a > b) && (a != b); //条件与and
        boolean result2 = (a > b) || (a != b); //条件或or
        System.out.println(result1);
        System.out.println(result2);
        // 测试短路现象
        boolean result3 = (a < b) || ((a = 5) > b); //条件或or
        System.out.println(result3 + ",a=" + a + ",b=" + b); //结果通过+变量+拼接
        // 标准逻辑运算符没有短路现象
        boolean result4 = (a < b) | ((a = 5) > b); //非简洁或or 这里出现了赋值
        System.out.println(result4 + ",a=" + a + ",b=" + b);
    }
}
