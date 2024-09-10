<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style type="text/css">
.error{
	color:red;
	font-style: italic;
}
</style>
<body>
<h1 align="center" style="color: green;">Welcome To Registration Page</h1>
<form action="added"  method="get">
	<table align="center">
		<tr>
			<td>Product Id</td>
			<td><input  type="text" name="productId"/></td>
			
			
		</tr>
		<tr>
			<td>Product Name</td>
			<td><input  type="text" name="productName"/></td>
		</tr>
		<tr>
			<td>Customer Mobile</td>
			<td><input  type="text" name="customerMobile"/></td>
			
		</tr>
		<tr>
			<td>Product Price</td>
			<td><input  type="text" name="productPrice"/></td>
		</tr>
		<tr>
			<td>Product Quantity</td>
			<td><input  type="text" name="productQuantity"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Submit"/></td>
		</tr>
	</table>
</form>
<h2 align="center" style="color: red;"><a href="/">Go Home</a></h2>

</body>
</html>
