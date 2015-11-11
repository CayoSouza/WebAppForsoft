_$("pesquisaJ").onchange = function x (){
    pesquisa = _$("pesquisaJ").value;
   if(pesquisa == "VEICULO"){
        aparece("formVeiculo");   
   }else{
       fechar("formVeiculo");
   }
   if(pesquisa == "MOTORISTA"){
       aparece("formMotorista");   
   }else{
       fechar("formMotorista");
   }
   if(pesquisa == "TRANSPORTADOR"){
       aparece("formTransportador");   
   }else{
       fechar("formTransportador");
   }
   if(pesquisa == "PESSOA_JURIDICA"){
       aparece("formPJ");   
   }else{
       fechar("formPJ");
   }
   if(pesquisa == "CARGA"){
       aparece("formCarga");   
   }else{
       fechar("formCarga");
   }
   if(pesquisa == "PESSOA_FISICA"){
       aparece("formPF");   
   }else{
       fechar("formPF");
   }
   if(pesquisa == "PRODUTO"){
       aparece("formProduto");   
   }else{
       fechar("formProduto");
   }
   if(pesquisa == "FRETE"){
       aparece("formFrete");   
   }else{
       fechar("formFrete");
   }
}