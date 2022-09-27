package chap5.task5_4.practice5_4.dao;

import java.util.*;
import java.util.Map.Entry;

import chap5.task5_4.practice5_4.bean.House;

public class HouseDAOImpUseOfHashMap implements HouseDAO {
	//使用HashMap集合对象存放多个房源信息 声明HashMap对象
	HashMap map;

	public HashMap getMap() {
		return map;
	}

	public void setMap(HashMap map) {
		this.map = map;
	}

	//无参构造
	public HouseDAOImpUseOfHashMap() {
		map = new HashMap(); //实例化map对象
	}

	//判断房屋是否存在
	public boolean isExist(House house) {
		boolean flag = false; //默认不存在
		if (map.containsKey(house.getHouseId())) {
			flag = true;
		}
		return flag;
	}

	//增加房屋信息
	public boolean insertHouse(House house) {
		boolean flag = false; //默认失败
		try {
			map.put(house.getHouseId(), house);
			flag = true;
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	//根据sid查询房屋信息
	public House selectById(String sid) {
		House house = null; //默认为空
		house = (House) map.get(sid);

		return house;
	}

	//更新房屋信息
	public boolean updateHouse(House house) {
		//默认更新失败
		boolean flag = false;
		if (this.isExist(house)) {
			map.put(house.getHouseId(), house);
			flag = true;
		}
		return flag;
	}

	//查询所有
	public List selectAll() { // list.size()==0
		List list = new ArrayList();
		// 使用遍历
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			House house = (House) entry.getValue();
			list.add(house);
		}
		return list;
	}

	// 简单查询（单个条件查询）   键、值查询
	public List simleSearchHouse(String condition, String conditionValue) {
		List list = new ArrayList();
		List list1 = this.selectAll();

		for (int i = 0; i < list1.size(); i++) {
			// 根据条件获取房源信息: 房源编号houseId、小区名称villageName、
			// 物业公司名称companyName、房屋朝向houseFavor、楼层houseFloor
			House house = (House) list1.get(i);
			if (condition.equals("villageName")
					&& conditionValue.equals(house.getVillageName())) {
				list.add(house);
			} else if (condition.equals("companyName")
					&& conditionValue.equals(house.getCompanyName())) {
				list.add(house);
			} else if (condition.equals("houseFavor")
					&& conditionValue.equals(house.getHouseFavor())) {
				list.add(house);
			} else if (condition.equals("houseFloor")
					&& conditionValue.equals(house.getHouseFloor())) {
				list.add(house);
			} else {
			}
		}
		return list;
	}

	// 根据房源状态查询
	public List searchByHouseState(int state) {
		List list = new ArrayList();
		list = this.selectAll();

		for (int i = 0; i < list.size(); i++) {
			// 根据条件获取房源信息: 房源编号、小区名称、物业公司名称、房屋朝向、楼层
			House house = (House) list.get(i);
			if (house.getHouseState() == state) {
				list.add(house);
			}
		}
		return list;
	}

	// 根据房租价格查询
	public List searchByRentPrice(int low, int high) {
		List list = new ArrayList();
		List list1 = this.selectAll();
		for (int i = 0; i < list1.size(); i++) {
			// 根据条件获取房源信息: 房源编号、小区名称、物业公司名称、房屋朝向、楼层
			House house = (House) list1.get(i);
			if (house.getRentPrice() <= high && house.getRentPrice() >= low) {
				list.add(house);
			}
		}
		return list;
	}



	// 显示所有房源信息
	public String showAllHouseInfo() {
		List list =  this.selectAll();
		//String类创建的字符串是常量，是不可更改的。若对字符串进行动态增减，
		StringBuffer stf = new StringBuffer();
		if (list.size() == 0) {
			stf.append("   还没有房源信息呢！   ");
		} else {
			stf.append("房源编号 |小区名称 |房屋类型 |幢/座编号|楼层 |状态   | 房屋朝向 |出租价格 |房屋设施 ");
			stf.append("\n");
			for (int i = 0; i < list.size(); i++) {
				House house = (House) list.get(i);

				stf.append(house.getHouseId() + "   | "
						+ house.getVillageName() + "   | "
						+ house.getHouseType() + "   |  "
						+ house.getHouseSet() + "   | "
						+ house.getHouseFloor() + "   | "
						+ house.getHouseState() + "   | "
						+ house.getHouseFavor() + "   | "
						+ house.getRentPrice() + "   | "
						+ house.getHouseFacility());
				stf.append("\n");
			}

		}

		return stf.toString(); //将动态字符串转换成常量字符串

	}

	// 根据sid删除房屋信息
	public boolean deleteById(String sid) {
		boolean flag=false;
		House oldhouse=this.selectById(sid);
		if(oldhouse!=null)
		{
			System.out.println("存在该房源，可以删除");
			map.remove(oldhouse.getHouseId());
			flag=true;
		}else
		{
			System.out.println("不存在该房源，不能删除");
		}
		return flag;
	}

}