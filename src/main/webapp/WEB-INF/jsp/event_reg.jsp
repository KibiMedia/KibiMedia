<%-- 
    Document   : reg
    Created on : 24.05.2016, 15:40:56
    Author     : 1
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

  <!--========================================================
                            HEADER
  =========================================================-->
   <%@include file="header.jsp" %>

    <div class="container">
        <div class="row">
          <div class="col-lg-6 col-lg-offset-3">
            <h4 class="text-center">Регистрация мероприятия</h4>
            <form action="event_reg" method="get">
              <div class="form-group">
                <label>Название организации (структурного подразделения):</label>
                <input class="form-control" placeholder="Полное наименование" type="text" name="org_name" value="">
                <label class="label label-danger" id="loginLabel" style="display: none">Название организации должно содержать
                  только русские или латинские символы.</label>
              </div>
              <div class="form-group">
                <label>Название мероприятия:</label>
                <input class="form-control" placeholder="Так будет отображаться в анонсах" type="text" name="event_name" value="">
                <label class="label label-danger" style="display: none">Название мероприятия должно содержать
                  только русские или латинские символы.</label>
              </div>
              <div class="form-group">
                <label>Краткое описание мероприятия:</label>
                <input name="description" class="form-control" placeholder="100-200 символов" type="text" name="description" value="">
                <label class="label label-danger" style="display: none">Описание должно содержать
                  только русские или латинские символы.</label>
              </div>
              <div class="form-group">
                <label>Контактный телефон ответственного:</label>
                <input class="form-control" placeholder="Например, +7(800)1234567" type="text" name="phone" value="">
                <label class="label label-danger" style="display: none">Телефон может содержать только цифры</label>
              </div>
              <div class="form-group">
                <label>ФИО ответственного:</label>
                <input class="form-control" placeholder="Полностью" type="text" name="full_name" value="">
                <label class="label label-danger" style="display: none">Поле должно содержать
                  только русские или латинские символы</label>
              </div>
              <div class="form-group" id="submitReg"> 
                <input class="btn btn-info" type="submit" value="Зарегистировать"> <input class="btn btn-warning" type="reset" value="Отменить">
                <br>
                <label class="label label-success" style="display: none">Вы успешно зарегистрированы!</label>
                <br>
                <label class="label label-danger" style="display: none">Заполните все поля!</label>
              </div>  
          

            </form>

          </div>
        </div>
      </div>
   
       <!--========================================================
                            FOOTER
        =========================================================-->
    <%@include file="footer.jsp" %>    

</body>
</html>