<%@page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>测试</title>

    <%--<script type="text/javascript" src="WEB-INF/js/jquery-1.11.3.min.js"/>--%>
    <script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <%--<script type="text/javascript" src="WEB-INF/js/json2.js"/>--%>
    <script type="text/javascript">
        $(document).ready(function () {
            //类似于原生js的window.onload
            test()
        });

        function rr() {
            alert("Message")
        }

        function test() {
            $.ajax({
                url: "localhost:8080/json/test",
                dataType: "json",
                type: "post",
                contentType: "application/json",
                data: JSON.stringify({"id": "001", "name": "tom"}),
                async: true,
                success: function (data) {
                    console.log(data);
                    $("#id").html(data.id);
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
    <%--<script>--%>
    <%--function rr() {--%>
    <%--alert("me")--%>
    <%--}--%>
    <%--</script>--%>
</head>
<body>
<h2>Hello World!</h2>
<br>
编号： <span id="id"></span>
</body>
</html>
