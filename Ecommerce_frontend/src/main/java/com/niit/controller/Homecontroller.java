package com.niit.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Ecommerce_backend.DAO.CategoryDAO;
import com.niit.Ecommerce_backend.DAO.ProductDAO;
import com.niit.Ecommerce_backend.DAO.UserDAO;
import com.niit.Ecommerce_backend.Model.CategoryModel;
import com.niit.Ecommerce_backend.Model.ProductModel;
import com.niit.Ecommerce_backend.Model.UserModel;

@Controller

public class Homecontroller 
{

	
	
	@Autowired
	private CategoryDAO categoryDAO;
	@Autowired
	ProductDAO products;
	@Autowired
	private ProductDAO productDAO;
	@Autowired
	private UserDAO user1;
	 	
	public void ProductDAO(ProductDAO productDAO)
	{
		this.productDAO=productDAO;
	}
   @RequestMapping(value="/")
   		public ModelAndView indePage()
   		{
	   List<CategoryModel> list=categoryDAO.getAll();
	       ModelAndView mt=new ModelAndView("index");
	   	mt.addObject("clist",list);
			return mt;
	    
   		}
   @ModelAttribute
   public void addAttributes(Model model)
   {
 	  model.addAttribute("clist",categoryDAO.getAll());
   }
 
@RequestMapping(value="/reg")
	public ModelAndView regpage()
	{
		ModelAndView m2=new ModelAndView("registerpage");
		return m2;
		
	}
@RequestMapping(value ="/registerpage")
public ModelAndView addUser(HttpServletRequest request)
{
    
		
	   int u_id=Integer.valueOf(request.getParameter("userid"));
		
	  // int u_id=Integer.parseInt(request.getParameter("userid"));
	   
	   String u_name=request.getParameter("username");
	   
	   String u_pass=request.getParameter("userpass");
	   
	   String u_addr=request.getParameter("useraddress");
	   
	   String u_mail=request.getParameter("usermail");
	   
	   int u_age=Integer.valueOf(request.getParameter("userage"));
	   
	   //int u_age=Integer.parseInt(request.getParameter("userage"));
	   
	   String u_city=request.getParameter("usercity");
	   String u_phone=request.getParameter("userphone");
	   
	   //int u_phone=Integer.valueOf(request.getParameter("userphone"));
	   
	  // int u_phone=Integer.parseInt(request.getParameter("userphone"));
	   
	   String u_gen=request.getParameter("usergen");
	   
	   
	   
	   UserModel u=new UserModel();
	   u.setUserid(u_id);
	   u.setName(u_name);
	   u.setPassword(u_pass);
	   u.setAddress(u_addr);
	   u.setEmail(u_mail);
	   u.setAge(u_age);
	   u.setCity(u_city);
	   u.setPhone(u_phone);
	   u.setGender(u_gen);
	   u.setRole("ROLE_USER");
	   user1.addUser(u);
		//System.out.println(u.getUserid());
		
		ModelAndView mv = new ModelAndView("index");
		return mv;
}
@RequestMapping(value="/login")
public ModelAndView login()
{
	ModelAndView mt2=new ModelAndView("login");
	return mt2;
}

 

@RequestMapping(value="/admin/product_edit")

public ModelAndView editProducts(HttpServletRequest request){	
int id=Integer.parseInt(request.getParameter("id"));

List<CategoryModel> list=categoryDAO.getAll();
ModelAndView mv=new ModelAndView("productEdit");
mv.addObject("product",products.findById(id) );	
mv.addObject("slist", list);

return mv;
}
  @RequestMapping(value = "/admin/product_update", method = RequestMethod.POST)
  public  ModelAndView updateProduct(@RequestParam("file") MultipartFile file ,HttpServletRequest request) 
  { 

  	int id=Integer.valueOf(request.getParameter("id"));
  	String pname=request.getParameter("pname");
  	int price=Integer.valueOf(request.getParameter("price"));
  	int cid=Integer.valueOf(request.getParameter("cid"));
 // 	int sid=Integer.valueOf(request.getParameter("sid"));
  //	System.out.println(id+"-"+pname+"-"+price+"-"+cid+"-"+sid);
  	CategoryModel c=categoryDAO.findById(cid);
  	//SupplierModel s=supplierDAO.findById(sid);
  	//product2.addProduct(new ProductModel(id,pname,price,c,s));
  	
      ProductModel p=new ProductModel();
      p.setCategoryid(c);
      p.setProductname(pname);
      p.setProductprice(price);
      p.setProductid(id);
      String originalfile = file.getOriginalFilename();
      p.setP_image(originalfile);
      //p.setSuplierid(s);
      products.update(p);
      String filepath = request.getSession().getServletContext().getRealPath("/");
      
      System.out.println(filepath+originalfile);
      try {
      	byte imagebyte[] = file.getBytes();
      	BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filepath+"/resources/product/"+originalfile));
      	fos.write(imagebyte);
      	fos.close();
      	} catch (IOException e) {
      	e.printStackTrace();
      	} catch (Exception e) {
      	// TODO Auto-generated catch block
      	e.printStackTrace();
      	}

  	ModelAndView mv = new ModelAndView("Adding");
  	
  	return mv;
  }
  @RequestMapping(value="/admin/product_delete")
  public ModelAndView deleteProduct(HttpServletRequest request){
  	
	ProductModel p=productDAO.findById(Integer.valueOf(request.getParameter("id")));
  	System.out.print(p);
      productDAO.delete(p);
      List<ProductModel> list=productDAO.getAll();
      ModelAndView mv = new ModelAndView("Adding");	
      mv.addObject("slist",list);
     return mv;
  }

	//view categorylist in header page
	@RequestMapping("/categoryproductlist")
	public ModelAndView productListFilter(HttpServletRequest request)
	{ 
		List<ProductModel> clist=productDAO.getFilterProducts(Integer.valueOf(request.getParameter("id")));
		//List<Product> list=productDao.getProducts();
		ModelAndView mv = new ModelAndView("categoryproductlist");	
		mv.addObject("list",clist);
		return mv;
	}
  @RequestMapping("/userlogged")
	public String userLogged() { 
		return "redirect:/";	
	}
	@RequestMapping("/noAccessPage")
	public ModelAndView notacess() 
	{
		ModelAndView m9=new ModelAndView("noAccessPage");
		//return "redirect:noAccessPage";
		return m9;
	}
	@RequestMapping(value="/sucess")
	public ModelAndView sucesspage()
	{
		ModelAndView m8=new ModelAndView("sucess");
		return m8;
		
	}


}