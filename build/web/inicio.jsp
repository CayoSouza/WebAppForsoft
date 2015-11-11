

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="pt-br" class="initial">
    <head>
        <title>Bem-vindo</title>
        <link rel="stylesheet" type="text/css" href="dist/css/estilo.css">
        <link href='https://fonts.googleapis.com/css?family=Cantarell:400,700' rel='stylesheet' type='text/css'>
        <link rel="icon" type="image/png" sizes="32x32" href="dist/imagens/favicon-32x32.png">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="dist/js/novo.js" defer=""></script>
    </head>
    <body class="home">
        <div id="interface">
            <!-- begin header -->
            <%@ include file="headerhome.jsp" %>  
            <!-- end header -->

            <div id="main">
                <div class="centro" >
                    <div class="logo">
                        <img src="dist/imagens/teste.png"  id="logoo" alt="Logo"/><br>
                        <span class="saibaMais">Saiba Mais</span>
                    </div>
                </div><!--Fim div centro-->		
                <div id="clear"></div><!--Fim div clear-->
            </div><!--Fim div main conteúdo-->	
            <div id="rodape">
                <div class="main">
                    <div id="footer">
                        &copy 2015 - Projeto Digimon | Forsoft Rio
                    </div><!--Fim div Footer-->
                </div><!--Fim div main do rodape-->
            </div><!--Fim div "rodape"-->
        </div><!--Fim div Interface-->
    </body>
</html>