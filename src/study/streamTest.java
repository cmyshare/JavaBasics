package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author cmy
 * @version 1.0
 * @date 2022/6/1 23:19
 * @description Java 8 Stream流
 */
public class streamTest {
    public static void main(String[] args) {
        List<Student> allList = new ArrayList<>();
        //添加集合信息 省去。。。
        Student st1 = new Student();
        st1.setAge(20);
        st1.setHeight(178L);
        st1.setSex(1);
        st1.setName("韩梅梅");
        allList.add(st1);
        Student st11 = new Student();
        st11.setAge(20);
        st11.setHeight(168L);
        st11.setSex(1);
        st11.setName("马冬梅");
        allList.add(st11);

        Student st2 = new Student();
        st2.setAge(21);
        st2.setHeight(179L);
        st2.setSex(2);
        st2.setName("李磊");
        allList.add(st2);
        Student st22 = new Student();
        st22.setAge(21);
        st22.setHeight(189L);
        st22.setSex(2);
        st22.setName("小李");
        allList.add(st22);

        //使用java8 stream groupingBy操作,按性别分组list
        System.out.println("使用java8 stream groupingBy操作,按性别分组list");
        Map<Integer, List<Student>> allMapTask = allList.stream().collect(Collectors.groupingBy(Student::getSex));
        // 遍历获取对象信息
        for (Map.Entry<Integer,List<Student>> entry: allMapTask.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

        //filter 筛选出性别为男的学生
        System.out.println("筛选出性别为男的学生");
        List<Student> studentList = allList.stream().filter(s->s.getSex()==2).collect(Collectors.toList());
        System.out.println(studentList);

        //filter 筛选出性别为男并且身高为1米8以上的学生
        System.out.println("筛选出性别为男并且身高为1米5以上的学生");
        List<Student> studentList2 = allList.stream().filter(s->s.getSex()==2
                &&s.getHeight().intValue()>=180).collect(Collectors.toList());
        System.out.println(studentList2);
    }
}

/**
 * 参考地址
 * https://blog.csdn.net/zhouzhiwengang/article/details/112319054
 * https://blog.csdn.net/qq_38974638/article/details/113800132
 * https://blog.csdn.net/java_huilong/article/details/59056611
 * https://zhuanlan.zhihu.com/p/148439563
 * https://blog.csdn.net/m0_60489526/article/details/119984236
 */