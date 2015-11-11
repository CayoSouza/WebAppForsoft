

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sessao-e-permissionamento.jsp" %>

<%@ include file="head.jsp" %>
<body class="insideSystem ui025">
    <div id="interface">
        <%@ include file="header.jsp" %>  
        <span id="titlePag">Consultar Pesagem | DigiMon</span>
        <div id="main">
            <div class="centro">
                <!-- =======================NÃO EDITE ACIMA ====================-->

                <h1>Consulta de Pesagem</h1>	
                <form name="form" method="post" action="#" id="formularioJ" class="formulario">	
                    <fieldset>	
                        <br><br><div class="campo"> 
                            <label for="idJ">ID:</label><br> 
                            <input type="text" name="ID" id="idJ" size="12" class="campoObrig" disabled ><span id="x_idJ" class="tSpan"></span>
                        </div>
                        <div class="campo"> 
                            <label for="placaJ">Placa:</label><br> 
                            <input type="text" name="placa" id="placaJ" class="campoObrig"  placeholder=" Nº da Placa"><span id="x_placaJ" class="tSpan"></span>
                        </div>	
                    </fieldset>	
                    <fieldset>
                        <legend>Dados da Pesagem</legend>
                        <div class="campo"> 
                            <label for="pbtJ">Peso Bruto Total:</label><br> 
                            <input type="text" name="pbt" id="pbtJ" class="campoObrig" ><span id="x_pbtJ" class="tSpan"></span>
                        </div>
                        <div class="campo"> 
                            <label for="pesoEixoJ">Peso Eixo 1:</label><br> 
                            <input type="text" name="pesoEixo" id="pesoEixoJ" class="campoObrig" ><span id="x_pesoEixoJ" class="tSpan"></span>
                        </div>
                        <div class="campo"> 
                            <label for="pesoEixo2J">Peso Eixo 2:</label><br> 
                            <input type="text" name="pesoEixo2" id="pesoEixo2J" class="campoObrig" ><span id="x_pesoEixo2J" class="tSpan"></span>
                        </div>
                        <br>							
                    </fieldset>
                    <fieldset>
                        <legend>Dados do Veículo</legend>

                        <div class="campo"> 
                            <label for="pbtJ">Peso Bruto Total Máximo:</label><br> 
                            <input type="text" name="pbt" id="pbtJ" class="campoObrig"  placeholder="" disabled><span id="x_pbtJ" class="tSpan"></span>
                        </div>
                        <div class="campo"> 
                            <label for="pesoEixoJ">Peso Máximo por Eixo:</label><br> 
                            <input type="text" name="pesoEixo" id="pesoEixoJ" class="campoObrig" placeholder="" disabled><span id="x_pesoEixoJ" class="tSpan"></span>
                        </div>
                        <div class="campo"> 
                            <label for="quantidadeEixoJ">Quantidade de Eixos:</label><br> 
                            <input type="text" name="quantidadeEixo" id="quantidadeEixoJ" class="campoObrig" placeholder="" disabled><span id="x_quantidadeEixoJ" class="tSpan"></span>
                        </div>

                    </fieldset>

                    <fieldset>
                        <legend>Situação</legend>

                        <div class="campo"> 
                            <label for="pbtJ">Peso Bruto Total:</label><br> 
                            <input type="text" name="pbt" id="pbtJ" class="campoObrig"  placeholder="OK" disabled><span id="x_pbtJ" class="tSpan"></span>
                        </div>

                        <div class="campo"> 
                            <label for="pesoEixoJ">Peso por Eixo:</label><br> 
                            <input type="text" name="pesoEixo" id="pesoEixoJ" class="campoObrig" placeholder="OK" disabled><span id="x_pesoEixoJ" class="tSpan"></span>
                        </div>

                    </fieldset>

                    <div class="botoes" id="botoes">

                        <input type="reset" value="CANCELAR" name="Limpar" id="limparJ" class="botaoJ">
                        <input type="submit" value="ENVIAR" name="enviar" id="enviarJ" class="botaoJ">
                    </div>
                </form>

                <!-- ===== NÃO EDITE A PARTIR DAQUI =========================================-->

            </div><!--Fim div centro-->		
            <div id="clear"></div><!--Fim div clear-->
        </div><!--Fim div main conteúdo-->	
        <!-- Include do footer -->
        <%@ include file="footer.jsp" %> 
        <!-- Fim do include do footer-->
</body>
</html>