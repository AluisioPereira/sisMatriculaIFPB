<%-- 
    Document   : cadastroCliente
    Created on : 06/03/2016, 18:44:56
    Author     : Aluísio
--%>

<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Matrícula Aluno</title>
        <link href='http://fonts.googleapis.com/css?family=Oswald' rel='stylesheet' type='text/css'> 
        <link href="css/slick.css" rel="stylesheet">     
        <link href="css/theme-red.css" rel="stylesheet">   
        <link href="css/theme.css" rel="stylesheet">	 
        <link href="style.css" rel="stylesheet" title="default">
        <link href="contraste.css" rel=" alternate stylesheet" title="contraste">
        <link href="aluisioIcomoon/style.css" rel="stylesheet" title="default">
        <link href="css/style.css" type="text/css" rel="stylesheet">
        <script language="JavaScript" type="text/javascript" src="js/cpf/validarCPFData.js"></script> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body style="padding: 1% 8% 4% 8%">

        <header style="text-align: center">
            <%@ include file="cabecalho.jsp"%>
        </header>
        <div id="mensagemFrancaco"style="display:none " class="alert alert-warning" role="alert">
            <span id="messagem">Messagem:</span>
        </div>
        <div id="mensagemSucesso"style="display:none " class="alert alert-success" role="alert">
            <span>Messagem:</span>
        </div>
        <div class="page-header">
            <div class="alert alert-info" role="alert">
                <h4 >NOVA MATRÍCULA: Informações do(a) aluno(a):<br><h6><span style="color:#ff3333">Realize o preenchimento correto de todos os campos!</span></h6><hr></h4>
                <form class="form-horizontal" name="form1" method="post" action="Control?seek=AlunoCadastrar">
                    <fieldset>
                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="Nome" >Nome:</label>  
                            <div class="col-md-4">
                                <input id="nome" name="Nome" type="text"  pattern="[A-Za-z]+$" placeholder="Ex.: João" class="form-control input-md">

                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="sobrenome">Sobrenome:</label>  
                            <div class="col-md-4">
                                <input id="sobrenome" name="sobreNome" type="text"  pattern="[A-Za-z]+" placeholder="Ex.: Silva" class="form-control input-md">
                            </div>
                        </div>

                        <!-- Select Basic -->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="sexo">Sexo:</label>
                            <div class="col-md-3">
                                <select id="sexo" name="sexo" class="form-control">
                                    <option value="masculino">masculino</option>
                                    <option value="feminino">feminino</option>
                                </select>
                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="dataNascimento">Data nascimento:</label>  
                            <div class="col-md-3">
                                <input id="data" name="dataNascimento" type="text" placeholder="Ex.:01/01/1991" class="form-control input-md" onkeypress="MascaraData(form1.data)"  
                                       maxlength="10" onblur= "ValidaData(form1.data);">
                            </div>
                        </div>

                        <!-- Select Basic -->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="nacionalidade">Nacionalidade:</label>
                            <div class="col-md-3">
                                <select id="nacionalidade" name="nacionalidade" class="form-control" >
                                    <option value="argentino(a)">Argentina/argentino(a)</option>
                                    <option value="boliviano(a)">Bolívia/boliviano(a)</option>
                                    <option value="brasileiro(a)" selected>Brasil/brasileiro(a)</option>
                                    <option value="chileno(a)">Chile/chileno(a)</option>
                                    <option value="colombiano(a)">Colômbia/colombiano(a)</option>
                                    <option value="equatoriano(a)">Equador/equatoriano(a)</option>
                                    <option value="guianês ou guianense">Guiana/guianês ou guianense</option>
                                    <option value="guianense">Guiana Francesa/guianense</option>
                                    <option value="paraguaio(a)">Paraguai/paraguaio(a)</option>
                                    <option value="peruano(a)">Peru/peruano(a)</option>
                                    <option value="surinamês">Suriname/surinamês</option>
                                    <option value="uruguaio(a)">Uruguai/uruguaio(a)</option>
                                    <option value="venezuelano(a)">Venezuela/venezuelano(a)</option>
                                </select>
                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="rg">RG e Órgão emissor:</label>  
                            <div class="col-md-3">
                                <input id="rg" name="rg" type="text" placeholder="Ex.: 1.333.333/SSP" class="form-control input-md">
                            </div>
                        </div>


                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="cpf">CPF:</label>  
                            <div class="col-md-3">
                                <input id="cpf" name="cpf" type="text" placeholder="Ex.:111.222.333-44" class="form-control input-md" onblur="ValidarCPF(form1.cpf);" onkeypress="MascaraCPF(form1.cpf);" maxlength="14">

                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="reservista">Reservista: </label>  
                            <div class="col-md-2">
                                <input id="reservista" name="reservista" type="text" placeholder="Ex.: 425715-S" class="form-control input-md">
                            </div>
                        </div>

                        <!-- Button (Double) -->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="idButao1"></label>
                            <div class="col-md-8">
                                <button id="idButao1" name="idButao1" class="btn btn-success">Matricular</button>
                                <button id="idButao2" name="idButao2" class="btn btn-danger">Cancelar</button>
                            </div>
                        </div>

                    </fieldset>


                </form>

            </div>


            <hr>
            <br>

            <%@include file="mapaIFPB.jsp" %>
            <%@ include file="rodape.jsp"%>
            </body>
            </html>
