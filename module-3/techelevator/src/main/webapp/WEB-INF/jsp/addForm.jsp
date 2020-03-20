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
	<c:url value="/processAdd" var="addFormUrl"/>
	<form method='POST' action = '${addFormUrl}'>
		<div>
			<label for="division">Division:</label> <select name="division"
				id="division">
				<option value="AAC">AAC</option>
				<option value="Big 10">Big 10</option>
				<option value="Big West">Big West</option>
			</select>
		</div>

		<div>
			<label for="team">Team Name:</label> <input type="text" name="team"
				id="team" />
		</div>

		<div>
			<label for="team">Wins:</label> <input type="text" name="wins"
				id="wins" />
		</div>

		<div>
			<label for="losses">Losses:</label> <input type="text" name="losses"
				id="losses" />
		</div>
		

		<input class="formSubmitButton" type="submit"
			value="Calculate Payment" />
	</form>
</body>
</html>