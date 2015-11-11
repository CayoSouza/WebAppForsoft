

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sessao-e-permissionamento.jsp" %>

<%@ include file="head.jsp" %>
<body class="insideSystem">
    <div id="interface">
        <span id="titlePag">Cadastrar Rodovia | DigiMon</span>
        <!-- begin header -->
        <%@ include file="header.jsp" %>  
        <!-- end header -->

        <div id="main">
            <div class="centro">

                <!-- =======================NÃO EDITE ACIMA ====================-->

                <h1>Cadastro de Rodovia</h1>
                <form action="ServletUI014" method="post" id="formularioJ">
                    <fieldset>
                        <legend>Dados Rodovia</legend>
                        <div class="campo"> 
                            <label for="nomeJ">Nome:</label><br> 
                            <input type="text" name="nome" id="nomeJ" class="campoObrig" placeholder="Nome da rodovia" size="37" maxlength="6"><span id="x_nomeJ" class="tSpan"></span>
                        </div>
                        <div class="campo"> 
                            <label for="extensaoKMJ">Extensão KM:</label><br> 
                            <input type="text" name="extensaoKm" id="extensaoKMJ" placeholder="km" class="campoObrig" size="10"><span id="x_extensaoKMJ" class="tSpan"></span>
                        </div>
                        <div class="campo"> 
                            <label for="cidadeInicialJ">Cidade Inicial:</label><br> 
                            <input type="text" name="cidadeInicial" id="cidadeInicialJ" placeholder="Cidade Inicial" size="46" maxlength="30" class="campoObrig iLetras"><span id="x_cidadeInicialJ" class="tSpan"></span>
                        </div>
                        <div class="campo"> 
                            <label for="ufInicialJ">UF:</label><br> 
                            <select id="ufInicialJ" name="ufInicial"> 
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
                        </div>
                        <div class="campo"> 
                            <label for="cidadeFinalJ">Cidade Final:</label><br> 
                            <input type="text" name="cidadeFinal" id="cidadeFinalJ" placeholder="Cidade Final" size="46" maxlength="30" class="campoObrig iLetras"><span id="x_cidadeFinalJ" class="tSpan"></span>
                        </div>
                        <div class="campo"> 
                            <label for="ufFinalJ">UF:</label><br> 
                            <select id="ufFinalJ" name="ufFinal"> 
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
                        </div>
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