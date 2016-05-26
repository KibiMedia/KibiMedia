<%-- 
    Document   : block_news
    Created on : 26.05.2016, 23:08:46
    Author     : DPosadsky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="col-md-4 col-sm-12 col-xs-12">
    <a class="thumb" data-fancybox-group='1' href="resources/images${newsPhotos.get(param.index).getHrefImg()}">              
      <img class="" src="resources/images${newsPhotos.get(param.index).getHrefImg()}" alt="">
      <span class='thumb_overlay'></span>
    </a>
    <p class="lead">
      ${news.get(param.index).getTitle()} 
    </p>
    <p class="ins767-1">
      ${news.get(param.index).getDescription()}   
      <a href="news?id=${news.get(param.index).getIdNews()}" class="btn-link l-h1 fa-angle-right"></a>
    </p>
</div>
