<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
	function validation() {
		var val1 = document.getElementById("bn").value;
		var val2 = document.getElementById("Cn").value;

		if (val1.length < 4 || val2.length < 4) {
			alert("the username and password should not be less than 4 characters")
			return false;
		}
		return true;
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Love Calculator</h1>
		<hr>
		<form:form method="get" action="result" modelAttribute="info">
			<p>
				<label for="bn"> Your Name :</label>
				<form:input id="bn" path="userName" />
				<form:errors path="userName"> </form:errors>

			</p>
			<p>
				<label for="Cn"> Cruch Name :</label>
				<form:input id="Cn" path="crushName" />

			</p>
			<input type="submit" value="Calculate">
		</form:form>

	</div>
</body>
</html>