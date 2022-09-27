package study;

import java.util.*;

/**
 * @author cmy
 * @version 1.0
 * @date 2022/5/12 22:56
 * @description map练习
 */
public class mapTest {
    public static void main(String[] args) {
        List<Map<String,Integer>> listMap=new ArrayList();
        Map map=new HashMap();
        map.put("one",1);
        map.put("two",2);
        listMap.add(map);

        Map map1=new HashMap();
        map1.put("three",3);
        map1.put("four",4);
        listMap.add(map1);
        for(Map<String,Integer> stringIntegerMap:listMap) {
            System.out.println(stringIntegerMap);
        }

        System.out.println("****************************************");

        HashMap<String,Integer> map2=new HashMap();
        map2.put("one",1);
        map2.put("two",2);
        map2.put("three",3);
        map2.put("four",4);
        System.out.println(map2);

        Set<Map.Entry<String, Integer>> ms =map2.entrySet();
        for(Map.Entry mapEntry:ms) {
            System.out.println(mapEntry);
        }

        int sum=0;
        for (int value:map2.values()){
            sum=sum+value;
        }

        System.out.println(sum);




    }
}
