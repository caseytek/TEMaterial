<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product List View" />
</c:import>

<div id="card-page">
	<c:import url="/WEB-INF/jsp/common/filters.jsp">
		<%-- Modify the baseRoute to apply filters to the current route. --%>
		<c:param name="baseRoute" value="/products" />
	</c:import>

	<div class="main-content">
		<!-- Container for Sorting Choices
         
         Each link should take the user to this current page and use any combination of the following
         querystring parameters to sort the page:
            - sortOrder (string) - PriceLowToHigh,PriceHighToLow,RatingHighToLow
    	-->
		<div id="sorting-options">
			<h3>Sort By</h3>
			<ul>
			
			<c:url var='LowToHighUrl' value='/products'>
				<c:param name='sortOrder' value='PriceLowToHigh'/>
			</c:url>
			<c:url var='HighToLowUrl' value='/products?sortOrder=PriceHighToLow'/>
			<c:url var="HighToLowRating" value="/products?sortOrder=RatingHighToLow"/>
				<li><a href="${LowToHighUrl}">Price - Low to High</a></li>
				<li><a href="${HighToLowUrl}">Price - High to Low</a></li>
				<li><a href="${HighToLowRating}">Rating - High to Low</a></li>
			</ul>
		</div>

		<!-- Container for all of the Products -->
		<!-- The list of products is available using the `products` variable -->
		<div id="grid">

			
			<c:forEach var="product" items="${products}">
				<c:choose>
	                <c:when test="${product.remainingStock == 0}">
	       			  	<div class="tile sold-out">
	                	<span class="banner">Sold Out</span>
	                </c:when>
	                <c:otherwise>
	                	<div class="tile ">
	                </c:otherwise>
	            </c:choose>
	            
	            <c:if test="${product.topSeller == true}">
	            	<span class="banner top-seller">Top Seller!</span>
	            </c:if>
				<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
				<c:url var='ProductDetail' value='/products/detail?id=${product.id}'/>
 
				<a class="product-image" href="${ProductDetail}"> 
					<img src="<c:url value="/images/product-images/${product.imageName}" />" />
				</a>
				<div class="details">
				
					<p class="name"><c:out value="${product.name}"/></p>

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
					
					<c:choose>
					
						<c:when test="${product.remainingStock <= 5}">
							<span class="product-alert">Only ${product.remainingStock} left!</span>
						</c:when>
					</c:choose>
					

					<p class="price">$<fmt:formatNumber type = "number" maxFractionDigits = "2" value = " ${product.price}" /></p>
				</div>
			</div>
			</c:forEach>
			

			 

<c:import url="/WEB-INF/jsp/common/footer.jsp" />