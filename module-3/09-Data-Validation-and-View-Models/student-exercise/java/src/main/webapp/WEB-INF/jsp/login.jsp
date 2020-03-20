<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="pageTitle" value="Home Page"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="common/header.jspf" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
<c:url var="loginUrl" value="/login" />
	<form:form method="POST" action="${loginUrl}"
		modelAttribute="login">
		<div>
			<label for="email">Email</label>
			<form:input path="email" placeholder="Enter email" />
			<form:errors path="email" cssClass="error" />
		</div>
		<div>
			<label for="password">Password</label>
			<form:input path="password" placeholder="Enter password" />
			<form:errors path="password" cssClass="error" />
		</div>
		<div>
			<input type="submit" value="Login" />
		</div>
	</form:form>
</body>
</html>

<%@include file="common/footer.jspf" %>
