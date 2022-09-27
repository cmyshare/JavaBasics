/**
 * 主界面设计
 */


package chap5.task5_4.practice5_4.manager;

import java.util.List;
import java.util.Scanner;

import chap5.task5_4.practice5_4.bean.House;
import chap5.task5_4.practice5_4.dao.HouseDAOImpUseOfHashMap;;

public class HouseManager {

	private HouseDAOImpUseOfHashMap hdim;

	public HouseManager() {
		hdim = new HouseDAOImpUseOfHashMap();
	}

	// 显示房源信息管理功能
	public void showFuction() {
		System.out.println("*************************************************");
		System.out
				.println("*              欢迎您使用房源管理系统                                  *");
		System.out.println("*                                               *");
		System.out
				.println("*    请选择要操作的功能：                                                                 *");
		System.out
				.println("*      房源信息管理：                                                                           *");
		System.out
				.println("*     1：查看所有房源                2：增加房源信息                     *");
		System.out.println("*     3：修改房源信息	  4：删除房源信息                     *");
		System.out.println("*                                               *");
		System.out
				.println("*        房源信息查询：                                                                     *");
		System.out
				.println("*     5：房租价格                         6：房源状态                                *");
		System.out
				.println("*     7：小区名称                         8： 房屋楼层                               *");
		System.out.println("*************************************************");

	}

