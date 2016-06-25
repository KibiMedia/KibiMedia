<%-- 
    Document   : files_upload
    Created on : 25.06.2016, 17:30:12
    Author     : DPosadsky
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
        
        <form action="add" enctype="multipart/form-data" method="get">
           <input type="file" min="1" max="9999" name="file[]" multiple="true" />
           <input type="submit" value="Сохранить">
        </form>

    </body>
</html>
