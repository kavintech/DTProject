package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.niit.Ecommerce_backend.DAO.ProductDAO;

@Controller
public class ProductList
{
	@Autowired
	 ProductDAO product;
	
}