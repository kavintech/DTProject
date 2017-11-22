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
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(product);
		s.getTransaction().commit();
		s.close();
         
		
	}

	public ProductModel getId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(ProductModel product) {
		// TODO Auto-generated method stub
		
	}

	public void delete(ProductModel p)
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.delete(p);
		s.getTransaction().commit();
		s.close();sessionFactory.openSession().delete(p);
		
	
	}

	public List<ProductModel> getAll() {
		
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		Query query =s.createQuery("from ProductModel");        
		List<ProductModel> list=query.list();
		System.out.println(list);
		s.getTransaction().commit();
		return list;
	}

	public ProductModel findById(int id) {
		return (ProductModel)sessionFactory.openSession().get(ProductModel.class,id);
	}
	
	
}