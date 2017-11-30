<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- To Access the Bootstrap link -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<link href="./resources/css/loginpage.css" rel="stylesheet" type="text/css"/>
<style type="text/css">
  .backgroundclr
  { 
    background-color: #1a0000;
  }
</style>
<body>
 <%-- <jsp:include page="header.jsp"></jsp:include> --%>
<!-- AddProduct coding  started -->
<div class="container">
    <div class="row">
        <div class="col-md-offset-5 col-md-3"><br><br><br>
            <div class="form-login">
            <form action="product_update" method="post" enctype="multipart/form-data">
            <h4 style="font-family: monospace;font-style: italic;"><b>ADD PRODUCT DETAILS</h4></b>
            <input type="text" id="userName" class="form-control input-sm chat-input"  name="id"  value="${product.productid}" placeholder="EnterProductId"/>
            </br>
            <input type="text" id="userPassword" class="form-control input-sm chat-input"  name="pname" value="${product.productname}" placeholder="EnterProductName"/>
            </br><br>
            Product Category
           <select name="cid">
             <c:forEach var="sList" items="${slist}">

                <option value="${sList.categoryid}">${sList.categoryname}</option>
                </c:forEach>
           
           </select><br><br><br>
           
          
           <input type="text" id="productprice" class="form-control input-sm chat-input" placeholder="Enter the product Price" name="price" value="${product.productprice}"/><br><br>
         
          <input type="file" name="file" value="fileupload" id="fileupload"><label for="fileupload"> Select a file to upload</label> 
          <button type="submit"><label for="fileupload"></label>
         
            <div class="wrapper">
            <span class="group-btn">  <br><br>   
                <input type="submit" value="ADD" class="btn btn-primary btn-md"><i class="fa fa-sign-in"></i></a>
                <input type="submit" value="BACK" class="btn btn-primary btn-md" onClick="display();"><i class="fa fa-sign-in"></i>
            </span>
            </div>
            </div>
        </form>
        </div>
    </div>
    </div>
   
        </div>
        
        </div>
    <jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>