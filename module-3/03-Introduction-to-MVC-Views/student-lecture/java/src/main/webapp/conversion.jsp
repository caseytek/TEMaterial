<%-- This is a JSP comment, it will not appear in the rendered HTML --%>

<%-- The next line is a taglib directive. It imports the tag library identified 
by the "uri" attribute and makes it available using the alias provided by
"prefix".  This particular taglib directive imports the JSTL "core" tags.
We can use whatever prefix we want, but it's common to use "c" for this
library --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<title>MVC Views Part 1 - Example: Metric Conversions</title>
		
		<style>
			
			tr {
				background-color: #DDDDDD;
			}
			
			td, th {
				padding: .25em;
			}
		
			tr.marker {
				background-color: #C8C8C8;
				font-weight: bold;
			}
			
			tr.freezing {
				background-color: #BEEBFA;
			}
			
			tr.boiling {
				background-color: #FAD7D2;
			}
			
		</style>
	</head>
	<body>
		<h1>MVC Views Part 1 - Example: Metric Conversions</h1>
		
		<h2>Inches to Centimeters</h2>
		<table>
			<tr>
				<th>inches</th>
				<th>centimeters</th>
			</tr>
			 
			<%-- The forEach tag can be used to iterate over a range of numbers
		     or over a collection (like the "for each" loop from Java).  The 
		     loop below iterates over the numbers from 1-12 inclusive and 
		     assigns the next number to the scoped variable named "inches" 
		     with each iteration --%>
			<c:forEach begin="1" end="12" var="inches">
				<tr>
					<%-- These are JSP EL expressions.  Anything between the
				    curly braces will be evaluated as an EL expression
				    and the result will be included in the HTML generated
				    by this JSP --%>
					<td>${inches}</td> 
					<td>${inches * 2.54}</td>
				</tr>	
			</c:forEach>
		</table>
		
		<h2>Feet to Meters</h2>
		
		<table>
			<tr>
				<th> feet </th>
				<th> meters </th>
			</tr>
			
			<c:forEach begin="1" end ="12" var="feet">
				
				<c:set var="rowClassAttribute" value="" />
			
				<c:if test="${feet%10 == 0}">
				<c:set var="rowClassAttribute" value="marker"/>
				</c:if>
				
			<tr class= "${rowClassAttribute}">
			
				<c:set var="meter" value="${feet * 0.3048}"/>

				<td> ${feet} </td>
				<td><fmt:formatNumber type = "number" maxFractionDigits = "2" value = " ${meter}" /></td>
			</tr>
			</c:forEach>
		</table>

		
		<h2>Fahrenheit to Celcius</h2>
		<table>
			
			<tr>
				<th>Fahrenheit </th>
				<th>Celcius</th> 
			</tr>
			<c:forEach begin="0" end="250" step="5" var="tempF">
								
				<c:choose>
				<c:when test="${tempF <= 32}">
				<c:set var="rowClassAttribute" value="freezing" />
				</c:when>
				<c:when test="${tempF >= 212}">
				<c:set var="rowClassAttribute" value="boiling" />
				</c:when>
				<c:otherwise>
				<c:set var="rowClassAttribute" value="" />
				</c:otherwise>
				</c:choose>
				
			<tr class= "${rowClassAttribute}">
				<td>${tempF} </td>
				<td>${ (tempF - 32)/1.8}</td>
			</tr>
				
			</c:forEach>
			
		</table>
		
		
	</body>
</html>