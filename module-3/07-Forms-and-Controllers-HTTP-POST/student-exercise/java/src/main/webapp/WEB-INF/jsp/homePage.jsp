<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <c:url value="/css/Dummy.css" var="cssHref" />
    <link rel="stylesheet" href="${cssHref}">
</head>
<body>
<section id="main-content"> 
	
		<h3 class = "centered"> Squirrel Cigar Parties for DUMMIES! </h3>
		
		<img style="position:relative; left:258px" src="<c:url value="/images/forDummies.png" />" />
		
		<div class="reviews">
		<c:url var="postAReviewHref" value="/leaveReview"/>
		<a class="centered" href="${postAReviewHref}"> Leave a dumb review!</a>
		<br>
		<c:set var="x" value="0"/>
		<c:forEach var="review" items="${reviews}">
		<div class="review">
		 <h4><c:out value="${review.title}"/></h4> <span> (${review.username})</span>
		 <p><c:out value="${dates[x]}"/></p>
		 <c:set var="x" value="${x+1}"/>
		 <p>
		 <c:forEach begin="1" end="${review.rating}"> 
			<img src="<c:url value="/images/star.png" />" />
		 </c:forEach>
		 </p>
		 <p class = "message"><c:out value="${review.text} "/></p>
		</div>
		</c:forEach>
		</div>
	</section>
</body>
</html>