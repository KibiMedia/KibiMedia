
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

  <!--========================================================
                            HEADER
  =========================================================-->
  <body>
<%@include file="header.jsp" %>

  <!--========================================================
                            CONTENT
  =========================================================-->
  <div class="container">
      <div class="row">
  <div>
  <h2 class="text-center">
             Видео
   </h2> 
              
        <c:forEach begin="0" end="${videoCount}" varStatus="loop"> 
            <c:if test="${(loop.index % 3) == 0}">
                <div class="row">
            </c:if>
            <div class="col-lg-4 col-xs-12 col-md-12">
               <p><iframe src=${video.get(loop.index).getHref()} frameborder="0" allowfullscreen></iframe>
            </div>
            <c:if test="${(loop.index % 3) == 2}">
                </div>
            </c:if>
         </c:forEach> 
            
  </div> 
  </div>
  </div>
 
    <!--========================================================
                            FOOTER
  =========================================================-->
  <%@include file="footer.jsp" %>
  </body>
