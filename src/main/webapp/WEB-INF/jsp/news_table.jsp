<%-- 
    Document   : news_table
    Created on : 26.05.2016, 13:45:32
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                <td>
                ${allNews.get(loop.index).getIdNews()}
                </td>
            </c:forEach>
            </tr>
            <tr>
            <td>Текст</td>
            <td>Текст</td>
            <td>Текст</td>
            </tr>
            </table>-->
            ${allNews.get(0).getText()}
    </body>
</html>
