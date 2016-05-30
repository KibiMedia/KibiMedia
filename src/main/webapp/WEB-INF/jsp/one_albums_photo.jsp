<%-- 
    Document   : one_albums_photo
    Created on : 30.05.2016, 12:42:38
    Author     : Сергей
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="header.jsp" %>

<div class="container">
    <h2 class="text-center">${albumName}</h2>
    <c:forEach begin="0" end="${albumsPhotoCount}" varStatus="loop">
        <c:if test="${(loop.index % 3) == 0}">
            <div class="row">
        </c:if>
        <div class="col-lg-4 col-md-12 col-xs-12">
            <a class="fancybox" rel="gallery1" href="resources/images/${albumsPhoto.get(loop.index).getHref()}" title="">
                <img src="resources/images/${albumsPhoto.get(loop.index).getHref()}" alt="" />
            </a>
        </div>
        <c:if test="${(loop.index % 3) == 2}">
            </div>
        </c:if>
    </c:forEach>

</div>

<%@include file="footer.jsp" %>
