

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sessao-e-permissionamento.jsp" %>

<%@ include file="head.jsp" %>
    <body class="insideSystem">
        <span id="titlePag">Consultar Rodovia | DigiMon</span>
        <div id="interface">
            <!-- begin header -->
            <%@ include file="header.jsp" %>  
            <!-- end header -->

            <div id="main">
                <div class="centro">

                    <!-- =======================NÃO EDITE ACIMA ====================-->

                    <h1>Consultar Rodovia</h1>
                    <form action="#" method="post" id="formularioJ">
                        <fieldset>
                            <legend>Dados Rodovia</legend>
                            <div class="campo"> 
                                <label for="idRodoviaJ">ID da Rodovia:</label><br> 
                                <input type="text" name="id" id="idRodoviaJ" class="campoObrig"  size="7" maxlength="40" disabled><span id="x_idRodoviaJ" class="tSpan"></span>
                            </div><!--Fim campo idRodovia-->
                            <div class="campo"> 
                                <label for="nomeJ">Nome:</label><br> 
                                <input type="text" name="nome" id="nomeJ" class="campoObrig"  size="30" maxlength="6" ><span id="x_nomeJ" class="tSpan"></span>
                            </div><!--Fim campo nomeJ-->
                            <div class="campo"> 
                                <label for="extensaoKMJ">Extensão KM:</label><br> 
                                <input type="text" name="extensaoKM" id="extensaoKMJ"  class="campoObrig" size="7" ><span id="x_extensaoKMJ" class="tSpan"></span>
                            </div><!--Fim campo extensaoKMJ-->
                            <div class="campo"> 
                                <label for="cidadeInicialJ">Cidade Inicial:</label><br> 
                                <input type="text" name="cidadeInicial" id="cidadeInicialJ"  size="48" maxlength="30" class="campoObrig iLetras" ><span id="x_cidadeInicialJ" class="tSpan"></span>
                            </div><!--Fim campo cidadeInicial-->
                            <div class="campo"> 
                                <label for="ufInicialJ">UF:</label><br> 
                                <select id="ufInicialJ" name="UF" > 
                                    <option value="AC">AC</option> 
                                    <option value="AL">AL</option> 
                                    <option value="AM">AM</option> 
                                    <option value="AP">AP</option> 
                                    <option value="BA">BA</option> 
                                    <option value="CE">CE</option> 
                                    <option value="DF">DF</option> 
                                    <option value="ES">ES</option> 
                                    <option value="GO">GO</option> 
                                    <option value="MA">MA</option> 
                                    <option value="MT">MT</option> 
                                    <option value="MS">MS</option> 
                                    <option value="MG">MG</option> 
                                    <option value="PA">PA</option> 
                                    <option value="PB">PB</option> 
                                    <option value="PR">PR</option> 
                                    <option value="PE">PE</option> 
                                    <option value="PI">PI</option> 
                                    <option value="RJ" selected>RJ</option> 
                                    <option value="RN">RN</option> 
                                    <option value="RO">RO</option> 
                                    <option value="RS">RS</option> 
                                    <option value="RR">RR</option> 
                                    <option value="SC">SC</option> 
                                    <option value="SE">SE</option> 
                                    <option value="SP">SP</option> 
                                    <option value="TO">TO</option>
                                </select><span id="x_ufInicialJ" class="tSpan"></span>
                            </div><!--Fim campo ufInicial-->
                            <div class="campo"> 
                                <label for="cidadeFinalJ">Cidade Final:</label><br> 
                                <input type="text" name="cidadeFinal" id="cidadeFinalJ"  size="48" maxlength="30" class="campoObrig iLetras" ><span id="x_cidadeFinalJ" class="tSpan"></span>
                            </div><!--Fim campo cidadeFinal-->
                            <div class="campo"> 
                                <label for="ufFinalJ">UF:</label><br> 
                                <select id="ufFinalJ" name="ufFinal" > 
                                    <option value="AC">AC</option> 
                                    <option value="AL">AL</option> 
                                    <option value="AM">AM</option> 
                                    <option value="AP">AP</option> 
                                    <option value="BA">BA</option> 
                                    <option value="CE">CE</option> 
                                    <option value="DF">DF</option> 
                                    <option value="ES">ES</option> 
                                    <option value="GO">GO</option> 
                                    <option value="MA">MA</option> 
                                    <option value="MT">MT</option> 
                                    <option value="MS">MS</option> 
                                    <option value="MG">MG</option> 
                                    <option value="PA">PA</option> 
                                    <option value="PB">PB</option> 
                                    <option value="PR">PR</option> 
                                    <option value="PE">PE</option> 
                                    <option value="PI">PI</option> 
                                    <option value="RJ" selected>RJ</option> 
                                    <option value="RN">RN</option> 
                                    <option value="RO">RO</option> 
                                    <option value="RS">RS</option> 
                                    <option value="RR">RR</option> 
                                    <option value="SC">SC</option> 
                                    <option value="SE">SE</option> 
                                    <option value="SP">SP</option> 
                                    <option value="TO">TO</option>
                                </select><span id="x_ufFinalJ" class="tSpan"></span>
                            </div><!--Fim campo ufFinal-->
                        </fieldset>
                        <div class="botoes" id="botoes">
                            <input type="reset" value="CANCELAR" name="Limpar" id="limparJ" class="botaoJ">
                            <input type="submit" value="ALTERAR" name="enviar" id="enviarJ" class="botaoJ">
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