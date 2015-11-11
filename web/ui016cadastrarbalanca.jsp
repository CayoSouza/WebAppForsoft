

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sessao-e-permissionamento.jsp" %>

<%@ include file="head.jsp" %>
<body class="insideSystem">
    <div id="interface">
        <span id="titlePag">Cadastrar Balança | DigiMon</span>
        <%@ include file="header.jsp" %>  
        <div id="main">
            <div class="centro">

                <!-- =======================NÃO EDITE ACIMA ====================-->
                <h1> Cadastro de Balança </h1>
                <form action="ServletUI016" method="post" id="formularioJ">
                    <fieldset>
                        <legend>Dados Balança</legend>
                        <div class="campo"> 
                            <label for="numSerieJ">Número Série:</label><br> 
                            <input type="text" name="numSerie" id="numSerieJ" size="10" class="campoObrig"><span id="x_numSerieJ" class="tSpan"></span>
                        </div>
                        <div class="campo"> 
                            <label for="fabricanteJ">Fabricante:</label><br> 
                            <input type="text" name="fabricante" id="fabricanteJ" maxlength="20" class="campoObrig"><span id="x_fabricanteJ" class="tSpan"></span>
                        </div>
                        <div class="campo"> 
                            <label for="modeloJ">Modelo:</label><br> 
                            <input type="text" name="modelo" id="modeloJ" maxlength="20" class="campoObrig"><span id="x_modeloJ" class="tSpan"></span>
                        </div>	
                        <div class="campo">
                            <label for="idPostoJ">Posto:</label><br>
                            <select id="idPostoJ" name="idPosto" class="campoObrig">
                                <option value="01">01</option>
                                <option value="02">02</option>
                                <option value="03">03</option>
                                <option value="04">04</option>
                                <option value="05">05</option>
                                <option value="06">06</option>
                                <option value="07">07</option>
                                <option value="08">08</option>
                                <option value="09">09</option>
                                <option value="10">10</option>
                            </select><span id="x_idPostoJ" class="tSpan"></span>
                        </div>
                    </fieldset>

                    <!--BOTÕES-->
                    <div class="botoes" id="botoes">
                        <input type="reset" value="Cancelar" name="Limpar" id="limparJ" class="botaoJ">
                        <input type="submit" value="ENVIAR" name="enviar" id="enviarJ" class="botaoJ">
                    </div>
                    <!--FIM BOTÕES-->	

                </form>

                <!-- ===== NÃO EDITE A PARTIR DAQUI =========================================-->

            </div><!--Fim div centro-->		
            <div id="clear"></div><!--Fim div clear-->
        </div><!--Fim div main conteúdo-->	
        <%@ include file="footer.jsp" %> 
    </div><!--Fim div Interface-->
</body>
</html>
