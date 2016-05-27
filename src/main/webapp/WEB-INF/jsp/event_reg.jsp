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
          <div class="col-lg-6">
            <h4 class="text-center">Регистрация мероприятия</h4>
            <form action="params.jspx">
              <div class="form-group">
                <label>Название организации:</label>
                <input class="form-control" placeholder="организация" type="text" name="org" value="">
                <label class="label label-danger" id="loginLabel" style="display: none">Название организации должно содержать
                  только русские или латинские символы.</label>
              </div>
              <div class="form-group">
                <label>Название мероприятия:</label>
                <input  name="fevent" class="form-control" placeholder="мероприятие" type="text" name="event" value="">
                <label class="label label-danger" style="display: none">Название мероприятия должно содержать
                  только русские или латинские символы.</label>
              </div>
              <div class="form-group">
                <label>Краткое описание мероприятия:</label>
                <input name="description" class="form-control" placeholder="описание" type="text" name="description" value="">
                <label class="label label-danger" style="display: none">Описание должно содержать
                  только русские или латинские символы.</label>
              </div>
              <div class="form-group">
                <label>Контактный телефон:</label>
                <input class="form-control" placeholder="введите номер телефона" type="text" name="phone" value="">
                <label class="label label-danger" style="display: none">Телефон может содержать только цифры</label>
              </div>
              <div class="form-group">
                <label>ФИО ответственного мероприятия:</label>
                <input class="form-control" placeholder="введите ФИО" type="text" name="fullname" value="">
                <label class="label label-danger" style="display: none">Поле должно содержать
                  только русские или латинские символы</label>
              </div>
                
              <div class="form-group" id="submitReg">
                  
                  <a type="submit" class="btn btn-success" id="submitRegBtn" 
                     href="event_reg?org_event=${param.org}&param.name_event=name&param.description=description_event&param.phone=phone_event&param.fullname=lider_event"
                   >Зарегестрировать</a>
                <a type="submit" class="btn btn-warning" id="cancelRegBtn">Отменить</a>
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