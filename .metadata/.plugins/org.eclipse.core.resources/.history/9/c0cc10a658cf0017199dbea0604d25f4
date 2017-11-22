<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<br><br><br><br><br>
<table class="table table-striped table-bordered table-list">
                 <thead>
                   <tr>
                       
                       <th>ID</th>
                       <th>ProdutName</th>
                       <th>Price</th>
                       <th>Action</th>
                                                                                             
                   </tr> 
                 </thead>
                 <tbody>
                         
                         <c:forEach items="${slist}" var="p">
                         <tr>
                        
                           <td>${p.productid}</td>
                           <td>${p.productname}</td>
                          <%-- <td>${p.categoryid.categoryname}</td>     
                           <td>${p.suplierid.suppliername}</td> --%>    
                           <td>${p.productprice}</td> 
                             <td>
                             <a class="glyphicon glyphicon-repeat" href="./product_edit?id=${p.productid}"><em class="fa fa-pencil"></em></a>
                             <a class="glyphicon glyphicon-remove" href="./product_delete?id=${p.productid}"><em class="fa fa-trash"></em></a>
                           </td>
                           
                           <%-- <td><img src="./resources/product/${p.p_image}"  class="img-rounded" alt="" width="75px" height="50px"/></td>          --%>
                           <%-- <td><img src='<c:url value="./resources/product" />'${p.p_image}  class="img-rounded" alt="" width="75px" height="50px"/></td>  --%>
                           <%-- <td><img src="${pageContext.request.contextPath}/resources/images/${p.p_image}"  class="img-rounded" alt="" width="75px" height="50px"/></td> --%>
                           <tr>       
                         </c:forEach>
                       </tbody>
               </table>
              <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>