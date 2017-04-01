package cn.springmvc.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.core.bean.User;
import cn.springmvc.core.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/index/login.do")
	public String login(String username,String password,Model model){
		if(username !=null && password !=null){
			User user = userService.findUserByName(username);
			if(user != null){
				if(username.equals(user.getName()) && password.equals(user.getPassword())){
					model.addAttribute("user", user);
					return "loginSuccess";
				}
			}
		}
		//将登录名回显
		model.addAttribute("username", username);
		return "index";
	}
}
