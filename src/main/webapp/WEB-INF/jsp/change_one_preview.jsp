<%-- 
    Document   : change_one_preview
    Created on : 18.06.2016, 23:18:21
    Author     : DPosadsky
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
<html>
<body>


    <head>
        <title>${action} Preview</title>
    </head>    
    
    <div class="container">
        <div class="row">

            <form action="${action}" method="get">
                ID <br>
                <textarea class="form-control" type="text" name="id">${preview.getIdPreview()}</textarea><br>
                Заголовок <br>
                <textarea class="form-control" type="text" name="title">${preview.getTitle()}</textarea><br>
                Краткое описание <br>
                <textarea class="form-control" type="text" name="description">${preview.getDescription()}</textarea><br>
                Полный текст <br>
                <textarea class="form-control" type="text" name="text">${preview.getText()}</textarea><br>
                Дата (гггг-мм-дд) <br>
                <textarea class="form-control" type="text" name="event_date">${preview.getEventDate()}</textarea><br>
                ID изображения <br>
                <textarea class="form-control" type="text" name="id_img">${preview.getIdImg()}</textarea><br>

                <input class="btn" type="submit" value="Сохранить"> 
                <input class="btn" type="reset" value="Отменить">

            </form>
        </div>
    </div>
</body>
</html>
