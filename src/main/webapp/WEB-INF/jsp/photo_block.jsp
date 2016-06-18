<%-- 
    Document   : photo_block
    Created on : 30.05.2016, 12:54:26
    Author     : Сергей
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="col-md-4 col-sm-12 col-xs-12">
<div class="thumbnail thumb-shadow">
    <img src="resources/images${album.get(param.index).getMainPhoto()}" width="370" height="370" alt="">
    <div class="caption bg2"> <!--bg-primary  bg3-->
        <h4>
            ${album.get(param.index).getTitle()}
        </h4>
        <div class="wrap">
            <a href="photo?id=${album.get(param.index).getIdAlbum()}" class="btn-link fa-angle-right"></a>
        </div>  
    </div>
</div>              
</div>
