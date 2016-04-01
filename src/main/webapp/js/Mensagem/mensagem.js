$(document).ready(function () {
    $('#idButao1').click(function () {
        var numero1 = $('#mensagemSucesso').val();
        $.ajax({
            type: "POST",
            url: "/Home/CalcularSoma",
            data: { a: numero1, b: numero2 },
            dataType: "json",
            success: function (resposta) {
                $('#messagem').text(resposta);
            }
        });
    })
    $('#idButao2').click(function () {
        var numero1 = $('#numeroA').val();
        var numero2 = $('#numeroB').val();
        $.ajax({
            type: "POST",
            url: "/Home/CalcularSubtracao",
            data: { a: numero1, b: numero2 },
            dataType: "json",
            success: function (resposta) {
                $('#resultado').text(resposta);
            }
        });
    })
});


