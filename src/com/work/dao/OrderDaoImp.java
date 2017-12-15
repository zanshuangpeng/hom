package com.work.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.work.entity.OrderTable;
import com.work.entity.OrderListtt;
@Repository
public class OrderDaoImp {
	@Resource
	private SessionFactory sessionFactory;
	
	public void OrderAdd(OrderTable o)throws Exception{
		this.sessionFactory.getCurrentSession().save(o);
	}
	public OrderTable CartFind(String user_id)throws Exception{
		String hql="from OrderTable where user_id="+user_id;
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		OrderTable ord=(OrderTable)query.uniqueResult();
		return ord;
	}
	public void OrderList(OrderListtt ol)throws Exception{
		this.sessionFactory.getCurrentSession().save(ol);
	}
	
	public List<OrderTable> OrderTableAll()throws Exception{
		String hql="from OrderTable";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		List<OrderTable> ot=query.list();
		return ot;
	}
	public List<OrderListtt> OrderListttAll()throws Exception{
		String hql="from OrderListtt";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		List<OrderListtt> ol=query.list();
		return ol;
	}
}
