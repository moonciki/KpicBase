<%--
  Created by IntelliJ IDEA.
  User: bjsunqinwen
  Date: 2016/6/17
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title></title>
  <script src="${pageContext.request.contextPath}/static/js/jquery-1.10.2.min.js"></script>
  <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/static/css/common.css" rel="stylesheet">
  <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
  <div class="navbar-header">
    <span style="cursor: pointer;color:#ff8498;font-size: 21px;font-weight: bold;padding-left:100px;line-height: 2.5" onclick="window.location.href='${pageContext.request.contextPath}/index'">咔哔圈子后台管理系统</span>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  </div>
  <div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">iOS</a></li>
      <li><a href="#">SVN</a></li>
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
          Java
          <b class="caret"></b>
        </a>
        <ul class="dropdown-menu">
          <li><a href="#">jmeter</a></li>
          <li><a href="#">EJB</a></li>
          <li><a href="#">Jasper Report</a></li>
          <li class="divider"></li>
          <li><a href="#">分离的链接</a></li>
          <li class="divider"></li>
          <li><a href="#">另一个分离的链接</a></li>
        </ul>
      </li>
    </ul>
  </div>
</nav>
</body>
</html>
