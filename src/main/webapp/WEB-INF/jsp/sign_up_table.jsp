<%-- 
    Document   : sign_up_table
    Created on : 27.05.2016, 14:53:41
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
                    <form action="/admin/news/chng">
                        <button type="submit">Изменить новость</button>
                    </form>
                    <form action="/admin/news/del">
                        <button type="submit">Удалить новость</button>
                    </form>
                </td>
                </tr>
                
            </c:forEach>
            <tr>
                <td></td><td></td>
                <td></td><td></td>
                <td></td><td></td>
                <td></td>
                <td>
                    <form action="/admin/news/add">
                        <button type="submit">Добавить новость</button>
                    </form>
                </td>
                </tr>
            </table>
    </body>
</html>
