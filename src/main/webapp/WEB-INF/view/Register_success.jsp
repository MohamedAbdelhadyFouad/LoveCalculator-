<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Thanks for registration</h1>
	${Register.name}
	<br /> ${Register.username}
	<br /> ${Register.password}
	<br /> ${Register.country}
	<br /> 
	<c:forEach var="temp"  items="${Register.hobby}">
	
	${temp},
	
	</c:forEach>
	
	
	
	<br /> ${Register.gender}
	<br />



</body>
</html>