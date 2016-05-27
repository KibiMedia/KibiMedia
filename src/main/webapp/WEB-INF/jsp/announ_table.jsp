<%-- 
    Document   : announ_table
    Created on : 26.05.2016, 13:46:03
    Author     : 1
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <th>Id Aнонса</th>
            <th>Заголовок</th>
            <th>Описание</th>
            <th>Дата события</th>
            <th>Id фотографии</th>
            </tr>
            <tr>
            <c:forEach begin="0" end="${announCount}" varStatus="loop">
                <tr>
                <td>
                    ${announcements.get(loop.index).getIdAnnoncement()}
                </td>
                <td>
                    ${announcements.get(loop.index).getTitle()}
                </td>
                <td>
                    ${announcements.get(loop.index).getDescription()}
                </td>
                <td>
                    ${announcements.get(loop.index).getEventDate()}
                </td>
                <td>
                    ${announcements.get(loop.index).getIdImg()}
                </td>
                </tr>
            </c:forEach>
            </tr>
        </table>
    </body>
</html>
