<%-- 
    Document   : footer
    Created on : 19.05.2016, 15:43:04
    Author     : Натусик
--%>

<%@page contentType="text/html" pageEncoding="utf-8"%>
<footer class="content-info" role="contentinfo" style="display: block;">
    <div class="container">
        <div class="row">
            <div class="col-lg-4">
                <div class="content">
                    <a href="#"><i class="fa fa-vk fa-3x" aria-hidden="true"></i> </a>
                    <a href="#"><i class="fa fa-twitter-square fa-3x"></i> </a>
                    <a href="#"><i class="fa fa-facebook-official fa-3x"></i> </a>
                    <a href="#"><i class="fa fa-instagram fa-3x" aria-hidden="true"></i> </a>
                </div>
            </div>
            <div class="col-lg-4">
                <div class="content">
                    <c:forEach begin="0" end="${footerPagesCount}" varStatus="loop">
                    <ul>
                        <a href="<c:url value="${footerPages.get(loop.index).getHref()}" />">${footerPages.get(loop.index).getTitle()}</a>
                    </ul>
                    </c:forEach>
                </div>
                </div>
            <div class="col-lg-4">
                <div class="content">
                    <h7>Электронная почта <small>exampl@mail.ru</small></h7><br>
                    <h7>Телефон <small>+7(???)???-??-??</small></h7>
                </div>
            </div>
        </div>
        <div class="row">
            <p class="copyright"> © 2016 КИБИ Медиа центр ЮФУ </p>
        </div>
    </div>
</footer>
                    
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
