/**
 * 出租房源信息类
 */

package chap5.task5_1.practice5_1.bean;

import java.util.Scanner;

//模型层House
public class House {
	private String houseId; //房源编号
	private String villageName;//小区名称
	private String companyName;//公司名称
	private String houseType;//房屋类型：二室二厅
	private String houseSet;//幢/座 编号
	private int houseState;//状态  0:未出租 1：已出租
	private String houseFavor;//房屋朝向：南北通透
	private String houseMethod;//房屋用途：
	private double housePrice;//房屋价格
	private double rentPrice;//出租价格
	private String houseFloor;//楼层
	private String houseBuildYear;//建筑年限
	private String houseFacility;//房屋设施
	private String houseRemark;//评价

	public House(){

	}

	public String getHouseId() {
		return houseId;
	}

	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public String getHouseSet() {
		return houseSet;
	}

	public void setHouseSet(String houseSet) {
		this.houseSet = houseSet;
	}

	public int getHouseState() {
		return houseState;
	}

	public void setHouseState(int houseState) {
		this.houseState = houseState;
	}

	public String getHouseFavor() {
		return houseFavor;
	}

	public void setHouseFavor(String houseFavor) {
		this.houseFavor = houseFavor;
	}

	public String getHouseMethod() {
		return houseMethod;
	}

	public void setHouseMethod(String houseMethod) {
		this.houseMethod = houseMethod;
	}

	public double getHousePrice() {
		return housePrice;
	}

	public void setHousePrice(double housePrice) {
		this.housePrice = housePrice;
	}

	public double getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}

	public String getHouseFloor() {
		return houseFloor;
	}

	public void setHouseFloor(String houseFloor) {
		this.houseFloor = houseFloor;
	}

	public String getHouseBuildYear() {
		return houseBuildYear;
	}

	public void setHouseBuildYear(String houseBuildYear) {
		this.houseBuildYear = houseBuildYear;
	}

	public String getHouseRemark() {
		return houseRemark;
	}

	public void setHouseRemark(String houseRemark) {
		this.houseRemark = houseRemark;
	}

	public String getHouseFacility() {
		return houseFacility;
	}


	public void setHouseFacility(String houseFacility) {
		this.houseFacility = houseFacility;

		System.out.println();
	}
}