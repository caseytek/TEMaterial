<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <c:url value="/css/Dummy.css" var="cssHref" />
    <link rel="stylesheet" href="${cssHref}">
</head>
<body>

<section id="main-content"> 
	
		<h3 class = "centered"> New Dummy Review </h3>
	
		<c:url var='surveyInput' value='/leaveReview'/>
		<form action='${surveyInput}' method = 'POST'>
		<div>
			<label for="username">Username</label>
			<input type="text" name="username" id="username"/>
		</div>
		<div>
			<label for="title">Title</label>
			<input type="text" name="title" id="title"/>
		</div>
		<div>
			<label for="text" > Review </label> 
			<textarea name ="text" id="message" rows="4" cols="30"></textarea>
		</div>
		<div> 
			<label for="rating"> Rating </label>
			<select name="rating" id="rating">
				<option value="1"> One Star </option>
				<option value="2"> Two Stars </option>
				<option value="3"> Three Stars </option>
				<option value="4"> Four Stars </option>
				<option value="1"> Five Stars </option>
			</select>
		</div>
		<div>
			<input style="margin-left:224px" type="submit" value="Submit!"/>
		</div>
		</form>
	</section>


</body>
</html>