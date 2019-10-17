<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2018/10/31
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="vendor/datatables-plugins/dataTables.bootstrap.css">
    <link rel="stylesheet" type="text/css" href="vendor/datatables-responsive/dataTables.responsive.css">
    <link rel="stylesheet" type="text/css" href="vendor/font_722271_wyzouauaftn/iconfont.css">
</head>
<body>
<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">婚纱信息表</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                <a id="modal-209029" href="#modal-container-addUser" role="button" class="btn" data-toggle="modal">
                    <button type="button" class="btn btn-info">添加婚纱</button>
                </a>
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                    <thead>
                    <tr>
                        <th>编号</th>
                        <th>名字</th>
                        <th>主面料</th>
                        <th>产地</th>
                        <%--<th>上市时间</th>--%>
                        <th>建议售价</th>
                        <th>押金</th>
                        <th>日租金</th>
                        <th>超时租金</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${resultList}" var="ul">
                        <tr>
                            <td>${ul.weddingdressId}</td>
                            <td>${ul.weddingdressName}</td>
                            <td>${ul.weddingdressIngredient}</td>
                            <td>${ul.weddingdressOrigin}</td>
                            <%--<td><fmt:formatDate value="${ul.weddingdressTtm}"/></td>--%>
                            <td>${ul.weddingdressPrice}</td>
                            <td>${ul.weddingdressDeposit}</td>
                            <td>${ul.weddingdressDailym}</td>
                            <td>${ul.weddingdressOvertime}</td>

                            <td>
                                <a class="col-sm-offset-3" href="#modal-container-updateUser" data-toggle="modal" onclick="showUser(this)">
                                    <i   class="iconfont icon-bianji"></i>
                                </a>
                                <a  class="col-sm-offset-2" href="#" onclick="deleteUser(${ul.weddingdressId},this)">
                                    <i class="iconfont icon-shanchu"></i>
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <!-- /.table-responsive -->
            </div>
            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="modal fade" id="modal-container-addUser" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h4 class="modal-title" id="myModalLabel">
                               添加婚纱
                            </h4>
                        </div>
                        <div class="modal-body center-block">
                            <form id="add_user_from" class="form-horizontal" role="form">
                                <div class="form-group">
                                    <label for="weddingdressId" class="col-sm-2 control-label">编号</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="weddingdressId" name="weddingdressId" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="weddingdressName" class="col-sm-2 control-label">名字</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="weddingdressName" name="weddingdressName" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="weddingdressIngredient" class="col-sm-2 control-label">主面料</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="weddingdressIngredient" name="weddingdressIngredient" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="weddingdressOrigin" class="col-sm-2 control-label">产地</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="weddingdressOrigin" name="weddingdressOrigin" required>
                                    </div>
                                </div>
                                <%--<div class="form-group">--%>
                                    <%--<label for="weddingdressTtm" class="col-sm-2 control-label">上市时间</label>--%>
                                    <%--<div class="col-sm-6">--%>
                                        <%--<input type="date" class="form-control" id="weddingdressTtm" name="weddingdressTtm" required>--%>
                                    <%--</div>--%>
                                <%--</div>--%>
                                <div class="form-group">
                                    <label for="weddingdressPrice" class="col-sm-2 control-label">建议售价</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="weddingdressPrice" name="weddingdressPrice" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="weddingdressDeposit" class="col-sm-2 control-label">押金</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="weddingdressDeposit" name="weddingdressDeposit" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="weddingdressDailym" class="col-sm-2 control-label">日租金</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="weddingdressDailym" name="weddingdressDailym" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="weddingdressOvertime" class="col-sm-2 control-label">超时租金</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="weddingdressOvertime" name="weddingdressOvertime" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="uploadFile" class="col-sm-2 control-label">文件选择</label>
                                    <div class="col-sm-6">
                                        <input name="uploadFile" id="uploadFile" type="file">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-offset-2 col-sm-2 pull-right">
                                        <input type="reset"  class="btn btn-danger" value="重置">
                                    </div>
                                </div>

                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            <button type="button" class="btn btn-primary" onclick="addUser()">保存</button>
                        </div>
                    </div>

                </div>

            </div>

        </div>
    </div>
