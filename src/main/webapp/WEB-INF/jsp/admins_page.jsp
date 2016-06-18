<%-- 
    Document   : aAdmin_page
    Created on : 26.05.2016, 11:51:40
    Author     : 1
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
<html>
    <!DOCTYPE html>
<html lang="en">
    <head>
    <header>  
        <div class="container top-sect">
            <div class="navbar-header">
                <h1 class="navbar-brand">
                  <a data-type="rd-navbar-brand"> Панель администратора</a>
                </h1>
            </div>
        </div>

        <div id="stuck_container" class="stuck_container">
            <div class="container">   
            <nav class="navbar navbar-default navbar-static-top pull-left">            
                <div class="">  
                    <ul class="nav navbar-nav sf-menu sf-js-enabled sf-arrows" data-type="navbar">

                            <li>
                              <a href="<c:url value="admin/news" />">Новости</a>
                            </li>

                            <li>
                              <a href="<c:url value="admin/preview" />">Анонсы</a>
                            </li>

                            <li>
                              <a href="<c:url value="admin/photo" />">Фото</a>
                            </li>

                            <li>
                              <a href="<c:url value="admin/video" />">Видео</a>
                            </li>

                            <li>
                              <a href="<c:url value="admin/sign_up" />">Записавшиеся</a>
                            </li>

                    </ul>                           
                </div>
            </nav>   
            </div>
        </div>  
    </header>
</head>

</html>
