package com.niit.Ecommerce_backend.Model;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity	
@Table(name="ProductModel")
public class ProductModel implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="Productid")
	private int productid;
	@Column(name="Productname")
	private String productname;
	@Column(name="Productprice")
	private int productprice;
	 @ManyToOne
	 @JoinColumn(name="categoryid")
	 private CategoryModel categoryid;
	 
	public CategoryModel getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(CategoryModel categoryid) {
		this.categoryid = categoryid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	

}

