<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.error{
	font-style: italic;
	font-family: cursive;
	color: red;
}
</style>
<body>
<h1 align="center">Welcome To Registration Page</h1>
<form:form action="reg" modelAttribute="user" method="post">
<table align="center">
	<tr>
		<td>User Name</td>
		<td><form:input path="uname"/></td>
		<td><form:errors path="uname" cssClass="error"/></td>
	</tr>
	<tr>
		<td>User Password</td>
		<td><form:password path="upwd"/></td>
		<td><form:errors path="upwd" cssClass="error"/></td>
	</tr>
	<tr>
		<td>User Email</td>
		<td><form:input path="email"/></td>
		<td><form:errors path="email" cssClass="error"/></td>
	</tr>
	<tr>
		<td>User Mobile</td>
		<td><form:input path="mobile"/></td>
		<td><form:errors path="mobile" cssClass="error"/></td>
	</tr>
	<tr>
		<td>User Age</td>
		<td><form:input path="age"/></td>
		<td><form:errors path="age" cssClass="error"/></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit" value="Submit"/></td>
	</tr>
</table>
</form:form>
</body>
</html>