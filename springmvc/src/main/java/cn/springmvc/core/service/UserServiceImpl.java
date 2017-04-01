package cn.springmvc.core.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.springmvc.core.bean.User;
import cn.springmvc.core.dao.user.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	
	public User findUserById(int id) {
		User user = userDao.findUserById(id);
		
		return user;
	}

	public User findUserByName(String username) {
		User user = userDao.findUserByName(username);
		return user;
	}

}
