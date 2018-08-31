<%--
  Created by IntelliJ IDEA.
  User: Zqc
  Date: 2018/8/30
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String name = new String(request.getParameter("username").getBytes("ISO-8859-1"),"utf-8");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
姓名：<%=name%>
</body>
</html>
