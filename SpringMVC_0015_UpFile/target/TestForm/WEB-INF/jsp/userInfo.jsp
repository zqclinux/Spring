<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>文件下载</title>
    <%
        String path = request.getServletContext().getRealPath("/images/");

    %>
</head>
<body>
<h3>文件下载</h3>
<a href="download?filename=${requestScope.user.image.originalFilename}">
    ${requestScope.user.image.originalFilename }
</a>
<br>
<img src="<%=path%>+${requestScope.user.image.originalFilename}" alt="null" width="40" height="40">
</body>
</html>