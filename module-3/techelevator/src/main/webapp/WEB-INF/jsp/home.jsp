<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th> Details </th>
<tr>

<c:forEach items = '${teamSummary}' var="team">
<tr>
<td> ${team.teamName} </td>
<td> ${team.division}  </td>
<td> ${team.wins}  </td>
<td> ${team.losses} </td>
<td> <a href="<c:url value="/details?team=${team.teamName}&wins=${team.wins}&losses=${team.losses}"/>"> Details</a></td>
</tr>
</c:forEach>
</table>
<a href="<c:url value="/add"/>"> + Add New Team</a>

</body>
</html>