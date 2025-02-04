<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product Tile View" />
</c:import>

<div id="masonry-page">
	<c:import url="/WEB-INF/jsp/common/filters.jsp">
		<%-- Modify the baseRoute to apply filters to the current route. --%>
		<c:param name="baseRoute" value="/products/tiles" />
	</c:import>



	<!-- Container for all of the Products -->
	<!-- The list of products is available using the `products` variable -->
	<div id="grid" class="main-content">

		<!-- The following HTML shows different examples of what HTML
		 could be rendered based on different rules. For purposes
		 of demonstration we've written it out so you can see it
		 when you load the page up. -->
		 
		 <c:forEach var="product" items="${products}">
				<c:choose>
	                <c:when test="${product.remainingStock == 0}">
	       			  	<div class="tile sold-out">
	                	<span class="banner">Sold Out</span>
	                </c:when>
	                <c:when test="${product.topSeller == true }">
	                	<div class="tile top-seller ">
	                </c:when>
	                <c:otherwise>
	                	<div class="tile ">
	                </c:otherwise>
	            </c:choose>
	            
	          
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
					
					<c:if test="${product.topSeller == true}">
	            	<br />
					<p class="product-alert">Top Seller</p>
	            	</c:if>
					
					<c:choose>
						<c:when test="${product.remainingStock <= 5}">
						<p class="product-alert"> ${product.remainingStock} remaining!</p>
						</c:when>
					</c:choose>
					

					<p class="price">$<fmt:formatNumber type = "number" maxFractionDigits = "2" value = " ${product.price}" /></p>
				</div>
			</div>
			</c:forEach>
			

		<!-- Standard Product -->
		<div class="tile  ">
			<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
			<a class="product-image" href="#"> 
				<img src="<c:url value="/images/product-images/grey-sofa.jpg" />" />
			</a>
			<div class="details">
				<p class="name">
					<a href="#">Grey Sofa</a>
				</p>

				<!-- .filled will make the star solid -->
				<div class="rating">
					<span class="filled">&#9734;</span> 
					<span>&#9734;</span> 
					<span>&#9734;</span>
					<span>&#9734;</span> 
					<span>&#9734;</span>
				</div>

				<p class="price">$939.00</p>
			</div>
		</div>

		<!-- Add the .top-seller class if the product is considered a Top Seller -->
		<div class="tile top-seller ">
			<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
			<a class="product-image" href="#"> 
				<img src="<c:url value="/images/product-images/grey-sofa.jpg" />" />
			</a>
			<div class="details">
				<p class="name">
					<a href="#">Grey Sofa</a>
				</p>

				<!-- .filled will make the star solid -->
				<div class="rating">
					<span class="filled">&#9734;</span> 
					<span class="filled">&#9734;</span>
					<span class="filled">&#9734;</span> 
					<span class="filled">&#9734;</span>
					<span>&#9734;</span>
				</div>

				<!-- Add the Top Seller <br/> and product alert if the product is considered a Top Seller -->
				<br />
				<p class="product-alert">Top Seller</p>
				<!-- Add the X remaining product alert if the remaining quantity is greater than 0, but less than or equal to 5 -->
				<p class="product-alert">4 remaining!</p>
				<p class="price">$930.00</p>
			</div>
		</div>

		<!-- Add the .sold-out class if the Remaining Stock is 0 -->
		<div class="tile  sold-out">
			<!-- Add the Sold Out banner if the Remaining Stock is 0 -->
			<span class="banner">Sold Out</span>

			<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
			<a class="product-image" href="#"> 
				<img src="<c:url value="/images/product-images/grey-sofa.jpg" />" />
			</a>
			<div class="details">
				<p class="name">
					<a href="#">Grey Sofa</a>
				</p>

				<!-- .filled will make the star solid -->
				<div class="rating">
					<span class="filled">&#9734;</span> 
					<span class="filled">&#9734;</span>
					<span class="filled">&#9734;</span> 
					<span class="filled">&#9734;</span>
					<span>&#9734;</span>
				</div>

				<p class="price">$939.00</p>
			</div>
		</div>
	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />