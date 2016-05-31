<%-- 
    Document   : one_news
    Created on : 26.05.2016, 14:29:13
    Author     : Сергей
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="header.jsp" %>

    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h2 class="panel-title text-center">${news.getTitle()}</h2>
            </div>
                <img style="float:left" src="resources/images${newsPhoto.getHrefImg()}" alt="">
            <div class="panel-body">
                <p>${news.getText()}</p>
            </div>
        </div>
    </div>
      
<%@include file="footer.jsp" %>
