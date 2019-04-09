<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/security/tags"  prefix="security" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5.01 Transitional//EN" "http://www.w3.org/TR/html5/loose.dtd">
<html>
<head>
<script type="text/javascript">



	

function mascaraGenerica(evt, campo, padrao) {  
    //testa a tecla pressionada pelo usuario  
    var charCode = (evt.which) ? evt.which : evt.keyCode;  
    if (charCode == 8) return true; //tecla backspace permitida  
    if (charCode != 46 && (charCode < 48 || charCode > 57)) return false; //apenas numeros            
    campo.maxLength = padrao.length; //Define dinamicamente o tamanho maximo do campo de acordo com o padrao fornecido  
    //aplica a mascara de acordo com o padrao fornecido  
    entrada = campo.value;  
    if (padrao.length > entrada.length && padrao.charAt(entrada.length) != '#') {  
         campo.value = entrada + padrao.charAt(entrada.length);                 
    }  
    return true;  
}  

    
    function optionCheck(){
    	//alert(document.getElementById("options").value)
        var option = document.getElementById("options").value;
        
        if(option !=="Escolher Produto"){
            document.getElementById("hiddenDiv").style.visibility ="visible";
           
            document.getElementById("codigoEnt").value = document.getElementById("options").value;
            document.getElementById("dataEntrada").value = dataAtual();
            document.getElementById("vlEntrada").focus();
           
        } else {
        	document.getElementById("hiddenDiv").style.visibility ="hidden";
        }
        
    }
    function dataAtual(){
    	data = new Date();
    	dia = data.getDate();
    	mes = data.getMonth()+1;
    	ano = data.getFullYear();
    	if(mes > 9) {
    	   dataCompleta = dia+"/"+mes+"/"+ano;
    	} else {
    		dataCompleta = dia+"/0"+mes+"/"+ano;
    	}
    	return dataCompleta;
   	}
    
    function maskIt(w,e,m,r,a){
    	// Cancela se o evento for Backspace
    	if (!e) var e = window.event
    	if (e.keyCode) code = e.keyCode;
    	else if (e.which) code = e.which;
    	// Variáveis da função
    	var txt  = (!r) ? w.value.replace(/[^\d]+/gi,'') : w.value.replace(/[^\d]+/gi,'').reverse();
    	var mask = (!r) ? m : m.reverse();
    	var pre  = (a ) ? a.pre : "";
    	var pos  = (a ) ? a.pos : "";
    	var ret  = "";
    	if(code == 9 || code == 8 || txt.length == mask.replace(/[^#]+/g,'').length) return false;
    	// Loop na máscara para aplicar os caracteres
    	for(var x=0,y=0, z=mask.length;x<z && y<txt.length;){
    	if(mask.charAt(x)!='#'){
    	ret += mask.charAt(x); x++; } 
    	else {
    	ret += txt.charAt(y); y++; x++; } }
    	// Retorno da função
    	ret = (!r) ? ret : ret.reverse()	
    	w.value = pre+ret+pos; }
    	// Novo método para o objeto 'String'
    	String.prototype.reverse = function(){
    		
    	return this.split('').reverse().join(''); 
   };
   function validar() {
	   var valor = document.getElementById("vlEntrada").value;
	   var quantidade = document.getElementById("quantEntrada").value;
	  
	  
	   if (valor == "") {
	      alert('Preencha o campo Valor unitárioe');
	      document.getElementById("vlEntrada").focus();
	      return false;
	   } else if (quantidade == "" || quantidade == "0") {
		   alert('Preencha o campo quantidade');
		   document.getElementById("quantEntrada").focus();
		   return false; 
	   }
  }
</script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<c:url value="/resources/teste" var="cssPath"/>
<c:url value="/resources/css" var="cssPath1"/>
   <meta charset='utf-8'>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="${cssPath}/styles.css">
   <link rel="stylesheet" href="${cssPath}/estilo.css">

   <link type="text/css" href="/springmvc/css/pepper-grinder/jquery-ui-1.8.16.custom.css" rel="stylesheet" />
   <script src="${cssPath}/jquery.min.js" type="text/javascript"></script>
   <script src="${cssPath}/jquery.maskMoney.js" type="text/javascript"></script>




<title>Entrada de produtos</title>
</head>
<body>

  
  
<!-- Inicio Menu -->
<div id='cssmenu'>
<ul class="nav navbar-nav navbar-left">
   <li><a href='${s:mvcUrl('HC#index').build()}'>Home</a></li>
   <li class='active'><a href='#'>Produtos</a>
      <ul>
         <li><a href='${s:mvcUrl('PC#Cadastro').build()}'>Cadastro</a></li>
         <li><a href='${s:mvcUrl('EC#listar').build()}' >Entrada</a></li>
         <li><a href='#'>Saida</a></li>
        <li><a href='#'>Lista</a></li>
      </ul>
   </li>
   <li class='active'><a href='#'>Usuários</a>
    <ul>
         <li><a href='#'>Cadastro</a></li>
         <li><a href='#'>Alteração</a></li>
         <li><a href='#'>Deleção</a></li>
      </ul>
   </li>   
   
   
   
     <li class="nav navbar-nav navbar-right"><a href="#">
              <security:authentication property="principal" var="usuario" /> 
                    ${usuario.nome }
     </a></li>
  
 </ul>

     
</div>
<!-- Fim Menu -->

<div id="area">
                              
   <form:form  cssClass="formulario" action="${s:mvcUrl('EC#gravar').build()}" method="post" 
      commandName="entrada" enctype="multipart/form-data">
      
      <fieldset>
         <legend><h1>Entrada de Produto</h1></legend>
         
         <div class="form-group">
             <label>Produto</label>
             <select  id="options" onchange="optionCheck()">
               <option value="Escolher Produto"></option>
				<c:forEach items="${produtos}" var="produto">
					<option value="${produto.codigo}" >${produto.descricao}</option>
		
				</c:forEach>
			 </select>
			 
			 <div class="container6" id="hiddenDiv" style="height:100px;width:300px;border:1px;visibility:hidden;">
                          
		         <div class="divCenter">
		              <label for="dataEntrada">Data de Entrada</label>
		              <div >
		                <form:input  path="dataEntrada" cssClass="form-data" readonly="true"   />
			             
			          </div>
		              <label>Código de Entrada</label>
		              <div >
		                <form:input path="codigoEnt" cssClass="form-codigo" readonly="true" />
			             
			          </div>
			          
			      
			          <div>
                       <label for="dinheiro">Valor Unitário R$</label>
                       
                       <input type="text" name="vlEntrada"  id="vlEntrada" value="" size="12" onKeyUp="maskIt(this,event,'###.###.###,##',true)" dir="rtl"  />
                       
			          </div>
			          <div>  
                         <label>Quantidade Entrada</label>
                         <form:input path="quantEntrada" value="0" onkeypress="return mascaraGenerica(event, this, '####');" />
			          </div> 
			          <div>
			            <label></label>
			            <button type="submit" class="btn btn-primary" onclick="return validar()">Cadastrar</button>  
			          </div>  
		         </div>
		      
             </div>
         </div>
      </fieldset>
   </form:form>
   
   
</div>
</body>
</html>