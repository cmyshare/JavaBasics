package chap5.task5_3.Example5_8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 例题5_8重写hashcode及equals方法测试
 */
public class Example5_8 {
    public static void main(String[] args)
    {
        //实例化数组列表 允许重复，按特定顺序排列
        ArrayList al=new ArrayList();
        Point rp1=new Point(3,3);
        Point rp2=new Point(5,6);
        Point rp3=new Point(3,3);

        al.add(rp1);
        al.add(rp2);
        al.add(rp3);
        al.add(rp1);
        System.out.println("list:"+al.size());//list: 4
        System.out.println(al);

        //实例化Set集合 不允许重复，不按特定顺序排列
        Set hs=new HashSet();
        hs.add(rp1);
        hs.add(rp2);
        hs.add(rp3);
        hs.add(rp1);
        //重写了hashCode方法和equals方法，rp1重复添加了，只添加一个rp1，rp1和rp3也重复，不添加rp3
        System.out.println("hs:"+hs.size()); //hs:2 [集合内存放的是rp1和rp2]
        System.out.println(hs);//[3 3, 5 6]

        //问题？？？？？？？？？？？？？
        //集合中添加了元素rp1后，修改对象rp1的成员变量值，这个成员变量是参与了hashCode()值的运算，进行移除rp1操作

        rp1.setX(100.0); //因为对rp1修改，删除，新增，都会修改hashCode值。修改后就不能移除原来的rp1对象。
        hs.remove(rp1);//移除元素，移除失败。
        // 但可以放在修改前移除，就可以成功移除。
        //发现还是2个元素，remove方法因为哈希值被修改了，无法移除原来的rp1对象，造成内存泄露！！
        System.out.println(hs);
    }
}
