<%-- 
    Document   : site_creators
    Created on : 27.05.2016, 14:22:59
    Author     : Сергей
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="header.jsp" %>

<section class="well well4 bg1 wow fadeIn" data-wow-duration='3s'>
    <div class="container">
        <h2>
          Наша
          <small>
            Команда
          </small>
        </h2>
        <div class="row offs3 center767">
            <c:forEach begin="0" end="2" varStatus="loop">
                <jsp:include page="creator.jsp" >
                    <jsp:param name="index" value="${loop.index}" />
                </jsp:include>
            </c:forEach>
        </div>
    </div>
</section>    
  
    <!--========================================================
                            FOOTER
  =========================================================-->
  <%@include file="footer.jsp" %>

