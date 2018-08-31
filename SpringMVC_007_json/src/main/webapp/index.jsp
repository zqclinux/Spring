<%@page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>测试</title>

    <%--<script type="text/javascript" src="WEB-INF/js/jquery-1.11.3.min.js"/>--%>
    <script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <%--<script type="text/javascript" src="js/json2.js"/>--%>
    <script type="text/javascript">
        $(document).ready(function () {
            //类似于原生js的window.onload
            test();
            // alert("fo");
        });

        function test() {
            $.ajax({
                url: "/json/test",
                dataType: "json",
                type: "POST",
                contentType: "application/json",
                data: JSON.stringify({id: "1", name: "tom"}),
                async: true,
                success: function (data) {
                    console.log(data);
                    $("#id").html(data.id);
                    $("#name").html(data.name);
                    $("#author").html(data.author);
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert("请求对象XMLHttpRequest: " + XMLHttpRequest.readyState);
                    alert("请求对象state: " + XMLHttpRequest.status);
                    alert("错误类型textStatus: " + textStatus.textStatus);
                    alert("异常对象errorThrown: " + errorThrown);
                }
            });
        }
    </script>
</head>
<body>
<h2>Hello World!</h2>
<br>
编号： <span id="id"></span><br>
书名： <span id="name"></span><br>
作者： <span id="author"></span><br>
</body>
</html>
