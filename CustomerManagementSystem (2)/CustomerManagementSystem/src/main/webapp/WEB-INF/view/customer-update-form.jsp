<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update customer list</title>
<style>
table,tr,td{
backgroung-color:palevioletred;
}
body{
 
background-repeat:no-repeat;
background-position:fixed;
background-size:cover;
}
a{
text-decoration:none;
color:burlywood;
}
input{
box-sizing: border-box;
border-radius:8px;
}
</style>
</head>
<body bgcolor="snow">

<h1>CUSTOMER MANAGEMENT SYSTEM</h1>

<h3>ADD CUSTOMER</h3>
<form:form action="saveCustomer" modelAttribute="customer" method="POST" >
		<table>
			<tbody>
			<tr>
					<td><label>Customer-ID:</label></td>
					<td><form:input path="id" /></td>
				</tr>
				<tr>
					<td><label>First Name:</label></td>
					<td><form:input path="firstName" /></td>
				</tr>
				<tr>
					<td><label>Last Name:</label></td>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<td><label>Email_ID:</label></td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td><label>Contact number:</label></td>
					<td><form:input path="contact" /></td>
				</tr>
				<tr>
					<td><label>Gender:</label></td>
					<td><form:input path="gender" /></td>
				</tr>
				<tr>
					<td><label>Product:</label></td>
					<td><form:input path="product" /></td>
				</tr>
		
				<tr>
					<td><input type="submit" value="Save" class="save"></td>
				</tr>
			</tbody>
		</table>
	</form:form>
	<p>
		<a href="http://localhost:8123/CustomerManagementSystem/customer/list">Back to Customer
			List</a>
	</p>
</body>
</html>