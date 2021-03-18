<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Please register here</h1>
		<hr>
		<form:form action="success" method="GET" modelAttribute="Register">
			<p>
				<label for="n"> Name : </label>
				<form:input type="text" id="n" path="name" />
			</p>
			<p>
				<label for="un"> User Name : </label>
				<form:input type="text" id="un" path="username" />
			</p>
			<p>
				<label for="pw"> Password : </label>
				<form:password id="pw" path="password" />
			</p>
			<p>
				<label for="Co"> Country : </label>
				<form:select id="Co" path="country">
					<form:option value="Egypt">Egypt</form:option>
					<form:option value="India">India</form:option>
					<form:option value="Hungary">Hungary</form:option>
					<form:option value="Canada">Canada</form:option>
				</form:select>
			</p>
			<p>
				<label> Hobby : </label>
				<form:checkbox value="Cricket" path="hobby" />
				<label> Cricket</label>
				<form:checkbox value="Reading" path="hobby" />
				<label> Reading</label>
				<form:checkbox value="Travel" path="hobby" />
				<label> Travel</label>
				<form:checkbox value="Programming" path="hobby" />
				<label>Programming</label>
			</p>
			<p>
				<label> Gender : </label>

				<form:radiobutton id="male" value="Male" path="gender" />
				<label for="male"> Male </label>
				<form:radiobutton id="female" value="Female" path="gender" />
				<label for="female"> Female </label>
			</p>
			<h3>Communication</h3>
			<p>
				<label for="email"> Email  : </label>
				<form:input path="comm.Email"  id="email"/>
			</p>
			<p>
				<input type="submit" value="Register" />
			</p>
		</form:form>
	</div>
</body>
</html>