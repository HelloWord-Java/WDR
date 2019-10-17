<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2018/10/29
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <script type="text/javascript" src="jquery/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-3 column">
        </div>
        <div class="col-md-6 column">
            <h3 class="text-center">登录</h3>
            <form id="login_from" class="form-horizontal" role="form">
                <div class="form-group">
                    <label for="userId" class="col-sm-2 control-label">帐号</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="userId" name="userId" placeholder="请输入帐号">
                    </div>
                </div>
                <div class="form-group">
                    <label for="userPassword" class="col-sm-2 control-label">密码</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" id="userPassword" name="userPassword" placeholder="请输入密码">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <div class="checkbox">
                            <label>
                                <input type="checkbox">请记住我
                            </label>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <input type="button" class="btn btn-default" value="登录" onclick="login()">
                        <input onclick="location='register'" type="button" value="注册" class="btn btn-default">
                    </div>
                </div>
            </form>
        </div>
        <div class="col-md-3 column">
        </div>
    </div>
</div>
<script type="text/javascript">
    // 用户登录校验
    function login() {
        var requestJson = {};
        var $name, $value;
        var $from = $("#login_from>.form-group");
        for (var i = 0; i < $from.length - 2; i++) {
            $name = $from.eq(i).find("input").attr("name");
            $value = $from.eq(i).find("input").val();
            if ($value==null||$value==""){
                alert($from.eq(i).find("label").text()+"不能为空！");
                return;
            }
            requestJson[$name] = $value;
        }
        $.ajax({
            type: "post",
            url: "/login/do",
            dataType: "json",
            contentType: "application/json; charset=utf-8",
            cache: true,
            data: JSON.stringify(requestJson),
            success: function (data) {
                if (data) {
                    switch (data.userState) {
                        case 1:
                            window.location.href = "/index";
                            break;
                        case 2:
                            window.location.href = "/managerPages";
                            break;
                        case 0:
                            alert("帐号不存在!")
                            break;
                        case  -1:
                            alert("密码错误！")
                            break;
                        case -9:
                            alert("该帐号禁止登录！")
                            break;
                        default:
                            alert("登录失败！未知原因")
                    }
                } else {
                    alert("失败")
                    return
                }
            }
        })
    }
</script>
</body>
</html>
