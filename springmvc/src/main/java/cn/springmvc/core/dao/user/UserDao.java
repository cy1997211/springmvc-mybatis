package cn.springmvc.core.dao.user;

import cn.springmvc.core.bean.User;

public interface UserDao {
	public User findUserById(int id);
	public User findUserByName(String username);
	public User findUserByAdd(String address);
}
