package meet2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author cmy
 * @version 1.0
 * @date 2022/4/19 14:50
 * @description 用hashmap分析字符串，输出字符串中不同字符，不分大小写
 */
public class StringCategory {
    public static void main(String[] args){
        System.out.println("输入字符：");
        String s = new Scanner(System.in).nextLine();

        //调用String类型下的方法
        //字符串名.toLowerCase()转换为小写 toUpperCase()转换为大写 非字母不受影响
        s=s.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            //取出下标为i的字符 charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
            char c = s.charAt(i);
            //从map集合中获取key为c对应的value
            Integer count = map.get(c);
            //为空put加入map 不为空则value累加
            if(count==null){
                map.put(c, 1);
            }else{
                map.put(c, count+1);
            }
        }
        //直接输出 map 以键值对形式输出 如：{p=2, a=1}
        System.out.println("各字符的个数为："+map.keySet());
    }
}
