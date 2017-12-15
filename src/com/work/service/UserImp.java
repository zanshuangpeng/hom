package com.work.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.work.dao.UserDaoImp;
import com.work.entity.User;

@Service
public class UserImp {
	@Resource
	private UserDaoImp userRegisterDaoImp;
	
	public String RegisterUser(User u)throws Exception{
		this.userRegisterDaoImp.UserRegister(u);
		return "login";
	}
	
	public String UserLogin(String username,String password,HttpServletRequest request,HttpSession session){
		try{
		User u=this.userRegisterDaoImp.Userlogin(username);
			if(password.equals(u.getPassword())){
				session.setAttribute("user_id", u.getId());
				return "index";
			}else{
				return "login";
			}
		
		}catch(Exception e){
			e.printStackTrace();
			return "login";
		}
	}
	
	public void UserAll(Model model)throws Exception{
		List<User> list=new ArrayList<User>();
		list=this.userRegisterDaoImp.UserALL();
		model.addAttribute("list", list);
		
		
	}
	public void UserDelete(Integer id)throws Exception{
		this.userRegisterDaoImp.UserDelete(id);
		
	}
	
}
