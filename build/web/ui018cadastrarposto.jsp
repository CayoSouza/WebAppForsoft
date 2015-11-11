

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sessao-e-permissionamento.jsp" %>

<%@ include file="head.jsp" %>
<body class="insideSystem">
    <span id="titlePag">Cadastrar Posto | DigiMon</span>
    <div id="interface">
        <%@ include file="header.jsp" %>  
        <div id="main">
            <div class="centro">

                <!-- =======================NÃO EDITE ACIMA ====================-->
                <h1>Cadastro de Posto</h1>
                <form action="ServletUI018" method="post" id="formularioJ">
                    <fieldset>
                        <legend>Dados de Localização</legend>
                        <div class="campo"> 
                            <label for="kmJ">Km:</label><br>
                            <input type="text" name="km" class="campoObrig" id="kmJ" size="14" ><span id="x_kmJ" class="tSpan"></span>
                        </div>
                        <div class="campo">
                            <label for="idRodoviaJ">ID:</label><br>
                            <select id="idRodoviaJ" name="idRodovia" class="campoObrig">
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
                            </select><span id="x_idRodoviaJ" class="tSpan"></span>
                        </div><br>
                        <div class="campo"> 
                            <label for="latitudeJ">Latitude:</label> <br>
                            <input type="text" name="latitude" class="campoObrig" id="latitudeJ" ><span id="x_latitudeJ" class="tSpan"></span>
                        </div><br>
                        <div class="campo"> 
                            <label for="longitudeJ">Longitude:</label> <br>
                            <input type="text" name="longitude" class="campoObrig" id="longitudeJ" ><span id="x_longitudeJ" class="tSpan"></span>
                        </div><br>
                    </fieldset>		 

                    <div class="botoes" id="botoes">
                        <input type="reset" value="CANCELAR" name="Limpar" id="limparJ" class="botaoJ">
                        <input type="submit" value="ENVIAR" name="enviar" id="enviarJ" class="botaoJ">
                    </div><!--Fim div botoes-->
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