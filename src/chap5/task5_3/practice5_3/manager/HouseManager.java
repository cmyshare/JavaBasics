/**
 * 主界面设计
 */

package chap5.task5_3.practice5_3.manager;

import java.util.Scanner;
import chap5.task5_3.practice5_3.bean.House;
import chap5.task5_3.practice5_3.dao.HouseDaoImpUseOfHashSet;



public class HouseManager {
	//业务处理对象作为成员变量
	HouseDaoImpUseOfHashSet hdih=new HouseDaoImpUseOfHashSet();

	public HouseManager() {
		//初始化
		hdih=new HouseDaoImpUseOfHashSet();
	}

	public static void main(String[] args) {

		HouseManager houseManager = new HouseManager();
		houseManager.showFuction();    //调用显示房源信息管理功能方法
		houseManager.showAction();     //调用功能操作方法

	}
	// 显示房源信息管理功能
	public void showFuction() {
		System.out.println("*************************************************");
		System.out.println("*              欢迎您使用房源管理系统                 *");
		System.out.println("*                                               *");
		System.out.println("*    请选择要操作的功能：                              *");
		System.out.println("*      房源信息管理：                                 *");
		System.out.println("*     1：查看所有房源       2：增加房源信息            *");
		System.out.println("*     3：修改房源信息	 4：删除房源信息            *");
		System.out.println("*                                              *");
		System.out.println("*        房源信息查询：                               *");
		System.out.println("*     5：房租价格           6：房源状态               *");
		System.out.println("*     7：小区名称           8： 房屋楼层              *");
		System.out.println("*************************************************");

	}

	// 功能操作
	public void showAction() {

		Scanner sc = new Scanner(System.in);
		quit: while (true) {
			int action = sc.nextInt();
			switch (action) {
				case 1://1：查看所有房源
					this.showAllHouseInfo();
					break;
				case 2://2：增加房源信息
					this.addHouse();
					break;
				case 3: //3：修改房源信息
					this.updateHouseInfo();
					break;
				case 4: //4：删除房源信息
					this.removeHouseInfo();
					break;
				case 5: // 5：房租价格
					break;
				case 6: //6：房源状态
					break;
				case 7: //7：小区名称
					break;
				case 8: //8： 房屋楼层
					break;
				default:
					break;
			}

			System.out.println("请选择下一步动作：a:继续   b:退出");
			String nextAction = sc.next();
			if (nextAction.equals("a")) {
				System.out.println("请继续选择操作类型：");
				continue;
			} else {
				break quit;
			}

		}
		System.out.println("你已经成功退出了！");
	}

	// 添加房源信息
	public void addHouse() {
		//1： 输入房源信息
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入房源编号：");
		String houseId = sc.next();

		System.out.println("请输入小区名称：");
		String villageName = sc.next();

		System.out.println("物业公司名称：");
		String companyName = sc.next();

		System.out.println("请输入房屋类型：");
		String houseType = sc.next();

		System.out.println("请输入房屋位置：");
		String houseSet = sc.next();

		System.out.println("请输入房屋状态：");
		int houseState = sc.nextInt();

		System.out.println("请输入房屋朝向：");
		String houseFavor = sc.next();

		System.out.println("请输入房屋用途：");
		String houseMethod = sc.next();

		System.out.println("请输入房屋价格");
		double housePrice = sc.nextDouble();

		System.out.println("请输入出租价格");
		double rentPrice = sc.nextDouble();

		System.out.println("请输入楼层：");
		String houseFloor = sc.next();

		System.out.println("请输入建筑年限：");
		String houseBuildYear = sc.next();

		System.out.println("请输入评价：");
		String houseRemark = sc.next();

		System.out.println("请输入房源设施：");
		String houseFacility = sc.next();

		//2： 创建房源信息对象
		House house = new House();
		house.setHouseId(houseId);
		house.setVillageName(villageName);
		house.setCompanyName(companyName);
		house.setHouseBuildYear(houseBuildYear);
		house.setHouseFavor(houseFavor);
		house.setHouseFloor(houseFloor);
		house.setHouseMethod(houseMethod);
		house.setHousePrice(housePrice);
		house.setRentPrice(rentPrice);
		house.setHouseRemark(houseRemark);
		house.setHouseSet(houseSet);
		house.setHouseState(houseState);
		house.setHouseType(houseType);
		house.setHouseFacility(houseFacility);

		//3： 判断房源信息是否存在
		boolean flag=hdih.isExist(house);

		if(flag)
		{
			System.out.println("已经存在，不能添加");
		}else{
			boolean f=hdih.insertHouse(house);
			if(f)
			{
				System.out.println("添加成功");
			}else{
				System.out.println("不能添加");
			}
		}
		//4：将该方法添加到功能操作方法中

	}

