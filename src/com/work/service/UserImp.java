package com.work.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.work.dao.UserDaoImp;
import com.work.entity.User;

@Service
public class UserImp {
	@Resource
	private UserDaoImp userRegisterDaoImp;
	
	public void RegisterUser(User u)throws Exception{
		this.userRegisterDaoImp.UserRegister(u);
	}
	
	public String UserLogin(String username,String password){
		try{
		User u=this.userRegisterDaoImp.Userlogin(username);
			if(password.equals(u.getPassword())){
				return "index";
			}else{
				return "login";
			}
		
		}catch(Exception e){
			e.printStackTrace();
			return "login";
		}
	}
	
}
