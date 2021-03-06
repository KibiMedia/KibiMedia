<%-- 
    Document   : news_table
    Created on : 26.05.2016, 13:45:32
    Author     : 1
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin News</title>
    </head>
    <body>
        <p align="center">
            <a align="center" href="news/add">Добавить новость</a>
        </p>
        <h2 align="center"> Новости </h2>
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
            <c:forEach begin="0" end="${newsCount}" varStatus="loop">
                <tr>
                <td>
                    ${allNews.get(loop.index).getIdNews()}
                </td>
                <td>
                    ${allNews.get(loop.index).getTitle()}
                </td>
                <td>
                    ${allNews.get(loop.index).getDescription()}
                </td>
                <td>
                    ${allNews.get(loop.index).getText()}
                </td>
                <td>
                    ${allNews.get(loop.index).getEventDate()}
                </td>
                <td>
                    ${allNews.get(loop.index).getIdImg()}
                </td>
                <td>
                    <a href="news/change?id=${allNews.get(loop.index).getIdNews()}">Изменить</a>
                    <a href="news/del?id=${allNews.get(loop.index).getIdNews()}">Удалить</a>
                </td>
                </tr>
                
            </c:forEach>
            </table>
    </body>
</html>
