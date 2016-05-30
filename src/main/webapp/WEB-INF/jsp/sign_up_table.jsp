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
        <title>Sign Up</title>
    </head>
    <body>
            <table border="1" cellspacing="0" cellpadding="10">
            <tr>
            <th>Id События</th>
            <th>Название события</th>
            <th>ФИО ответственного</th>
            <th>Название организации</th>
            <th>Телефон</th>
            <th>Описание</th>
            </tr>
            <tr>    
            <c:forEach begin="0" end="${eventsCount}" varStatus="loop">
                <tr>
                <td>
                    ${events.get(loop.index).getIdEvent()}
                </td>
                <td>
                    ${events.get(loop.index).getName()}
                </td>
                <td>
                    ${events.get(loop.index).getLeader()}
                </td>
                <td>
                    ${events.get(loop.index).getOrganization()}
                </td>
                <td>
                    ${events.get(loop.index).getPhone()}
                </td>
                <td>
                    ${events.get(loop.index).getDescription()}
                </td>
                <td>
                    <form action="/admin/sign_up/chng">
                        <button type="submit">Изменить событие</button>
                    </form>
                    <form action="/admin/sign_up/del">
                        <button type="submit">Удалить событие</button>
                    </form>
                </td>
                </tr>
                
            </c:forEach>
                
            </tr>
            <tr>
                <td></td><td></td>
                <td></td><td></td>
                <td></td><td></td>
                <td>
                    <form action="/admin/sign_up/add">
                        <button type="submit">Добавить событие</button>
                    </form>
                </td>
                </tr>
            </table>
    </body>
</html>
