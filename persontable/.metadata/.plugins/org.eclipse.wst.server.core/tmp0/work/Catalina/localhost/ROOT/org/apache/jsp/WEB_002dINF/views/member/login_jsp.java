/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.30
 * Generated at: 2020-03-24 11:54:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1582005488663L));
    _jspx_dependants.put("jar:file:/C:/persontable/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Persontable/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<script type = \"text/javascript\" src = \"https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js\" charset=\"utf-8\"></script>\r\n");
      out.write(" \r\n");
      out.write("<div id = \"naver_id_login\"></div>\r\n");
      out.write(" \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" \r\n");
      out.write("         var naver_id_login = new naver_id_login(\"2La7TaXZli6MTmiOMEUA\", \"http://localhost:8088/member/login_result\");    // Client ID, CallBack URL 삽입\r\n");
      out.write("                                            // 단 'localhost'가 포함된 CallBack URL\r\n");
      out.write("         var state = naver_id_login.getUniqState();\r\n");
      out.write("        \r\n");
      out.write("         naver_id_login.setButton(\"white\", 4, 40);\r\n");
      out.write("         naver_id_login.setDomain(\"http://localhost:8088/member/login\");    //  URL\r\n");
      out.write("         naver_id_login.setState(state);\r\n");
      out.write("         naver_id_login.setPopup();\r\n");
      out.write("         naver_id_login.init_naver_id_login();\r\n");
      out.write(" \r\n");
      out.write("</script>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css\">\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Mobile Metas -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<!-- Site Metas -->\r\n");
      out.write("<title>Freshshop - Ecommerce Bootstrap 4 HTML Template</title>\r\n");
      out.write("<meta name=\"keywords\" content=\"\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Start Main Top -->\r\n");
      out.write("\t\t<header class=\"main-header\">\r\n");
      out.write("        <!-- Start Navigation -->\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <!-- Start Header Navigation -->\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar-menu\" aria-controls=\"navbars-rs-food\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"mainPage.jsp\"><img src=\"../images/logo.png\" class=\"logo\" alt=\"\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- End Header Navigation -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbar-menu\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav ml-auto\" data-in=\"fadeInDown\" data-out=\"fadeOutUp\">\r\n");
      out.write("                        \r\n");
      out.write("                        <ul class=\"nav navbar-nav ml-auto\" data-in=\"fadeInDown\" data-out=\"fadeOutUp\">\r\n");
      out.write("                       \r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"board.jsp\">게시판</a></li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"recipe_list.html\">레시피</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"ingredientList.html\">식재료</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"/app/loginForm\">로그인</a></li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"myPage.html\">마이페이지</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"cart.html\">장바구니</a></li>\r\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbar-menu\">\r\n");
      out.write("                    \r\n");
      out.write("                            \r\n");
      out.write("                    \r\n");
      out.write("                            <ul class=\"nav navbar-nav ml-auto\" data-in=\"fadeInDown\" data-out=\"fadeOutUp\">\r\n");
      out.write("                        <form action=\"#\">\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Search here...\" type=\"text\">\r\n");
      out.write("                            \r\n");
      out.write("                                \r\n");
      out.write("                            </form>\r\n");
      out.write("                        <button type=\"submit\"> <i class=\"fa fa-search\"></i> </button>\r\n");
      out.write("                        \r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.navbar-collapse -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Start Atribute Navigation -->\r\n");
      out.write("                <div class=\"search-product\">\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                <!-- End Atribute Navigation -->\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </nav>\r\n");
      out.write("        <!-- End Navigation -->\r\n");
      out.write("    </header>\r\n");
      out.write("\t<!-- End Main Top -->\r\n");
      out.write("\t<!-- End Main Top -->\r\n");
      out.write("\r\n");
      out.write("<script src=\"//code.jquery.com/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/latest/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("  /* 사이드바 래퍼 스타일 */\r\n");
      out.write("  \r\n");
      out.write("  #page-wrapper {\r\n");
      out.write("    padding-left: 250px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  #sidebar-wrapper {\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    width: 250px;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    margin-left: -250px;\r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("    overflow-x: hidden;\r\n");
      out.write("    overflow-y: auto;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  #page-content-wrapper {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("  }\r\n");
      out.write("  /* 사이드바 스타일 */\r\n");
      out.write("  \r\n");
      out.write("  .sidebar-nav {\r\n");
      out.write("    width: 250px;\r\n");
      out.write("    margin-top: 150px;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    list-style: none;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .sidebar-nav li {\r\n");
      out.write("    text-indent: 1.5em;\r\n");
      out.write("    line-height: 2.8em;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .sidebar-nav li a {\r\n");
      out.write("    display: block;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    color:  #000000;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .sidebar-nav li a:hover {\r\n");
      out.write("    color:  #000000;\r\n");
      out.write("    background: rgb(255, 255, 255, 0.2);\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .sidebar-nav > .sidebar-brand {\r\n");
      out.write("    font-size: 1.3em;\r\n");
      out.write("    line-height: 3em;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"page-wrapper\">\r\n");
      out.write("\t\t<!-- 사이드바 -->\r\n");
      out.write("\t\t<div id=\"sidebar-wrapper\">\r\n");
      out.write("\t\t\t<ul class=\"sidebar-nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">회원정보수정</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">회원정보탈퇴</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">장바구니목록</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">판매관리페이지</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">광고관리페이지</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">회원정보관리페이지</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /사이드바 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\t<div class=\"contact-box-main\">\r\n");
      out.write("        \r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("            \r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-8 col-sm-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"contact-form-right\">\r\n");
      out.write("\t\t\t\t\t\t<h2>로그인</h2>\r\n");
      out.write("                        <section id = \"loginFormArea\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t아이디\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"id\" name=\"id\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"userID\"/> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"help-block with-errors\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t비밀번호\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"password\" placeholder=\"password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"help-block with-errors\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form action =\"login\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"submit-button text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn hvr-hover\" id=\"submit\" type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"margin-right: 10px; width: 450px\">로그인</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"submit-button text-center\" style=\"margin-top:50px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn hvr-hover\" id=\"submit\" type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"margin-right: 10px\">아이디찾기</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn hvr-hover\" id=\"submit\" type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"margin-left: 10px; margin-right: 10px\">비밀번호찾기</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form action=\"/registForm\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn hvr-hover\" id=\"submit\" type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"margin-left: 10px\">회원가입</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"msgSubmit\" class=\"h3 text-center hidden\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Start Footer  -->\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<div class=\"footer-main\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 col-md-12 col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-top-box\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>운영시간</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"list-time\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>월요일 - 금요일: 08.00am to 05.00pm</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>토요일: 10.00am to 08.00pm</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 col-md-12 col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-top-box\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>About 1인식탁</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>1인식탁은 1인가구를 위한 레시피제공, 그에 띠른 식자재 제공 및 배달로 요리에 대한 접근을 쉽게\r\n");
      out.write("\t\t\t\t\t\t\t\t만들어주고자 하는 서비스입니다. 1인가구의 양에 맞춤한 용량으로 서비스를 제공합니다.</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 col-md-12 col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-link-contact\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Contact Us</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-map-marker-alt\"></i>Address: Michael I. Days\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t3756 <br>Preston Street Wichita,<br> KS 67213\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-phone-square\"></i>Phone: <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"tel:+1-888705770\">+1-888 705 770</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-envelope\"></i>Email: <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"mailto:contactinfo@gmail.com\">contactinfo@gmail.com</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!-- End Footer  -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<a href=\"#\" id=\"back-to-top\" title=\"Back to top\" style=\"display: none;\">&uarr;</a>\r\n");
      out.write("\r\n");
      out.write("\t<!-- ALL JS FILES -->\r\n");
      out.write("\t<script src=\"js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/popper.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<!-- ALL PLUGINS -->\r\n");
      out.write("\t<script src=\"js/jquery.superslides.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-select.js\"></script>\r\n");
      out.write("\t<script src=\"js/inewsticker.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootsnav.js.\"></script>\r\n");
      out.write("\t<script src=\"js/images-loded.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/isotope.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/baguetteBox.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/form-validator.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/contact-form-script.js\"></script>\r\n");
      out.write("\t<script src=\"js/custom.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}