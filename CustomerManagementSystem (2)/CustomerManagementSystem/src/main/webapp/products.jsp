<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body{
 
  background: url();
background-repeat:no-repeat;
background-position:fixed;
background-size:cover;
}
input{

width: 200px;
height:30px;
  margin: 8px ;
  box-sizing: border-box;
border-radius:8px;

}
table{
font-family:arial,sans-serif;
border-collapse:collapse;
width:100%;
}
td,th{
border:1px solid #dddddd;
text-align:left;
padding:8px;
}
tr:nth-child(even){
background-color:#dddddd;}
</style>
</head>
<body>
<h2>Product List</h2>
<table>
<tr>
<th>Product</th>
<th>Company</th>
</tr>
<tr>
<td>Washing Machine</th>
<td>SAMSUNG</th>
</tr><tr>
<td>LED</th>
<td>LG</th>
</tr><tr>
<td>SMART WATCH</th>
<td>APPLE</th>
</tr><tr>
<td>LAPTOP</th>
<td>DELL</th>
</tr><tr>
<td>TELIVISION</th>
<td>TOSHIBA</th>
</tr>
</table>
<br>
<a href="http://localhost:8123/CustomerManagementSystem/customer-login.jsp">Back
</body>
</html>