</div>
<!--/.添加用户模态框-->
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="modal fade" id="modal-container-updateUser" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h4 class="modal-title" id="">
                                修改婚纱
                            </h4>
                        </div>
                        <div class="modal-body center-block">
                            <form id="update_user_from" class="form-horizontal" role="form">
                                <div class="form-group">
                                    <label for="update_weddingdressId" class="col-sm-2 control-label">编号</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="update_weddingdressId" name="weddingdressId" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="update_weddingdressName" class="col-sm-2 control-label">名字</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="update_weddingdressName" name="weddingdressName" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="update_weddingdressIngredient" class="col-sm-2 control-label">主面料</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="update_weddingdressIngredient" name="weddingdressIngredient" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="update_weddingdressOrigin" class="col-sm-2 control-label">产地</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="update_weddingdressOrigin" name="weddingdressOrigin" required>
                                    </div>
                                </div>
                                <%--<div class="form-group">--%>
                                    <%--<label for="weddingdressTtm" class="col-sm-2 control-label">上市时间</label>--%>
                                    <%--<div class="col-sm-6">--%>
                                        <%--<input type="text" class="form-control" id="update_weddingdressTtm" name="weddingdressTtm" required>--%>
                                    <%--</div>--%>
                                <%--</div>--%>
                                <div class="form-group">
                                    <label for="update_weddingdressPrice" class="col-sm-2 control-label">建议售价</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="update_weddingdressPrice" name="weddingdressPrice" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="update_weddingdressDeposit" class="col-sm-2 control-label">押金</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="update_weddingdressDeposit" name="weddingdressDeposit" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="update_weddingdressDailym" class="col-sm-2 control-label">日租金</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="update_weddingdressDailym" name="weddingdressDailym" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="update_weddingdressOvertime" class="col-sm-2 control-label">超时租金</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="update_weddingdressOvertime" name="weddingdressOvertime" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-offset-2 col-sm-2 pull-right">
                                        <input type="reset"  class="btn btn-danger" value="重置">
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            <button type="button" class="btn btn-primary" onclick="updateUser()">保存</button>
                        </div>
                    </div>

                </div>

            </div>

        </div>
    </div>
</div>
<!--/.修改用户模态框-->

<script type="text/javascript" src="jquery/jquery-3.3.1.min.js"></script>
<script src="vendor/datatables/js/jquery.dataTables.min.js"></script>
<script src="vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
<script src="vendor/datatables-responsive/dataTables.responsive.js"></script>
<script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
            responsive: true
        });
    });
    function addUser() {
        var json1={};
        var $name,$value;
        var $from=$("#add_user_from>.form-group");
        for (var i=0;i<$from.length-1;i++){
            $name=$from.eq(i).find("input").attr("name");
            $value=$from.eq(i).find("input").val();
            console.log( $name+":"+$value)
            if ($value==null||$value==""){
                alert($from.eq(i).find("label").text()+"不能为空");
                return;
            }
            json1[$name]=$value;
        }
        console.log(json1.userName);
        var formData=new FormData($("#add_user_from")[0]);
        $.ajax({
            type: "post",
            url: "/addWeddingDress/do",
            processData: false,
            contentType: false,
            // dataType: "json",
            // contentType: "application/json; charset=utf-8",
            // cache: true,
            data: formData,
            success:function (data) {
                console.log(data.userName)
                if (data) {
                    switch (data) {
                        case -1:
                            alert("编号已存在!")
                            break;
                            case 2:
                            alert("格式不正确，仅支持jpg和png!")
                            break;
                        case 1:
                            alert("添加成功")
                            $("#add_user_from")[0].reset()
                            break;
                        default:
                            alert("添加失败！")
                    }
                }else {
                    alert("未知错误！")
                    return
                }
            }
        });
    }
    function showUser(obj) {
        $("#update_user_from");
        var $formgroup=$("#update_user_from>.form-group");
        for (var i=0;i<$(obj).parent().parent().find("td").length-1;i++) {
            var $td=$(obj).parent().parent().find("td").eq(i).text()
            console.log($formgroup.eq(i).find("input").attr("name")+":"+$td);
            $formgroup.eq(i).find("input").val($td)

        }
    }
    function updateUser() {
        var json1={};
        var $name,$value;
        var $from=$("#update_user_from>.form-group");
        console.log( $from.length-1)
        for (var i=0;i<$from.length-1;i++){
            $name=$from.eq(i).find("input").attr("name");
           $value=$from.eq(i).find("input").val();
            console.log( $name+":"+$value)
            if ($value==null||$value==""){
                alert($from.eq(i).find("label").text()+"不能为空");
                return;
            }
            json1[$name]=$value;
        }
            $.ajax({
                type: "post",
                url: "/updateWeddingDress/do",
                dataType: "json",
                contentType: "application/json; charset=utf-8",
                cache: true,
                data: JSON.stringify(json1),
                success:function (data) {
                    console.log("修改返回值："+data)
                    if (data) {
                        switch (data) {
                            case 1:
                                alert("修改成功!")
                                break;
                            case  -2:
                                alert("修改失败！请重试")
                                break;
                            default:
                                alert("修改失败！请重试")
                        }
                    }else {
                        alert("失败")
                        return
                    }
                }
            });

    }
    function deleteUser(i,obj) {
        var json1={};
        var $name,
        $name="weddingdressId";
        json1[$name]=i;
        console.log($name+i)
        $.ajax({
            type: "post",
            url: "/deleteWeddingDress/do",
            dataType: "json",
            contentType: "application/json; charset=utf-8",
            cache: true,
            data: JSON.stringify(json1),
            success:function (data) {
                console.log("修改返回值："+data)
                if (data) {
                    switch (data) {
                        case 1:
                            alert("删除成功!")
                            break;
                        case  -2:
                            alert("失败！请重试")
                            break;
                        default:
                            alert("删除失败！请重试")
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
