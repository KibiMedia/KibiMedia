<%-- 
    Document   : change_video
    Created on : 26.05.2016, 14:04:51
    Author     : 1
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
<html>
<body>
    <head>
        <title>${action} Video</title>
    </head>    
    
    <div class="container">
        <div class="row">

            <form action="${action}" method="get">
                ID <br>
                <textarea class="form-control" type="text" name="id">${video.getIdVideo()}</textarea><br>
                Ссылка <br>
                <textarea class="form-control" type="text" name="href">${video.getHref()}</textarea><br>

                <input class="btn" type="submit" value="Сохранить"> 
                <input class="btn" type="reset" value="Отменить">

            </form>
        </div>
    </div>
</body>
</html>