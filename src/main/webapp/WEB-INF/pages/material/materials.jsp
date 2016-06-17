<%--
  Created by IntelliJ IDEA.
  User: bjsunqinwen
  Date: 2016/6/17
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>圈子类型管理</title>
</head>
<body>
<%@include file="../Top.jsp" %>
<div class="main">

  <table class="table table-bordered">
    <thead>
    <tr>
      <th>素材</th>
      <th>素材名称</th>
      <th>url</th>
      <th>后缀</th>
      <th>添加日期</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${materials}" var="material">
      <tr>
        <td>
          <img src="${material.url}?imageView2/2/w/100/h/100/q/95" width="100px" height="100px" class="type_img_style"/>
        </td>
        <td>
            ${material.name}
        </td>
        <td>
            <input type="text" class="form-control" value="${material.url}"/>
        </td>
        <td>
            ${material.postfix}
        </td>
        <td>
          <fmt:formatDate value="${material.createTime}" pattern="yyyy年MM月dd日"/>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <br/>
  <a href="${pageContext.request.contextPath}/material/upload?page=${page-1}">上一页</a>|<a href="${pageContext.request.contextPath}/material/upload?page=${page+1}">下一页</a>
  <br/><br/>
  <span style="font-size: 25px;">添加素材</span>
  <br/>
  <br/>
  <input type="text" class="form-control" id="name" placeholder="请输入名称"/><br/>
  <input type="text" class="form-control" id="postfix" placeholder="请输入后缀"/><br/>
  <input type="text" class="form-control" id="url" disabled="disabled"/>
  <br/>
  <button type="button" id="upload" class="btn btn-info">
    <span class="glyphicon glyphicon-circle-arrow-up"></span>
    上传
  </button>
  <br/>
  <br/>
  <span id="pic">
  </span>
  <br/>
  <button type="button" onclick="tj()" class="btn btn-primary">
    提交
  </button>
</div>

<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/plupload/plupload.full.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/qiniu.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/material/materials.js"></script>
</body>
</html>
