/**
 * 单元5 房源信息管理
 * 任务3  删除房源信息
 * 设计要点：
 * 1.房源信息管理主界面
 * 2.选择HashSet类对象
 * 3.使用接口模拟数据的增删改查操作
 * 4.遍历接口的使用
 * 5.方法调用
 */
package chap5.task5_3.practice5_3.dao;

import java.util.HashSet;
import java.util.Iterator;

import chap5.task5_3.practice5_3.bean.House;

public class HouseDaoImpUseOfHashSet implements HouseDAO {
	HashSet set;

	public HouseDaoImpUseOfHashSet() {
		set=new HashSet();
	}


	public HashSet getSet() {
		return set;
	}


	public void setSet(HashSet set) {
		this.set = set;
	}


	public boolean insertHouse(House house) {
		boolean flag = false;
		if (this.isExist(house)) {
			System.out.println("该房源已经存在，不能添加");
		} else {
			set.add(house);
			flag = true;
		}
		return flag;
	}

	public boolean isExist(House house) {
		boolean flag = false;
		if (set.contains(house)) {
			flag = true;
		}
		return flag;
	}

	public void showall() {
		Iterator it = set.iterator();
		System.out.println("显示所有房源信息");
		System.out.println("房源编号 |小区名称 |房屋类型 |幢/座编号|楼层 |状态   | 房屋朝向 |出租价格 |房屋设施 ");
		while (it.hasNext()) {
			House house = (House) it.next();
			System.out.println(house.getHouseId() + "   | "
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
		Iterator it=set.iterator();  //获取遍历对象
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
			//将原来的删除
			set.remove(oldhouse);
			set.add(house);

			flag=true;
		}else
		{
			System.out.println("不存在，不能修改");
		}
		return flag;
	}

	//根据房源编号进行删除，先按照编号进行查询，如果存在才能删除，不存在，则不能删除
	public boolean deleteById(String sid) {
		boolean flag=false;
		House oldhouse=this.selectById(sid);
		if(oldhouse!=null)
		{
			System.out.println("存在该房源，可以删除");
			set.remove(oldhouse);
			flag=true;
		}else
		{
			System.out.println("不存在该房源，不能删除");
		}
		return flag;
	}


}
