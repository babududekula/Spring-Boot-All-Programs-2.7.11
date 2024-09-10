<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Welcome To Reg Form</h1>
<h2>
<form:form action="/reg" modelAttribute="name" method="post">
	<table align="center">
		<tr>
			<td>Product Id</td>
			<td><form:input path="pid"/></td>
		</tr>
		<tr>
			<td>Product Name</td>
			<td><form:input path="pname"/></td>
		</tr>
		<tr>
			<td>Product Price</td>
			<td><form:input path="pprice"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Submit"/></td>
		</tr>
	</table>
</form:form>
</h2>
</body>
</html>