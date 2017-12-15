package com.work.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.work.dao.ADDaoImp;
import com.work.entity.AD;

@Service
public class ADImp {
	@Resource
	private ADDaoImp aDDaoImp;
	
	public String ADLogin(String name,String password){
		try{
			AD a=this.aDDaoImp.ADLogin(name);
			if(password.equals(a.getPassword())){
				return "adminindex";
				
			}else{
				return "admin";
			}
		}catch(Exception e){
			e.printStackTrace();
			return "admin";
		}
	}
	
}
