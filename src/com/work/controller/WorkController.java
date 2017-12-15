package com.work.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.work.entity.Product;
import com.work.entity.User;
import com.work.service.ADImp;
import com.work.service.CartImp;
import com.work.service.OrderImp;
import com.work.service.ProductImp;
import com.work.service.UserImp;

@Controller

public class WorkController {
	@Resource
	private UserImp userRegisterImp;
	@Resource
	private ProductImp productimp;
	@Resource
	private ADImp aDImp;
	@Resource
	private CartImp cartImp;
	@Resource
	private OrderImp orderImp;
	
	@RequestMapping("/AdminLogin")
	public String AdminLogin(String name,String password){
		return this.aDImp.ADLogin(name, password);
	}
	
	@RequestMapping("/UserRegisterController")
	public String UserRegister(User u)throws Exception{
		return this.userRegisterImp.RegisterUser(u);
		
	}
	@RequestMapping("/UserLoginController")
	public String Userlogin(String username,String password,HttpServletRequest request,HttpSession session){
		return this.userRegisterImp.UserLogin(username, password,request,session);
	}
	@RequestMapping("/bicyclesController")
	public String ProductAll(Model model)throws Exception{
		return this.productimp.ProductAll(model);
		
	}
	@RequestMapping("/m-bicycesController")
	public String ProductFindByTypeid(int typeid,Model model,HttpServletRequest request)throws Exception{
		return this.productimp.ProductFindByTypeid(typeid, model,request);
	}
	@RequestMapping("/ProductFindById")
	public String ProductFindByid(int id,Model model)throws Exception{
		this.productimp.ProductFindById(id, model);
		return "single";
	}
	@RequestMapping("/productlist")
	public String ProductList(Model model)throws Exception{
		this.productimp.ProductAll(model);
		return "productlist";
	}
	@RequestMapping("/ProductDelete")
	public String ProductList(Integer id,Model model)throws Exception{
		this.productimp.ProductAll(model);
		return this.productimp.ProductDelete(id);
	}
	@RequestMapping("/AddProduct" )
	public String AddProduct(Product p,Model model)throws Exception{
		this.productimp.AddProduct(p);
		this.productimp.ProductAll(model);
		return "productlist";
	}
	@RequestMapping(value="ModProduct",method=RequestMethod.GET)
	public String Productmod(int id,Model model)throws Exception{
		this.productimp.ProductFindById(id, model);
		return "mod";
	}
	
	@RequestMapping("/moproduct")
	public String ProductMod(Product pd)throws Exception{
		
		this.productimp.ProductMod(pd);
		return "";
	}
	@RequestMapping("/userlist")
	public String UserList(Model model)throws Exception{
		this.userRegisterImp.UserAll(model);
		return "userlist";
		
	}
	@RequestMapping("/UserDelete")
	public String UserDelete(Integer id,Model model)throws Exception{
		this.userRegisterImp.UserDelete(id);
		this.userRegisterImp.UserAll(model);
		return "userlist";
	}
	@RequestMapping("/OD")
	public String OrderL(Model model,Model mo)throws Exception{
		this.orderImp.OrderTO(model, mo);
		return "orderlis";
	}
	
	
	@RequestMapping("/CartAdd")
	public String CartAdd(HttpServletRequest request, int id,int price,String p_name,HttpSession session,Model model,Model AllPrice)throws Exception{
		this.cartImp.CartListAdd(request, id,price,p_name,session);
		return this.cartImp.CartListA(session, model,AllPrice);
	}
	
	@RequestMapping("/CartListDelete")
	public String CartListDelete(HttpSession session,Model model,Model AllPrice,int id)throws Exception{
		return this.cartImp.CartListDelte(session, model,AllPrice, id);
	}
	@RequestMapping("/Cart")
	public String Cart(HttpSession session,Model model,Model AllPrice)throws Exception{
		return this.cartImp.CartListB(session, model, AllPrice);
	}
	@RequestMapping("/Order")
	public String OrderAdd(HttpServletRequest request,HttpSession session,Model model,Model AllPrice,Model order_id)throws Exception{
		this.orderImp.OrderAdd(request, session);
		this.cartImp.CartListB(session, model, AllPrice);
		this.orderImp.OrderFind(session, order_id);
		return "orderlist";
	}
	@RequestMapping("/Or")
	public String Order(HttpServletRequest request,HttpSession session,Model model,Model AllPrice,Model order_id)throws Exception{
		this.cartImp.CartListB(session, model, AllPrice);
		this.orderImp.OrderFind(session, order_id);
		return this.orderImp.Order(session);
	}
	@RequestMapping("/OrderList")
	public String OrderListtt(HttpSession session)throws Exception{
		return this.orderImp.OrderListAdd(session);
	}
}
