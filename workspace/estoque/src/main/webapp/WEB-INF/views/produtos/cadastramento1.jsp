<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/security/tags"  prefix="security" %>

<!DOCTYPE html">

<html>

<head>
<meta charset="UTF-8">
<title>Estoque - Valnei Ferragens LTDA ME - ME</title>
<c:url value="/resources/teste" var="cssPath1"/>
<c:url value="/resources/css" var="cssPath"/>
<link rel="stylesheet" href="${cssPath}/bootstrap.min.css" />
<link rel="stylesheet" href="${cssPath}/bootstrap-theme.min.css" />
<link rel="stylesheet" href="${cssPath1}/style.css" />
 <script src="${cssPath1}style.css"></script>
<style type="text/css">
        body{
            padding-top: 00px;
        }
</style>
</head>

<body>
<nav class="navbar navbar-inverse">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
     
    
    </div>
  
    <ul class="nav navbar-nav navbar-right">
     <li><a href="#">
              <security:authentication property="principal" var="usuario" /> 
                    ${usuario.nome }
         </a></li>
    </ul>
    </div><!-- /.navbar-collapse -->
  </div>
</nav>



<div class="container">
  
  
   <h1>Cadastro de Produto</h1>
   <form:form action="${s:mvcUrl('PC#gravar').build()}" method="post" 
      commandName="produto" enctype="multipart/form-data">
    
         <div class="form-group">
             <label>Código</label>
             <form:input path="codigo" cssClass="form-control" />
             <form:errors path="codigo" />
         </div>
         <div class="form-group">
            <label>Descrição</label>
            <form:textarea path="descricao" cssClass="form-control" />
            <form:errors path="descricao" />
         </div>
         <div class="form-group">
            <label>Unidade</label>
            <form:input path="unidade" cssClass="form-control" />
            <form:errors path="unidade" />
         </div>
         <div class="form-group">
            <label>Quantidade</label>
            <form:input path="quantidade" cssClass="form-control" />
            <form:errors path="quantidade" />
         </div>
        <div class="form-group">
            <label>Valor Unitário</label>
            <form:input path="vlUnitaria" cssClass="form-control" />
            <form:errors path="vlUnitaria" />
         </div>
        
         <div class="form-group">
            <label>Estoque Minimo</label>
            <form:input path="quantMinima" cssClass="form-control" />
            <form:errors path="quantMinima" />
         </div>
         <button type="submit" class="btn btn-primary">Cadastrar</button>
      </form:form>
     </div>
</body>
</html>