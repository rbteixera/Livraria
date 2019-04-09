<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/security/tags"  prefix="security" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

   <c:url value="/resources/teste" var="cssPath"/>
   <meta charset='utf-8'>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="${cssPath}/styles.css">
   <link rel="stylesheet" href="${cssPath}/estilo.css">
   <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
   
 <meta charset="UTF-8">  
   <title>Estoque</title>  

</head>
<body>


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
   
<div id="area">   
    
   <form:form  cssClass="formulario" action="${s:mvcUrl('PC#gravar').build()}" method="post" 
      commandName="produto" enctype="multipart/form-data">
    
      <fieldset>
         <legend><h1>Cadastro de Produto</h1></legend>
         
         
         <div class="form-group" >
             <label>Código</label>
             <form:input path="codigo" cssClass="form-codigo" />
             <form:errors path="codigo" />
         </div>
         <div class="form-group">
            <label>Descrição</label>
            <form:textarea rows="10" cols="20" path="descricao" cssClass="form-control" />
            <form:errors path="descricao" />
         </div>
         <div class="form-group">
            <label>Unidade</label>
            <form:select path="unidade">
                <form:option value=""> </form:option>
                <form:option value="CX">Caixa</form:option>
                <form:option value="RL">Rolo</form:option>
                <form:option value="DZ">Dezena</form:option>
                <form:option value="PT">Pacote</form:option>
                <form:option value="SC">Saco</form:option>
            </form:select>
           
            <form:errors path="unidade" />
         </div>
         <div class="form-group">
            <label>Referência do fabricante</label>
            <form:input path="referenciaFab" cssClass="form-control" />
            <form:errors path="referenciaFab" />
         </div>
        <div class="form-group">
            <label>Estoque Mínimo</label>
            <form:input path="estoqueMinimo" cssClass="form-control" />
            <form:errors path="estoqueMinimo" />
         </div>
       
         <button type="submit" class="btn btn-primary">Cadastrar</button>
      </fieldset>   
      </form:form>

</div>



</body>
</html>