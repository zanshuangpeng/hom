package com.work.service;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.sun.org.apache.xerces.internal.impl.Constants;
import com.work.dao.CartDaoImp;
import com.work.entity.Cart;
import com.work.entity.CartList;

@Service
public class CartImp {
	@Resource
	private CartDaoImp cartDaoImp;
	
	public void CartAdd(HttpServletRequest request,HttpSession session)throws Exception{
		int user_id=(Integer)session.getAttribute("user_id");
		Cart c=new Cart();
		c.setU(user_id);
		this.cartDaoImp.CartAdd(c);
	}
	public String CartListAdd(HttpServletRequest request, int id,int price,String p_name,HttpSession session)throws Exception{
		String user_id=String.valueOf(session.getAttribute("user_id"));
		if(session.getAttribute("user_id")!=null){
		Cart c=this.cartDaoImp.CartFindByid(user_id);
		if(c==null){
			CartAdd(request,session);
			CartListAdd(request,id,price,p_name,session);
		}
		CartList cl=new CartList();
		cl.setCart_id(String.valueOf(c.id));
		cl.setProduct_id(id);
		cl.setNumber(1);
		cl.setPrice(price);
		cl.setP_name(p_name);
		this.cartDaoImp.CartListAdd(cl);
		return "";
		}else{
			return "unlogin";
		}
		
	}
	
	public String CartListA(HttpSession session,Model model,Model AllPrice)throws Exception{
		String user_id=String.valueOf(session.getAttribute("user_id"));
		if(session.getAttribute("user_id")!=null){
			
		Cart c=this.cartDaoImp.CartFindByid(user_id);
		String cart_id=String.valueOf(c.id);
		List<CartList> list=this.cartDaoImp.CartList(cart_id);
		model.addAttribute("list", list);
		int price=0;
		for(CartList str: list){
			price=price+str.getPrice();
		}
		AllPrice.addAttribute("AllPrice", price);
		return "cart";
		}else{
			return "unlogin";
		}
		
	}
	public String CartListDelte(HttpSession session,Model model,Model AllPrice,int id)throws Exception{
		this.cartDaoImp.CartListDelete(id);
		return CartListA(session,model,AllPrice);
	}
	public String CartListB(HttpSession session,Model model,Model AllPrice)throws Exception{
		String user_id=String.valueOf(session.getAttribute("user_id"));
		if(session.getAttribute("user_id")!=null){
		
		Cart c=this.cartDaoImp.CartFindByid(user_id);
		String cart_id=String.valueOf(c.id);
		List<CartList> list=this.cartDaoImp.CartList(cart_id);
		model.addAttribute("list", list);
		int price=0;
		for(CartList str: list){
			price=price+str.getPrice();
		}
		AllPrice.addAttribute("AllPrice", price);
		return "cart";
		}else{
			return "unlogin";
		}
	}
	
}
