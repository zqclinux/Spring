<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>测试返回JSON格式的数据</title>
    <%--<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.js"></script>--%>
    <script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
    <%--<script type="text/javascript" src="../js/json2.js"></script>--%>
    <script type="text/javascript">
        $(document).ready(function () {
            //类似于原生js的window.onload
           testResponseBody()
        });
        function testResponseBody(){
            $.post("/json/get",null,
                function(data){
                    $.each(data,function(){
                        var tr  = $("<tr align='center'/>");
                        $("<td/>").html(this.id).appendTo(tr);
                        $("<td/>").html(this.name).appendTo(tr);
                        $("<td/>").html(this.author).appendTo(tr);
                        $("#booktable").append(tr);
                    })
                },"json");
        }
    </script>
</head>
<body>
<table id="booktable" border="1"  style="border-collapse: collapse;">
    <tr align="center">
        <th>编号</th>
        <th>书名</th>
        <th>作者</th>
    </tr>

</table>

</body>
</html>