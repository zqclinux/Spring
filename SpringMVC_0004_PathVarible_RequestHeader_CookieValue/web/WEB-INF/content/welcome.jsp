<%--
  Created by IntelliJ IDEA.
  User: Zqc
  Date: 2018/8/9
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>For test</title>
</head>
<body>
${requestScope.get("Name")}
<br>
${requestScope.get("Message")}
但是
<br>
<a href=${requestScope.get("URL")}>Web</a>
</body>
</html>
