<%-- 
    Document   : login
    Created on : 21.06.2016, 12:30:13
    Author     : DPosadsky
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
<html>
<body>
    <head>
        <title>${action} Video</title>
    </head>    
    
    <div class="container">
        <div class="row">

            <form action="j_spring_security_check" method="post">
                Логин <br>
                <input class="form-control" type="text" name="j_username"/><br>
                Пароль <br>
                <input class="form-control" type="text" name="j_password"/><br>
                <checkbox name="_spring_security_remember_me"/>

                <input class="btn" type="submit" value="Сохранить"> 
                <input class="btn" type="reset" value="Отменить">

            </form>
        </div>
    </div>
</body>