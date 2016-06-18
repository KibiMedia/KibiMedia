<%-- 
    Document   : preview_table
    Created on : 18.06.2016, 23:19:36
    Author     : DPosadsky
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin Preview</title>
    </head>
    <body>
        <p align="center">
            <a align="center" href="preview/add">Добавить анонс</a>
        </p>
        <h2 align="center"> Анонсы </h2>
        <table border="1" cellspacing="0" cellpadding="10">
            <tr>
                <th>Id</th>
                <th>Заголовок</th>
                <th>Описание</th>
                <th>Полный текст</th>
                <th>Дата события</th>
                <th>Id фотографии</th>
            </tr>
            <tr>
            <c:forEach begin="0" end="${previewsCount}" varStatus="loop">
                <tr>
                <td>
                    ${previews.get(loop.index).getIdPreview()}
                </td>
                <td>
                    ${previews.get(loop.index).getTitle()}
                </td>
                <td>
                    ${previews.get(loop.index).getDescription()}
                </td>
                <td>
                    ${previews.get(loop.index).getText()}
                </td>
                <td>
                    ${previews.get(loop.index).getEventDate()}
                </td>
                <td>
                    ${previews.get(loop.index).getIdImg()}
                </td>
                <td>
                    <a href="preview/change?id=${previews.get(loop.index).getIdPreview()}">Изменить</a>
                    <a href="preview/del?id=${previews.get(loop.index).getIdPreview()}">Удалить</a>
                </td>
                </tr>
                
            </c:forEach>
            </table>
    </body>
</html>
