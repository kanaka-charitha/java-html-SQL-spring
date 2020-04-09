<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
<style>
.error
{
color:red;
}
body{
 
  background: url(file:///C:/Users/Aspire/eclipse-workspace/CustomerManagementSystem/src/main/webapp/WEB-INF/img/cus4.jpg);
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
<body >
<center>
<h1>CUSTOMER MANAGEMENT SYSTEM</h1>
</center>
<h3>ADD CUSTOMER</h3>
<form:form action="saCustomer" modelAttribute="customer" method="POST" >
		<table>
			<tbody>
			    <tr>
					<td><label>Customer-ID:</label></td>
					<td><form:input path="id" /></td>
				</tr>
				<tr>
					<td><label>First Name:</label></td>
					<td><form:input path="firstName" /></td>
					<form:errors path="firstName" cssClass="error"/>
				</tr>
				<tr>
					<td><label>Last Name:</label></td>
					<td><form:input path="lastName" /></td>
					<form:errors path="lastName" cssClass="error"/>
				</tr>
				<tr>
					<td><label>Email-ID:</label></td>
					<td><form:input path="email" /></td>
					<form:errors path="email" cssClass="error"/>
				</tr>
				<tr>
					<td><label>Contact number:</label></td>
					<td><form:input path="contact" /></td>
					<form:errors path="contact" cssClass="error"/>
				</tr>
				<tr>
					<td><label>Gender:</label></td>
					<td><form:input path="gender" /></td>
					<form:errors path="gender" cssClass="error"/>
				</tr>
			<tr>
					<td><label>Product:</label></td>
					<td><form:input path="product" /></td>
					<form:errors path="product" cssClass="error"/>
				</tr>
				
				<tr>
					<td><input type="submit" value="Save" class="save"></td>
				</tr>
			</tbody>
		</table>
	</form:form>
	<p>
		<a href="http://localhost:8123/CustomerManagementSystem/customer-login.jsp">Back
			List</a>
	</p>
</body>
</html>