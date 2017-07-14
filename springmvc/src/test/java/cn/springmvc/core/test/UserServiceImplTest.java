package cn.springmvc.core.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.springmvc.commons.test.SpringJunitTest;
import cn.springmvc.core.service.UserServiceImpl;


public class UserServiceImplTest extends SpringJunitTest{

	@Resource
	private UserServiceImpl userServiceImpl;
	
	//方法上要有@Test注解 不然会报错的
	@Test
	public void testFindUserById() {
		System.out.println(userServiceImpl.findUserById(1000));
	
	}
	@Test
	public void testFindUserByAdd(){
		System.out.println(userServiceImpl.findUserByAdd("成都"));
	}

}
