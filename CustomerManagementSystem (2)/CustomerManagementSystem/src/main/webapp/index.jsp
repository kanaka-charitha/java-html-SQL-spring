<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Management System</title>
<style>
body{
 
  background: url(file:///C:/Users/Aspire/eclipse-workspace/CustomerManagementSystem/src/main/webapp/WEB-INF/img/cus7.jpg);
background-repeat:no-repeat;
background-position:fixed;
background-size:cover;
}
input{

width: 200px;
height:30px;
  margin: 8px 0;
  box-sizing: border-box;
border-radius:8px;

}
</style>
</head>
<body bgcolor="darkturquoise" >
<center>
<h1>Customer Management system</h1>
<br><br>
<br>
<input type="button" value="Manager" onclick="location.href='manager-login.jsp'" class="add-button"/>
<input type="button" value="Customer" onclick="location.href='customer-login.jsp'" class="add-button"/>
</center>
</body>
</html>