	// 功能操作
	public void showAction() {

		Scanner sc = new Scanner(System.in);
		quit: while (true) {
			int action = sc.nextInt();
			switch (action) {
				case 1:
					this.showAllHouseInfo();
					break;
				case 2:
					this.addHouse();
					break;

				case 3:
					this.updateHouseInfo();
					break;

				case 4:
					this.removeHouseInfo();
					break;

				case 5:
					this.getHouseRentPrice();
					break;

				case 6:
					this.getHouseByState();
					break;

				case 7:
					this.getHouseByVillageName();
					break;

				case 8:
					this.getHouseByFloor();
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

		// 输入房源信息
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

		// 创建房源信息对象
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

		// 判断房源信息是否存在
		boolean isExist = hdim.isExist(house);
		if (isExist) {
			System.out.println("请重新输入,该房源信息已经存在啦！");
		} else {
			// 保存是否成功
			boolean iresult = hdim.insertHouse(house);
			if (iresult) {
				System.out.println("恭喜你！增加房源信息成功啦！");
			} else {
				System.out.println("添加房源失败啦！");
			}
		}

	}

	// 修改房源信息
	public void updateHouseInfo() {
		// 1:首先根据输入的房源编号查询是否存在
		System.out.println("请输入要修改的房源编号：");
		Scanner sc = new Scanner(System.in);
		String houseId = sc.next();

		House house = hdim.selectById(houseId);
		if (house == null) { // 2:如果不存在则不能修改
			System.out.println("该房源不存在！");
		} else {// 3:显示房源信息
			System.out
					.println("房源编号 |小区名称 |房屋类型 |幢/座编号|楼层 |状态   | 房屋朝向 |出租价格 |房屋设施 ");
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

			// 调用修改方法
			boolean uresult = hdim.updateHouse(house);
			if (uresult) {
				System.out.println("修改成功！");
				System.out.println("修改后的房源信息为：");
				System.out
						.println("房源编号 |小区名称 |房屋类型 |幢/座编号|楼层 |状态   | 房屋朝向 |出租价格 |房屋设施 ");
				System.out.println(house.getHouseId() + "   | "
						+ house.getVillageName() + "  | "
						+ house.getHouseType() + "  |  " + house.getHouseSet()
						+ "  | " + house.getHouseFloor() + "   | "
						+ house.getHouseState() + "  | "
						+ house.getHouseFavor() + "  | " + house.getRentPrice()
						+ "  | " + house.getHouseFacility());

			} else {
				System.out.println("修改失败啦！");
			}

		}

	}

	// 房源删除过程
	public void removeHouseInfo() {

		System.out.println("请输入要删除的房源编号：");
		Scanner sc = new Scanner(System.in);
		String houseId = sc.next();
		House house = hdim.selectById(houseId);
		if (house == null) {
			System.out.println("该房源不存在！");

		} else {
			System.out
					.println("房源编号 |小区名称 |房屋类型 |幢/座编号|楼层 |状态   | 房屋朝向 |出租价格 |房屋设施 ");
			System.out.println(house.getHouseId() + "   | "
					+ house.getVillageName() + "  | " + house.getHouseType()
					+ "  |  " + house.getHouseSet() + "  | "
					+ house.getHouseFloor() + "   | " + house.getHouseState()
					+ "  | " + house.getHouseFavor() + "  | "
					+ house.getRentPrice() + "  | " + house.getHouseFacility());
			System.out.println("你确定要删除吗?c：删除  d:取消");

			String delectAction = sc.next();
			if (delectAction.equals("c")) {// 确定删除该房源
				boolean dresult = hdim.deleteById(house.getHouseId());
				if (dresult) {
					System.out.println("删除成功啦！");
				} else {
					System.out.println("删除失败啦！");
				}
			} else {
				System.out.println("取消删除该房源啦！");
			}

		}
	}

	// 查看所有房源信息
	public void showAllHouseInfo() {
		String houseInfo = hdim.showAllHouseInfo();
		System.out.println(houseInfo);
	}

	// 房租价格查询
	public void getHouseRentPrice() {
		System.out.println("请输入最低价格：");
		Scanner sc = new Scanner(System.in);
		int lowPrice = sc.nextInt();
		System.out.println("请输入最高价格：");
		int highPrice = sc.nextInt();

		List list = hdim.searchByRentPrice(lowPrice, highPrice);
		System.out.println("list=" + list.size());
		if (list == null) {
			System.out.println("对不起，没有合适的房源信息！");
		} else {
			System.out
					.println("房源编号|小区名称 | 房屋类型 |幢/座编号 | 楼层 |状态 |房屋朝向  | 出租价格 ");
			for (int i = 0; i < list.size(); i++) {
				House house = (House) list.get(i);

				System.out.println(house.getHouseId() + " | "
						+ house.getVillageName() + " | " + house.getHouseType()
						+ "  | " + house.getHouseSet() + " |  "
						+ house.getHouseFloor() + " | " + house.getHouseState()
						+ " | " + house.getHouseFavor() + " | "
						+ house.getRentPrice());
				System.out.println("\n");
			}
		}
	}

	// 根据房源状态查询
	public void getHouseByState() {
		System.out.println("请输入房源状态 0：没有出租  1 ：已出租");
		Scanner sc = new Scanner(System.in);
		int state = sc.nextInt();

		List list = hdim.searchByHouseState(state);
		if (list == null) {
			System.out.println("没有房源信息！");
		} else {
			System.out
					.println("房源编号|小区名称 | 房屋类型 |幢/座编号 | 楼层 |状态 |房屋朝向  | 出租价格 ");
			for (int i = 0; i < list.size(); i++) {
				House house = (House) list.get(i);

				System.out.println(house.getHouseId() + " | "
						+ house.getVillageName() + " | " + house.getHouseType()
						+ "  | " + house.getHouseSet() + " |  "
						+ house.getHouseFloor() + " | " + house.getHouseState()
						+ " | " + house.getHouseFavor() + " | "
						+ house.getRentPrice());
				System.out.println("\n");
			}
		}
	}

	// 根据小区名称查询
	public void getHouseByVillageName() {
		System.out.println("请输入房源小区名称:");
		Scanner sc = new Scanner(System.in);
		String villageName = sc.next();

		List list = hdim.simleSearchHouse("villageName", villageName);
		if (list == null || list.size() == 0) {
			System.out.println("没有该房源信息！");
		} else {
			System.out
					.println("房源编号|小区名称 | 房屋类型 |幢/座编号 | 楼层 |状态 |房屋朝向  | 出租价格 ");
			for (int i = 0; i < list.size(); i++) {
				House house = (House) list.get(i);

				System.out.println(house.getHouseId() + " | "
						+ house.getVillageName() + " | " + house.getHouseType()
						+ "  | " + house.getHouseSet() + " |  "
						+ house.getHouseFloor() + " | " + house.getHouseState()
						+ " | " + house.getHouseFavor() + " | "
						+ house.getRentPrice());
				System.out.println("\n");
			}
		}
	}

	// 根据房屋楼层查询
	public void getHouseByFloor() {

		System.out.println("请输入房源楼层:");
		Scanner sc = new Scanner(System.in);
		String houseFloor = sc.next();

		List list = hdim.simleSearchHouse("houseFloor", houseFloor);
		if (list == null) {
			System.out.println("没有该房源信息！");
		} else {
			System.out
					.println("房源编号|小区名称 | 房屋类型 |幢/座编号 | 楼层 |状态 |房屋朝向  | 出租价格 ");
			for (int i = 0; i < list.size(); i++) {
				House house = (House) list.get(i);

				System.out.println(house.getHouseId() + " | "
						+ house.getVillageName() + " | " + house.getHouseType()
						+ "  | " + house.getHouseSet() + " |  "
						+ house.getHouseFloor() + " | " + house.getHouseState()
						+ " | " + house.getHouseFavor() + " | "
						+ house.getRentPrice());
				System.out.println("\n");
			}
		}
	}

	public static void main(String[] args) {
		//房屋管理-查询房源信息
		HouseManager houseManager = new HouseManager();
		//功能选择
		houseManager.showFuction();
		//功能具体行为
		houseManager.showAction();

	}
}