<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<!-- Site Icons -->
<link rel="shortcut icon" href="/images/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon" href="/images/apple-touch-icon.png">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="/css/bootstrap.min.css">
<!-- Site CSS -->
<link rel="stylesheet" href="/css/style.css">
<!-- Responsive CSS -->
<link rel="stylesheet" href="/css/responsive.css">
<!-- Custom CSS -->
<link rel="stylesheet" href="/css/custom.css">
<script src="//code.jquery.com/jquery.min.js"></script>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/latest/js/bootstrap.min.js"></script>
<script src="/ckeditor/ckeditor.js"></script>
	<title>1인식탁</title>
<script>
		var regExp = /[^0-9]/gi;

		$("#recipePrice").keyup(function(){ numCheck($(this)); });
		$("#recipeStock").keyup(function(){ numCheck($(this)); });

		function numCheck(selector) {
		 var tempVal = selector.val();
		 selector.val(tempVal.replace(regExp, ""));
</script>
<script>
$(document).ready(function() {
						var formObj = $("form[role='form']");

						$("#update_Btn").click(function() {
							formObj.attr("action", "/recipe/modify");
							formObj.attr("method", "post")
							formObj.submit();
						});
						$("#back_Btn").click(function() {
							location.href = "recipe/admin_recipe_view?n=" + $
							{
								recipe.recipeNum
							}
							;
						});
})
</script>
</head>
<c:if test="${member.authority == 1}">
<body>
	<%@include file="../header.jsp"%>
	<div id="page-wrapper">
		<%@include file="../sidebar.jsp"%>
		<div class="container">
			<div class="all-title-box">
				<div class="row">
					<div class="col-lg-6">
						<div class="col-lg-10 col-sm-10">
							<h2>관리자-레시피</h2>
						</div>
					</div>
				</div>
			</div>
				<%@include file="nav.jsp"%>
			<section id="container">
			<div class="col-lg-10 col-sm-12">
			<form name="readForm" role="form" method="post">
				<input type="hidden" id="recipeNum" name="recipeNum"
					value="${recipe.recipeNum}" /> <input type="hidden" id="page"
					name="page" value="${scri.page}"> <input type="hidden"
					id="perPageNum" name="perPageNum" value="${scri.perPageNum}">
				<input type="hidden" id="searchType" name="searchType"
					value="${scri.searchType}"> <input type="hidden"
					id="keyword" name="keyword" value="${scri.keyword}">
			</form>

			<form role="form" method="post" autocomplete="off"
				enctype="multipart/form-data">

				<input type="hidden" name="recipeNum" value="${recipe.recipeNum}" />

				<div class="form-group">
					<label>카테고리</label> <select class="category1" name="recipeCateCode" style="margin-left:15px; height:30px;">
						<option value="채소">채소</option>
						<option value="과일">과일</option>
						<option value="육류">육류</option>
						<option value="해산물">해산물</option>
						<option value="조미료">조미료</option>
						<option value="소스">소스</option>
						<option value="견과류">견과류</option>
						<option value="유제품">유제품</option>
						<option value="기타">기타</option>

					</select>
				</div>
				<div class="form-group">
					<label for="recipeName">상품명</label> <input type="text" id="recipeName"
						name="recipeName" value="${recipe.recipeName}" style="margin-left: 30px; width: 500px;"/>
				</div>
				<div class="form-group">
					<label for="recipePrice">상품가격</label> <input type="text" id="recipePrice"
						name="recipePrice" value="${recipe.recipePrice}" style="margin-left: 15px; width: 500px;"/>
				</div>
				<div class="form-group">
					<label for="recipeStock">상품수량</label> <input type="text" id="recipeStock"
						name="recipeStock" value="${recipe.recipeStock}" style="margin-left: 15px; width: 500px;"/>
				</div>
				<div class="form-group">
					<label for="recipeDes">상품소개</label>
					<textarea id="recipeDes" name="recipeDes" style="margin-left: 15px; width: 500px;">${recipe.recipeDes}</textarea>
				</div>
<script>
var ckeditor_config = {
   resize_enaleb : false,
   enterMode : CKEDITOR.ENTER_BR,
   shiftEnterMode : CKEDITOR.ENTER_P,
   filebrowserUploadUrl : "/recipe/ckUpload"
};

CKEDITOR.replace("recipeDes", ckeditor_config);
</script>
				<div class="form-group">
					<input type="file" id="recipeImg" name="file" />
					<div class="select_img">
						<img src="${recipe.recipeImg}" /> <input type="hidden"
							name="recipeImg" value="${recipe.recipeImg}" /> <input
							type="hidden" name="recipeThumbImg"
							value="${recipe.recipeThumbImg}" />
					</div>
					<script>
						$("#recipeImg").change(
								function() {
									if (this.files && this.files[0]) {
										var reader = new FileReader;
										reader.onload = function(data) {
											$(".select_img img").attr("src",
													data.target.result).width(
													500);
										}
										reader.readAsDataURL(this.files[0]);
									}
								});
					</script>
					<%-- <%=request.getRealPath("/")%> --%>
				<div class="submit-button text-center" style="margin-top:100px;">
					<button type="submit" id="update_Btn" class="btn hvr-hover">완료</button>
					<button type="submit" id="back_Btn" class="btn hvr-hover">취소</button>
				</div>
				</div>

			</form>
			</div>
			</section>
		</div>
		<%@include file="../footer.jsp"%>

	</div>


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
</c:if>
<c:if test="${member.authority != 1}">
out.println("<script>alert('접근권한이 없습니다.');history.back();</script>");
</c:if>
</html>