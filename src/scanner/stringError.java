package scanner;

import java.util.Scanner;

/**
 * @author cmy
 * @version 1.0
 * @date 2022/5/4 17:45
 * @description 纠正英文稿件拼写错误
 */
public class stringError {

    /**
     * 题型描述
     * 1. 三个同样的字母连在一起，一定是拼写错误，去掉一个的就好啦：比如 helllo -> hello
     * 2. 两对一样的字母（AABB型）连在一起，一定是拼写错误，去掉第二对的一个字母就好啦：比如 helloo -> hello
     * 3. 上面的规则优先“从左到右”匹配，即如果是AABBCC，虽然AABB和BBCC都是错误拼写，应该优先考虑修复AABB，结果为AABCC
     */

    //链接：https://www.nowcoder.com/questionTerminal/42852fd7045c442192fa89404ab42e92?answerType=1&f=discussion
    //来源：牛客网
    public static void  main(String[] args){
        Scanner cin = new Scanner(System.in);
        //确定输入的行数
        int n = cin.nextInt();
        for(int i = 0; i < n; i++){
            //获取有效无空格的一行
            String res = parse(cin.next());
            System.out.println(res);
        }
    }

    //对一行有效字符串 进行纠正处理
    public static String parse(String word){
        // 字符相邻重复标识 0无重复 1为有重复
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        int n = word.length();
        sb.append(word.charAt(0));
        for(int i = 1; i < n; i++){
            if(cnt == 1){
                //有重复的情况下，重复<3 可以加入sb
                if(word.charAt(i - 1) != word.charAt(i)){
                    sb.append(word.charAt(i));
                    // mark this condition
                    if(i + 1 < n && word.charAt(i) != word.charAt(i + 1)){
                        cnt = 0;
                    }
                }else{ //有重复的情况下，重复>=3 忽略掉
                    while(i < n && word.charAt(i - 1) == word.charAt(i)){
                        i++;
                    }
                    // mark this
                    i--;
                    cnt = 0;
                }
            }else{  //有重复的情况下，直接先加入sb
                sb.append(word.charAt(i));
                //判断i 和 i-1 是否重复
                if(word.charAt(i) == word.charAt(i - 1)){
                    cnt = 1;
                    // mark this condition
                    while(i < n && word.charAt(i) == word.charAt(i - 1)){
                        i++;
                    }
                    // mark this
                    i--;
                }
            }
            // System.out.println(sb);
        }
        return sb.toString();
    }
}
