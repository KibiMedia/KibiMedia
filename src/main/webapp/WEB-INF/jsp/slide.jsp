<%-- 
    Document   : slide
    Created on : 25.05.2016, 1:26:29
    Author     : DPosadsky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="item">
    <img src="resources/images/page-1_slide2.jpg" alt="">
    <div class="carousel-caption">
        <h3>${preview.get(param.index).getTitle()}</h3>
        <p>${preview.get(param.index).getDescription()}</p>
    </div>
</div>