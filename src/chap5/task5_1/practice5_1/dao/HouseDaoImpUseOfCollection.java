/**
 * 单元5 房源信息管理
 * 任务1  添加房源信息
 * 设计要点：
 * 1.房源信息管理主界面
 * 2.选择Collection接口
 * 3.使用接口模拟数据的增删改查操作
 * 4.遍历接口的使用
 * 5.方法调用
 */
package chap5.task5_1.practice5_1.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import chap5.task5_1.practice5_1.bean.House;

//接口实现层DaoImp
public class HouseDaoImpUseOfCollection implements HouseDAO {
	Collection collection; //声明集合对象

	//无参构造
	public HouseDaoImpUseOfCollection() {
		collection = new ArrayList(); //创建集合对象
	}

	public Collection getCollection() {
		return collection;
	}

	public void setCollection(Collection collection) {
		this.collection = collection;
	}

	public boolean insertHouse(House house) {
		boolean flag = false;
		if (this.isExist(house)) {
			System.out.println("该房源已经存在，不能添加");
		} else {
			collection.add(house);
			flag = true;
		}
		return flag;
	}

	public boolean isExist(House house) {
		boolean flag = false;
		//判断集合中是否有house对象
		if (collection.contains(house)) {
			flag = true;
		}
		return flag;
	}

	public void showall() {
		Iterator it = collection.iterator();
		System.out.println("显示所有房源信息");
		//it.hasNext()判断是否存在另一个可访问的元素
		while (it.hasNext()) {
			//iterator.next()返回要访问的下一个元素 返回Object。
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
}
