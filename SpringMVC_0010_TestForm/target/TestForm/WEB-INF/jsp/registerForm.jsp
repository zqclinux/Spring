<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Zqc
  Date: 2018/8/30
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>注册页面</h3>
<form:form  method="post" action="register" >
    <table>
        <tr>
            <td>姓名:</td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td>性别:</td>
            <td><form:input path="sex"/></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><form:input path="age"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
