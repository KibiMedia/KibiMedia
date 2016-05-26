<%-- 
    Document   : news
    Created on : 26.05.2016, 14:35:30
    Author     : Сергей
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="header.jsp" %>

<div class="container">
    <h2 class="text-center">
      Новости             
    </h2>
    <c:forEach begin="0" end="${newsCount}" varStatus="loop">
        <c:if test="${(loop.index % 3) == 0}">
            <div class="row">
        </c:if>
        <jsp:include page="block_news.jsp" >
            <jsp:param name="index" value="${loop.index}" />
        </jsp:include>
        <c:if test="${(loop.index % 3) == 2}">
            </div>
        </c:if>
    </c:forEach>
</div>

<%@include file="footer.jsp" %>
