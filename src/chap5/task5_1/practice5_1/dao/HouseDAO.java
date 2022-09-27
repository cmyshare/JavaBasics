package chap5.task5_1.practice5_1.dao;

import java.util.List;

import chap5.task5_1.practice5_1.bean.House;

//接口层HouseDAO
public interface HouseDAO {
	//判断房源存在与否
	public boolean isExist(House house);
	//添加房源信息
	public boolean insertHouse(House house);

	//显示所有房源信息
	public void showall();
	//按照房源编号查询房源信息
	// public House selectById(String sid);
	//修改房源信息
	//  public boolean updateHouse(House house);

	//查询所有房源信息
	// public List selectAll();
}
    
	
