<%-- 
    Document   : all_photos
    Created on : 26.05.2016, 13:48:27
    Author     : Сергей
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container">
    <div class="row">
        <c:forEach begin="0" end="${albumsPhotoCount}" varStatus="loop">
            <a class="fancybox" rel="gallery1" href="http://farm8.staticflickr.com/7308/15783866983_27160395b9_b.jpg" title="Rodeo Dusk (_JonathanMitchellPhotography_)">
                <img src="http://farm8.staticflickr.com/7308/15783866983_27160395b9_m.jpg" alt="" />
            </a>
        </c:forEach>

    </div>
</div>
