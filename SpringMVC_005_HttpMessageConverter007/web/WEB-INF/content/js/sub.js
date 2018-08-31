$(document).ready(function () {
    testRequestBody();
});

basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
function testRequestBody() {
    // base = <%=basePath%>
    $.ajax({
        url: basePath + "/json/test",
        dataType: "json", // 预期服务器返回的数据类型。
        type: "post", //  请求方式 POST或GET
        // 发送到服务器的数据。
        data: {id: "1", name: "Spring MVC企业应用实战"},
        async: true, // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
        // 请求成功后的回调函数。
        success: function (data) {
            console.log(data);
            $("#id").html(data.id);
            $("#name").html(data.name);
            $("#author").html(data.author);
        },
        // 请求出错时调用的函数
        error: function () {
            alert("数据发送失败");
        }
    });
    alert("DDD");
}
