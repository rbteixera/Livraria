<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
    .wrap {
max-width: 1200px;
margin: 0 auto;
}

.nav {
background: #FFF;
z-index: 200;
position: fixed;
width: 100%;
font-size: 1em;
overflow: auto;
}

.nav ul {
padding: 1em;
}

li {
display: inline-block;
margin-right: 2em;
}

a {
text-decoration: none;
color: #444;
}

a:hover {
color: red;
}

.nav-toggle {
display: none;
}

.foto {
width: 100%;
}

/*Media Queries*/
@media only screen and (max-width: 800px) {
.wrap {
max-width: 100%;
margin: 0;
}

.nav.nav-aberta {
position: relative;
padding: 0 0 0.5em 0;
height: 0;
}

.nav ul {
padding: .5em;
margin: 0;
background: #444;
}

li {
margin: 0;
padding: 0;
display: block;
border-bottom: 1px solid #FFF;
}

li a {
padding: 0.5em 0 0.5em 0;
display: block;
color: #FFF;
}

li:last-child {
border-bottom:none;
}

.nav-toggle {
display: block;
padding: .4em;
margin: .5em 0;
}
#holder-menu{
width:100%;
height:30px;
background:#CCC;
}
#menu{
width:960px;
height:30px;
margin-left:auto;
margin-rigth:auto;
}
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- <img alt="" src="http://placehold.it/1920x800/&text=Conteúdo" />  -->
<div class="holder-menu">
   <nav class="nav nav-aberta">
   <div class="menu">
		<ul class="listaNav">
			<li><a href="#">Usuários</a></li>
			<li><a href="#">Produtos</a></li>
			<li><a href="#">Item 3</a></li>
			<li><a href="#">Item 4</a></li>
			<li><a href="#">Item 5</a></li>
			<li><a href="#">Item 6</a></li>
			<li><a href="#">Item 7</a></li>
			<li><a href="#">Item 8</a></li>
			<li><a href="#">Item 9</a></li>
       </ul>
   </div>
  </nav>
</div>
</body>
</html>