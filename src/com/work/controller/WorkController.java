package com.work.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.work.entity.Product;
import com.work.entity.User;
import com.work.service.ProductImp;
import com.work.service.UserImp;

@Controller

public class WorkController {
	@Resource
	private UserImp userRegisterImp;
	@Resource
	private ProductImp productimp;
	@RequestMapping("/UserRegisterController")
	public void UserRegister(User u)throws Exception{
		this.userRegisterImp.RegisterUser(u);
		
	}
	@RequestMapping("/UserLoginController")
	public String Userlogin(String username,String password){
		return this.userRegisterImp.UserLogin(username, password);
	}
	@RequestMapping("/bicyclesController")
	public String ProductAll(Model model)throws Exception{
		return this.productimp.ProductAll(model);
		
	}
}
