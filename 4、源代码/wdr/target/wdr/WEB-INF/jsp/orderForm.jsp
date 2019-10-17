<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/23 0023
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>订单查看</title>
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
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                    <thead>
                    <tr>
                        <th>订单号</th>
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
                            <td>${ul.weddingdressId}</td>
                            <td><fmt:formatDate type="date" value="${ul.orderStarttime}"/></td>
                            <td><fmt:formatDate type="date" value="${ul.orderPEndtime}"/></td>
                            <c:if test="${not empty ul.orderAEndtime}">
                                <td><fmt:formatDate type="date" value="${ul.orderAEndtime}"/></td>
                            </c:if>
                            <c:if test="${empty ul.orderAEndtime}">
                                <td>租赁中</td>
                            </c:if>
                            <td>${ul.orderBasicC}</td>
                            <td>${ul.orderTimeoutC}</td>
                            <td>${ul.orderSumC}</td>
                            <c:if test="${ul.orderStatus==1}">
                                <td>租赁中</td>
                                <td><a href="#" onclick="updateOrderForm(${ul.orderId})">归还</a></td>
                            </c:if>
                            <c:if test="${ul.orderStatus==-1}">
                                <td>超时付款</td>
                                <td><a href="#">付款</a></td>
                            </c:if>
                            <c:if test="${ul.orderStatus==0}">
                                <td>完成</td>
                                <td></td>
                            </c:if>
                            <c:if test="${ul.orderStatus==2}">
                                <td>已申请归还</td>
                                <td></td>
                            </c:if>
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
    function updateOrderForm(orderId) {
        var atime=new Date();
        var json1={};
        json1["orderId"]=orderId;
        json1["orderStatus"]=2;
        json1["orderAEndtime"]=atime;
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
                            alert("申请提交成功！")
                            break;
                        case  -2:
                            alert("失败！请重试")
                            break;
                        default:
                            alert("失败！请重试")
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
