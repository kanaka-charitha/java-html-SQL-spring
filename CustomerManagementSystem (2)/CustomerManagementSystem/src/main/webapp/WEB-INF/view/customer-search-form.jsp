<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List-Search By Id</title>
<style>
table{
border-collapse:collapse;
border:3px solid black;

}
input{
backgroung-color:lightgreen;
box-sizing: border-box;
border-radius:8px;
}
</style>
</head>
<body bgcolor="palegreen">
<center>
<h1>Customer Management System</h1>
<center>
<h3>CUSTOMER LIST-SEARCH BY NAME</h3>

<br>
<table border="1" bgclor="white" >
	    <tr>
		    <td>Customer_ID</td>
		   <td>First Name</td>
		   <td>Last Name</td>
		   <td>Email_ID</td>
		   <td>Contact number</td>
		   <td>Gender</td>
	       <td>Action</td>
		</tr>
		
		<c:url var="updateLink" value="/customer/updateCustomer">
				<c:param name="customerId" value="${customer.id}"></c:param>
		</c:url>
		<c:url var="deleteLink" value="/customer/deleteCustomer">
				<c:param name="customerId" value="${customer.id}"></c:param>
			</c:url>
			<tr>
				<td>${customer.id}</td>
				<td>${customer.firstName}</td>
				<td>${customer.lastName}</td>
				<td>${customer.email}</td>
				<td>${customer.contact}</td>
				<td>${customer.gender}</td>
				<td><a href="${updateLink}">Update</a>|
				<a href="${deleteLink}" onclick="if(!(confirm('Are you sure to delete'))) return false">Delete</a></td>
			</tr>
	
	</table>
	<div>
<input type="button" value="Add Customer" onclick="window.location.href='addCustomer';return false;" class="add-button"/>
<br><br><br>
</div>
<p>
		<a href="http://localhost:8123/CustomerManagementSystem/customer/list">Back to Customer
			List</a>
	</p>
</body>
</html>