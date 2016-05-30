<%-- 
    Document   : change_one_news
    Created on : 30.05.2016, 10:41:34
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<form action="chng" method="get">

    <head>
        <title>Change News</title>
    </head>    
    
<table border="1" cellspacing="0" cellpadding="10">
            <tr>
            <th>Заголовок</th>
            <th>Описание</th>
            <th>Полный текст</th>
            <th>Id автора</th>
            <th>Дата события</th>
            <th>Id фото</th>
            </tr>

<tr>
   
    
    <td  valign=top>
    Заголовок*
    <input type="text" name="title" value="" size=37 maxlength=100></td>
    
    <td valign=top>
    Описание*
    <input type="text" name="description" value="" size=35  maxlength=5000>
    </td>
    
    <td  valign=top>
    Полный текст*
    <input type="text" name="text" value="" size=37  maxlength=5000>
    </td>
    
    <td  valign=top>
    ID автора*
    <input type="text" name="id_writer" value="" size=3  maxlength=5>
    </td>
    
    <td  valign=top>
    Дата события*
    <input type="text" name="event_date" value="" size=15  maxlength=15>
    </td>
    
    <td  valign=top>
    ID фото*
    <input type="text" name="id_img" value="" size=3  maxlength=5>
    </td>
    
</tr>

<tr>
    <td  align=center colspan=6>
        <input type="submit" value="Submit"> <input type="reset"
        value="Reset">
    </td>
</tr>

</table>
</form>
</body>
</html>
