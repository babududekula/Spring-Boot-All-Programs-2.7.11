<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
  border:1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>
<h1 align="center">Get All Books</h1>

<table border="1" align="center" style="width: 30%">
	<thead>
		<tr>
			<th>Book Id</th>
			<th>Book Name</th>
			<th>Book Price</th>
		</tr>
	</thead>
	
	<tbody>
		<c:forEach items="${message}" var="book">
				<tr style="height: 50px">
					<td>${book.bookId}</td>
					<td>${book.bookName}</td>
					<td>${book.bookPrice}</td>
				</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>