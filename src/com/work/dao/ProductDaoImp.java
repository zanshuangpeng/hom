package com.work.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
	
	public List<Product> ProductFindeByType(int typeid)throws Exception{
		String hql="from Product where typeid="+typeid;
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		List<Product> list=query.list();
		return list;
	}
	public Product ProductFindeById(int id)throws Exception{
		String hql="from Product where id="+id;
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		Product p=(Product)query.uniqueResult();
		return p;
	}
	
	public void ProductDelete(Integer id)throws Exception{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String hql="delete from Product where id="+id;
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		int ret =query.executeUpdate();
		tx.commit();
		session.close();
		
	}
	
	public void AddProduct(Product p)throws Exception{
		this.sessionFactory.getCurrentSession().save(p);
	}
	public void UpdateProduct(Product pd)throws Exception{
		 Session session = sessionFactory.getCurrentSession(); 
		 System.out.println("111");
         session.beginTransaction();  
         String hql = ("update Product pd set pd.name=?,pd.price=?,pd.size=?,pd.number=?,pd.typeid=? where pd.id=?");    
         Query query = session.createQuery(hql);  
         query.setParameter(0, pd.getName());  
         query.setParameter(1, pd.getPrice());  
         query.setParameter(2, pd.getSize());  
         query.setParameter(3, pd.getNumber());
         query.setParameter(4, pd.getTypeid()); 
         query.setParameter(5, pd.getId());
         query.executeUpdate(); 
         session.getTransaction().commit();    
	}

}
