package study;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author cmy
 * @version 1.0
 * @date 2022/6/8 20:40
 * @description 递归练习
 */
public class DiguiTest {
    public static void main(String[] args) {
        List<Shengshiqu> shengshiquList=new ArrayList<>();
        shengshiquList.add(new Shengshiqu(1L,"中国",1L,"重庆",1L,"合川",1L,"官渡"));
        shengshiquList.add(new Shengshiqu(1L,"中国",1L,"重庆",2L,"永川",2L,"水电"));
        shengshiquList.add(new Shengshiqu(1L,"中国",1L,"重庆",3L,"渝北",3L,"光电"));
        shengshiquList.add(new Shengshiqu(1L,"中国",2L,"广东",4L,"广州",4L,"越秀"));
        shengshiquList.add(new Shengshiqu(1L,"中国",2L,"广东",5L,"佛山",5L,"顺德"));
        shengshiquList.add(new Shengshiqu(1L,"中国",2L,"广东",6L,"江门",6L,"沙坪"));
        shengshiquList.add(new Shengshiqu(1L,"中国",3L,"北京",7L,"海淀",7L,"人大"));
        shengshiquList.add(new Shengshiqu(1L,"中国",3L,"北京",8L,"朝阳",8L,"北大"));
        shengshiquList.add(new Shengshiqu(1L,"中国",3L,"北京",9L,"平昌",9L,"清大"));

        //方法一 多层嵌套map键值对分组
        Map<String,Map<String,Map<String,List<Shengshiqu>>>>
        allMapTask = shengshiquList.stream().collect(
                Collectors.groupingBy(Shengshiqu::getShengName,Collectors.groupingBy(Shengshiqu::getShiName,Collectors.groupingBy(Shengshiqu::getQuName))));

        System.out.println(allMapTask.values());
        //Set<Map.Entry<String, Map<String,Map<String,List<Shengshiqu>>>>> ms =allMapTask.entrySet();
        //for(Map.Entry mapEntry:ms) {
        //    System.out.println(mapEntry);
        //}

        //方法二 先查所有省 再省下的所有市 再查市下的所有区 用查询
        //Shengshiqu Tree=new Shengshiqu();
        ////查所有省
        //List<Shengshiqu> shengList=shengshiquList;
        //for (Shengshiqu sheng:shengList){
        //    //查所有市
        //    List<Shengshiqu> shiList=shengList.stream().filter(s->s.getShengId()==sheng.getShengId()).collect(Collectors.toList());
        //    for (Shengshiqu shi:shiList){
        //        //查所有区
        //        List<Shengshiqu> quList=shengList.stream().filter(s->s.getShiId()==shi.getShiId()).collect(Collectors.toList());
        //        shi.setNodes(quList);
        //    }
        //    sheng.setNodes(shiList);
        //}
        //Tree.setNodes(shengList);
        //System.out.println(Tree);


        ////方法三 一次性查出所有省市区的数据，遍历构造树
        ////公司id-热站-小区-楼栋 国家-省-市-区
        //List<Shengshiqu> trees = shengshiquList;
        //for (Shengshiqu country : trees) {
        //    if(country.getCountryId()==1){ //9
        //        //获取省
        //        for(Shengshiqu province : trees){
        //            if(province.getShengId()==country.getCountryId()){
        //                //获取市
        //                for (Shengshiqu city : trees) {
        //                    if(city.getShiId()==province.getShengId()){
        //                        //获取区
        //                        for (Shengshiqu district : trees) {
        //                            if(district.getQuId()==city.getShiId()){
        //                                city.getNodes().add(district);
        //                            }
        //                        }
        //                        province.getNodes().add(city);
        //
        //                    }
        //                }
        //                country.getNodes().add(province);
        //            }
        //        }
        //    }
        //}
        //System.out.println(trees);



        //方法四 一次性查出所有省市区的数据，递归构造树
        //定义根节点
        ShengshiquTree shengshiquNode = new ShengshiquTree();
        shengshiquNode.setParentId(0L);
        shengshiquNode.setId(0L);
        shengshiquNode.setName("公司");

        //加入树中
        List<ShengshiquTree> list = new ArrayList();
        list.add(shengshiquNode);

    }
}
