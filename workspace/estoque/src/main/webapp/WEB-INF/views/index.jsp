<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags"  prefix="security" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang=''>
<head>

<c:url value="/resources/teste" var="cssPath"/>
   <meta charset='utf-8'>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="${cssPath}/styles.css">
   <link rel="stylesheet" href="${cssPath}/estilo.css">
   <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
   <script src="${cssPath}/script.js"></script>
   
   <title>Estoque</title>
</head>
<body>

<div id='cssmenu'>
<ul class="nav navbar-nav navbar-left">
   <li><a href='#'>Home</a></li>
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
   <li><a href='${s:mvcUrl('LC#logout').build()}'>Sair do Sistema</a></li>
   
   
     <li class="nav navbar-nav navbar-right"><a href="#">
              <security:authentication property="principal" var="usuario" /> 
                    ${usuario.nome }
     </a></li>
  
 </ul>

     
</div>
 

￼<footer id="layout-footer">  		
Copyright © Sitename 2018  	
</footer>  
</body>
</html>
