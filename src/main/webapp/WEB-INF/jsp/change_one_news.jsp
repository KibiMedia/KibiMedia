<%-- 
    Document   : change_one_news
    Created on : 30.05.2016, 10:41:34
    Author     : 1
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
<html>
<body>


    <head>
        <title>${action} News</title>
    </head>    
    
    <div class="container">
        <div class="row">

            <form action="${action}" method="get">
                ID <br>
                <textarea class="form-control" type="text" name="id">${news.getIdNews()}</textarea><br>
                Заголовок <br>
                <textarea class="form-control" type="text" name="title">${news.getTitle()}</textarea><br>
                Краткое описание <br>
                <textarea class="form-control" type="text" name="description">${news.getDescription()}</textarea><br>
                Полный текст <br>
                <textarea class="form-control" type="text" name="text">${news.getText()}</textarea><br>
                Дата (гггг-мм-дд) <br>
                <textarea class="form-control" type="text" name="event_date">${news.getEventDate()}</textarea><br>
                ID изображения <br>
                <textarea class="form-control" type="text" name="id_img">${news.getIdImg()}</textarea><br>

                <input class="btn" type="submit" value="Сохранить"> 
                <input class="btn" type="reset" value="Отменить">

            </form>
        </div>
    </div>
</body>
</html>