	// 修改房源信息
	public void updateHouseInfo() {
		// 1:首先根据输入的房源编号查询是否存在
		System.out.println("请输入要修改的房源编号：");
		Scanner sc = new Scanner(System.in);
		String houseId = sc.next();
		//2：调用业务方法，房源编号查询房源信息，返回房源对象
		House house= hdih.selectById(houseId);

		//3：根据查询结果执行修改和不修改操作
		//a：如果不存在，提示“该房源不存在！”；
		//b：如果存在，先显示房源信息：房源编号 |小区名称 |房屋类型 |幢/座编号|楼层 |状态   | 房屋朝向 |出租价格 |房屋设施
		//同时进行修改信息的提示和录入，对该房源对象属性进行修改
		if(house==null)
		{
			System.out.println("该房源不存在！");
		}else
		{
			System.out.println("房源编号 |小区名称 |房屋类型 |幢/座编号|楼层 |状态   | 房屋朝向 |出租价格 |房屋设施 ");
			System.out.println(house.getHouseId() + "   | "
					+ house.getVillageName() + "   | "
					+ house.getHouseType() + "   |  "
					+ house.getHouseSet() + "   | "
					+ house.getHouseFloor() + "   | "
					+ house.getHouseState() + "   | "
					+ house.getHouseFavor() + "   | "
					+ house.getRentPrice() + "   | "
					+ house.getHouseFacility());
			System.out.println("请输入房源信息要修改的信息：");
			System.out.println("请输入修改小区名称：");
			String villageName = sc.next();

			System.out.println("请输入修改房屋类型:");
			String houseType = sc.next();

			System.out.println("请输入修改房屋位置：");
			String houseSet = sc.next();

			System.out.println("请输入修改房屋楼层:");
			String houseFloor = sc.next();

			System.out.println("请输入修改房屋状态：");
			int houseState = sc.nextInt();

			System.out.println("请输入修改房屋朝向：");
			String houseFavor = sc.next();

			System.out.println("请输入修改出租价格：");
			double rentPrice = sc.nextDouble();

			System.out.println("请输入修改房屋设施:");
			String houseFacility = sc.next();

			if (!villageName.equals("")) {
				house.setVillageName(villageName);
			}

			if (!houseType.equals("")) {
				house.setHouseType(houseType);
			}

			if (!houseSet.equals("")) {
				house.setHouseSet(houseSet);
			}

			if (!houseFloor.equals("")) {
				house.setHouseFloor(houseFloor);
			}

			if (!houseFavor.equals("")) {
				house.setHouseFavor(houseFavor);
			}

			if (!houseFacility.equals("")) {
				house.setHouseFacility(houseFacility);
			}

			house.setHouseState(houseState);
			house.setRentPrice(rentPrice);
		}

		//4：调用修改方法，提示修改成功与
		boolean flag=hdih.updateHouse(houseId,house);
		if(flag)
		{
			System.out.println("x修改成功");
		}else{
			System.out.println("修改失败");
		}

		//5：将该方法添加到功能操作方法中
	}

	// 房源删除过程
	public void removeHouseInfo() {
		// 1:首先根据输入的房源编号查询是否存在
		System.out.println("请输入要删除的房源编号：");
		Scanner sc = new Scanner(System.in);
		String houseId = sc.next();

		//2：调用业务方法，根据房源编号删除房源信息
		boolean result=hdih.deleteById(houseId);
		if(result)
		{
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
	}

	// 查看所有房源信息
	public void showAllHouseInfo() {
		hdih.showall();
	}

//		//1:调用显示房源信息业务方法
//		List list=hdic.selectAll();
//		//遍历
//		Iterator it=list.iterator();
//		 System.out.println("房源编号 |小区名称 |房屋类型 |幢/座编号|楼层 |状态   | 房屋朝向 |出租价格 |房屋设施 ");
//		while(it.hasNext())
//		{
//			House house=(House) it.next();
//
//			System.out.println(house.getHouseId() + "   | "
//					+ house.getVillageName() + "   | "
//					+ house.getHouseType() + "   |  "
//					+ house.getHouseSet() + "   | "
//					+ house.getHouseFloor() + "   | "
//					+ house.getHouseState() + "   | "
//					+ house.getHouseFavor() + "   | "
//					+ house.getRentPrice() + "   | "
//					+ house.getHouseFacility());
//		}

//	}
//
//	// 房租价格查询
//	public void getHouseRentPrice() {
//		//1:输入查询价格
//		System.out.println("请输入最低价格：");
//		Scanner sc = new Scanner(System.in);
//		int lowPrice = sc.nextInt();
//		System.out.println("请输入最高价格：");
//		int highPrice = sc.nextInt();
//
//		//2:调用按照价格范围查找方法,返回List集合
//          //如果集合中没有元素,则输出"对不起，没有合适的房源信息!"
//		  //否则,遍历集合,并输出
//
//	}
//
//	// 根据房源状态查询
//	public void getHouseByState() {
//		////1:输入房源状态
//		System.out.println("请输入房源状态 0：没有出租  1 ：已出租");
//		Scanner sc = new Scanner(System.in);
//		int state = sc.nextInt();
//		//2:调用按照房源状态查找方法,返回List集合
//          //如果集合中没有元素,则输出"对不起，没有合适的房源信息!"
//		  //否则,遍历集合,并输出
//	}
//
//	// 根据小区名称查询
//	public void getHouseByVillageName() {
//		//1:输入小区名称
//		System.out.println("请输入房源小区名称:");
//		Scanner sc = new Scanner(System.in);
//		String villageName = sc.next();
//
//		//2:调用按照小区姓名查找方法,返回List集合
//        //如果集合中没有元素,则输出"对不起，没有合适的房源信息!"
//		  //否则,遍历集合,并输出
//	}
//
//	// 根据房屋楼层查询
//	public void getHouseByFloor() {
//		//1:输入房源楼层
//		System.out.println("请输入房源楼层:");
//		Scanner sc = new Scanner(System.in);
//		String houseFloor = sc.next();
//		//2:调用按照房源楼层查找方法,返回List集合
//        //如果集合中没有元素,则输出"对不起，没有合适的房源信息!"
//		  //否则,遍历集合,并输出
//	
//	}
}
