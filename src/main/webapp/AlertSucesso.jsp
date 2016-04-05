<%-- 
    Document   : AlertSucesso
    Created on : 03/04/2016, 22:11:25
    Author     : José
--%>

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
    <div class="modal-content">
      <div class="modal-header align-center">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title text-success">Operação realizada com sucesso!</h4>
      </div>
      <div class="modal-footer">
          <a  href="matricularAluno.jsp" class="btn btn-success" data-dismiss="modal">Matricular outro ALUNO</a>
          <a  href="index.html" class="btn btn-danger" data-dismiss="modal">Finalizar</a>          
      </div>       
    </div>

  </div>
    </body>
</html>
