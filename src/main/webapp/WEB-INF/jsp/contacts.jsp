
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
    <link href="<c:url value="/resources/css/app.css" />" rel="stylesheet">



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
      
        <div class="sito animated fadeIn">
      <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2709.5954842492583!2d39.62720411491453!3d47.22449682228932!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x40e3b8b405014c77%3A0x4a02f18a21feb76b!2z0YPQuy4g0JfQvtGA0LPQtSwgMjEsINCg0L7RgdGC0L7Qsi3QvdCwLdCU0L7QvdGDLCDQoNC-0YHRgtC-0LLRgdC60LDRjyDQvtCx0LsuLCAzNDQxMDM!5e0!3m2!1sru!2sru!4v1464077863160" width="1797" height="599" frameborder="0" style="border:0" allowfullscreen></iframe>
</div>
    <section class="contatti-numeri ">
        <div class="container">
          <div class="row">
            <div class="col-md-3">
              <h2>Наши контакты</h2>
            </div>
            <div class="col-md-9">
              <p>

                  <span class="cont"><span aria-hidden="true" class="icona-phone"></span>
                  <span class="visible-lg">Телефон 1</span>
                  +7(???)???-??-??
                    </span>
                  <span class="cont">
                      <span aria-hidden="true" class="icona-file"></span>
                      <span class="visible-lg">Телефон 1 </span>
                      +7(???)???-??-??
                  </span>
                  <span class="cont mobile">
                      <span aria-hidden="true" class="icona-mobile"></span>
                      <span class="visible-lg">Cel. </span>+7(???)???-??-??
                  </span>
                  <span class="cont"><span aria-hidden="true" class="icona-envelope"></span>
                      <span class="visible-lg">Email </span>
                      <a href="mailto:info@riot.design">example@mail.run</a>
                  </span>
              </p>
            </div>
          </div>
        </div>
      </section>
<div class="bianco">
  <div class="container hidden-xs">
    <hr>
  </div>
</div>

    </main>

    <!--========================================================
                            FOOTER
  =========================================================-->
  <%@include file="footer.jsp" %>
  </div>


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <!-- Include all compiled plugins (below), or include individual files as needed -->         
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/resources/js/tm-scripts.js" />"></script>    
  <!-- </script> -->


  </body>
</html>
