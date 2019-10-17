<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2018/10/29
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>注册</title>
    <script type="text/javascript" src="jquery/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
    <script src="vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-3 column">
        </div>
        <div class="col-md-6 column">
            <h3 class="text-center">注册</h3>
            <form id="register_from" class="form-horizontal" role="form">
                <div class="form-group">
                    <label for="userId" class="col-sm-3 control-label">帐号</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="userId" name="userId" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="userName" class="col-sm-3 control-label">用户名</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="userName" name="userName" required>
                    </div>
                </div>

                <div class="form-group">
                    <label for="userPassword" class="col-sm-3 control-label">密码</label>
                    <div class="col-sm-6">
                        <input type="password" class="form-control" id="userPassword" name="userPassword" required>
                    </div>
                </div>

                <div class="form-group">
                    <div class="radio col-sm-offset-3">
                        <label>
                            <input type="radio" name="userSex" id="optionsRadios1" value="1" checked>&ensp;男&ensp;&ensp;&ensp;
                        </label>
                        <label>
                            <input type="radio" name="userSex" id="optionsRadios2" value="0">&ensp;女
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <label for="userRealName" class="col-sm-3 control-label">真实姓名</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="userRealName" name="userRealName" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="userIdNumber" class="col-sm-3 control-label">证件号</label>
                    <div class="col-sm-6">
                        <input typ="text" class="form-control" id="userIdNumber" name="userIdNumber" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="userTel" class="col-sm-3 control-label">电话号码</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="userTel" name="userTel" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="userEMaill" class="col-sm-3 control-label">邮箱</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="userEMaill" name="userEMaill" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="userPost" class="col-sm-3 control-label">邮编</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="userPost" name="userPost" required>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <input type="button" onclick="register()" class="btn btn-default"value="注册">
                        <input type="reset" class="btn btn-default" value="重置">
                        <input type="button" onclick="location='login'" value="返回" class="btn btn-default">
                    </div>
                </div>
            </form>
        </div>
        <div class="col-md-3 column">
        </div>
    </div>
</div>
<script type="text/javascript">
    function register() {
          var json1={};
        var $name,$value;
        var $from=$("#register_from>.form-group");
        for (var i=0;i<$from.length-1;i++){
            $name=$from.eq(i).find("input").attr("name");
            if (i==3) {
                $value=$from.eq(i).find("input[name=\"userSex\"]:checked").val();
            }else {
                $value=$from.eq(i).find("input").val();
            }
            console.log( $name+":"+$value)
            if ($value==null||$value==""){
                alert($from.eq(i).find("label").text()+"不能为空");
                return;
            }
            json1[$name]=$value;
        }
        console.log(json1.userName);
        $.ajax({
            type: "post",
            url: "/addUser/do",
            dataType: "json",
            contentType: "application/json; charset=utf-8",
            cache: true,
            data: JSON.stringify(json1),
            success:function (data) {
                console.log(data.id)
                if (data) {
                    switch (data.state) {
                        case -1:
                            alert("帐号已存在!")
                            break;
                        case  -2:
                            alert("注册失败！请重试")
                            break;
                        default:
                            alert("成功")
                            window.location.href = "login";
                    }
                }else {
                    alert("失败")
                    return
                }
            }
        });
    }
</script>
</body>
</html>
