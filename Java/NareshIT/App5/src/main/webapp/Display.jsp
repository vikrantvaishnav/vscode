<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h1>
		<%
			String P_name = request.getParameter("pname");
			String P_id = request.getParameter("pid");
			String P_qnty = request.getParameter("pqty");
			String P_price = request.getParameter("pprice");
			
			out.println("Product Name:"+P_name);
			out.println("Product ID:"+P_id);
			out.println("Product Quantity:"+P_qnty);
			out.println("Product Price:"+P_price);



		%>
	</h1>
	
</body>
</html>