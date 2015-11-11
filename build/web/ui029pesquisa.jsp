

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="pt-br">
    <!-- Não utilizar o include head.jsp neste arquivo -->
    <head>
        <title>Pesquisa | DigiMon</title>
        <link rel="stylesheet" type="text/css" href="dist/css/estilo.css">
        <link rel="icon" type="image/png" sizes="32x32" href="dist/imagens/favicon-32x32.png">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="dist/js/novo.js" defer=""></script>
        <script type="text/javascript" src="dist/js/pesquisa.js" defer=""></script>
    </head>   
    <body class="pesquisa">
     <span id="titlePag">Pesquisa | DigiMon</span>
        <div id="interface">


            <!-- begin header -->
            <%@ include file="header.jsp" %>  
            <!-- end header -->
            <div id="main">
                <div class="centro" id="centro">
                    <form action="" method="post" id="formPrincipal" class="formularioP">
                        <div class="campo" id="principal"> 
                            <label for="pesquisaJ">Pesquisar Por</label><br> 
                            <select id="pesquisaJ" name="pesquisa"> 
                                <option selected>Selecione</option>
                                <option value="VEICULO">Veículo</option>
                                <option value="TRANSPORTADOR">Transportador</option>
                                <option value="PESSOA_JURIDICA">Pessoa Jurídica</option>
                                <option value="PESSOA_FISICA">Pessoa Física</option>
                                <option value="MOTORISTA">Motorista</option>
                                <option value="CARGA">Carga</option>
                                <option value="PRODUTO">Produto</option>
                                <option value="FRETE">Frete</option>
                            </select><span id="x_pesquisaJ" class="tSpan"></span>
                        </div>
                        <!--<div class="botoes" id="botoes">
                            <input type="reset" value="CANCELAR" name="Limpar" id="limparJ" class="botaoJ">
                            <input type="submit" value="ENVIAR" name="enviar" id="enviarJ" class="botaoJ">
                        </div><!--Fim div botoes-->
                    </form>
                    <form action="ServletUI029" method="post" id="formVeiculo" class="formularioP">
                        <div class="campo">
                            <label for="placaJ">Placa</label><br> 
                            <input type="text" name="placa" id="placaJ" placeholder="AAA-0000" maxlength="8"><span id="x_placaJ" class="tSpan"></span>
                        </div>
                        <img src="dist/imagens/lupa.png" id="lupa"/>
                    </form>
                    <form action="ServletUI029" method="post" id="formMotorista" class="formularioP">
                        <div class="campo">
                            <label for="nomeJ">Nome</label><br> 
                            <input type="text" name="nome" id="nomeJ" class="iLetras"><span id="x_nomeJ" class="tSpan"></span>
                        </div>
                        <div class="campo">
                            <label for="cnhJ">CNH</label><br> 
                            <input type="text" name="cnh" id="cnhJ" ><span id="x_cnhJ" class="tSpan"></span>
                        </div>
                    </form>
                    <form action="ServletUI029" method="post" id="formTransportador" class="formularioP">
                        <div class="campo">
                            <label for="cnpjJ">CNPJ</label><br> 
                            <input type="text" name="cnpj" id="cnpjJ"><span id="x_cnpjJ" class="tSpan"></span>
                        </div>    
                        <div class="campo">
                            <label for="nomeJ">Nome</label><br> 
                            <input type="text" name="nome" id="nomeJ" class="iLetras"><span id="x_nomeJ" class="tSpan"></span>
                        </div>
                        <div class="campo">
                            <label for="rntrcJ">RNTRC</label><br> 
                            <input type="text" name="rntrc" id="rntrcJ"><span id="x_rntrcJ" class="tSpan"></span>
                        </div>

                    </form>
                    <form action="ServletUI029" method="post" id="formPJ" class="formularioP">
                        <div class="campo">
                            <label for="cnpjJ">CNPJ</label><br> 
                            <input type="text" name="cnpj" id="cnpjJ"><span id="x_cnpjJ" class="tSpan"></span>
                        </div>    
                        <div class="campo">
                            <label for="nomeJ">Nome</label><br> 
                            <input type="text" name="nome" id="nomeJ" class="iLetras"><span id="x_nomeJ" class="tSpan"></span>
                        </div>
                    </form>
                    <form action="ServletUI029" method="post" id="formCarga" class="formularioP">
                        <div class="campo">
                            <label for="tipoJ">Tipo</label><br> 
                            <input type="text" name="tipo" id="tipoJ"><span id="x_tipoJ" class="tSpan"></span>
                        </div>    
                        <div class="campo">
                            <label for="remetenteJ">Remetente</label><br> 
                            <input type="text" name="remetente" id="remetenteJ" class="iLetras"><span id="x_remetenteJ" class="tSpan"></span>
                        </div>
                        <div class="campo">
                            <label for="destinatarioJ">Destinatário</label><br> 
                            <input type="text" name="destinatario" id="destinatarioJ"><span id="x_destinatarioJ" class="tSpan"></span>
                        </div>
                    </form>
                    <form action="ServletUI029" method="post" id="formPF" class="formularioP">
                        <div class="campo">
                            <label for="cpfJ">CPF</label><br> 
                            <input type="text" name="cpf" id="cpfjJ"><span id="x_cpfJ" class="tSpan"></span>
                        </div>    
                        <div class="campo">
                            <label for="nomeJ">Nome</label><br> 
                            <input type="text" name="nome" id="nomeJ"><span id="x_nomeJ" class="tSpan"></span>
                        </div>
                    </form>
                    <form action="ServletUI029" method="post" id="formProduto" class="formularioP">
                        <div class="campo">
                            <label for="mercadoriaJ">Mercadoria</label><br> 
                            <input type="text" name="mercadoria" id="mercadoriaJ"><span id="x_mercadoriaJ" class="tSpan"></span>
                        </div>    
                    </form>
                    <form action="ServletUI029" method="post" id="formFrete" class="formularioP">
                        <div class="campo">
                            <label for="tipoJ">Tipo</label><br> 
                            <input type="text" name="tipo" id="tipoJ"><span id="x_tipoJ" class="tSpan"></span>
                        </div>    
                        <div class="campo">
                            <label for="deJ">De</label><br> 
                            <input type="text" name="de" id="deJ"><span id="x_deJ" class="tSpan"></span>
                        </div>
                        <div class="campo">
                            <label for="ateJ">Até</label><br> 
                            <input type="text" name="ate" id="ateJ"><span id="x_ateJ" class="tSpan"></span>
                        </div>
                    </form>

                    <!-- ===== NÃO EDITE A PARTIR DAQUI =========================================-->
                    <fieldset>
                        <legend></legend>
                    </fieldset>    
                </div>
                <div id="clear"></div>
            </div>
            <%@ include file="footer.jsp" %> 
        </div>
    </body>
</html>