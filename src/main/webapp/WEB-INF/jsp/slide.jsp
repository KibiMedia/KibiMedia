<%-- 
    Document   : slide
    Created on : 25.05.2016, 1:26:29
    Author     : DPosadsky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="item">
    <img src="resources/images${previewPhotos.get(param.index).getHrefImg()}" alt="">
    <div class="carousel-caption">
        <h3><a href="previews?id=${previews.get(param.index).getIdPreview()}">${previews.get(param.index).getTitle()}</a></h3>
        <p>${previews.get(param.index).getDescription()}</p>
    </div>
</div>