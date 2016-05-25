<%-- 
    Document   : slider
    Created on : 20.05.2016, 11:22:25
    Author     : DPosadsky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="carousel" class="carousel slide">
    <!--Индикаторы слайдов-->
    <ol class="carousel-indicators">
        <li class="active" data-target="#carousel" data-slide-to="0"></li>
        <c:forEach begin="1" end="${previewCount}" varStatus="loop">
            <li data-target="#carousel" data-slide-to="loop.index"></li>
        </c:forEach>
    </ol>

    <!--Слайды-->
    <div class="carousel-inner">
        <div class="item active">
            <img src="resources/images/page-1_slide1.jpg" alt="">
            <div class="carousel-caption">
                <h3>${preview.get(0).getTitle()}</h3>
                <p>${preview.get(0).getDescription()}</p>
            </div>
        </div>

        <c:forEach begin="1" end="${previewCount}" varStatus="loop">
            <jsp:include page="slide.jsp" >
                <jsp:param name="index" value="${loop.index}" />
            </jsp:include>
        </c:forEach>


        <!--Стрелки переключения слайдов-->
        <a href="#carousel" class="left carousel-control" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left"></span>
        </a>
        <a href="#carousel" class="right carousel-control" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right"></span>
        </a>
    </div>
</div>
   
    
    