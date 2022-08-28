<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="domain.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
</head>
<%
	List<ProductVO> list = (ArrayList<ProductVO>)request.getAttribute("list");
%>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>PNO</th>
				<th>PNAME</th>
				<th>REGDATE</th>
			</tr>
		</thead>
		<tbody>
		<% for(ProductVO pvo : list) {%>
			<tr>
				<td><%=pvo.getPno() %></td>
				<td><a href="./detail.pd?pno=<%=pvo.getPno() %>">
				<%=pvo.getPname() %></a></td>
				<td><%=pvo.getRegdate() %></td>
			</tr>
		<%} %>
		</tbody>
	</table>
	<h3>
		<a href="product/register.pd">Go Product Register Page</a>
	</h3>
</body>
</html>