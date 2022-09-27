package meet2;

/**
 * @author cmy
 * @version 1.0
 * @date 2022/4/19 15:40
 * @description 基础类型比较、包装类型比较、引用类型比较
 */
public class TypeValueCompare {
    public static void main(String[] args) {

        System.out.println("------------------int、long、double、float基础数据类型直接用==比较值------------------");
        System.out.println("------------------int、long、double、float基础数据类型 不能实例化构造 如int a=new int();------------------");

        System.out.println("------------------包装类不用equals------------------");
        //Integer范围-128 - 127中 用==就可以比较值
        Integer i1 = 1;
        Integer i2 = 1;
        System.out.println( "i1 == i2:" + (i1 == i2)); //true
        //Long范围中 用==就可以比较值
        Long l1 = 1l;
        Long l2 = 1l;
        System.out.println("l1 == l2:" + (l1 == l2)); //true
        //包装类Double用equals比较
        Double d1 = 1d;
        Double d2 = 1d;
        System.out.println("d1 == d2:" + (d1 == d2)); //false
        //包装类Float用equals比较
        Float f1 = 1f;
        Float f2 = 1f;
        System.out.println("f1 == f2:" + (f1 == f2)); //false

        System.out.println("------------------包装类用equals比较值------------------");
        System.out.println( "i1 == i2 equals:" + i1.equals(i2)); //true
        System.out.println("l1 == l2 equals:" + l1.equals(l2)); //true
        System.out.println("d1 == d2 equals:" + d1.equals(d2)); //true
        System.out.println("f1 == f2 equals:" + f1.equals(f2)); //true

        System.out.println("------------------引用类型 不用equals------------------");
        //两个实例化Integer 值一样 但地址不同
        Integer i3=new Integer(i1);
        Integer i4 = new Integer(i2);
        System.out.println( "i3 == i4:" + (i3 == i4)); //false
        Long l3 = new Long(l1);
        Long l4 = new Long(l2);
        System.out.println("l3 == l4:" + (l3 == l4)); //false
        Double d3 = new Double(d1);
        Double d4 = new Double(d2);
        System.out.println("d3 == d3:" + (d3 == d4)); //false
        Float f3 = new Float(f1);
        Float f4 = new Float(f2);
        System.out.println("f3 == f4:" + (f3 == f4)); //false

        System.out.println("------------------引用类型 用equals比较值------------------");
        System.out.println( "i3 == i4 equals:" + i3.equals(i4));
        System.out.println("l3 == l4 equals:" + l3.equals(l4));
        System.out.println("d3 == d4 equals:" + d3.equals(d4));
        System.out.println("f3 == f4 equals:" + f3.equals(f4));


        System.out.println("------------------String 不用equals------------------");
        //单个字符内容比较 char不能new实例化构造
        char c1='a';
        char c2='a';
        System.out.println("c1 == c2:" + (c1==c2)); //true

        String s1="abc";
        String s2="abc"; //为了节省内存，系统会找到已有内存地址1，s2指向内存地址1
        String s3="ab";
        String s4=s3+"c";
        String s5 = new String(s1);
        System.out.println("s1 == s2:" + (s1 == s2)); //地址一样 比较值 //true
        System.out.println("s1 == s4:" + (s1 == s4)); //地址不一样 //false
        System.out.println("s1 == s5:" + (s1 == s5)); //地址不一样 //false

        System.out.println("------------------String 用equals比较值------------------");
        System.out.println("s1 == s2:" + s1.equals(s2)); //true
        System.out.println("s1 == s4:" + s1.equals(s4)); //true
        System.out.println("s1 == s5:" + s1.equals(s5)); //true
    }
}
