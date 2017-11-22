package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Ecommerce_backend.DAO.CategoryDAO;
import com.niit.Ecommerce_backend.Model.CategoryModel;

@Controller

public class Homecontroller 
{

   		
	
	@Autowired
	private CategoryDAO categoryDAO;
	 	
@RequestMapping(value="/")
public ModelAndView indexpage()
{
	   List<CategoryModel> clist=categoryDAO.getAll();
       ModelAndView mt=new ModelAndView("index");
   	mt.addObject("list",clist);
	return mt;
}
@RequestMapping(value="/rig")
public ModelAndView register()
{
	ModelAndView mt1=new ModelAndView("signup");
			return mt1;
}
@RequestMapping(value="/log")
public ModelAndView login()
{
	ModelAndView mt2=new ModelAndView("login");
	return mt2;
}
}