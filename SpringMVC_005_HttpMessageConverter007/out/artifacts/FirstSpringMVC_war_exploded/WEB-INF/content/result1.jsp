<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试@ModelAttribute(value="")注释返回具体类的方法</title>
</head>
<body>
访问request作用范围域中的model对象,loginName: ：${requestScope.user.loginName }<br>
访问request作用范围域中的model对象,passWord：${requestScope.user.password}<br>
访问request作用范围域中的model对象,usrName：${requestScope.user.userName }<br>
<br>
</body>
</html>