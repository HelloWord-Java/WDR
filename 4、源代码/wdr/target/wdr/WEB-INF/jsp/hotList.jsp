<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/23 0023
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="vendor/template/sb-admin-2.min.css">
    <link rel="stylesheet" type="text/css" href="vendor/metisMenu/metisMenu.min.css">
    <link rel="stylesheet" type="text/css" href="vendor/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="vendor/font_722271_wyzouauaftn/iconfont.css">
</head>
<body>
<div class="row">
    <div class="col-lg-12">
        <h2 class="page-header">爆款推荐</h2>
    </div>
</div>
<div class="row">
    <c:forEach items="${hotWeddingDressList}" var="l" begin="0" end="7">
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <img src="${pageContext.request.contextPath}upload/photo${l.weddingdressId}.jpg"
                     alt="未找到图片！">
                <div class="caption">
                    <h3>${l.weddingdressName}</h3>
                    <p>已售：${l.weddingdressNum}</p>
                    <p>售价：${l.weddingdressDailym}/天</p>
                    <p>
                        <%--<a href="#" class="btn btn-primary" role="button" onclick="add(${l.weddingdressId})">--%>
                            <%--加入购物车--%>
                        <%--</a>--%>
                        <a href="#modal-container-addUser" data-toggle="modal" class="btn btn-info" role="button" onclick="show(${l.weddingdressId},'${l.weddingdressName}',${l.weddingdressDailym})">
                            租赁
                        </a>
                    </p>
                </div>
            </div>
        </div>
    </c:forEach>
</div>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <ul class="pagination pagination-sm">
                <li>
                    <a href="#">Prev</a>
                </li>
                <li>
                    <a href="#">1</a>
                </li>
                <li>
                    <a href="#">Next</a>
                </li>
            </ul>
        </div>
    </div>
</div>`
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="modal fade" id="modal-container-addUser" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h4 class="modal-title" id="myModalLabel">
                                订单详情
                            </h4>
                        </div>
                        <div class="modal-body center-block">
                            <div class="row">
                                <div class="col-sm-6 col-md-6">
                                    <div class="thumbnail">
                                        <img width="280" height="280"
                                             alt="未找到图片！" data_id="" data_price="">
                                    </div>


                                </div>
                                <div class="caption pull-right">
                                <h3>商品名称:</h3>
                                    <span class="add-on">租期 &ensp;</span>
                                    <select name="" id="selectDays">
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>
                                        <option value="5">5</option>
                                        <option value="10">10</option>
                                    </select><span class="add-on">&ensp;天</span>
                                    <p>售价：<span></span>.0/天</p>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                            <button type="button" class="btn btn-primary" onclick="addOrderForm()">确认付款</button>
                        </div>
                    </div>

                </div>

            </div>

        </div>
    </div>
</div>
<script src="vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
    function show(id,name,price) {
        var $mb=$("#modal-container-addUser .modal-body")
        console.log(id,name,price+$mb.find("p").text());
        $mb.find("img").attr("src","${pageContext.request.contextPath}upload/photo"+id+".jpg");
        $mb.find("img").attr("data_id",id);
        $mb.find("img").attr("data_price",price);
        $mb.find("h3").text("商品名称:"+name);
        $mb.find("p").find("span").text(price);
    }
    function addOrderForm() {
        var $modalbody=$("#modal-container-addUser .modal-body")
        var $id=$modalbody.find("img").attr("data_id");
        var $price=$modalbody.find("img").attr("data_price");
        var ptime=$modalbody.find("select").val();
        var nowDate=new Date();
        var nowDateAdd = new Date(new Date().setDate(new Date().getDate()+ptime*1));
        console.log(nowDate.toLocaleDateString());
        console.log(nowDateAdd.toLocaleDateString());
        var json1={};
        json1["weddingdressId"]=$id;
        json1["userId"]=${loginUser.userId};
        json1["orderId"]=${loginUser.userId}+$id;
        json1["orderStarttime"]=nowDate;
        json1["orderPEndtime"]=nowDateAdd;
        json1["orderBasicC"]=$price*ptime;
        json1["orderSumC"]=$price*ptime;
        json1["orderStatus"]=1;
        $.ajax({
            type: "post",
            url: "/addOrderform/do",
            dataType: "json",
            contentType: "application/json; charset=utf-8",
            cache: true,
            data: JSON.stringify(json1),
            success:function (data) {
                console.log("修改返回值："+data)
                if (data) {
                    switch (data) {
                        case 1:
                            alert("已付款！交易成功!")
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
