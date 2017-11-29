package com.work.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.work.entity.Product;

@Repository
public class ProductDaoImp {
	@Resource
	private SessionFactory sessionFactory;
	
	public List<Product> ProductFindAll()throws Exception{
		String hql="from Product";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		List<Product> list=query.list();
		return list;
	}
}
