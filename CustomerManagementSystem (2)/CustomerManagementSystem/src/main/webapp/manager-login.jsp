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
 
  background: url(file:///C:/Users/Aspire/eclipse-workspace/CustomerManagementSystem/src/main/webapp/WEB-INF/img/cus3.jpg);
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
<br>
<form action="success" modelAttribute="admin">
<div>
User ID:<input type="text" name="username"/>
<br>
<br>
Password:<input type="password" name="password"/>
<br>
<br>
</center>
<p align="center" font size="20"><input type="submit" name="submit" value="Login"/></p>
</div>
</form>
<br>
<input type="button" value="HOME" onclick="location.href='http://localhost:8123/CustomerManagementSystem/index.jsp'" class="add-button"/>
</center>
</body>
</html>