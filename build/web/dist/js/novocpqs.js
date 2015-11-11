//Simplifica a chamada getElementById para _$
var _$ = function (id) {
    return document.getElementById(id);
}

//Simplifica a chamada getElementByClassName para _gbc
var _gbc = function (gbc) {
	return document.getElementsByClassName (gbc);
}

//Função verfica se tem class
function hasClass(element, className) {
    return element.className && new RegExp("(^|\\s)" + className + "(\\s|$)").test(element.className);
}
/*EFEITO MENU*/
function aparece(campo){
	var div = _$(campo);
	div.style.display = "block";
}
function fechar(campo){
	var div = _$(campo);
	div.style.display = "none";
}
		

/*EFEITO MENU*/
/*EFEITO TELA PESQUISA - JANELA MODAL*/
function aparecerJanela(campo){
	var div = document.getElementById(campo);
	div.style.display = "block";
}

function fecharJanela(campo){
	var div = document.getElementById(campo);
	div.style.display = "none";
}

function desabilitar(campo){
	var rebecca = _gbc(campo);
	for(i=0; i < rebecca.length; i++){
		rebecca[i].checked = 0;
		rebecca[i].disabled = 1;
	}

}

function habilitar(campo){
	
	var rebecca = _gbc(campo);
	for(i=0; i < rebecca.length; i++){
		rebecca[i].disabled = 0;
	}
}
	
/*EFEITO TELA PESUISA*/

//Função de validação de CPF
function CPF(){"user_strict";function r(r){for(var t=null,n=0;9>n;++n)t+=r.toString().charAt(n)*(10-n);var i=t%11;return i=2>i?0:11-i}function t(r){for(var t=null,n=0;10>n;++n)t+=r.toString().charAt(n)*(11-n);var i=t%11;return i=2>i?0:11-i}var n=false,i=true;this.gera=function(){for(var n="",i=0;9>i;++i)n+=Math.floor(9*Math.random())+"";var o=r(n),a=n+"-"+o+t(n+""+o);return a},this.valida=function(o){for(var a=o.replace(/\D/g,""),u=a.substring(0,9),f=a.substring(9,11),v=0;10>v;v++)if(""+u+f==""+v+v+v+v+v+v+v+v+v+v+v)return n;var c=r(u),e=t(u+""+c);return f.toString()===c.toString()+e.toString()?i:n}}

//Função de validação de CNPJ
function TestaCNPJ(CNPJ) {
	
    var strCNPJ = CNPJ.substring(0, 2)+CNPJ.substring(3, 6)+CNPJ.substring(7, 10)+CNPJ.substring(11, 15)+CNPJ.substring(16, 18);
	
	console.log(strCNPJ);
     
    if (strCNPJ.length != 14)
        return false;
 
    // Elimina strCNPJs invalidos conhecidos
    if (strCNPJ == "00000000000000" ||
        strCNPJ == "11111111111111" || 
        strCNPJ == "22222222222222" || 
        strCNPJ == "33333333333333" || 
        strCNPJ == "44444444444444" || 
        strCNPJ == "55555555555555" || 
        strCNPJ == "66666666666666" || 
        strCNPJ == "77777777777777" || 
        strCNPJ == "88888888888888" || 
        strCNPJ == "99999999999999")
        return false;
         
    // Valida DVs
    tamanho = strCNPJ.length - 2
    numeros = strCNPJ.substring(0,tamanho);
    digitos = strCNPJ.substring(tamanho);
    soma = 0;
    pos = tamanho - 7;
    for (i = tamanho; i >= 1; i--) {
      soma += numeros.charAt(tamanho - i) * pos--;
      if (pos < 2)
            pos = 9;
    }
    resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;
    if (resultado != digitos.charAt(0))
        return false;
         
    tamanho = tamanho + 1;
    numeros = strCNPJ.substring(0,tamanho);
    soma = 0;
    pos = tamanho - 7;
    for (i = tamanho; i >= 1; i--) {
      soma += numeros.charAt(tamanho - i) * pos--;
      if (pos < 2)
            pos = 9;
    }
    resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;
    if (resultado != digitos.charAt(1))
          return false;
           
    return true;
    
}

