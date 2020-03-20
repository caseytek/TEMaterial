<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>

<c:url var="formAction" value="/customerSearch"/>

<form method="GET" action="${formAction}">

	<div class="formInputGroup">
		<label for="search"> Name: </label>
		<input type="text" name="name" id="name" placeholder="search"/>
	</div>
	<div class="formInputGroup"> 
		<label for="sort"> Sort: </label>
		<select name="sort" id="sort">
			<option value="last_name"> Last Name </option>
			<option value="email"> Email </option>
			<option value="active"> Active? </option>
		</select>	
	</div>
	<input class="formSubmitButtom" type="submit" value="Search"/>
</form>

<table class="table">

<tr>
<th>Name</th>
<th> Email </th>
<th> Active </th>
</tr>
<c:forEach items="${customers}" var="customer">
    <!-- What do we print here for each actor? -->
<tr>
<td> <c:out value="${customer.firstName} ${customer.lastName} "></c:out></td>
<td> <c:out value="${customer.email}"></c:out></td>
<c:choose>
	<c:when test="${customer.active == true}">
	<td> <c:out value="yes"></c:out></td>
	</c:when>
	<c:when test="${customer.active == false}">
	<td> <c:out value="no"></c:out></td>
	</c:when>
</c:choose>

</tr>
</c:forEach>
</table>

<%@include file="common/footer.jspf"%>