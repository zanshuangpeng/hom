package com.work.service;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.work.dao.CartDaoImp;
import com.work.dao.OrderDaoImp;
import com.work.entity.Cart;
import com.work.entity.CartList;
import com.work.entity.OrderTable;
import com.work.entity.OrderListtt;
@Service
public class OrderImp {
	@Resource
	private OrderDaoImp orderDaoImp;
	@Resource
	private CartDaoImp cartDaoImp;
	
	public void OrderAdd(HttpServletRequest request,HttpSession session)throws Exception{
		
		int user_id=(Integer)session.getAttribute("user_id");
		OrderTable o=new OrderTable();
		o.setUser_id(user_id);
		o.setState(1);
		o.setUser_name(request.getParameter("user_name"));
		o.setAddress(request.getParameter("address"));
		this.orderDaoImp.OrderAdd(o);
	}
	public void OrderFind(HttpSession session,Model order_id)throws Exception{
		String user_id=String.valueOf(session.getAttribute("user_id"));
		OrderTable ord=this.orderDaoImp.CartFind(user_id);
		order_id.addAttribute("order_id",ord.getUser_id());
	}
	public String Order(HttpSession session)throws Exception{
		String user_id=String.valueOf(session.getAttribute("user_id"));
		OrderTable ord=this.orderDaoImp.CartFind(user_id);
		if(ord!=null){
			return "orderlist";
		}else{
			return "order";
		}
	}
	
	public String OrderListAdd(HttpSession session)throws Exception{
		String user_id=String.valueOf(session.getAttribute("user_id"));
		OrderTable ord=this.orderDaoImp.CartFind(user_id);
		Cart c=this.cartDaoImp.CartFindByid(user_id);
		String cart_id=String.valueOf(c.id);
		List<CartList> list=this.cartDaoImp.CartList(cart_id);
		
		for(CartList str:list){
			OrderListtt ol=new OrderListtt();
			ol.setOrder_id(String.valueOf(ord.getId()));
			ol.setNumber(str.getNumber());
			ol.setPrice(str.getPrice());
			ol.setProduct_id(str.getProduct_id());
			ol.setP_name(str.getP_name());
			this.orderDaoImp.OrderList(ol);
			
		}
		
		return "";
	}
	public void OrderTO(Model model,Model mo)throws Exception{
		List<OrderListtt> ol=this.orderDaoImp.OrderListttAll();
		List<OrderTable> ot=this.orderDaoImp.OrderTableAll();
		model.addAttribute("ol", ol);
		mo.addAttribute("ot", ot);
	}
}
