package chap5.task5_3.practice5_3.dao;

import chap5.task5_3.practice5_3.bean.House;

public interface HouseDAO {
    //判断房源存在与否
    public boolean isExist(House house);
    //添加房源信息
    public boolean insertHouse(House house);

    //显示所有房源信息
    public void showall();
    //按照房源编号查询房源信息
    public House selectById(String sid);
    //修改房源信息
    public boolean updateHouse(String sid,House house);

    //删除房源信息
    public boolean deleteById(String sid);
    //查询所有房源信息
    // public List selectAll();
}

