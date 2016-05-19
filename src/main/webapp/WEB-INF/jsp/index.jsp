<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="format-detection" content="telephone=no"/>
    <link rel="icon" href="<c:url value="/resources/images/favicon.ico" />" type="image/x-icon">
    <title>HOME</title>

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
        <div class="camera_container">
          <div id="camera" class="camera_wrap">
            <div data-src="<c:url value="/resources/images/page-1_slide1.jpg" />">
              <div class="camera_caption fadeIn">
                <div class="jumbotron jumbotron1">
                  <em>
                    SUCCESS
                  </em>
                  <div class="wrap">
                    <p>
                      Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do<span> eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim</span>.
                    </p>
                    <a href="#" class="btn-link fa-angle-right"></a>
                  </div>  
                </div>
              </div>
            </div>
            <div data-src="<c:url value="/resources/images/page-1_slide2.jpg" />">
              <div class="camera_caption fadeIn">
                <div class="jumbotron jumbotron2">
                  <em>
                    quality
                  </em>
                  <div class="wrap">
                    <p>
                      Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do<span> eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim</span>.
                    </p>
                    <a href="#" class="btn-link hov_prime fa-angle-right"></a>
                  </div>  
                </div>
              </div>
            </div>
            <div data-src="<c:url value="/resources/images/page-1_slide3.jpg" />">
              <div class="camera_caption fadeIn">
                <div class="jumbotron">
                  <em>
                    SOLUTIONS
                  </em>
                  <div class="wrap">
                    <p>
                      Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do<span> eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim</span>.
                    </p>
                    <a href="#" class="btn-link fa-angle-right"></a>
                  </div>  
                </div>
              </div>
            </div>
          </div>
        </div>

        <div class="container center991">
          <div class="row">
            <%@include file="main_news.jsp" %>
            <%@include file="main_news.jsp" %>
            <%@include file="main_news.jsp" %>
          </div>

          <div class="row wow fadeIn" data-wow-duration='2s'>
            <%@include file="main_news.jsp" %>
            <%@include file="main_news.jsp" %>
            <%@include file="main_news.jsp" %>
          </div>
        </div>        
      </section>
      
      <section class="well well2 wow fadeIn  bg1" data-wow-duration='3s'>
        <div class="container">
        <h2 class="txt-pr">
        wELCOME
          <small>
            TO OUR COMPANY!
          </small>
        </h2>
          <div class="row">
            <div class="col-md-6 col-sm-12">
              <p>
                Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt. Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
              </p>
            </div>
            <div class="col-md-6 col-sm-12">
              <p>
                Ipsum dolor sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt. Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                <a href="#" class="btn-link l-h1 fa-angle-right"></a>
              </p>
            </div>
          </div>
        </div>
      </section>

      <section class="well well2">
        <div class="container">
        <h2>
          our
          <small>
            SERVICES
          </small>
        </h2>
          <div class="row offs1">
            <div class="col-md-6 col-sm-12">
              <ul class="link-list wow fadeInLeft" data-wow-duration='3s'>
                <li>

                  <a href="#">Excepteur sint occaecat cupidatat non</a>

                  <a href="#" class="btn-link l-h1 fa-angle-right"></a>
                </li>
                <li>

                  <a href="#">Lorem ipsum dolor sit amet</a>

                  <a href="#" class="btn-link l-h1 fa-angle-right"></a>
                </li>
                <li>

                  <a href="#">Conse ctetur adipisicing elit sed do</a>

                  <a href="#" class="btn-link l-h1 fa-angle-right"></a>
                </li>
                <li>

                  <a href="#">Eiusmod tempor incididunt</a>

                  <a href="#" class="btn-link l-h1 fa-angle-right"></a>
                </li>
              </ul>
            </div>
            <div class="col-md-6 col-sm-12">
              <img class="width_img" src="<c:url value="/resources/images/page-1_img6.jpg" />" alt="">
            </div>
          </div>
        </div>
      </section>

      <section class="well well3 parallax" data-url="<c:url value="/resources/images/parallax1.jpg" />" data-mobile="
      true" data-speed="0.9">
        <div class="container">
          <div class="wrap text-center">
            <strong>
              SAVE TIME,<br />
              SAVE MONEY,
              <small>
                GROW & SUCCEED
              </small>
            </strong>
            <p>
              Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip.
            </p>
            <a href="#" class="btn btn-primary">read more <span class="fa-angle-right"></span></a>
          </div>  
        </div>        
      </section>

      <section class="well well2">
        <div class="container">
          <h2>
            our 
            <small>
              clients
            </small>
          </h2>

          <div class="row offs1">
            <ul class="flex-list">
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a href="#">
                  <img src="<c:url value="/resources/images/page-1_img7.jpg" />" alt="">
                </a>  
              </li>
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a href="#">
                  <img src="<c:url value="/resources/images/page-1_img8.jpg" />" alt="">
                </a>  
              </li>
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a href="#">
                  <img src="<c:url value="/resources/images/page-1_img9.jpg" />" alt="">
                </a>  
              </li>
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a href="#">
                  <img src="<c:url value="/resources/images/page-1_img10.jpg" />" alt="">
                </a>  
              </li>
            </ul>

            <ul class="flex-list">
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a href="#">
                  <img src="<c:url value="/resources/images/page-1_img11.jpg" />" alt="">
                </a>  
              </li>
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a href="#">
                  <img src="<c:url value="/resources/images/page-1_img12.jpg" />" alt="">
                </a>  
              </li>
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a href="#">
                  <img src="<c:url value="/resources/images/page-1_img13.jpg" />" alt="">
                </a>  
              </li>
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a href="#">
                  <img src="<c:url value="/resources/images/page-1_img14.jpg" />" alt="">
                </a>  
              </li>
            </ul>
          </div>  
          
        </div>
      </section>

    </main>

    <!--========================================================
                            FOOTER
  =========================================================-->
  <%@include file="footer.jsp" %>
  </div>


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <!-- Include all compiled plugins (below), or include individual files as needed -->         
    <script src="js/bootstrap.min.js"></script>
    <script src="js/tm-scripts.js"></script>    
  <!-- </script> -->


  </body>
</html>
