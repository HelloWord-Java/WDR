<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/22 0022
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
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
        <h1 class="page-header">订单信息表</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                <a id="modal-209029" href="#modal-container-addUser" role="button" class="btn" data-toggle="modal">
                    <button type="button" class="btn btn-info">添加订单</button>
                </a>
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                    <thead>
                    <tr>
                        <th>订单号</th>
                        <th>用户账号</th>
                        <th>婚纱编号</th>
                        <th>开始时间</th>
                        <th>计划归还时间</th>
                        <th>实际归还时间</th>
                        <th>基本消费(/元)</th>
                        <th>超时消费(/元)</th>
                        <th>共计(/元)</th>
                        <th>订单状态</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${orderFormList}" var="ul">
                        <tr>
                            <td>${ul.orderId}</td>
                            <td>${ul.userId}</td>
                            <td>${ul.weddingdressId}</td>
                            <td><fmt:formatDate type="date" value="${ul.orderStarttime}"/></td>
                            <td><fmt:formatDate type="date" value="${ul.orderPEndtime}"/></td>
                            <c:if test="${not empty ul.orderAEndtime}">
                                <td><fmt:formatDate type="date" value="${ul.orderAEndtime}"/></td>
                            </c:if>
                            <c:if test="${empty ul.orderAEndtime}">
                                <td>租赁中...</td>
                            </c:if>
                            <td>${ul.orderBasicC}</td>
                            <td>${ul.orderTimeoutC}</td>
                            <td>${ul.orderSumC}</td>
                            <c:if test="${ul.orderStatus==1}">
                                <td>租赁中</td>
                            </c:if>
                            <c:if test="${ul.orderStatus==-1}">
                                <td>待付款</td>
                            </c:if>
                            <c:if test="${ul.orderStatus==0}">
                                <td>完成</td>
                            </c:if>
                            <c:if test="${ul.orderStatus==2}">
                                <td>申请归还中</td>
                            </c:if>
                            <td>
                                <a class="col-sm-offset-3" href="#modal-container-updateUser" data-toggle="modal" onclick="showUser(this)">
                                    <i   class="iconfont icon-bianji"></i>
                                </a>
                                <a  class="col-sm-offset-2" href="#" onclick="deleteUser(${ul.orderId},this)">
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
                                添加订单
                            </h4>
                        </div>
                        <div class="modal-body center-block">
                            <form id="add_user_from" class="form-horizontal" role="form">
                                <div class="form-group">
                                    <label for="orderId" class="col-sm-2 control-label">订单号</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="orderId" name="orderId" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="userId" class="col-sm-2 control-label">用户账号</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="userId" name="userId" required>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="weddingdressId" class="col-sm-2 control-label">婚纱编号</label>
                                    <div class="col-sm-6">
                                        <input type="password" class="form-control" id="weddingdressId" name="weddingdressId" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="orderStarttime" class="col-sm-2 control-label">开始时间</label>
                                    <div class="col-sm-6">
                                        <input type="password" class="form-control" id="orderStarttime" name="orderStarttime" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="orderPEndtime" class="col-sm-2 control-label">计划归还时间</label>
                                    <div class="col-sm-6">
                                        <input type="password" class="form-control" id="orderPEndtime" name="orderPEndtime" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="orderAEndtime" class="col-sm-2 control-label">实际归还时间</label>
                                    <div class="col-sm-6">
                                        <input type="password" class="form-control" id="orderAEndtime" name="orderAEndtime" required>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="orderBasicC" class="col-sm-2 control-label">基本消费</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="orderBasicC" name="orderBasicC" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="orderTimeoutC" class="col-sm-2 control-label">超时消费</label>
                                    <div class="col-sm-6">
                                        <input typ="text" class="form-control" id="orderTimeoutC" name="orderTimeoutC" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="orderSumC" class="col-sm-2 control-label">共计</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="orderSumC" name="orderSumC" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="radio col-sm-offset-3">
                                        <label>
                                            <input type="radio" name="orderStatus" id="optionsRadios3" value="-1" checked>&ensp;待付款&ensp;&ensp;&ensp;
                                        </label>
                                        <label>
                                            <input type="radio" name="orderStatus" id="optionsRadios33" value="1">&ensp;租赁中
                                        </label>
                                        <label>
                                            <input type="radio" name="orderStatus" id="optionsRadios333" value="0">完成
                                        </label>
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
<!--/.添加订单模态框-->
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="modal fade" id="modal-container-updateUser" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h4 class="modal-title" id="">
                                修改订单
                            </h4>
                        </div>
                        <div class="modal-body center-block">
                            <form id="update_user_from" class="form-horizontal" role="form">
                                <div class="form-group">
                                    <label for="update_orderId" class="col-sm-2 control-label">订单号</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="update_orderId" name="orderId" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="update_userId" class="col-sm-2 control-label">用户账号</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="update_userId" name="userId" required>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="update_weddingdressId" class="col-sm-2 control-label">婚纱编号</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="update_weddingdressId" name="weddingdressId" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="update_orderStarttime" class="col-sm-2 control-label">开始时间</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="update_orderStarttime" name="orderStarttime" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="update_orderPEndtime" class="col-sm-2 control-label">计划归还时间</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="update_orderPEndtime" name="orderPEndtime" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="update_orderAEndtime" class="col-sm-2 control-label">实际归还时间</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="update_orderAEndtime" name="orderAEndtime" required>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="update_orderBasicC" class="col-sm-2 control-label">基本消费</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="update_orderBasicC" name="orderBasicC" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="update_orderTimeoutC" class="col-sm-2 control-label">超时消费</label>
                                    <div class="col-sm-6">
                                        <input typ="text" class="form-control" id="update_orderTimeoutC" name="orderTimeoutC" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="update_orderSumC" class="col-sm-2 control-label">共计</label>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control" id="update_orderSumC" name="orderSumC" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="radio col-sm-offset-3">
                                        <label>
                                            <input type="radio" name="orderStatus" id="optionsRadios6" value="-1" checked>&ensp;待付款&ensp;&ensp;&ensp;
                                        </label>
                                        <label>
                                            <input type="radio" name="orderStatus" id="optionsRadios66" value="1">&ensp;租赁中
                                        </label>
                                        <label>
                                            <input type="radio" name="orderStatus" id="optionsRadios666" value="0">完成
                                        </label>
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
<!--/.修改订单模态框-->

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
            switch (i) {
                case 9:
                    $value=$from.eq(i).find("input[name=\"orderStatus\"]:checked").val();
                    break;
                default:
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
            url: "/addOrderform/do",
            dataType: "json",
            contentType: "application/json; charset=utf-8",
            cache: true,
            data: JSON.stringify(json1),
            success:function (data) {
                console.log(data.userName)
                if (data) {
                    switch (data) {
                        case -1:
                            alert("订单号已存在!")
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
            switch (i) {
                case 9:
                    $formgroup.eq(i).find("input[name=\"orderStatus\"]").removeAttr("checked")
                    if($td=="待付款"){
                        $formgroup.eq(i).find("input[value=-1]").attr("checked","checked")
                    }
                    if($td=="租赁中"){
                        $formgroup.eq(i).find("input[value=1]").attr("checked","checked")
                    }
                    if($td=="完成"){
                        $formgroup.eq(i).find("input[value=0]").attr("checked","checked")
                    }
                    break;
                default:

                    $formgroup.eq(i).find("input").val($td)
            }

        }
    }
    function updateUser() {
        var json1={};
        var $name,$value;
        var $from=$("#update_user_from>.form-group");
        console.log( $from.length-1)
        for (var i=0;i<$from.length-1;i++){
            $name=$from.eq(i).find("input").attr("name");
            switch (i) {
                case 9:
                    $value=$from.eq(i).find("input[name=\"orderStatus\"]:checked").val();
                    break;
                default:
                    $value=$from.eq(i).find("input").val();
            }
            console.log( $name+":"+$value)
            if ($value==null||$value==""){
                alert($from.eq(i).find("label").text()+"不能为空");
                return;
            }
            json1[$name]=$value;
        }
        $.ajax({
            type: "post",
            url: "/updateOrderform/do",
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
            $name="orderId";
        json1[$name]=i;
        console.log($name+i)
        $.ajax({
            type: "post",
            url: "/deleteOrderform/do",
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
