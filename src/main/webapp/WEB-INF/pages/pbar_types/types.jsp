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
      <th>logo</th>
      <th>类别名称</th>
      <th>权重</th>
      <th>是否首页</th>
      <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${types}" var="type">
      <tr>
        <td>
          <img src="${type.picUrl}?imageView2/2/w/50/h/50/q/95" width="50px" height="50px" class="type_img_style"/>
        </td>
        <td>
          ${type.name}
        </td>
        <td>
          ${type.weight}
        </td>
        <td>
          ${type.isIndex}
        </td>
        <td>
          <button type="button" onclick="edit('${type.id}', '${type.name}', '${type.picUrl}', '${type.weight}', '${type.isIndex}')" class="btn btn-primary">
            <span class="glyphicon glyphicon-pencil"></span>
            编辑
          </button>

          <c:choose>
            <c:when test="${type.isIndex == 1}">
              <button type="button" onclick="index(${type.id}, 0)" class="btn btn-danger">
                <span class="glyphicon glyphicon-th-list"></span>
                取消首页
              </button>
            </c:when>
            <c:otherwise>
              <button type="button" onclick="index(${type.id}, 1)" class="btn btn-success">
                <span class="glyphicon glyphicon-th-list"></span>
                置于首页
              </button>
            </c:otherwise>
          </c:choose>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>

  <div class="common_black" id="fc">
    <div class="common_black_content">
      <input type="hidden" id="typeId" value=""/>
      <input type="text" class="form-control" id="name" placeholder="请输入名称"/><br/>
      <input type="text" class="form-control" id="picUrl" placeholder="请输入外链"/><br/>
      <input type="text" class="form-control" id="weight" placeholder="权重"><br/>
      <input type="text" class="form-control" id="isIndex" placeholder="是否首页"><br/>
      <button type="button" onclick="tj()" class="btn btn-success">
        提交
      </button>
      <button type="button" onclick="qx()" class="btn btn-success">
        取消
      </button>
    </div>
  </div>

</div>

<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/pbar_types/types.js"></script>
</body>
</html>
