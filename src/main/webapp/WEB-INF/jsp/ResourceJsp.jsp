<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2017/12/3
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fn"%>
<html>
<head>
    <title>Title</title>
</head>
<body style="background-image: none;">
<div class="body_wrap">
    <div class="container">
        <div class="alert alert-success text-center" role="alert"></div>
        <table class="table table-striped table-bordered">
            <tr>
                <td>作者</td>
                <td>教程名称</td>
                <td>地址</td>
            </tr>
            <c:forEach var="learn" items="${learnList}">
                <tr class="text-info">
                    <td>${learn.author}</td>
                    <td>${learn.title}</td>
                    <td><a href="${learn.url}" class="btn btn-search btn-green" target="_blank"><span>点我</span></a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
