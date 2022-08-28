<%@page import="domain.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product  Edit</title>
</head>
<%
	ProductVO pvo = (ProductVO)request.getAttribute("pvo");
%>
<body>
	<form action="./modify.pd"  method="post">
	<input type="hidden" name="pno" value="<%=pvo.getPno() %>">
	<table border="1">
		<tr>
			<th>PNO</th>
			<td><%=pvo.getPno() %></td>
		</tr>
		<tr>
			<th>PNAME</th>
			<td>
			<input type="text" name="pname" value="<%=pvo.getPname() %>">
			</td>
		</tr>
		<tr>
			<th>PRICE</th>
			<td>
			<input type="number" name="price" value="<%=pvo.getPrice() %>">
			</td>
		</tr>
		<tr>
			<th>REGDATE</th>
			<td>
			<%=pvo.getRegdate() %>
			</td>
		</tr>
		<tr>
			<th>MADE BY</th>
			<td>
			<input type="text" name="madeBy" value="<%=pvo.getMadeby() %>">
			</td>
		</tr>
		<tr>
			<td  colspan="2">
				<button type="submit">수정완료</button>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>