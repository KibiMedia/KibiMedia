<%-- 
    Document   : header
    Created on : 19.05.2016, 15:38:07
    Author     : Натусик
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="format-detection" content="telephone=no"/>
    <link rel="icon" href="<c:url value="/resources/images/favicon.ico" />" type="image/x-icon">
    <title>${mainTitle}</title>

    <!-- Bootstrap -->
    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
  

    <!-- Links -->
    <link href="<c:url value="/resources/css/camera.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/search.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/google-map.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/js/fancybox/source/jquery.fancybox.css" />" rel="stylesheet">




    <!--JS-->
    <script src="<c:url value="/resources/js/jquery.js" />"></script>
    <script src="<c:url value="/resources/js/jquery-migrate-1.2.1.min.js" />"></script>
    <script src="<c:url value="/resources/js/rd-smoothscroll.min.js" />"></script>


    <!--[if lt IE 9]>
    <div style=' clear: both; text-align:center; position: relative;'>
        <a href="http://windows.microsoft.com/en-US/internet-explorer/..">
            <img src="images/ie8-panel/warning_bar_0000_us.jpg" border="0" height="42" width="820"
                 alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today."/>
        </a>
    </div>
    <script src="js/html5shiv.js"></script>
    <![endif]-->
    <script src="<c:url value="/resources/js/device.min.js" />"></script>

  </head>
  <body>
  <div class="page">
    <header>  
        <div class="container top-sect">
            <div class="col-lg-3">
                <div class="navbar-header">
                    <h1 class="navbar-brand">
                      <a data-type='rd-navbar-brand'  href="/">Киби<small>Медиа</small><small>Центр</small></a>
                    </h1>
                    <a class="search-form_toggle" href="#"></a>
                </div>
            </div>
            <div class="col-lg-6">
                <c:forEach begin="0" end="${topPagesCount}" varStatus="loop">
                    <h4 class="text-center">
                      <a href="<c:url value="${topPages.get(loop.index).getHref()}" />">${topPages.get(loop.index).getTitle()}</a>
                    </h4>
                </c:forEach>
            </div>
            <div class="col-lg-3">
                    <div class="help-box text-right">
                        <img class="text-right" src="${sfeduLogo}" width="200" height="200" alt="">
                    </div>
            </div>
        </div>            

        <div id="stuck_container" class="stuck_container">
            <div class="container">   
            <nav class="navbar navbar-default navbar-static-top pull-left">            
                <div class="">  
                    <ul class="nav navbar-nav sf-menu" data-type="navbar">
                        <c:forEach begin="0" end="${mainPagesCount}" varStatus="loop">
                            <li>
                              <a href="<c:url value="${mainPages.get(loop.index).getHref()}" />">${mainPages.get(loop.index).getTitle()}</a>
                            </li>
                        </c:forEach>
                    </ul>                           
                </div>
            </nav>   
            <form class="search-form" action="search.php" method="GET" accept-charset="utf-8">
                <label class="search-form_label">
                    <input class="search-form_input" type="text" name="s" autocomplete="off" placeholder=""/>
                    <span class="search-form_liveout"></span>
                </label>
                <button class="search-form_submit fa-search" type="submit"></button>
            </form>       
            </div>
        </div>  
    </header>
