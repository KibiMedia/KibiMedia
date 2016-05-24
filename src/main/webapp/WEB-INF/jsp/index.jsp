<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
  <!--========================================================
                            HEADER
  =========================================================-->
   <%@include file="header.jsp" %>

  <!--========================================================
                            CONTENT
  =========================================================-->

    <main>        
      <section class="well well1 well1_ins1">
        

        <div class="container center991">
            <%@include file="slider.jsp" %>
            <div class="row">
                <%for (int i = 0; i < 3; i++) { %>
                    <%@include file="main_news.jsp" %>
                <% } %>
            </div>

          <!--<div class="row wow fadeIn" data-wow-duration='2s'>-->
          <div class="row">
            <%@include file="main_news.jsp" %>
            <%@include file="main_news.jsp" %>
            <%@include file="main_news.jsp" %>
          </div>
        </div>        
      </section>
      
      <%@include file="welcome_to_our_company.jsp" %>

      <%@include file="our_service.jsp" %>

      <%@include file="big_text_pane.jsp" %>

      <%@include file="our_clients.jsp" %>

    </main>

    <!--========================================================
                            FOOTER
  =========================================================-->
  <%@include file="footer.jsp" %>
  </div>


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <!-- Include all compiled plugins (below), or include individual files as needed --> 
    <script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="<c:url value="http://code.jquery.com/jquery-latest.min.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/resources/js/tm-scripts.js" />"></script>   
    
  <!-- </script> -->


  </body>
</html>
