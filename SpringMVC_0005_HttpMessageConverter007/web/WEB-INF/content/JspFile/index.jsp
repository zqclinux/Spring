<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <%--<%--%>
        <%--String path = request.getContextPath();--%>
        <%--String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";--%>
    <%--%>--%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>测试接收JSON格式的数据</title>
    <%--<script type="text/javascript" src="../js/jquery-1.11.0.min.js"></script>--%>
    <script type="text/javascript" src="../js/sub.js"></script>
    <%--<script>--%>
    <%--alert("${pageContext.request.contextPath}/json/testRequestBody")--%>
    <%--</script>--%>
</head>
<body>
编号：<span id="id"></span><br>
书名：<span id="name"></span><br>
作者：<span id="author"></span><br>
</body>
</html>