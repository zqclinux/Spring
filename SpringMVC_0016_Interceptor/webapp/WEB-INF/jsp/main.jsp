<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Zqc
  Date: 2018/8/31
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>展示页</title>
</head>
<body>
<h3>欢迎[${sessionScope.user.userName}]</h3><br>
<table border="1" bgcolor="#f0f8ff">
    <tr>
        <th>封面</th>
        <th>书名</th>
        <th>作者</th>
        <th>价格</th>
    </tr>
    <c:forEach items="${requestScope.bookList}" var="book">
        <tr>
            <td><img src="/img/${book.image}" height="50"/></td>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>${book.price}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
