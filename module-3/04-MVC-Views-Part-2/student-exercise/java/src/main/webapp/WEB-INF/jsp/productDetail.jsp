<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product Details" />
</c:import>

<!-- Container for the Product -->
<!-- The current product is available using the `product` variable -->
<div id="product-detail">
	<img src="<c:url value="/images/product-images/${product.imageName}" />" />
	<div class="product-description">
		<h3><c:out value="${product.name}"/></h3>

		<!-- .filled will make the star solid -->
		<div class="rating">
					<fmt:parseNumber var="intValue" integerOnly="true" 
	                       type="number" value="${product.averageRating}"/> 
	                       	                       
	                    <c:forEach begin="1" end="${intValue}">
	                    <span class="filled">&#9734;</span> 
	                    </c:forEach> 
	                    
	                    <c:forEach begin="1" end="${5-intValue}">
	                    <span>&#9734;</span> 
	                    </c:forEach>
		</div>

		<!-- Include this if the product has a Remaining Stock of 5 or less -->
		
					
		<c:if test="${product.remainingStock <= 5}">
			<p class="alert-remaining">BUY NOW! Only ${product.remainingStock} left!</p>
		</c:if>
		
		<p class="description">${product.description}</p>
		
		<p class="price">$<fmt:formatNumber type = "number" maxFractionDigits = "2" value = " ${product.price}" /></p>

		<c:choose>
			<c:when test="${product.remainingStock > 0 }">
				<button class="action">Add to Cart</button>
			</c:when>
			<c:otherwise>
				<button disabled>Sold Out</button>
			</c:otherwise>
		</c:choose>
		
		
	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />