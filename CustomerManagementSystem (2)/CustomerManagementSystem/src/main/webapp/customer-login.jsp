<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CUSTOMER</title>
<style>
h{
font-size:20px;
color:tomato;
}
input{

width: 200px;
height:30px;
  margin: 8px ;
  box-sizing: border-box;
border-radius:8px;

}
body{
 
  background: url(file:///C:/Users/Aspire/eclipse-workspace/CustomerManagementSystem/src/main/webapp/WEB-INF/img/cus8.jpg);
background-repeat:no-repeat;
background-position:fixed;
background-size:cover;
}
</style>
</head>
<body>
<center>
<h>CUSTOMER</h>
<br><br>
<input type="button" value="View Products" onclick="location.href='products.jsp'" class="add-button"/>
<br><br>
<input type="button" value="Register for product" onclick="window.location.href='customer/regCustomer';return false;" class="add-button"/>
<input type="button" value="HOME" onclick="location.href='http://localhost:8123/CustomerManagementSystem/index.jsp'" class="add-button"/>
</center>
</body>
</html>