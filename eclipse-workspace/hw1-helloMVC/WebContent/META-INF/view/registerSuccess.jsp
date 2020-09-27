<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>You registered successfully.</h1>
	<%--JSP 표현 --%>
	<%--doLogin의 request.setAttribute("customer", customer);와 맞춰야함 --%>
	<ul>
		<li>ID: ${customer.id}</li>
		<li>PASSWORD: ${customer.password}</li>
		<li>NAME: ${customer.name}</li>
		<li>GENDER: ${customer.gender}</li>
		<li>EMAIL: ${customer.email}</li>
	</ul>
	<p>
		<a href="/hw1-helloMVC/index.jsp"> go to home page </a>
	</p>
</body>
</html>