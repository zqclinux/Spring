<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>
<h3>测试Model</h3>
<form action="/login1" method="post">
     <table>
         <tr>
         	<td><label>登录名: </label></td>
             <td><input type="text" id="loginName" name="loginName" ></td>
         </tr>
         <tr>
         	<td><label>密码: </label></td>
             <td><input type="password" id="password" name="password" ></td>
         </tr>
         <tr>
             <td><input id="submit" type="submit" value="登录"></td>
         </tr>
     </table>
</form>
</body>
</html>