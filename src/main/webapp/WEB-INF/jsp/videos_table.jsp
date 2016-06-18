<%-- 
    Document   : video_table
    Created on : 19.06.2016, 0:02:39
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
            <a align="center" href="video/add">Добавить видео</a>
        </p>
        <h2 align="center"> Видео </h2>
        <table border="1" cellspacing="0" cellpadding="10">
            <tr>
                <th>Id</th>
                <th>Ссылка</th>
            </tr>
            <tr>
            <c:forEach begin="0" end="${videosCount}" varStatus="loop">
                <tr>
                <td>
                    ${videos.get(loop.index).getIdVideo()}
                </td>
                <td>
                    ${videos.get(loop.index).getHref()}
                </td>
                <td>
                    <a href="video/change?id=${videos.get(loop.index).getIdVideo()}">Изменить</a>
                    <a href="video/del?id=${videos.get(loop.index).getIdVideo()}">Удалить</a>
                </td>
                </tr>
                
            </c:forEach>
            </table>
    </body>
</html>
