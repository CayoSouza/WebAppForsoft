

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div id="header">
    <div class="main">
        <a href="ui005home.jsp"><img src="dist/imagens/logoo.png" class="logo" id="logoo" alt="Logo"/></a>
        <ul class="menu" id="menu">
            <li><a href="ui005home.jsp">Home</a></li>
            <li><a href="#">Transportador<img src="dist/imagens/seta.png" class="seta" alt="Opções de transportador"/></a>
                <ul>
                    <li><a href="#">Frete<img src="dist/imagens/setad.png" class="setad" alt="Opções de Frete"/></a>
                        <!--Criação da class submenu-->
                        <ul class="submenu">
                            <li><a href="http://www2.projetodigimon.com.br/Home/ui006cadastrarfrete">Cadastrar</a></li>
                            <li><a href="ui029pesquisa.jsp">Consultar</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Veículo <img src="dist/imagens/setad.png" class="setad" alt="Opções de Veículo"/></a>
                        <ul class="submenu">
                            <li><a href="http://www2.projetodigimon.com.br/Home/ui008cadastrarveiculo">Cadastrar</a></li>
                            <li><a href="ui029pesquisa.jsp">Consultar</a></li>

                        </ul>
                    </li>
                    <li><a href="#">Motorista <img src="dist/imagens/setad.png" class="setad" alt="Opções de Motorista"/></a>
                        <ul class="submenu">
                            <li><a href="http://www2.projetodigimon.com.br/Home/ui020cadastrarmotorista">Cadastrar</a></li>
                            <li><a href="ui029pesquisa.jsp">Consultar</a></li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li><a href="#">ANTT / DNIT <img src="dist/imagens/seta.png" class="seta" alt="Opções de Órgão"/></a>
                <ul>
                    <li><a href="#">Posto de Pesagem<img src="dist/imagens/setad.png" class="setad" alt="Opções de Posto"/></a>
                        <ul class="submenu">
                            <li><a href="ui018cadastrarposto.jsp">Cadastrar</a></li>
                            <li><a href="ui029pesquisa.jsp">Consultar</a></li>

                        </ul>
                    </li>
                    <li><a href="#">Rodovia <img src="dist/imagens/setad.png" class="setad" alt="Opções de Rodovia"/></a>
                        <ul class="submenu">
                            <li><a href="ui014cadastrarrodovia.jsp">Cadastrar </a></li>
                            <li><a href="ui015consultarrodovia.jsp">Consultar</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Transportador <img src="dist/imagens/setad.png" class="setad" alt="Opções de Transportador"/></a>
                        <ul class="submenu">
                            <li><a href="http://www2.projetodigimon.com.br/Home/ui010cadastrartransportador">Cadastrar </a></li>
                            <li><a href="http://www2.projetodigimon.com.br/Home/ui011consultartransportador">Consultar</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Câmera <img src="dist/imagens/setad.png" class="setad" alt="Opções de Câmera"/></a>
                        <ul class="submenu">
                            <li><a href="ui026cadastrarcamera.jsp">Cadastrar </a></li>
                            <li><a href="ui029pesquisa.jsp">Consultar</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Balança <img src="dist/imagens/setad.png" class="setad" alt="Opções de Balança"/></a>
                        <ul class="submenu">
                            <li><a href="ui016cadastrarbalanca.jsp">Cadastrar</a></li>
                            <li><a href="ui029pesquisa.jsp">Consultar</a></li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li><a href="#">Posto de Pesagem <img src="dist/imagens/seta.png" class="seta" alt="Opções de Pesagem"/></a>
                <ul>
                    <li><a href="#">Pesagem <img src="dist/imagens/setad.png" class="setad" alt="Opções de Pesagem"/></a>
                        <ul class="submenu">
                            <li><a href="ui024cadastrarpesagem.jsp">Registrar </a></li>
                            <li><a href="ui029pesquisa.jsp">Consultar</a></li>
                        </ul>
                    </li>
                </ul>
            </li> 
            <li><a href="#">Relatório <img src="dist/imagens/seta.png" class="seta" alt="Opções de Relatório"/></a>
                <ul>
                    <li><a href="http://www2.projetodigimon.com.br/Home/ui030relatorio">Emitir</a></li>
                </ul>
            </li>
            <li><a href="#">Usuário<img src="dist/imagens/seta.png" class="seta" alt="Opções de Usuário"/></a>
                <ul>
                    <li><a href="http://www2.projetodigimon.com.br/Home/ui012cadastrarusuario">Cadastrar</a></li>
                    <li><a href="ui029pesquisa.jsp">Consultar</a></li>
                </ul>
            </li> 
            <li><a href="#">Ajuda<img src="dist/imagens/seta.png" class="seta" alt="Opções de Ajuda"/></a>
                <ul class="penultimo">
                   <li><a href="http://www2.projetodigimon.com.br/Home/ui034faleconosco">Fale Conosco</a></li>
                    <li><a href="http://www2.projetodigimon.com.br/Home/ui033faq">FAQ</a></li>
                </ul>
            </li>
            <!--Aqui tem uma ul diferente-->
            <li class="last"><img src="dist/imagens/iconeMenu.png" class="iconeMenu" alt="Menu do Usuário"/>
                <ul class="last">
                    <li><a href="http://www2.projetodigimon.com.br/Home/ui032minhaconta">Minha Conta</a></li>
                    <li><a href="LogoutServlet">Sair</a></li>
                </ul>
                <!--aqui termina a ul do botao sair e minha conta-->
            </li>
        </ul>
    </div>
    <div id="darkBox"></div>
</div>