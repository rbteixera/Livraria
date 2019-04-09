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
<title>Login</title>

<c:url value="/resources/css" var="cssPath"/>
<link rel="stylesheet" href="${cssPath}/bootstrap.min.css" />
<link rel="stylesheet" href="${cssPath}/bootstrap-theme.min.css" />
<style type="text/css">
        body{
            padding-top: 00px;
        }
</style>
</head>

<body>

<div class="container">
   <h1>Estoque</h1>
   
   <form:form servletRelativeAction="/login">
    
         <div class="form-group">
             <label>Usuário
             <input name="username" type="text" class="form-control" /></label>
         </div>
         <div class="form-group">
            <label>Senha</label>
            <input name="password" type="password" class="form-control" />
   
         </div>
         
       
         <button type="submit" class="btn btn-primary">Logar</button>
      </form:form>
     </div>
</body>
</html>