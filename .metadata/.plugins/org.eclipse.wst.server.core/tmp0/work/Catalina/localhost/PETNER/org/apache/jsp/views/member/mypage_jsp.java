/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2020-02-21 02:06:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.petner.member.model.vo.Member;
import java.util.ArrayList;
import com.kh.petner.member.pet.model.vo.Pet;
import com.kh.petner.member.model.vo.Member;

public final class mypage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/common/header.jsp", Long.valueOf(1582245139921L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.petner.member.pet.model.vo.Pet");
    _jspx_imports_classes.add("com.kh.petner.member.model.vo.Member");
    _jspx_imports_classes.add("java.util.ArrayList");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      out.write("    ");

    	Member mp = (Member)session.getAttribute("member"); 
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<!-- Mobile Specific Meta -->\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\t\t<!-- Author Meta -->\r\n");
      out.write("\t\t<meta name=\"author\" content=\"colorlib\">\r\n");
      out.write("\t\t<!-- Favicon-->\r\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"/PETNER/resources/img/common/small_logo.jpg\">\r\n");
      out.write("\t\t<!-- meta character set -->\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<!-- Site Title -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<title>My Page</title>\r\n");
      out.write("\t\t<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"/PETNER/resources/js/vendor/jquery-3.4.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"/PETNER/resources/js/vendor/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/PETNER/resources/css/main_hyon.css\" type=\"text/css\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<link href=\"https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/lightgallery/1.6.11/css/lightgallery.min.css\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/PETNER/resources/css/font-awesome.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/PETNER/resources/css/bootstrap.css\" type=\"text/css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/PETNER/resources/css/main.css\" type=\"text/css\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	 Member m = (Member)session.getAttribute("member"); 

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<link href=\"https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700\" rel=\"stylesheet\">\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/lightgallery/1.6.11/css/lightgallery.min.css\">\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"/PETNER/resources/css/font-awesome.min.css\">\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"/PETNER/resources/css/bootstrap.css\" type=\"text/css\">\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"/PETNER/resources/css/main.css\" type=\"text/css\">\r\n");
      out.write("\t\t\t<!-- <link rel=\"stylesheet\" href=\"/PETNER/resources/css/main_hyon.css\" type=\"text/css\"> -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<script src=\"/PETNER/resources/js/vendor/jquery-3.4.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t\t<script src=\"/PETNER/resources/js/vendor/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<style>\r\n");
      out.write("\t\t\t\t.nav-menu>li>a {\r\n");
      out.write("\t\t\t\t     padding-top: 30px;\r\n");
      out.write("\t\t\t\t     padding-bottom: 20px;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--################ Start Header Area ########-->\r\n");
      out.write("\t<header id=\"header\" class=\"fixed-top\" >\r\n");
      out.write("\t\t<div class=\"header-top\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-6 col-sm-6 col-4 no-padding\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"header-top-left\"  style=\"border-right: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"tel:010-0137-0220\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-phone\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t010-1234-5678\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-6 col-sm-6 col-8 header-top-right no-padding\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
 if( m == null) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<ul style=\"border-right: none;\" id=\"guest\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t| &nbsp;&nbsp; <a href='#' data-target=\"#modal-login\" data-toggle=\"modal\">login</a> \r\n");
      out.write("\t\t\t\t\t\t\t\t| <a style=\"padding-left:10px;\" href=\"/PETNER/views/member/insertMemberForm.jsp\"> Join</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!--  로그인시에는 밑에 화면이 보임 -->\r\n");
      out.write("\t\t\t\t\t\t<ul style=\"border-right: none;\" id=\"loginMem\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if( m != null && m.getUserRoles() == 777) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"/PETNER/adStart.ad\">Admin Page</a> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t| \t&nbsp;&nbsp; \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href='/PETNER/mpServlet.mp' > MyPage</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- onClick=\"window.open(this.href, '', 'width=1600, height=900'); return false;\" -->\r\n");
      out.write("\t\t\t\t\t\t\t\t| \t<a style=\"padding-left:10px;\" href=\"/PETNER/Plogout.me\"> LogOut</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<div class=\"container main-menu\">\r\n");
      out.write("\t\t\t<div class=\"row align-items-center justify-content-between d-flex\" >\r\n");
      out.write("\t\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/PETNER/index.jsp\"><img style=\"width: 100px;\" src=\"/PETNER/resources/img/common/petner_logo.jpg\" alt=\"\" title=\"\" /></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<nav id=\"nav-menu-container\" >\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/PETNER/index.jsp\" \">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/PETNER/views/etc/about.jsp\">ABOUT</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/PETNER/hotelDbServlet?Market=HOTEL\">HOTEL</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/PETNER/hotelDbServlet?Market=HOSPITAL\">HOSPITAL</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/PETNER/hotelDbServlet?Market=BEAUTY\">BEAUTY</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"menu-has-children\"><a>NOTICE</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/PETNER/NoticeList.go\">NOTICE</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/PETNER/FAQlist.go\">FAQ</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/PETNER/QNAlist.go\">Q&A</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t<!--######## #nav-menu-container -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!--######## End Header Area ########-->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 로그인 모달 -->\r\n");
      out.write("\t\t<div class=\"row\" style=\"position: relative; vertical-align: middle;\">\r\n");
      out.write("\t\t\t<div class=\"modal\" id=\"modal-login\" tabindex=\"-1\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-dialog\" style=\"vertical-align: middle;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <div class=\"text-center \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1 class=\"h4 text-gray-900 mb-4\">LOGIN</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"modal-body\" style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form class=\"user\" id=\"loginForm\" method=\"post\" action=\"/PETNER/Plogin.me\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  <input type=\"email\" class=\"form-control form-control-user\" name=\"userEmail\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  aria-describedby=\"emailHelp\" placeholder=\"이메일을 입력해주세요.\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  <input type=\"password\" class=\"form-control form-control-user\" name=\"userPwd\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  placeholder=\"비밀번호를 입력해주세요.\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t           <!-- <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  <div class=\"custom-control custom-checkbox small\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"customCheck\">이메일 저장</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" onclick=\"Plogin();\"  class=\"btn btn-primary btn-user btn-block\" style=\"background:#008000\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  Login\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <hr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  <br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  <!-- 비번 찾기랑 회원가입하기버튼 수정해야함  -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- 일단은 안보이게해놈 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"/PETNER/views/member/searchPwForm.jsp\" style=\"padding-right: 20px;\">비밀번호 찾기</a>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"register.html\" style=\"padding-left: 20px;\">회원가입</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"modal fade\" id=\"modal-login\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t    <div class=\"modal-content\">\r\n");
      out.write("\t\t      <div class=\"modal-header\">\r\n");
      out.write("\t\t        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Modal title</h5>\r\n");
      out.write("\t\t        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("\t\t          <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t        </button>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t      <div class=\"modal-body\">\r\n");
      out.write("\t\t        ...\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t      <div class=\"modal-footer\">\r\n");
      out.write("\t\t        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t        <button type=\"button\" class=\"btn btn-primary\">Save changes</button>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t//로그인 서블릿으로 보내는 함수\r\n");
      out.write("\t\tfunction Plogin(){\t\r\n");
      out.write("\t\t\t$('#loginForm').submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write(" \r\n");
      out.write("\t<!--######## start banner Area ########-->\r\n");
      out.write("\t<!--  메뉴바랑 겹치는 부분 제거 -->\r\n");
      out.write("\t<div style=\"padding-top:150px;\"></div>\r\n");
      out.write("\t\r\n");
      out.write("    <!--tap-->\r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("     $('document').ready(function () {\r\n");
      out.write("    \t \r\n");
      out.write("    \t var $row = $('<div class=\"row>\"');\r\n");
      out.write("    \t var $p = $('<p>').text('textValue');\r\n");
      out.write("    \t \r\n");
      out.write("    \t \r\n");
      out.write("    \t $row.append($p);\r\n");
      out.write("    \t \r\n");
      out.write("    \t \r\n");
      out.write("    \t console.log($row);\r\n");
      out.write("    \t \r\n");
      out.write("    \t \r\n");
      out.write("    \t$('#tab_container').load(\"tab/tab1.jsp\");\r\n");
      out.write("\r\n");
      out.write("    \t// $('.tab_Chat').load(\"tab/chat.jsp\");\r\n");
      out.write("\r\n");
      out.write("    \t\r\n");
      out.write("    \t//tab을 눌렀을 때\r\n");
      out.write("        $(\"ul.tabs li\").click(function () {\r\n");
      out.write("        \t$(\"#tab_container\").html(\"\");\r\n");
      out.write("\r\n");
      out.write("            $(\"ul.tabs li\").removeClass(\"active\").css(\"color\", \"#333\");\r\n");
      out.write("            $(this).addClass(\"active\").css(\"color\", \"green\");\r\n");
      out.write("\r\n");
      out.write("            console.log($(this).attr('rel'));\r\n");
      out.write("            console.log($('ul.tabs li.active').attr('rel'));\r\n");
      out.write("\r\n");
      out.write("            var taburl=\"tab/\"+$('ul.tabs li.active').attr('rel')+\".jsp?userEmail=");
      out.print( mp.getUserEmail() );
      out.write("\";\r\n");
      out.write("\t\t\tvar userEmail = '");
      out.print( mp.getUserEmail() );
      out.write("';\r\n");
      out.write("            \r\n");
      out.write("            if($('ul.tabs li.active').attr('rel') == 'tab3'){\r\n");
      out.write("\t\t\t\tconsole.log(\"tab2\");\r\n");
      out.write("\t\t\t\tconsole.log('");
      out.print( mp.getUserEmail() );
      out.write("');\r\n");
      out.write("\t\t\t\tconsole.log(userEmail);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t/* \r\n");
      out.write("\t\t\t\t$(\"#tab_container\")\r\n");
      out.write("\t\t\t\t.load('/PETNER/QNAUserlist.go?userEmail='+userEmail);\r\n");
      out.write("\t\t\t\t$.ready\r\n");
      out.write("\t\t\t\t$(\"#tab_container\").load(\"tab/tab3.jsp\");\r\n");
      out.write("\t\t\t\t */\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t\t $.ajax({\r\n");
      out.write("\t\t\t\t\t url:\"/PETNER/QNAUserlist.go\"\r\n");
      out.write("\t\t\t\t\t , method: \"post\"\r\n");
      out.write("\t\t\t\t\t , data:{userEmail:userEmail}\r\n");
      out.write("\t\t\t\t \t, success:function(data){\r\n");
      out.write("\t\t\t\t \t\t$(\"#tab_container\").load(\"tab/tab3.jsp\",function(){\r\n");
      out.write("\t\t\t\t\t\t\tconsole.log('tab3.jsp 켜졌어염.!!!!!!!!!!!!!!');\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#noticeArea td\").mouseenter(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t$(this).parent().css({\"background\":\"#BBDEFB\", \"cursor\":\"pointer\"});\r\n");
      out.write("\t\t\t\t\t\t\t}).mouseout(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t$(this).parent().css({\"background\":\"white\"});\r\n");
      out.write("\t\t\t\t\t\t\t}).click(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t/* console.log($(this).parent().children().eq(0)text()); */\r\n");
      out.write("\t\t\t\t\t\t\t\tvar qno = $(this).parent().children().eq(0).text();\r\n");
      out.write("\t\t\t\t\t\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/QNASelectOne.go?qno=\"+qno;\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t $(\"#noclick\").bind('click', false);\r\n");
      out.write("\t\t\t\t \t}\r\n");
      out.write("\t\t\t\t \t, error:function(data){\r\n");
      out.write("\t\t\t\t \t\tconsole.log(\"에라에라 data : \"+data);\r\n");
      out.write("\t\t\t\t \t}\r\n");
      out.write("\t\t\t\t }); //ajax\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}else if($('ul.tabs li.active').attr('rel') == 'tab2'){\r\n");
      out.write("\t\t\t\tconsole.log(\"Tab2\");\r\n");
      out.write("\t\t\t\tconsole.log('");
      out.print( mp.getUserEmail() );
      out.write("');\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t $.ajax({\r\n");
      out.write("\t\t\t\t\t url:\"/PETNER/rList.me\"\r\n");
      out.write("\t\t\t\t\t , method: \"post\"\r\n");
      out.write("\t\t\t\t\t , data:{userEmail:userEmail}\r\n");
      out.write("\t\t\t\t \t, success:function(data){\r\n");
      out.write("\t\t\t\t \t\t$(\"#tab_container\").load(\"tab/tab2.jsp\",function(){\r\n");
      out.write("\t\t\t\t\t\t\tconsole.log('tab2.jsp 켜졌어염.!!!!!!!!!!!!!!');\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#noticeArea td\").mouseenter(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t$(this).parent().css({\"background\":\"#BBDEFB\", \"cursor\":\"pointer\"});\r\n");
      out.write("\t\t\t\t\t\t\t}).mouseout(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t$(this).parent().css({\"background\":\"white\"});\r\n");
      out.write("\t\t\t\t\t\t\t}).click(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t/* console.log($(this).parent().children().eq(0)text()); */\r\n");
      out.write("\t\t\t\t\t\t\t\tvar qno = $(this).parent().children().eq(0).text();\r\n");
      out.write("\t\t\t\t\t\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/QNASelectOne.go?qno=\"+qno;\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t \t}//success\r\n");
      out.write("\t\t\t\t \t, error:function(data){\r\n");
      out.write("\t\t\t\t \t\tconsole.log(\"에라에라 data : \"+data);\r\n");
      out.write("\t\t\t\t \t}\r\n");
      out.write("\t\t\t\t }); //ajax\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}else if($('ul.tabs li.active').attr('rel') == 'tab1'){\r\n");
      out.write("\t\t\t\tconsole.log(\"tab1\")\r\n");
      out.write("\t\t\t\t$('#tab_container').load(\"tab/tab1.jsp\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("            \r\n");
      out.write("            //$(\"#tab_container\").load(\"tab/\"+$('ul.tabs li.active').attr('rel')+\".jsp\");\r\n");
      out.write("            \r\n");
      out.write("\t\t\t\r\n");
      out.write("            $(\"#tab_container\").fadeIn();\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        //펫 정보 수정 페이지로 이동\r\n");
      out.write("        function updatePet(petName){\r\n");
      out.write("        \tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/pSel.pe?petName=\"+petName;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        //펫 삭제\r\n");
      out.write("        function deletePet(petName){\r\n");
      out.write("\r\n");
      out.write("        \tlocation.href=\"/PETNER/pDelete.pe?petName=\"+petName;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        //채팅창 띄우기\r\n");
      out.write("        function tab_Chat(){\r\n");
      out.write("        \t$(this).hide();\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("    <!--tap end-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Align Area -->\r\n");
      out.write("    <section class=\"whole-wrap\">\r\n");
      out.write("        <div class=\"container\" >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <!--start tab area-->\r\n");
      out.write("    \r\n");
      out.write("    \t<div class=\"container\" style=\"width:100%;\">\r\n");
      out.write("\t        <ul class=\"tabs\" style=\"width:100%;\">\r\n");
      out.write("\t            <li rel=\"tab1\">회원 정보 관리</li>\r\n");
      out.write("\t            <li rel=\"tab2\">호텔 예약 조회</li>\r\n");
      out.write("\t            <li rel=\"tab3\">1:1 문의 내역</li>\r\n");
      out.write("\t            \r\n");
      out.write("\t            <!-- \r\n");
      out.write("\t            <li rel=\"tab5\">\r\n");
      out.write("\t            펫트너 월드\r\n");
      out.write("\t            <a class=\"btn btn-default\" href=\"tab/chat.jsp\" onclick=\"tab_Chat(); window.open(this.href,'','width=370, height=720'); return false;\">Open</a>\r\n");
      out.write("\t            </li>\r\n");
      out.write("\t             -->\r\n");
      out.write("\t             \r\n");
      out.write("\t        </ul>\r\n");
      out.write("    \t</div> <!-- container.tabs -->\r\n");
      out.write("\r\n");
      out.write("\t    <div class=\"container\">\r\n");
      out.write("\t        <div id=\"tab_container\" style=\"width:100%;\">\r\n");
      out.write("\t\t        \t<!-- 요기에 불러옴 -->\r\n");
      out.write("\t\r\n");
      out.write("\t        </div> <!-- .tab_container -->\r\n");
      out.write("\t    </div><!-- container -->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</div> <!-- container -->\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction deleteMember(){\r\n");
      out.write("\t\t if (confirm(\"정말 탈퇴하시겠습니까??\") == true){    //확인\r\n");
      out.write("\t\t\t $('#delForm').submit();\r\n");
      out.write("\t\t }else{   //취소\r\n");
      out.write("\t\t     return false;\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t \r\n");
      out.write("\t}//deleteMember\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
