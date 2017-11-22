package com.niit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Ecommerce_backend.DAO.ProductDAO;
import com.niit.Ecommerce_backend.Model.ProductModel;


@Controller
public class ProductList
{
	@Autowired
	 ProductDAO product;
	@RequestMapping(value ="/admin/productlistview")
	  public ModelAndView getlist() 
	   {
			ModelAndView mv=new ModelAndView("productlistview");
			List<ProductModel>slist=product.getAll();
			mv.addObject("slist",slist);
		    return mv;
	   }
		    @RequestMapping(value="/admin/product_delete")
			public ModelAndView deleteProduct(HttpServletRequest request){
				
				ProductModel p=product.findById(Integer.valueOf(request.getParameter("id")));
				System.out.print(p);
			    product.delete(p);
			    List<ProductModel> list=product.getAll();
			    ModelAndView mv = new ModelAndView("productlistview");	
			    mv.addObject("list",list);
			   return mv;

	   }
}
