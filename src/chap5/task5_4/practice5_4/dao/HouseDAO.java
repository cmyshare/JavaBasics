package chap5.task5_4.practice5_4.dao;

import java.util.List;

import chap5.task5_4.practice5_4.bean.House;

public interface HouseDAO {
    //判断房源存在与否
    public boolean isExist(House house);
    //添加房源信息
    public boolean insertHouse(House house);
    //按照房源编号查询房源信息
    public House selectById(String sid);
    //修改房源信息
    public boolean updateHouse(House house);

    //显示所有房源信息
    public String showAllHouseInfo();
    //删除房源信息
    public boolean deleteById(String sid);

    //查询所有房源信息
    public List selectAll();
    //根据房源楼层与小区名称查询过程一致，可合并到一个方法：simmpleSearchHouse()。
    public List simleSearchHouse(String condition,String conditionValue);

    //根据房源状态查询
    public List searchByHouseState(int state);

    //根据房租价格查询
    public List searchByRentPrice(int low,int high);

}