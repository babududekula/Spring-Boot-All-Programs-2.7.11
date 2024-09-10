<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
table , th , td{
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
<body>
<h1 align="center" style="color: maroon;">&#128526;&#128526;&#128526; Your Product Details Here &#128526;&#128526;&#128526;</h1>
<h3>
<table align="center" style="color: green;">
	<tr>
		<td>Product-Id</td>
		<td>Product-Name</td>
		<td>Customer-Mobile</td>
		<td>Product-Price</td>
		<td>Product-Quantity</td>
		<td>Product-Total</td>
		<td>Product-Discount</td>
		<td>Product-ServiceCharges</td>
		<td>Product-InvoiceAmount</td>
		<td>Edit</td>
		<td>Delete</td>
	</tr>
	<c:forEach items="${babu}" var="product">
		<tr>
			<td>${product.productId}</td>
			<td>${product.productName}</td>
			<td>${product.customerMobile}</td>
			<td>${product.productPrice}</td>
			<td>${product.productQuantity}</td>
			<td>${product.productTotal}</td>
			<td>${product.productDiscount}</td>
			<td>${product.productServiceCharges}</td>
			<td>${product.productInvoiceAmount}</td>
			<td><a href="/edit/${product.productId}">Edit</td>
			<td><a href="/delete/${product.productId}">Delete</td>
		</tr>
	</c:forEach>
</table>
</h3>
<h2 align="center"><a href="/" style="color: red;">Go Home</a></h2>
</body>
</html>