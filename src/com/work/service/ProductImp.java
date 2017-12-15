package com.work.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import org.springframework.ui.Model;

import com.work.dao.ProductDaoImp;
import com.work.entity.Product;

@Service
public class ProductImp {
	@Resource
	private ProductDaoImp productDaoimp;
	
	public String ProductAll(Model model)throws Exception{
		List<Product> list=new ArrayList<Product>();
		list=this.productDaoimp.ProductFindAll();
		model.addAttribute("list", list);
		return "bicycles";
	}
	
	public String ProductFindByTypeid(int typeid,Model model,HttpServletRequest request)throws Exception{
		List<Product> list =new ArrayList<Product>();
		list=this.productDaoimp.ProductFindeByType(typeid);
		model.addAttribute("list",list);
		request.setAttribute("typeid",typeid);
		return "bicycles";
	}
	
	public void ProductFindById(int id,Model model) throws Exception{
		Product p=this.productDaoimp.ProductFindeById(id);
		model.addAttribute("p",p);
		
	}
	
	public String ProductDelete(Integer id)throws Exception{
		this.productDaoimp.ProductDelete(id);
		return "productlist";
	}
	public void AddProduct(Product p)throws Exception{
		this.productDaoimp.AddProduct(p);
	}
	
	public void ProductMod(Product pd)throws Exception{
		this.productDaoimp.UpdateProduct(pd);
	}
}
