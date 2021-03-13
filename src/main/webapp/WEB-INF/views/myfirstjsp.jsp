<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to shopping Mall</title>
</head>
<body>
	<h1>${message}</h1>

	<%
	String obj = (String) request.getAttribute("message");
	%>
	<h1>
		Message is
		<%=obj%></h1>

	<!-- Getting List here -->

	<%
	List<String> obj1 = (List<String>)request.getAttribute("list");
	%>
    
    <!-- Displaying List here -->
	<h1>
		List is
		<%=obj1%></h1>
    <!-- Displaying List here using for loop -->
    
	<%
	for (String s : obj1) {
	%>

	<h1><%=s%></h1>

	<%
	}
	%>
	

   <!-- Displaying List here using for loop in JSTL -->
   
   <c:forEach var="item" items="${list}">
     <h1>${item}</h1>
    </c:forEach>


</body>
</html>