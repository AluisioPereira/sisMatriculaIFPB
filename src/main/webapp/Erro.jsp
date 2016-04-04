<%-- 
    Document   : Erro
    Created on : 03/04/2016, 22:17:40
    Author     : José
--%>


<%@page import="java.util.Collection"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/animate.css/animate.min.css">
        <link rel="stylesheet" href="assets/mobirise/css/style.css">
        <link rel="stylesheet" href="assets/mobirise/css/mbr-additional.css" type="text/css">

    </head>

    <body>
        <div class="modal-dialog">
            <!-- Modal content-->
            <div class="modal-content alert alert-warning">
                <div>
                    <h4 class="modal-title text-danger">Matrícula não foi realizada.</h4>
                    <h4 class="modal-title text-danger">Aluno já matrículado ou há informações inválidas!</h4>                    
                </div>
                <div class="modal-footer">
                    <a  href="matricularAluno.jsp" class="btn btn-primary" data-dismiss="modal">Voltar</a>
                </div>
            </div>
        </div>
    </body>
</html>

