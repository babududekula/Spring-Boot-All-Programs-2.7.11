<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<h1 align="center" style="color: red;">Product Edit Form</h1>
<h2>
<form:form action="/editform">
	<table align="center" style="color: purple;">
		<tr>
			<td>Product Id</td>
			<td>${productId}<form:hidden path="productId" value="${productId}"/></td>
		</tr>
		<tr>
			<td>Product Name</td>
			<td><form:input path="productName"/></td>
		</tr>
		<tr>
			<td>Customer Number</td>
			<td><form:input path="customerMobile"/></td>
		</tr>
		<tr>
			<td>Product Price</td>
			<td><form:input path="productPrice"/></td>
		</tr>
		<tr>
			<td>Product Quantity</td>
			<td><form:input path="productQuantity"/></td>
		</tr>
		<%-- <tr>
			<td>Product Total</td>
			<td><form:input path="productTotal"/></td>
		</tr>
		
		<tr>
			<td>Product Discount</td>
			<td><form:input path="productDiscount"/></td>
		</tr>
		<tr>
			<td>Product ServiceCharges</td>
			<td><form:input path="productServiceCharges"/></td>
		</tr>
		<tr>
			<td>Product InvoiceAmount </td>
			<td><form:input path="productInvoiceAmount"/></td>
		</tr> --%>
		<tr>
			<td></td>
			<td><input type="submit" value="Update"/></td>
		</tr>
	</table>
</form:form>
</h2>
<h2 align="center"><a href="/viewProduct">View All Products</h2>
</body>
</html>