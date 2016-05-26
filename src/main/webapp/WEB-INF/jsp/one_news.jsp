<%-- 
    Document   : one_news
    Created on : 26.05.2016, 14:29:13
    Author     : Сергей
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="header.jsp" %>

<h2>${news.getTitle()}</h2>

<p>
    ${news.getText()}
</p>

<%@include file="footer.jsp" %>
