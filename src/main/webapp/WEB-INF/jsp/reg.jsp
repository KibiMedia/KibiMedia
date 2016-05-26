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
                <h4 class="text-center">Регистрация</h4>
                <form>
                    <div class="form-group" id="firstName">
                        <label>Введите логин:</label>
                        <input class="form-control" placeholder="Введите имя">
                        <label class="label label-danger" id="firstNameLabel" style="display: none">Логин должно содержать
                            только русские или латинские символы.</label>
                    </div>
                    <div class="form-group" id="e-mail">
                        <label>Адрес электронной почты:</label>
                        <input class="form-control" placeholder="e-mail">
                        <label class="label label-danger" style="display: none">e-mail должен иметь вид
                        example@example.com</label>
                    </div>
                    <div class="form-group" id="password">
                        <label>Пароль:</label>
                        <input class="form-control" type="password" placeholder="Не менее 8 символов">
                        <label class="label label-danger" style="display: none">Пароль должен содержать не менее 8
                            символов</label>
                    </div>
                    <div class="form-group" id="passwordRepeat">
                        <label>Повторите пароль:</label>
                        <input class="form-control" type="password" placeholder="Пароль еще раз">
                        <label class="label label-danger" style="display: none">Пароли не совпадают</label>
                    </div>
                    <div class="form-group">
                        <label>Пол:</label>
                        <div class="radio">
                            <label>
                                <input type="radio" name="optionsRadios" checked> Мужской
                            </label>
                        </div>
                        <div class="radio">
                            <label>
                                <input type="radio" name="optionsRadios"> Женский
                            </label>
                            <label class="label label-danger" style="display: none">Отметьте галочкой Ваш пол</label>
                        </div>
                    </div>
                    <div class="form-group" id="submitReg">
                        <a type="submit" class="btn btn-success" id="submitRegBtn">Регистрация</a>
                        <a type="submit" class="btn btn-warning" id="cancelRegBtn">Отказаться</a>
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

    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
    <script src="resources/js/source.js"></script>

</body>
</html>