<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer List</title>
</head>
<body bgcolor="skyblue">

<h1>Customer Management System</h1>

<h3>CUSTOMER LIST</h3>
<div>
<input type="button" value="Add Customer" onclick="window.location.href='addCustomer';return false;" class="add-button"/>
</div>
<br>
<table border="1">
	    <tr>
		   <td>Customer_ID</td>
		   <td>First Name</td>
		   <td>Last Name</td>
		   <td>Email_ID</td>
		   <td>Contact number</td>
		   <td>Gender</td>
		   <td>Product_name</td>
	       <td>Price</td>
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
				<td>${tempCustomers.product_name}</td>
				<td>${tempCustomers.price}</td>
				<td><a href="${updateLink}">Update</a>|
				<a href="${deleteLink}" onclick="if(!(confirm('Are you sure to delete'))) return false">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>