<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>
<!-- Form goes here -->

<c:url var="formAction" value="/actorSearch" />

<form method="GET" action="${formAction}">
	<div class="formInputGroup">
		<label for="search"> Search </label>
		<input type="text" name="actorName" id="ActorName"/>
	</div>
	<input class="formSubmitButtom" type="submit" value="Submit"/>
</form>

<table class="table">

<tr>
<th>Name</th>
</tr>
<c:forEach items="${actors}" var="actor">

<tr>
<td> <c:out value="${actor.firstName}"></c:out></td>
<td> <c:out value="${actor.lastName}"></c:out></td>
    <!-- What do we print here for each actor? -->
</tr>
</c:forEach>
</table>
<%@include file="common/footer.jspf"%>