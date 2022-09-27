/**
 * 单元5 房源信息管理
 * 任务2  修改房源信息
 * 设计要点：
 * 1.房源信息管理主界面
 * 2.选择ArrayList对象
 * 3.使用接口模拟数据的增删改查操作
 * 4.遍历接口的使用
 * 5.方法调用
 */
package chap5.task5_2.practice5_2.dao;

import java.util.ArrayList;
import java.util.Iterator;

import chap5.task5_2.practice5_2.bean.House;

public class HouseDaoImpUseOfArrayList implements HouseDAO {
	ArrayList list;

	public HouseDaoImpUseOfArrayList() {
		list = new ArrayList();
	}


	public ArrayList getList() {
		return list;
	}


	public void setList(ArrayList list) {
		this.list = list;
	}


	public boolean insertHouse(House house) {
		boolean flag = false;
		if (this.isExist(house)) {
			System.out.println("该房源已经存在，不能添加");
		} else {
			list.add(house);
			flag = true;
		}
		return flag;
	}

	public boolean isExist(House house) {
		boolean flag = false;
		if (list.contains(house)) {
			flag = true;
		}
		return flag;
	}

	public void showall() {
		Iterator it = list.iterator();
		System.out.println("显示所有房源信息");
		while (it.hasNext()) {
			House house = (House) it.next();
			System.out
					.println(house.getHouseId() + "   | "
							+ house.getVillageName() + "   | "
							+ house.getHouseType() + "   |  "
							+ house.getHouseSet() + "   | "
							+ house.getHouseFloor() + "   | "
							+ house.getHouseState() + "   | "
							+ house.getHouseFavor() + "   | "
							+ house.getRentPrice() + "   | "
							+ house.getHouseFacility());
		}
	}

	//按照房源编号查询房源信息,找到返回该房源对象，找不到返回空对象
	public House selectById(String sid) {
		House house=null;
		Iterator it=list.iterator();  //获取遍历对象
		while(it.hasNext())
		{
			House h=(House)it.next();
			if(h.getHouseId().equals(sid))
			{
				System.out.println("根据Id找到该房源");
				house=h;
			}
		}
		return house;
	}

	//根据id进行修改，如果成功返回true ，否则返回false
	public boolean updateHouse(String sid,House house) {
		boolean flag=false;
		House oldhouse=this.selectById(sid);    //根据Id找到原有房源
		if(oldhouse!=null)
		{
			System.out.println("可以修改");
			int index=list.indexOf(oldhouse);  //获取原有房源的index索引号码
			list.set(index, house);  //修改函数set()
			flag=true;
		}else
		{
			System.out.println("不存在，不能修改");
		}
		return flag;
	}
}