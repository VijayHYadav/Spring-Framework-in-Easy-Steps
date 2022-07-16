<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<h1>Hello from spring mvc this text is from hello.jsp</h1>

	<%
	Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	Integer salary = (Integer) request.getAttribute("salary");
	out.print(id);
	out.println(name);
	out.println(salary);
	%>

	<b>${id} <i>${name}  </i>  ${salary}</b>
</body>
</html>