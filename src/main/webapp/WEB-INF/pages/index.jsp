<%--
  Created by IntelliJ IDEA.
  User: bjsunqinwen
  Date: 2016/6/16
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>咔哔圈子后台管理</title>
</head>
<body>
<%@include file="./Top.jsp" %>

<div class="main">
  <button type="button" onclick="window.location.href='${pageContext.request.contextPath}/pbar/types'" class="btn btn-success">
    <span class="glyphicon glyphicon-tags"></span>
    &nbsp;圈子类别管理
  </button>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <button type="button" onclick="window.location.href='${pageContext.request.contextPath}/material/upload'" class="btn btn-danger">
    <span class="glyphicon glyphicon-picture"></span>
    &nbsp;上传素材图片
  </button>
</div>
</body>
</html>
