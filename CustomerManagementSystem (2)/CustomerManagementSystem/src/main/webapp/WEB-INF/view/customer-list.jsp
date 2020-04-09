<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer List</title>
<style>
body{
 
  background: url(file:///C:/Users/Aspire/eclipse-workspace/CustomerManagementSystem/src/main/webapp/WEB-INF/img/cus.jpg);
background-repeat:no-repeat;
background-position:fixed;
background-size:cover;
}
table{
border-collapse:collapse;
border:3px solid black;

}
input{
backgroung-color:plum;
box-sizing: border-box;
border-radius:8px;
}
</style>
</head>
<body>
<center>
<h1>Customer Management System</h1>
<center>
<h3>CUSTOMER LIST</h3>


<input type="button" value="BACK TO LOGIN" onclick="location.href='http://localhost:8123/CustomerManagementSystem/manager-login.jsp'" class="add-button"/>
<input type="button" value="SIGN OUT" onclick="location.href='http://localhost:8123/CustomerManagementSystem/index.jsp'" class="add-button"/>
<table border="1" bgclor="white" >
	    <tr>
		   <td>Customer_ID</td>
		   <td>First Name</td>
		   <td>Last Name</td>
		   <td>Email_ID</td>
		   <td>Contact number</td>
		   <td>Gender</td>
		   <td>Product</td>
	       <td>Action</td>
		</tr>
		<c:forEach var="tempCustomers" items="${customers}">
		<c:url var="updateLink" value="/customer/updateCustomer">
				<c:param name="customerId" value="${tempCustomers.id}"></c:param>
		</c:url>
		<c:url var="deleteLink" value="/customer/deleteCustomer">
				<c:param name="customerId" value="${tempCustomers.id}"></c:param>
			</c:url>
			<tr>
				<td>${tempCustomers.id}</td>
				<td>${tempCustomers.firstName}</td>
				<td>${tempCustomers.lastName}</td>
				<td>${tempCustomers.email}</td>
				<td>${tempCustomers.contact}</td>
				<td>${tempCustomers.gender}</td>
				<td>${tempCustomers.product}</td>
				<td><a href="${updateLink}">Update</a>|
				<a href="${deleteLink}" onclick="if(!(confirm('Are you sure to delete'))) return false">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<div>
<input type="button" value="Add Customer" onclick="window.location.href='addCustomer';return false;" class="add-button"/>
<br><br><br>
</div>
<br><br>
<div class="search">
<form action="searchCustomer"   >
<label>Search By ID:</label>
<input type="number" name="customerId">
<input type="submit" value="Search" >
</form>
</div>
</body>
</html>