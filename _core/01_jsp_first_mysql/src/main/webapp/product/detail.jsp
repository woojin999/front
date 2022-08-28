<%@page import="domain.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product  Detail</title>
</head>
<%
	ProductVO pvo = (ProductVO)request.getAttribute("pvo");
%>
<body>
<table border="1">
		<tr>
			<th>PNO</th>
			<td><%=pvo.getPno() %></td>
		</tr>
		<tr>
			<th>PNAME</th>
			<td><%=pvo.getPname() %></td>
		</tr>
		<tr>
			<th>PRICE</th>
			<td><%=pvo.getPrice() %></td>
		</tr>
		<tr>
			<th>REGDATE</th>
			<td><%=pvo.getRegdate() %></td>
		</tr>
		<tr>
			<th>MADE BY</th>
			<td><%=pvo.getMadeby() %></td>
		</tr>
	</table>
	<h3><a href="./edit.pd?pno=<%=pvo.getPno()%>">Product Modify</a></h3>
	<h3><a href="">Product Remove</a></h3>
</body>
</html>