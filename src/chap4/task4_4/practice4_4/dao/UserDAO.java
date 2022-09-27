package chap4.task4_4.practice4_4.dao;


import chap4.task4_4.practice4_4.bean.User;

public interface UserDAO {
	//判断有没有此用户
	public boolean isExist(User u);
	//添加客户
	public boolean insertUser(User u);
	//根据客户编号查询客户信息
	public User getUserById(int userId);
	//修改客户信息
	public boolean updateUser(int userId, User u);
	//删除客户信息
	public boolean deleteUser(User u);

	//根据客户姓名查询客户信息
	public User getUserByName(String  userName);

	public void show();     //显示方法
}
