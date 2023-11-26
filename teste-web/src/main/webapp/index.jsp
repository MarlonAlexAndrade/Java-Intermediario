<%@page import="model.Pessoa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página de Exemplo</title>
</head>
<body>
	<h1>Teste web com página JSP</h1>
	
	<%
		Pessoa pessoa = new Pessoa();
	
		pessoa.nome = "Osvaldo";
		pessoa.idade = 26;
	%>
	
	<h3> <%= pessoa.nome %></h3>
	
	<h4> <%= pessoa.idade %></h4>
</body>
</html>