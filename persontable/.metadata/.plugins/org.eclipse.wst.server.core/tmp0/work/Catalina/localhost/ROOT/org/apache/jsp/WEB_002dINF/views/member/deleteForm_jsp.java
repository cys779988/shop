/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.30
 * Generated at: 2020-05-14 11:23:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class deleteForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/views/member/../header.jsp", Long.valueOf(1589452548242L));
    _jspx_dependants.put("/WEB-INF/views/member/../footer.jsp", Long.valueOf(1588876454201L));
    _jspx_dependants.put("jar:file:/C:/persontable/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Persontable/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1582005488663L));
    _jspx_dependants.put("/WEB-INF/views/member/../sidebar.jsp", Long.valueOf(1589454474792L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<!-- Basic -->\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("<!-- Mobile Metas -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<!-- Site Metas -->\r\n");
      out.write("\t<title>1인식탁</title>\r\n");
      out.write("<meta name=\"keywords\" content=\"\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("<!-- Site Icons -->\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"/images/favicon.ico\"\r\n");
      out.write("\ttype=\"image/x-icon\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"/images/apple-touch-icon.png\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/bootstrap.min.css\">\r\n");
      out.write("<!-- Site CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/style.css\">\r\n");
      out.write("<!-- Responsive CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/responsive.css\">\r\n");
      out.write("<!-- Custom CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/custom.css\">\r\n");
      out.write("\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"//code.jquery.com/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//maxcdn.bootstrapcdn.com/bootstrap/latest/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction cancel() {\r\n");
      out.write("\t\tlocation.href = \"/\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#submit\").on(\"click\", function() {\r\n");
      out.write("\t\t\tif ($(\"#userPasswd\").val() == \"\") {\r\n");
      out.write("\t\t\t\talert(\"비밀번호를 입력해주세요.\");\r\n");
      out.write("\t\t\t\t$(\"#userPasswd\").focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl : \"/member/passChk\",\r\n");
      out.write("\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\tdata : $(\"#delForm\").serializeArray(),\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\tif (data == 0) {\r\n");
      out.write("\t\t\t\t\t\talert(\"패스워드가 틀렸습니다.\");\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\tif (confirm(\"회원탈퇴하시겠습니까?\")) {\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#delForm\").submit();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header class=\"main-header\">\r\n");
      out.write("\t<!-- Start Navigation -->\r\n");
      out.write("\t<nav\r\n");
      out.write("\t\tclass=\"navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<!-- Start Header Navigation -->\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\tdata-target=\"#navbar-menu\" aria-controls=\"navbars-rs-food\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-bars\"></i>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"/\"><img src=\"/images/logo.png\"\r\n");
      out.write("\t\t\t\t\tclass=\"logo\" alt=\"\"></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- End Header Navigation -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbar-menu\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav ml-auto\" data-in=\"fadeInDown\"\r\n");
      out.write("\t\t\t\t\tdata-out=\"fadeOutUp\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/board/list\">게시판</a></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/notice/list\">공지사항</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/recipe/sell_recipe_list\">레시피</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/ingredient/sell_ing_list\">식재료</a></li>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("<!-- \t\t\t\t<form action=\"#\">\r\n");
      out.write("\t\t\t\t\t<input class=\"form-control\" placeholder=\"Search here...\"\r\n");
      out.write("\t\t\t\t\t\ttype=\"text\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<button type=\"submit\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-search\"></i>\r\n");
      out.write("\t\t\t\t</button> -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<!-- End Navigation -->\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"page-wrapper\">\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\n");
      out.write(".centerd {\n");
      out.write("\tmargin-right: auto;\n");
      out.write("\tmargin-left: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#page-wrapper {\n");
      out.write("\tpadding-left: 250px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#sidebar-wrapper {\n");
      out.write("\tposition: fixed;\n");
      out.write("\twidth: 250px;\n");
      out.write("\theight: 100%;\n");
      out.write("\tmargin-left: -250px;\n");
      out.write("\tbackground-color: #ffffff;\n");
      out.write("\toverflow-x: hidden;\n");
      out.write("\toverflow-y: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#page-content-wrapper {\n");
      out.write("\twidth: 100%;\n");
      out.write("\tpadding: 20px;\n");
      out.write("}\n");
      out.write("/* 사이드바 스타일 */\n");
      out.write(".sidebar-nav {\n");
      out.write("\twidth: 250px;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tlist-style: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar-nav li {\n");
      out.write("\ttext-indent: 1.5em;\n");
      out.write("\tline-height: 2.8em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar-nav li a {\n");
      out.write("\tdisplay: block;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tcolor: #000000;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar-nav li a:hover {\n");
      out.write("\tcolor: #000000;\n");
      out.write("\tbackground: rgb(255, 255, 100, 0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar-nav>.sidebar-brand {\n");
      out.write("\tfont-size: 1.3em;\n");
      out.write("\tline-height: 3em;\n");
      out.write("}\n");
      out.write("</style>\r\n");
      out.write("<div id=\"sidebar-wrapper\">\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t<div class=\"contact-box-main\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-8 col-sm-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"contact-form-right\">\r\n");
      out.write("\t\t\t\t\t\t<h2>회원탈퇴</h2>\r\n");
      out.write("\t\t\t\t\t\t<section id=\"loginFormArea\">\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"/member/memberDelete\" method=\"post\" id=\"delForm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t이름\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"userName\" name=\"userName\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.userName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"help-block with-errors\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t아이디\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"userId\" name=\"userId\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.userId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"help-block with-errors\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t비밀번호\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"userPasswd\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tname=\"userPasswd\" placeholder=\"password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"help-block with-errors\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \t\t\t\t\t\t<div class=\"submit-button text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn hvr-hover\" id=\"submit\">회원탈퇴</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn hvr-hover\" onclick=\"cancel();\" id=\"cancel\">취소</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- Site Icons -->\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"/images/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"/images/apple-touch-icon.png\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/bootstrap.min.css\">\r\n");
      out.write("<!-- Site CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/style.css\">\r\n");
      out.write("<!-- Responsive CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/responsive.css\">\r\n");
      out.write("<!-- Custom CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/custom.css\">\r\n");
      out.write("\r\n");
      out.write("<style>\n");
      out.write("\t.footer-main {\r\n");
      out.write("\tcolor : #ffffff;\r\n");
      out.write("\tmargin-top: 150px;\r\n");
      out.write(" \tbackground-color: #000;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("\t\t<div class=\"footer-main\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-12 col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-top-box\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>운영시간</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"list-time\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>월요일 - 금요일 : 09.00am to 05.00pm</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>토요일 : 10.00am to 03.00pm</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 col-md-12 col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-top-box\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>About 1인식탁</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>1인식탁은 1인가구를 위한 레시피제공, 그에 따른 식자재 제공 및 배달로 요리에 대한 접근을 쉽게\r\n");
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
      out.write("\t\t    <a href=\"#\" id=\"back-to-top\" title=\"Back to top\" style=\"display: none;\">&uarr;</a>\r\n");
      out.write("\t</footer>");
      out.write("\r\n");
      out.write("</div>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/member/../header.jsp(34,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member == null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/member/loginForm\">로그인</a></li>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/member/../header.jsp(37,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member != null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/member/logout\">로그아웃</a></li>\r\n");
          out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/cart/orderList\">마이페이지</a></li>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/cart/cartList\">장바구니</a></li>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"submit-button text-right\"><button class=\"write_btn btn hvr-hover\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.userId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("님환영합니다.</button></div>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /WEB-INF/views/member/../sidebar.jsp(57,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member != null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<ul class=\"sidebar-nav\">\r\n");
          out.write("\t\t\t<li><a href=\"/member/modifyForm\">회원정보수정</a></li>\r\n");
          out.write("\t\t\t<li><a href=\"/member/deleteForm\">회원정보탈퇴</a></li>\r\n");
          out.write("\t\t\t<li><a href=\"/cart/cartList\">장바구니목록</a></li>\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fif_005f2, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_005fif_005f4(_jspx_th_c_005fif_005f2, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t</ul>\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f3_reused = false;
    try {
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
      // /WEB-INF/views/member/../sidebar.jsp(63,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.authority == 1}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \r\n");
          out.write("\t\t\t\t<li><a href=\"/ingredient/admin_ing_list\">식재료관리페이지</a></li>\r\n");
          out.write("\t\t\t\t<li><a href=\"/recipe/admin_recipe_list\">레시피관리페이지</a></li>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      _jspx_th_c_005fif_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f4_reused = false;
    try {
      _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
      // /WEB-INF/views/member/../sidebar.jsp(67,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.authority == 2}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
      if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<li><a href=\"/advertise/list\">광고관리페이지</a></li>\r\n");
          out.write("\t\t\t\t<li><a href=\"/memberManage/list\">회원정보관리페이지</a></li>\r\n");
          out.write("\t\t\t\t<li><a href=\"/cart/adminOrderList\">주문관리페이지</a></li>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      _jspx_th_c_005fif_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f4, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f4_reused);
    }
    return false;
  }
}
