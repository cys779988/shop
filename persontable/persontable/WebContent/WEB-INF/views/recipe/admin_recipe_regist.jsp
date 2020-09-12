<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<script src="/ckeditor/ckeditor.js"></script>
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
			<hr />
				<%@include file="nav.jsp"%>
			<div class="contact-box-main">
				<div class="container">
					<div class="row">
						<div class="col-lg-10 col-sm-12">
							<div class="contact-form-right">
									<form action="/recipe/recipeRegister" method="post"
										enctype="multipart/form-data">

										<div class="form-group">
											<label>카테고리</label> <select class="category1"
												name="recipeCateCode"style="margin-left:30px; height:30px;">
												<option value="밑반찬">밑반찬</option>
												<option value="국/탕">국/탕</option>
												<option value="찌개">찌개</option>
												<option value="해물류">해물류</option>
												<option value="면">면</option>
												<option value="양식">양식</option>
												<option value="샐러드">샐러드</option>
												<option value="간식">간식</option>
												<option value="볶음">볶음</option>
											</select>
										</div>

										<div class="form-group">
											<label for="recipeName">레시피명</label> <input type="text"
												id="recipeName" name="recipeName"
												style="margin-left: 30px; width: 500px;" />
										</div>

										<div class="form-group">
											<label for="recipePrice">레시피가격</label> <input type="number"
												id="recipePrice" name="recipePrice"
												style="margin-left: 15px; width: 500px;" />
										</div>

										<div class="form-group">
											<label for="recipeStock">레시피수량</label> <input type="number"
												id="recipeStock" name="recipeStock"
												style="margin-left: 15px; width: 500px;" />
										</div>
										
										<div class="form-group">
											<label for="ingName">식재료1</label> <input type="text"
												id="ingName1" name="ingName1"
												style="margin-left: 20px; width: 150px;" />
											<label>식재료양</label> <input type="number"
												id="ingWeight1" name="ingWeight1"
												style="margin-left: 15px; width: 70px;" />g/ml
										</div>
										<div class="form-group">
											<label>식재료2</label> <input type="text"
												id="ingName2" name="ingName2"
												style="margin-left: 15px; width: 150px;" />
											<label>식재료양</label> <input type="number"
												id="ingWeight2" name="ingWeight2"
												style="margin-left: 15px; width: 70px;" />g/ml
										</div>
										<div class="form-group">
											<label for="ingName">식재료3</label> <input type="text"
												id="ingName3" name="ingName3"
												style="margin-left: 15px; width: 150px;" />
											<label for="ingWeight">식재료양</label> <input type="number"
												id="ingWeight3" name="ingWeight3"
												style="margin-left: 15px; width: 70px;" />g/ml
										</div>
										<div class="form-group">
											<label for="ingName">식재료4</label> <input type="text"
												id="ingName4" name="ingName4"
												style="margin-left: 15px; width: 150px;" />
											<label for="ingWeight">식재료양</label> <input type="number"
												id="ingWeight4" name="ingWeight4"
												style="margin-left: 15px; width: 70px;" />g/ml
										</div>
										<div class="form-group">
											<label for="ingName">식재료5</label> <input type="text"
												id="ingName5" name="ingName5"
												style="margin-left: 15px; width: 150px;" />
											<label for="ingWeight">식재료양</label> <input type="number"
												id="ingWeight5" name="ingWeight5"
												style="margin-left: 15px; width: 70px;" />g/ml
										</div>
										<div class="form-group">
											<label for="ingName">식재료6</label> <input type="text"
												id="ingName6" name="ingName6"
												style="margin-left: 15px; width: 150px;" />
											<label for="ingWeight">식재료양</label> <input type="number"
												id="ingWeight6" name="ingWeight6"
												style="margin-left: 15px; width: 70px;" />g/ml
										</div>
										<div class="form-group">
											<label for="ingName">식재료7</label> <input type="text"
												id="ingName7" name="ingName7"
												style="margin-left: 15px; width: 150px;" />
											<label for="ingWeight">식재료양</label> <input type="number"
												id="ingWeight7" name="ingWeight7"
												style="margin-left: 15px; width: 70px;" />g/ml
										</div>
										<div class="form-group">
											<label for="ingName">식재료8</label> <input type="text"
												id="ingName8" name="ingName8"
												style="margin-left: 15px; width: 150px;" />
											<label for="ingWeight">식재료양</label> <input type="number"
												id="ingWeight8" name="ingWeight8"
												style="margin-left: 15px; width: 70px;" />g/ml
										</div>
										<div class="form-group">
											<label for="ingName">식재료9</label> <input type="text"
												id="ingName9" name="ingName9"
												style="margin-left: 15px; width: 150px;" />
											<label for="ingWeight">식재료양</label> <input type="number"
												id="ingWeight9" name="ingWeight9"
												style="margin-left: 15px; width: 70px;" />g/ml
										</div>

										<div class="form-group">
											<label for="recipeDes">상품소개</label>
											<textarea id="recipeDes" id="recipeDes" name="recipeDes"
												style="margin-left: 15px; width: 500px;"></textarea>
											<script>
												var ckeditor_config = {
													resize_enaleb : false,
													enterMode : CKEDITOR.ENTER_BR,
													shiftEnterMode : CKEDITOR.ENTER_P,
													filebrowserUploadUrl : "/recipe/ckUpload"
												};

												CKEDITOR.replace("recipeDes",
														ckeditor_config);
											</script>
										</div>
										<div class="form-group">
											<input type="file" id="recipeImg" name="file" />
											<script>
												$("#recipeImg")
														.change(
																function() {
																	if (this.files
																			&& this.files[0]) {
																		var reader = new FileReader;
																		reader.onload = function(
																				data) {
																			$(
																					".select_img img")
																					.attr(
																							"src",
																							data.target.result)
																					.width(
																							500);
																		}
																		reader
																				.readAsDataURL(this.files[0]);
																	}
																});
											</script>
											<%-- 	<%=request.getRealPath("/")%> --%>
										<div class="submit-button text-center">
											<button class = "btn hvr-hover" type="submit" >등록</button>
										</div>
										</div>

									</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<script>
			var regExp = /[^0-9]/gi;

			$("#recipePrice").keyup(function() {
				numCheck($(this));
			});
			$("#recipeStock").keyup(function() {
				numCheck($(this));
			});
			$("#ingWeight1").keyup(function() {
				numCheck($(this));
			});
			$("#ingWeight2").keyup(function() {
				numCheck($(this));
			});
			$("#ingWeight3").keyup(function() {
				numCheck($(this));
			});
			$("#ingWeight4").keyup(function() {
				numCheck($(this));
			});
			$("#ingWeight5").keyup(function() {
				numCheck($(this));
			});
			$("#ingWeight6").keyup(function() {
				numCheck($(this));
			});
			$("#ingWeight7").keyup(function() {
				numCheck($(this));
			});
			$("#ingWeight8").keyup(function() {
				numCheck($(this));
			});
			$("#ingWeight9").keyup(function() {
				numCheck($(this));
			});

			function numCheck(selector) {
				var tempVal = selector.val();
				selector.val(tempVal.replace(regExp, ""));
			}
		</script>
		<%@include file="../footer.jsp"%>
	</div>

</body>
</c:if>
<c:if test="${member.authority != 1}">
out.println("<script>alert('접근권한이 없습니다.');history.back();</script>");
</c:if>
</html>