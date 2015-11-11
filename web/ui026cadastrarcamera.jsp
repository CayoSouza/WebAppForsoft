

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sessao-e-permissionamento.jsp" %>

<!DOCTYPE HTML>
<html lang="pt-br">
    <!-- Head -->
    <%@ include file="head.jsp" %>
    <!-- fim Head -->
    <body class="insideSystem ui025">
        <div id="interface">
            <!-- begin header -->
            <%@ include file="header.jsp" %>  
            <!-- end header -->
            <span id="titlePag">Cadastrar Câmera | DigiMon</span>

            <div id="main">
                <div class="centro">

                    <!-- =======================NÃO EDITE ACIMA ====================-->

                    <h1>Cadastro de Câmera</h1>
    				<form action="ServletUI026" method="post" id="formularioJ">
					<fieldset>
						<legend>Dados da Câmera</legend><br>
						<div class="campo"> 
                            <label for="fabricanteJ">Fabricante :</label> <br>
                            <input type="text" name="fabricante" class="campoObrig iLetras"  maxlength="20" id="fabricanteJ"><span id="x_fabricanteJ" class="tSpan"></span>
                        </div><br>
                        <div class="campo"> 
                            <label for="modeloJ">Modelo:</label> <br>
                            <input type="text" name="modelo" class="campoObrig" maxlength="20" id="modeloJ"><span id="x_modeloJ" class="tSpan"></span>
                        </div><br>
                        <div class="campo"> 
                            <label for="numserieJ">Número de Série:</label> <br>
                            <input type="text" name="numserie" class="campoObrig" maxlength="15" id="numserieJ" ><span id="x_numserieJ" class="tSpan"></span>
                        </div><br>
						<div class="campo">
							<label for="idRodoviaJ" >ID Rodovia:</label><br>
								<select id="idRodoviaJ" name="idRodovia" class="campoObrig">
										<option value="01">0001</option>
										<option value="02">0002</option>
										<option value="03">0003</option>
										<option value="04">0004</option>
										<option value="05">0005</option>
										<option value="06">0006</option>
										<option value="07">0007</option>
										<option value="08">0008</option>
										<option value="09">0009</option>
										<option value="10">0010</option>
								</select><span id="x_idRodoviaJ" class="tSpan"></span>
						</div><br>
						<div class="campo">
							<label for="kmJ">Km:</label><br>
							<input type="text" name="km" class="campoObrig" id="kmJ" size="20" ><span id="x_kmJ" class="tSpan"></span>
						</div><br>
					</fieldset>	
					<fieldset>
						<legend>Dados de Localização</legend>
						<br>
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
             <%@ include file="footer.jsp" %> 
        </div><!--Fim div Interface-->
    </body>
</html>