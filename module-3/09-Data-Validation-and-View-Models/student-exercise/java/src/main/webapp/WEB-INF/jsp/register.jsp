<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="pageTitle" value="register"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="common/header.jspf" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<c:url var = "registerUrl" value ="/register"/>
	<form:form method="POST" action="${registerUrl}"
		modelAttribute="register">
		<div>
			<label for="firstName">First Name</label>
			<form:input path="firstName" placeholder="enter first name" />
			<form:errors path="firstName" cssClass="error" />
		</div>
		<div>
			<label for="lastName">Last Name</label>
			<form:input path="lastName" placeholder="enter last name" />
			<form:errors path="lastName" cssClass="error" />
		</div>
		<div>
			<label for="email">Email </label>
			<form:input path="email" placeholder="enter email" />
			<form:errors path="email" cssClass="error" />
		</div>
		<div>
			<label for="confirmEmail">Confirm Email</label>
			<form:input path="confirmEmail" placeholder="confirm email address" />
			<form:errors path="passwordMatch" cssClass="error" />
		</div>
		<div>
			<label for="password">Password </label>
			<form:input path="password" placeholder="enter password" />
			<form:errors path="password" cssClass="error" />
		</div>
		<div>
			<label for="confirmPassword">Confirm Password</label>
			<form:input path="confirmPassword" placeholder="confirm password" />
			<form:errors path="passwordMatch" cssClass="error" />
		</div>
		<div>
			<label for="birthday">Birthday (yyyy-MM-dd)</label>
			<form:input path="birthday"  placeholder="enter birth date"/>
			<form:errors path="birthday" cssClass="error" />
		</div>
		<div>
			<label for="numberOfTickets"># of Tickets</label>
			<form:input path="numberOfTickets" placeholder="enter number of tickets" />
			<form:errors path="numberOfTickets" cssClass="error" />
		</div>
		<div>
			<input type="submit" value="Submit" />
		</div>
		
	</form:form>

</body>
</html>

<%@include file="common/footer.jspf" %>
