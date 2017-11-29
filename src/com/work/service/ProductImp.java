package com.work.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

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
}
