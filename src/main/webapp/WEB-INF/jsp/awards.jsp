
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

  <!--========================================================
                            HEADER
  =========================================================-->
<%@include file="header.jsp" %>

  <!--========================================================
                            CONTENT
  =========================================================-->
  <h2 class="text-center">
          <small>
           Награды
          </small>
  </h2>
  <img src="resources/images/awards.jpg">   
        <div class="container">
            <c:forEach begin="0" end="${awardsCount}" varStatus="loop">
                <div class="row">

                <p>
                    ${loop.index+1})  
                    ${awards.get(loop.index).getText()}
                </p>
                </div>
            </c:forEach>
        </div>
   
    <!--========================================================
                            FOOTER
  =========================================================-->
  <%@include file="footer.jsp" %>

