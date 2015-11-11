

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="pt-br" class="initial">
    <head>
        <title>Contato | DigiMon</title>
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
                <div class="centro">

                    <!-- =======================NÃO EDITE ACIMA ====================-->

                    <h2>Fale Conosco</h2>
                    <form action="#" method="post" id="formularioJ">
                        ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                        <div class="rc">
                            <div class="campo">
                                <label for="nomeJ">Nome:</label><br> 
                                <input type="text" size="35" name="nome" id="nomeJ" class="campoObrig iLetras" maxlength="40" ><span id="x_nomeJ" class="tSpan"></span>
                            </div><br>
                            <div class="campo"> 
                                <label for="emailJ">Email:</label><br> 
                                <input type="text" size="35" name="email" id="emailJ"  class="campoObrig" maxlength="100" ><span id="x_emailJ" class="tSpan"></span>
                            </div>
                            <br>
                            <div class="campo">
                                <label for="assuntoJ">Assunto:</label><br>
                                <input type="text" name="assunto" id="assuntoJ"  class="campoObrig" maxlength="40"><span id="x_assuntoJ" class="tSpan"></span>
                            </div>
                            <br>
                            <div class="campo">
                                <textarea name="comentario" placeholder="Insira aqui a sua mensagem..." rows="12" cols="64"  class="campoObrig"></textarea><span id="x_comentarioJ" class="tSpan"></span>

                            </div>
                        </div>				
                        ----------------------------------------------------------------------------------------------------------------------------------------------------------------------
                        <div class="botoes" id="botoes">
                            <input type="reset" value="CANCELAR" name="Limpar" id="limparJ" class="botaoJ">
                            <input type="submit" value="ENVIAR" name="enviar" id="enviarJ" class="botaoJ">
                        </div><!--Fim div botoes-->
                    </form>



                    <!-- ===== NÃO EDITE A PARTIR DAQUI =========================================-->

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