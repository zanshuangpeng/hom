package com.work.entity;


import javax.annotation.Resource;
import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class test {
	
	@Resource
	private SessionFactory sessionFactory;
	@RequestMapping("/ssss")
	public void select() throws Exception{
		
		
		
		String hql="from Product where id=1";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		Product p=(Product)query.uniqueResult();
		String a=p.getName();
		System.out.println("111");
		System.out.println(a);
		
		
		
		
		return;
	}
	
	
	@RequestMapping("/11111")
	public void insert (Product p)throws Exception{

		this.sessionFactory.getCurrentSession().save(p);
		
	}
	
}
