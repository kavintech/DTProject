package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class Homecontroller {
	
@RequestMapping(value="/")
public ModelAndView indexpage()
{
	ModelAndView mt=new ModelAndView("index");
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