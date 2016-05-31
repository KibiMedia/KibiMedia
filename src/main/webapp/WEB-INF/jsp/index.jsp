<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
                <c:forEach begin="0" end="2" varStatus="loop">
                    <jsp:include page="main_news.jsp" >
                        <jsp:param name="index" value="${loop.index}" />
                    </jsp:include>
                </c:forEach>
            </div>

          <!--<div class="row wow fadeIn" data-wow-duration='2s'>-->
            <div class="row">
                <c:forEach begin="3" end="5" varStatus="loop">
                    <jsp:include page="main_news.jsp" >
                        <jsp:param name="index" value="${loop.index}" />
                    </jsp:include>
                </c:forEach>
            </div>
        </div>        
      </section>
      
      <%@include file="welcome_to_our_company.jsp" %>

      <%@include file="our_service.jsp" %>

      <%@include file="big_text_pane.jsp" %>

      <!--<%@include file="our_clients.jsp" %>-->

    </main>

    <!--========================================================
                            FOOTER
  =========================================================-->
  <%@include file="footer.jsp" %>

