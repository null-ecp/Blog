<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <meta charset="utf-8" name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0"/>
    <%-- 把编辑器的css放在这引用的原因是防止编辑器关于fa的css定义覆盖字体图标本身的css导致图标变形，无法正常显示 --%>
    <link href="${pageContext.request.contextPath}/static/editormd/css/editormd.preview.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/blog.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/fontawesome5.2.0/css/all.min.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/bootstrap3/js/bootstrap.min.js"></script>

<title>${title }</title>
<script type="text/javascript">
    function changeClass(obj) {
        var li = obj.parentNode; //获取父节点
        li.className = "active";
    }
</script>
<style type="text/css">
    body{
        padding-top:60px;
        padding-bottom:40px;
        background-color: #F5F5F5;
        font-family: microsoft yahei;
    }

</style>
</head>

<body>
    <div class="container">
        <%-- 顶部标题 --%>
        <div class="row">
            <jsp:include page="foreground/common/head.jsp"/>
        </div>
        <%-- 导航栏 --%>
        <div class="row" style="padding-top: 20px">
            <jsp:include page="foreground/common/menu.jsp"/>
        </div>
        <div class="row">
            <%-- 博客列表 --%>
            <div class="col-sm-9">
                <jsp:include page="${commonPage}"/>
            </div>
            <%-- 右侧列表 --%>
            <div class="col-sm-3">
                <jsp:include page="foreground/blog/rightList.jsp"/>
            </div>
        </div>

        <%-- 引入底部页面 --%>
        <div class="row">
            <jsp:include page="foreground/common/footer.jsp"/>
        </div>

    </div>
    <%--  百度分享js  --%>
    <script>
        window._bd_share_config = {
            "common" : {
                "bdSnsKey" : {},
                "bdText" : "",
                "bdMini" : "2",
                "bdMiniList" : false,
                "bdPic" : "",
                "bdStyle" : "0",
                "bdSize" : "32"
            },
            "share" : {},
            "image" : {
                "viewList" : [ "weixin", "tsina", "linkedin" ],
                "viewText" : "分享到：",
                "viewSize" : "24"
            },
            "selectShare" : {
                "bdContainerClass" : null,
                "bdSelectMiniList" : [ "weixin", "tsina", "linkedin" ]
            }
        };
        with (document)
            0[(getElementsByTagName('head')[0] || body)
                    .appendChild(createElement('script')).src =
                'http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='
                    + ~(-new Date() / 36e5)];
    </script>
</body>
</html>
