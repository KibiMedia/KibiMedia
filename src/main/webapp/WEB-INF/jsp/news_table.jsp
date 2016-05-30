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
            <table border="1" cellspacing="0" cellpadding="10">
            <tr>
            <th>Id</th>
            <th>Заголовок</th>
            <th>Описание</th>
            <th>Полный текст</th>
            <th>Id автора</th>
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
                    ${allNews.get(loop.index).getIdWriter()}
                </td>
                <td>
                    ${allNews.get(loop.index).getEventDate()}
                </td>
                <td>
                    ${allNews.get(loop.index).getIdImg()}
                </td>
                <td>
                    <a href="news/chng?id=${allNews.get(loop.index).getIdNews()}">Изменить новость</a>
                    <form action="/admin/news/del?id=${allNews.get(loop.index).getIdNews()}">
                        <button type="submit">Удалить новость</button>
                    </form>
                </td>
                </tr>
                
            </c:forEach>
            <tr>
                <td align=center colspan=8>
                    <form action="/admin/news/add">
                        <button type="submit">Добавить новость</button>
                    </form>
                </td>
                </tr>
            </table>
    </body>
</html>
