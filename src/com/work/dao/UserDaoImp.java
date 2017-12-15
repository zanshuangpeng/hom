package com.work.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
	public List<User> UserALL()throws Exception{
		String hql="from User";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		List<User> list=query.list();
		return list;
	}
	public void UserDelete(Integer id)throws Exception{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String hql="delete from User where id="+id;
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		int ret =query.executeUpdate();
		tx.commit();
		session.close();
	}
}
