<%-- 
    Document   : photo
    Created on : 26.05.2016, 11:39:50
    Author     : Сергей
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="header.jsp" %>

<div class="row">
    <c:forEach begin="0" end="5" varStatus="loop">
        <jsp:include page="main_news.jsp" >
            <jsp:param name="index" value="${loop.index}" />
        </jsp:include>
    </c:forEach>
</div>

<%@include file="footer.jsp" %>