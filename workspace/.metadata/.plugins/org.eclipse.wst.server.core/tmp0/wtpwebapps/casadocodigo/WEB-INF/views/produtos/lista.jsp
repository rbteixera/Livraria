<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/security/tags"  prefix="security" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Livro de java, Android, Iphone, PhP, Ruby e muito mais - Casa do Código</title>

<c:url value="/resources/css" var="cssPath"/>
<link rel="stylesheet" href="${cssPath}/bootstrap.min.css" />
<link rel="stylesheet" href="${cssPath}/bootstrap-theme.min.css" />
<script src="resources/js/bootstrap.min.js"></script>
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
      <a class="navbar-brand" href="${s:mvcUrl('HC#index').build()}">Casa do Código</a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="${s:mvcUrl('PC#listar').build()}">Lista de Produtos</a></li>
        <li><a href="${s:mvcUrl('PC#form').build()}">Cadastro de Produtos</a></li>
        <li class="nav-item">
        <a href="<c:url value="/logout" />">Sair</a></span>
 </li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
     <li><a href="#">
              <security:authentication property="principal" var="usuario" /> 
                     ${usuario.nome} 
         </a></li>
    </ul>
    </div><!-- /.navbar-collapse -->
  </div>
</nav>
 <div class="container">
        <h1>Listas de Produtos</h1>
         <c:set scope="request" var="isbn1" value=""/> 
        <form:form action="${s:mvcUrl('PC#listaPorIsbn').build()}" method="post" >
          <div>Pesquisa por ISBN : <form:input path="isbn1"  cssClass="form-control" />
          <button type="submit" class="btn btn-primary">Pesquisar</button>  </div>
        </form:form>
        <table  class="table table-bordered table-striped table-hover">
           <tr>
              <th>Título</th>
              <th>Descrição</th>
              <th>Páginas</th>
           </tr>
           
           <c:forEach items="${produtos}" var="produto">
               <tr>
                  <td><a href="${s:mvcUrl('PC#detalhe').arg(0,produto.id).build() }">${produto.titulo }</a></td>
                  <td>${produto.descricao }</td>
                  <td>${produto.paginas }</td>
                  
               </tr>
           </c:forEach>

        </table>
  </div>
</body>
 
</html>