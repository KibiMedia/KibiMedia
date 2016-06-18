
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

  <!--========================================================
                            HEADER
  =========================================================-->
<%@include file="header.jsp" %>

  <!--========================================================
                            CONTENT
  =========================================================-->
  <div>
  <h2 class="text-center">
          <small>
           Награды
          </small>
  </h2>
 
  <img src="<c:url value="resources/images/award.jpg" />">   
        <div class="container">
            <c:forEach begin="0" end="${awardCount}" varStatus="loop">
                <div class="row">

                <p>
                    ${loop.index+1})  
                    ${award.get(loop.index).getText()}
                </p>
                </div>
            </c:forEach>
        </div>
  </div>
    <!--========================================================
                            FOOTER
  =========================================================-->
  <%@include file="footer.jsp" %>

