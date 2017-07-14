package cn.springmvc.core.service;

import cn.springmvc.core.bean.User;

public interface UserService {
	public User findUserById(int id);
	public User findUserByName(String username);
	public User findUserByAdd(String address);
}
