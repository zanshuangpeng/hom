package com.work.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.work.entity.Cart;
import com.work.entity.CartList;

@Repository
public class CartDaoImp {
	@Resource
	private SessionFactory sessionFactory;
	
	public void CartAdd(Cart c)throws Exception{
		this.sessionFactory.getCurrentSession().save(c);
	}
	
	public Cart CartFindByid(String user_id)throws Exception{
		String hql="from Cart where user_id="+user_id;
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		Cart c=(Cart)query.uniqueResult();
		return c;
	}
	
	public void CartListAdd(CartList cl)throws Exception{
		this.sessionFactory.getCurrentSession().save(cl);
	}
	public List<CartList> CartList(String cart_id)throws Exception{
		String hql="from CartList where cart_id="+cart_id;
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		List<CartList> list=query.list();
		return list;
		
		
	}
	
	public void CartListDelete(int id)throws Exception{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String hql="delete from CartList where id="+id;
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		int ret =query.executeUpdate();
		tx.commit();
		session.close();
	}
}
