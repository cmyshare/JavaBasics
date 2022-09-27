package chap4.task4_3.practice4_3.dao;

import chap4.task4_3.practice4_3.bean.HireUser;
import chap4.task4_3.practice4_3.bean.User;

public class HireUserDAOImp implements UserDAO{  //求租客户信息处理业务类
	HireUser hu[]=new HireUser[10]; //对象类型的数组-复合类型



	public HireUserDAOImp() {
		//每次添加时，自动先模拟10个数据进HireUser对象数据
		//因为时复合类型数组，给数组元素分配了内存空间，还需要给每一个数组元素单独分配内存空间。
		for(int i=0;i<hu.length;i++)
		{
			hu[i]=new HireUser();
			hu[i].setUserID(i+1);
			hu[i].setUserName("aaa");
		}
	}
	//判断有没有此用户
	public boolean isExist(User hireUser) {
		boolean flag=false;
		if(hireUser instanceof HireUser)
		{
			HireUser huser=(HireUser) hireUser;
			for(int i=0;i<hu.length;i++)     //判断，按照客户编号
			{
				if(hu[i].getUserID()==huser.getUserID())
				{
					flag=true;	    //找到的情况
				}
			}
		}
		return flag;
	}
	//添加客户
	public boolean insertUser(User hireUser) {
		boolean flag=false;
		HireUser h[]=hu;
		int length=hu.length;//获取长度
		if(hireUser instanceof HireUser)
		{
			hu=new HireUser[length+1];          //长度增一
			for(int i=0;i<h.length;i++)      //原来数组值的迁移
			{
				hu[i]=h[i];
			}
			hu[length]=(HireUser) hireUser;                  //添加用户在原数组的最后
			flag=true;
		}
		return flag;
	}


	//根据客户编号查询客户信息
	public User getUserById(int userId) {
		for(int i=0;i<hu.length;i++)
		{
			if(hu[i].getUserID()==userId)
			{
				return hu[i];
			}
		}

		return null;
	}
	//修改客户信息
	public boolean updateUser(int userId,User u) {
		boolean flag=false;
		HireUser huser[]=hu;
		int length=hu.length;
		int index=-1;
		if(u instanceof HireUser)
		{
			if(this.getUserById(userId)==null)
			{
				System.out.println("没有该用户");
			}else{
				System.out.println("存在该用户，需要修改");
				//求该用户的下标index
				for(int i=0;i<hu.length;i++)
				{
					if(hu[i].getUserID()==userId)
					{
						index=i;
					}
				}
				for(int j=0;j<index;j++)         //index之前的数据迁移
				{
					hu[j]=huser[j];
				}
				hu[index]=(HireUser) u;         //该元素更新
				for(int j=index+1;j<hu.length;j++)  //index之后的数据迁移
				{
					hu[j]=huser[j];
				}
				flag=true;
			}
		}
		return flag;

	}

	//删除客户信息
	public boolean deleteUser(User u) {
		boolean flag=false;
		if(!this.isExist(u))
		{
			System.out.println("不存在该用户，不能删除用户信息");
		}else
		{
			System.out.println("存在该用户，执行删除操作");
			HireUser huser[]=hu;
			int length=hu.length;
			if(u instanceof HireUser)
			{
				int index=-1;     //查找到用户的下标
				for(int i=0;i<hu.length;i++)
				{
					if(hu[i].getUserID()==u.getUserID())
					{
						index=i;
					}
				}
				if(index<0)
				{
					System.out.println("没有该用户");
				}else
				{
					System.out.println("存在该用户，需要删除");
					for(int j=0;j<index;j++)         //index之前的数据迁移
					{
						hu[j]=huser[j];
					}
					for(int j=index;j<hu.length-1;j++)   //index之后的数据迁移
					{
						hu[j]=huser[j+1];
					}
					flag=true;
				}
			}
		}
		return flag;
	}


	//根据客户姓名查询房源信息
	public User getUserByName(String userName) {
		for(int i=0;i<hu.length;i++)
		{
			if(hu[i].getUserName().equals(userName))
			{
				return hu[i];
			}
		}
		return null;
	}



	public void show()     //显示方法
	{
		for(int i=0;i<hu.length;i++)
		{
			System.out.println("求租客户的姓名是"+hu[i].getUserName());
		}
	}


}