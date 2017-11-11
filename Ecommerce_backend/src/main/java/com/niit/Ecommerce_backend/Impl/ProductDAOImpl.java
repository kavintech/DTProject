package com.niit.Ecommerce_backend.Impl;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Ecommerce_backend.DAO.ProductDAO;
import com.niit.Ecommerce_backend.Model.ProductModel;

@Repository
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addProduct(ProductModel product) {
		// TODO Auto-generated method stub
		
	}

	public ProductModel getId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(ProductModel product) {
		// TODO Auto-generated method stub
		
	}

	public void delete(ProductModel p) {
		// TODO Auto-generated method stub
		
	}

	public List<ProductModel> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public ProductModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	


	}
