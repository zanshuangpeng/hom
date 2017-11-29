package com.work.dao;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.work.entity.User;
@Repository
public class UserDaoImp {
	@Resource
	private SessionFactory sessionFactory;
	
	public void UserRegister(User u)throws Exception{
		this.sessionFactory.getCurrentSession().save(u);
	}
	
	public User Userlogin(String username)throws Exception{
		String hql="from User where name="+username;
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		User u=(User)query.uniqueResult();
		return u;
	}
	
}
