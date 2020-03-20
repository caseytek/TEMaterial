<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Films List"/>

<%@include file="common/header.jspf"%>

<c:url var="formAction" value="/filmSearch" />

<form method="GET" action="${formAction}">
	<div class="formInputGroup">
		<label for="search"> Minimum Length: </label>
		<input type="text" name="minLength" id="minLength"/>
	</div>
	<div class="formInputGroup">
		<label for="search"> Maximum Length: </label>
		<input type="text" name="maxLength" id="maxLength"/>
	</div>
	<div class="formInputGroup">
		<label for="Genre">Genre:</label> 
		<select name="genre" id="Genre">
			<option value="action">Action</option>
			<option value="Animation">Animation</option>
			<option value="Children">Children</option>
			<option value="Classics">Classics</option>
			<option value="Comedy">Comedy</option>			
			<option value="Documentary">Documentary</option>
			<option value="Drama">Drama</option>
			<option value="Family">Family</option>
			<option value="Foreign">Foreign</option>
			<option value="Games">Games</option>
			<option value="Horror">Horror</option>
			<option value="Music">Music</option>
			<option value="New">New</option>
			<option value="Sci-Fi">Sci-Fi</option>
			<option value="Sports">Sports</option>
			<option value="Travel">Travel</option>
		</select>		
	</div>
	<input class="formSubmitButtom" type="submit" value="Search"/>
</form>

<table class="table">

<tr>
<th>Title</th>
<th> Description </th>
<th> Release Year </th>
<th> Length </th>
<th> Rating </th>
</tr>
<c:forEach items="${films}" var="film">
    <!-- What do we print here for each actor? -->
<tr>
<td> <c:out value="${film.title}"></c:out></td>
<td> <c:out value="${film.description}"></c:out></td>
<td> <c:out value="${film.releaseYear}"></c:out></td>
<td> <c:out value="${film.length}"></c:out></td>
<td> <c:out value="${film.rating}"></c:out></td>

</tr>
</c:forEach>
</table>

<%@include file="common/footer.jspf"%>