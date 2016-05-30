<%-- 
    Document   : one_preview
    Created on : 30.05.2016, 11:59:11
    Author     : Сергей
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="header.jsp" %>

    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h2 class="panel-title text-center">${preview.getTitle()}</h2>
            </div>
            <div class="panel-body">
                <p>${preview.getText()}</p>
            </div>
        </div>
    </div>
      
<%@include file="footer.jsp" %>
