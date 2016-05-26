/**
 * Created by DPosadsky on 16.03.2015.
 */

$(function() {

    var countSuccessFields = 0;

    var formFieldsCount = 6;
    var formFieldsIsCorrest = new Array(formFieldsCount);
    for (var i = 0; i < formFieldsCount; ++i) {
        formFieldsIsCorrest[i] = false;
    }

    $('#login input').blur(function() {
        var loginLabel = $('#login label');
        if (!/[а-яА-Яa-zA-Z]+/.exec(this.value)) {
            loginLabel[1].style.display = 'block';
            formFieldsIsCorrest[0] = false;
        }
        else {
            loginLabel[1].style.display = 'none';
            formFieldsIsCorrest[0] = true;
        }
    });


    $('#e-mail input').blur(function() {
        var eMailLabel = $('#e-mail label');
        if (!/\w+\@\w+\.(ru|com|info|рф|net|org|biz|name|aero|arpa|edu|int|gov|mil|coop|museum|mobi|pro|tel|travel|xxx)/.exec(this.value)) {
            eMailLabel[1].style.display = 'block';
            formFieldsIsCorrest[2] = false;
        }
        else {
            eMailLabel[1].style.display = 'none';
            formFieldsIsCorrest[2] = true;
        }
    });


    var passwordInput = $('#password input');
    $('#password input').blur(function() {
        var passwordLabel = $('#password label');
        if (passwordInput[0].value.length < 8) {
            passwordLabel[1].style.display = 'block';
            formFieldsIsCorrest[4] = false;
        }
        else {
            passwordLabel[1].style.display = 'none';
            formFieldsIsCorrest[4] = true;
        }
    });

    var passwordRepeatInput = $('#passwordRepeat input');
    passwordRepeatInput.blur(function() {
        var passwordRepeatLabel = $('#passwordRepeat label');
        if (passwordInput[0].value !== passwordRepeatInput[0].value) {
            passwordRepeatLabel[1].style.display = 'block';
            formFieldsIsCorrest[5] = false;
        }
        else {
            passwordRepeatLabel[1].style.display = 'none';
            formFieldsIsCorrest[5] = true;
        }
    });

    $('#submitRegBtn').click(function() {
        for (var i = 0; i < formFieldsCount; ++i) {
            if (formFieldsIsCorrest[i] === false) {
                $('#submitReg label')[0].style.display = 'none';
                $('#submitReg label')[1].style.display = 'block';
                return;
            }
        }

        $('#submitReg label')[0].style.display = 'block';
        $('#submitReg label')[1].style.display = 'none';
    });

    $(document).ready(function() {

        $('#btnDelete div a').each(function(i, a) {
            a.click(function () {
                alert("fadf");
            });

        });

    });
});
