package meet2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author cmy
 * @version 1.0
 * @date 2022/4/19 14:20
 * @description hashmap根据value排序
 * 实现原理：由于HashMap不属于list子类，所以无法使用Collections.sort方法来进行排序，所以我们将hashmap中的entryset取出放入一个ArrayList中，
 * 来对ArrayList中的entryset进行排序（根据entryset中value的值），达到我们对hashmap的值进行排序的效果。
 */
public class hashMapSortByValue {
    public static void main(String[] args) {
        //产生一个map并添加一些参数
        Map<String,Integer> map = new HashMap<>();
        map.put("ddd", 1);
        map.put("aaa", 2);
        map.put("bbb", 3);
        map.put("ccc", 4);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet()); //将map的entryset放入list集合
        //对list进行排序，并通过Comparator传入自定义的排序规则
        Collections.sort(list,new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o2.getValue()-o1.getValue(); //重写排序规则，小于0表示升序，大于0表示降序
            }
        });

        //用迭代器对list中的键值对元素进行遍历 输出
        Iterator<Map.Entry<String, Integer>> iter = list.iterator();
        while(iter.hasNext()){
            Map.Entry<String, Integer> item = iter.next();
            String key = item.getKey();
            int value = item.getValue();
            System.out.println("键"+key+"值"+value);
        }
    }
}
