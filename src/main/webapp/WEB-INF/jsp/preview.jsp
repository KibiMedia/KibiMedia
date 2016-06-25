<%-- 
    Document   : preview
    Created on : 30.05.2016, 11:50:12
    Author     : Сергей
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="col-md-4 col-sm-12 col-xs-12">
    <a class="thumb" data-fancybox-group='1' href="news?id=${previews.get(param.index).getIdPreview()}">              
      <img class="" src="resources/images${previewsPhoto.get(param.index).getHrefImg()}" alt="">
      <span class='thumb_overlay'></span>
    </a>
    <p class="lead">
      ${previews.get(param.index).getTitle()} 
    </p>
    <p class="ins767-1">
      ${previews.get(param.index).getDescription()}   
      <a href="preview?id=${previews.get(param.index).getIdPreview()}" class="btn-link l-h1 fa-angle-right"></a>
    </p>
</div>