//Função de validação de Email
function ValidaEmail(vEmail){
	var arroba = vEmail.indexOf("@");
	if (arroba == -1){
		return false;
	}	
	var first = vEmail.charAt(0);
	if(first=="@"){
		return false;		
	} 
		
	var tam = vEmail.length;
	if (arroba+1==tam){
		return false;	
	}
	
	var ponto = vEmail.indexOf(".");
	if ((arroba+1==ponto)||(ponto==-1)|| (ponto+1==tam)||(ponto==arroba-1)){
		return false;	
	}
	
	var pontoF = vEmail.lastIndexOf(".");
	if (pontoF+1==tam){
		return false;	
	}

	return true		
}

var regexLETRAS = /^[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$/; // Expressão regular seletora de caracteres do tipo Letra.

var y = _gbc("campoObrig");/*class de todos os inputs que devem ser iserido o texto "Campo Obriatório"*/
var x = _gbc("tSpan");/*class de todas as tags span*/
	

//Valida todos os campos obrigatórios	
function obrigatorio(e) {
	
	var err = false;
	if ( e.currentTarget.value.length <=0 ) {
			err = true;
	} else {	
	
		if ( e.currentTarget.id == "cpfJ" || e.currentTarget.id == "cpfJD" ) {
			var cpf = new CPF();
			var cpfValido = cpf.valida( e.currentTarget.value );
			if ( !cpfValido ) {
				addMsgErro(e.currentTarget, "CPF");
				return false;
			}
		}
		
		if ( e.currentTarget.id == "telJ" ) {
			var regexTel = /^\d+\ \d+\-\d+$/;
			if (!e.currentTarget.value.match(regexTel) || e.currentTarget.value.length <12) { 
				addMsgErro(e.currentTarget, "Telefone")
				return true;
			}
		}
		
		if ( e.currentTarget.id == "celJ" ) {
			var regexCel = /^\d+\ \d+\-\d+$/;
			if (!e.currentTarget.value.match(regexCel) || e.currentTarget.value.length <13) { 
				addMsgErro(e.currentTarget, "Celular")
				return true;
			}
		}
		
		if ( e.currentTarget.id == "cepJ" ) {
			var regexCep = /^\d+\.\d+\-\d+$/;
			if (!e.currentTarget.value.match(regexCep)) { 
				addMsgErro(e.currentTarget, "CEP")
				return true;
			}
		}
				
		if ( e.currentTarget.id == "cnpjJ" ) {
			var cnpjValido = TestaCNPJ (e.currentTarget.value);
			if  (cnpjValido == false ){
				addMsgErro(e.currentTarget, "CNPJ")
				return true;
			}
		}
		
		if ( e.currentTarget.id == "emailJ" ) {
			var emailValido = ValidaEmail (e.currentTarget.value);
			if  (emailValido == false ){
				addMsgErro(e.currentTarget, "e-mail")
				return true;
			}
		}
		
		if ( e.currentTarget.id == "horaJ" ) {
			var regexHora = /^([01]\d|2[0-3]):([0-5]\d):([0-5]\d)$/;
			if (!e.currentTarget.value.match(regexHora)) { 
				e.currentTarget.nextSibling.innerHTML 		= "Hora Inválida!";
				e.currentTarget.style.border 				= "thin solid red";	
				e.currentTarget.nextSibling.style.display 	= "block";
				return true;
			}
		}
		
		if ( e.currentTarget.id == "placaJ" ) {
			var regexPlaca = /^([A-Za-z]{3})\-(\d{4})$/;
			if (!e.currentTarget.value.match(regexPlaca)) { 
				e.currentTarget.nextSibling.innerHTML 		= "Placa Inválida!";
				e.currentTarget.style.border 				= "thin solid red";	
				e.currentTarget.nextSibling.style.display 	= "block";
				return true;
			}
		}
		
		
		if ( e.currentTarget.id == "dataJ" || e.currentTarget.id == "dataJD" || e.currentTarget.id == "dataR" || e.currentTarget.id == "dataNascimentoJ") {
			var regexData = /^(?:(?:31(\/|-|\.)(?:0?[13578]|1[02]))\1|(?:(?:29|30)(\/|-|\.)(?:0?[1,3-9]|1[0-2])\2))(?:(?:1[6-9]|[2-9]\d)?\d{2})$|^(?:29(\/|-|\.)0?2\3(?:(?:(?:1[6-9]|[2-9]\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\d|2[0-8])(\/|-|\.)(?:(?:0?[1-9])|(?:1[0-2]))\4(?:(?:1[6-9]|[2-9]\d)?\d{2})$/;
			if (!e.currentTarget.value.match(regexData)) { 
				e.currentTarget.nextSibling.innerHTML 		= "Data Inválida!";
				e.currentTarget.style.border 				= "thin solid red";	
				e.currentTarget.nextSibling.style.display 	= "block";
				return true;
			}
		}
	}	
	
	if ( err ) {
		e.currentTarget.nextSibling.innerHTML 		= "Campo Obrigatório";
		e.currentTarget.style.border 				= "thin solid red";	
		e.currentTarget.nextSibling.style.display 	= "block";
	} else {
		e.currentTarget.nextSibling.innerHTML 		= "";	
		e.currentTarget.style.border 				= "thin solid #a9a9a9";
		e.currentTarget.nextSibling.style.display 	= "none";
	}
}

//Função não Permite Digitar Letras - Está sendo passada juntamente com a máscara
function somenteNumeros(e){
	var numero = /(48|49|50|51|52|53|54|55|56|57)/;
	var elm = e.currentTarget;
	var code = e.which || e.keyCode;
	if ( code != 8 && code != 127 && code != 9 && code != 35 && code != 36 && code != 37 && code != 39 && code != 123) {
		if ( !numero.test(code) ) {
			e.preventDefault();
			e.currentTarget.nextSibling.style.display = "block";
			e.currentTarget.nextSibling.innerHTML = "Digite Apenas Números";//pega o elemento em que acontece o evento, depois a tag "vizinha" e insere o HTML
			return false;
		}else if ( numero.test(code) ){
			e.currentTarget.nextSibling.innerHTML = "";//pega o elemento em que acontece o evento, depois a tag "vizinha" e insere o HTML
			e.currentTarget.nextSibling.style.display = "none";
		}
	}
}

//Função não Permite Digitar Números - Para ela ser aplicada, basta colocar a class iLetras no input
function somenteLetras(e){
	var code = e.which || e.keyCode;
	var caracter = String.fromCharCode(code);
	var res = caracter.match(regexLETRAS);
	console.log(code);
	if ( code != 8 && code != 127 && code != 46 && code != 9 && code != 35 && code != 36 && code != 37 && code != 38 && code != 39 ) {
		if ( !res ) {
			e.preventDefault();
			e.currentTarget.nextSibling.style.display = "block";
			e.currentTarget.nextSibling.innerHTML = "Digite Apenas letras";//pega o elemento em que acontece o evento, depois a tag "vizinha" e insere o HTML
			return false;
		} else if ( res ){
			e.currentTarget.nextSibling.innerHTML = "";//pega o elemento em que acontece o evento, depois a tag "vizinha" e insere o HTML
			e.currentTarget.nextSibling.style.display = "none";
		}
	}
}

/*Tabela*/

function alternate(id){ 

  if(document.getElementsByTagName){  

    var table = document.getElementById(id);   

    var rows = table.getElementsByTagName("tr");   

    for(i = 0; i < rows.length; i++){           

  //manipulate rows 

      if(i % 2 == 0){ 

        rows[i].className = "even"; 

      }else{ 

        rows[i].className = "odd"; 

      }       

    } 

  } 

}

/*fim tabela*/
window.onload = function () {
var y = _gbc("campoObrig");/*class de todos os inputs que devem ser iserido o texto "Campo Obriatório"*/
var x = _gbc("tSpan");/*class de todas as tags span*/

	/*EFEITO MENU CAIXA PRETA*/
	var _gebt = document.getElementsByTagName("li")
	
	for (var i = 1; i < _gebt.length; i++) {
		_gebt[i].onmousemove = function x(){
			aparece("darkBox");
		}
		
		_$("menu").onmouseout = function y(){
			fechar("darkBox");
		}
	}
	
			_$("selecionar").onclick = function x (){
		aparecerJanela("janelaFormulario");
	}
	_$("fechar").onclick = function y(){
		fecharJanela("janelaFormulario");
	}
	_$("transpotadorP").onclick = function modal(){
		desabilitar("pesagemP");
		desabilitar("orgaoP");
		habilitar("transportadorP");
	}
	_$("orgaoP").onclick = function modal(){
		desabilitar("pesagemP");
		desabilitar("transportadorP");
		habilitar("orgaoP");
	}
	_$("pesagemP").onclick = function modal(){
		habilitar("pesagemP");
		desabilitar("orgaoP");
		desabilitar("transportadorP");
	}


	/*FIM EFEITO MENU*/

		//console.log(document.getElementByTagName("body"));
		//if (hasClass(document.getElementsByTagName("body")[0], "pesquisar")){
		if (hasClass(document.body, "pesquisar")){
			alternate("tblConsulta");
		}
		
		for (var i = 0; i < y.length; i++) {
			//console.log(y);
			if ( hasClass(y[i], "campoObrig") ) {
				y[i].onblur = function(e){
					obrigatorio(e);
				};
			}
		}
		
		for (var i = 0; i < y.length; i++) {
			if ( hasClass(y[i], "iLetras") ) {
				y[i].onkeypress = function(e){
					somenteLetras(e);
				};
			}
		}
		var validaMasc = function (idCampo, mascare){
			var campo = _$(idCampo);
			if ( campo ) {
				//var code = event.which || event.keyCode;
				//console.log(code);
				campo.onkeypress = function (e) {	
					somenteNumeros(e);
					mascara(e, mascare);
				}
			}	
		}
		
		validaMasc("cpfJ", "###.###.###-##");
		validaMasc("cpfJD", "###.###.###-##");
		validaMasc("telJ", "## ####-####");
		validaMasc("celJ", "## #####-####");
		validaMasc("cepJ", "##.###-###");
		validaMasc("cnpjJ", "##.###.###/####-##");
		validaMasc("horaJ", "##:##:##");
		validaMasc("dataJ", "##/##/####");
		validaMasc("dataR", "##/##/####");
		validaMasc("dataJD", "##/##/####");
		validaMasc("dataNascimentoJ", "##/##/####");
		validaMasc("kmJ", "#####");
		validaMasc("rgJ","##.###.###-#");				
		validaMasc("rgJD","##.###.###-#");	
		var placaJ = _$("placaJ");
		if ( placaJ ) {
			placaJ.onkeypress = function (e) {
				mascara(e, "###-####");
			}
		}
}

/*var topo = _$("caixa");
	topo.style.display = 'none';  // esta linha faz o menu superior direito "esconder" por padrão

	_$('botao-topo').onclick = function () {        //ao clicar abre o dropwdown superior direito
		topo.style.display = topo.style.display === 'none' ? '' : 'none';
	}

	_$('centro').onclick = function () { //ao clicar na div do centro esconde o menu
		topo.style.display = topo.style.display === '' ? 'none' : 'none';
}*/
	
mascara = function (event, mask) {    // função das máscaras
	var code = event.which || event.keyCode;
	console.log(code);
	if ( code != 8 && code != 127 && code != 46 ) {
		var i = event.currentTarget.value.length;
		var saida = mask.substring(1, 0);
		var texto = mask.substring(i)
		if (texto.substring(0, 1) != saida) {
			event.currentTarget.value += texto.substring(0, 1);
		}
	}
}

// Validação de Envio do Formulário

	
_$("formularioJ").onsubmit = function(e){
	var err = false;
	
	for (var i = 0; i < y.length; i++){
		
		if ( y[i].value.length <= 0 || x[i].innerHTML.length > 0 ) {
		if ( y[i].value.length <= 0 || x[i].innerHTML.length > 0 ) {
				err = true;
				e.preventDefault();
			if (err){
				alert("Verifique se digitou corretamente o campo " + y[i].name);
				y[i].focus();
				y[i].select();
				err = true;
				break
			} 
			
		}	
	}if (!err) {
		alert("Dados cadastrados com sucesso!");
	}
}
}
/*_$("limparJ").onclick = function limpo(campo) { 
	var l = _gbc("limpar");
	for (var i = 0; i < l.length; i++){
		if (l[i].value.length > 0 ) {
			l[i].value=""; 
			l[i].nextSibling.innerHTML 		= "";	
			l[i].style.border 				= "thin solid #a9a9a9";
			l[i].nextSibling.style.display 	= "none";
			y[0].focus();
			
		
		}
	} 
}*/
var limparJ = _$("limparJ");
if (limparJ){
	limparJ.onclick = function limpar(campo) {
		window.location.reload();
	}
}

//Isso é igual a function addMsgErro(teste)
var addMsgErro = function(teste, nome){
	teste.nextSibling.innerHTML 		= nome+ " Inválido(a)!";
	teste.style.border 				= "thin solid red";	
	teste.nextSibling.style.display 	= "block";
}