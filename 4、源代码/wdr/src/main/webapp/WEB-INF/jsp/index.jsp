<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2018/10/31
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>婚纱租系统</title>
    <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="vendor/template/sb-admin-2.min.css">
    <link rel="stylesheet" type="text/css" href="vendor/metisMenu/metisMenu.min.css">
    <link rel="stylesheet" type="text/css" href="vendor/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="vendor/font_722271_wyzouauaftn/iconfont.css">
</head>
<body>
<div id="wrapper">

    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html">婚纱租赁系统</a>
        </div>
        <!-- /.navbar-header -->

        <ul class="nav navbar-top-links navbar-right">
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                </a>
                <ul class="dropdown-menu dropdown-user">
                    <li><a href="#" onclick="showUserData()"><i class="fa fa-user fa-fw"></i>个人资料</a>
                    </li>
                    </li>
                    <li class="divider"></li>
                    <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> 登出</a>
                    </li>
                </ul>
                <!-- /.dropdown-user -->
            </li>
            <!-- /.dropdown -->
        </ul>
        <!-- /.navbar-top-links -->

        <div class="navbar-default sidebar" role="navigation">
            <div class="sidebar-nav navbar-collapse">
                <ul class="nav" id="side-menu">
                    <%--<li class="sidebar-search">--%>
                        <%--<div class="input-group custom-search-form">--%>
                            <%--<input type="text" class="form-control" placeholder="搜索...">--%>
                            <%--<span class="input-group-btn">--%>
                                <%--<button class="btn btn-default" type="button">--%>
                                    <%--<i class="fa fa-search"></i>--%>
                                <%--</button>--%>
                            <%--</span>--%>
                        <%--</div>--%>
                        <%--<!-- /input-group -->--%>
                    <%--</li>--%>
                    <li data-id="hotList">
                        <a href="#" class="text-center">
                            <i class="${menu.icon } fa-fw"></i> 热款推荐
                        </a>
                    </li>
                    <li data-id="dressList">
                        <a href="#" class="text-center">
                            <i class="${menu.icon } fa-fw"></i>查看商品
                        </a>
                    </li>
                    <li data-id="orderForm">
                        <a href="#" class="text-center">
                            <i class="${menu.icon } fa-fw"></i> 查看订单
                        </a>
                    </li>
                    <li data-id="userData">
                        <a href="#" class="text-center">
                            <i class="${menu.icon } fa-fw"></i> 个人资料
                        </a>
                    </li>
                    <li>
                        <a href="#" class="text-center"><i class="fa fa-sitemap fa-fw"></i>链接<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="register" class="text-center">注册</a>
                            </li>
                            <li>
                                <a href="login" class="text-center">登录</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                </ul>
            </div>
            <!-- /.sidebar-collapse -->
        </div>
        <!-- /.navbar-static-side -->
    </nav>
    <!-- Page Content -->
    <div id="page-wrapper">
    </div>
    <!-- /#page-wrapper -->

</div>





<script type="text/javascript" src="jquery/jquery-3.3.1.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="vendor/template/sb-admin-2.js"></script>
<script src="vendor/metisMenu/metisMenu.min.js"></script>
<script type="text/javascript">
    (function () {
        $("#page-wrapper").load("hotList");
    })();
    function showUserData() {
        $("#page-wrapper").load("userData")
    }
    $(function() {
        $("#side-menu").on("click", "li", function() {
            var sId = $(this).data("id"); //获取data-id的值
            if (sId!=undefined){
                loadInner(sId);
            }
        });

        function loadInner(sId) {
            var pathn;
            console.log(sId);
            $("#page-wrapper").load(sId); //加载相对应的内容
        }
    });
</script>



</body>
</html>
