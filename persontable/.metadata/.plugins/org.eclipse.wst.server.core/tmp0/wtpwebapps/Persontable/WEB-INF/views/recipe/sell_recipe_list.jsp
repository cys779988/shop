<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<!-- Basic -->
<script src="//code.jquery.com/jquery.min.js"></script>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/latest/js/bootstrap.min.js"></script>
<script>
$(document).ready(function() {
			$('#searchBtn').click(function() {
									self.location = "sell_recipe_list"
											+ '${pageMaker.makeQuery(1)}'
											+ "&searchType="
											+ $("select option:selected").val()
											+ "&keyword="
											+ encodeURIComponent($('#keywordInput').val());
											});
						});
</script>
<head>
<!-- Mobile Metas -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Site Metas -->
<title>1인식탁</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="/css/bootstrap.min.css">
<!-- Site CSS -->
<link rel="stylesheet" href="/css/style.css">
<!-- Responsive CSS -->
<link rel="stylesheet" href="/css/responsive.css">
<!-- Custom CSS -->
<link rel="stylesheet" href="/css/custom.css">

<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<style>
.pagination {
	text-align:center;
}
.pagination li {
	display:inline;
	vertical-align:middle;
}
.pagination li {
	display:-moz-inline-stack;	/*FF2*/
	display:inline-block;
	vertical-align:top;
	padding:4px;
	margin-right:10px;
	width:30px !important;
	color:#000;
	font:bold 20px tahoma;
	border:1px solid #eee;
	text-align:center;
	text-decoration:none;
	width /**/:26px;	/*IE 5.5*/

}
.pagination li a.now {
}
.pagination li a:hover, ul li a:focus {
	color:#fff;
	border:1px solid #f40;
	background-color:#f40;
}
</style>
</head>

<body>
	<%@include file="../header.jsp"%>
		<div class="container">
			<div class="all-title-box">
				<div class="row">
					<div class="col-lg-6">
						<div class="col-lg-10 col-sm-10">
							<h2>레시피판매페이지</h2>
						</div>
					</div>
				</div>
			</div>
				<div class="container">
					<!-- Start Gallery  -->
					<section>
					<div class="products-box">
						<div class="container">
							<div class="row">
								<div class="col-lg-12">
									<div class="special-menu text-center">
										<div class="button-group filter-button-group">
											<button class="active"
												onClick="location.href='/recipe/sell_recipe_list'">All</button>
											<button
												onClick="location.href='/recipe/sellRecipeCateList?c=밑반찬'">밑반찬</button>
											<button
												onClick="location.href='/recipe/sellRecipeCateList?c=국/탕'">국/탕</button>
											<button
												onClick="location.href='/recipe/sellRecipeCateList?c=찌개'">찌개</button>
											<button
												onClick="location.href='/recipe/sellRecipeCateList?c=해물류'">해물류</button>
											<button
												onClick="location.href='/recipe/sellRecipeCateList?c=면'">면</button>
											<button
												onClick="location.href='/recipe/sellRecipeCateList?c=양식'">양식</button>
											<button
												onClick="location.href='/recipe/sellRecipeCateList?c=샐러드'">샐러드</button>
											<button
												onClick="location.href='/recipe/sellRecipeCateList?c=간식'">간식</button>
											<button
												onClick="location.href='/recipe/sellRecipeCateList?c=볶음'">볶음</button>
										</div>
									</div>
								</div>
							</div>

							<div class="row special-list">
								<c:forEach items="${sellRecipeList}" var="sellRecipeList">
									<div class="col-lg-3 col-md-6 special-grid fruits">
										<div class="products-single fix">

											<div class="box-img-hover">

												<a href="/recipe/sellRecipeView?n=${sellRecipeList.recipeNum}&page=${scri.page}&perPageNum=${scri.perPageNum}&searchType=${scri.searchType}&keyword=${scri.keyword}">
												<img src="${sellRecipeList.recipeThumbImg }" class="img-fluid"
													alt="Image" style="width:200px; height:200px;"></a>

											</div>
											<div class="why-text">
												<h4><a href="/recipe/sellRecipeView?n=${sellRecipeList.recipeNum}&page=${scri.page}&perPageNum=${scri.perPageNum}&searchType=${scri.searchType}&keyword=${scri.keyword}">
												<c:out value="${sellRecipeList.recipeName}" /></a></h4>
												<h5>${sellRecipeList.recipePrice }원</h5>
											</div>
										</div>
									</div>
								</c:forEach>



							</div>
							<div class="col-md-offset-3" style="margin-left: 400px;">
						<ul class="pagination ">
							<c:if test="${pageMaker.prev}">
								<li><a
									href="sell_recipe_list${pageMaker.makeSearch(pageMaker.startPage - 1)}">이전</a></li>
							</c:if>

							<c:forEach begin="${pageMaker.startPage}"
								end="${pageMaker.endPage}" var="idx">
								<li
									<c:out value="${pageMaker.cri.page == idx ? 'class=info' : ''}" />>
									<a href="sell_recipe_list${pageMaker.makeSearch(idx)}">${idx}</a>
								</li>
							</c:forEach>

							<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
								<li><a
									href="sell_recipe_list${pageMaker.makeSearch(pageMaker.endPage + 1)}">다음</a></li>
							</c:if>
						</ul>
					</div>
							<div class="search row">
						<div class="col-xs-2 col-sm-2">
							<select name="searchType" class="form-control">
								<option value="n"
									<c:out value="${scri.searchType == null ? 'selected' : ''}"/>>-----</option>
								<option value="t"
									<c:out value="${scri.searchType eq 't' ? 'selected' : ''}"/>>레시피명</option>
							</select>
						</div>

						<div class="col-xs-8 col-sm-8">
							<div class="input-group">
								<input type="text" name="keyword" id="keywordInput"
									value="${scri.keyword}" class="form-control" /> <span
									class="input-group-btn">
									<button id="searchBtn" type="button" class="btn btn-default">검색</button>
								</span>
							</div>
						</div>


					</div>
						</div>
					</div>
					</section>
				</div>
			</div>
		<%@include file="../footer.jsp"%>

	<a href="#" id="back-to-top" title="Back to top" style="display: none;">&uarr;</a>

	<!-- ALL JS FILES -->
	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<!-- ALL PLUGINS -->
	<script src="js/jquery.superslides.min.js"></script>
	<script src="js/bootstrap-select.js"></script>
	<script src="js/inewsticker.js"></script>
	<script src="js/bootsnav.js."></script>
	<script src="js/images-loded.min.js"></script>
	<script src="js/isotope.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/baguetteBox.min.js"></script>
	<script src="js/form-validator.min.js"></script>
	<script src="js/contact-form-script.js"></script>
	<script src="js/custom.js"></script>
</body>

</html>