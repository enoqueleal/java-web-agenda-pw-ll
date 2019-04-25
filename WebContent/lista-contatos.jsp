<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacts</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">
<link href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" rel="stylesheet">
<link href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" rel="stylesheet">
</head>
<body>

	<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom box-shadow">
		<h5 class="my-0 mr-md-auto font-weight-normal">Agenda</h5>
		<nav class="my-2 my-md-0 mr-md-3">
			<a class="p-2 text-dark" href="index.html">Home</a>
			<a class="p-2 text-dark" href="adiciona-contato.html">Cadastrar</a>
			<a class="p-2 text-dark" href="busca-contatos">Listar</a>
		</nav>
	</div>
	
	<div class="container">
	
		<div class="text-center">
			<h1 class="display-4">Lista de contatos</h1>
	    </div>
	
		<c:if test="${empty contatos}">
			<div class="text-center">
				<hr>
				<h3 class="display-4">Nenhum contato cadastrado!</h3>
			</div>
		</c:if>
		
		<c:if test="${not empty contatos}">
			<table class="table">
					<tr>
						<th>Nome</th>
						<th>E-mail</th>
						<th>Endereco</th>
						<th>Telefone</th>
						<th></th>
					</tr>
					
					<c:forEach var="pessoa" items="${contatos}">
						<tr>
							<td>${pessoa.nome}</td>
							<td>${pessoa.email}</td>
							<td>${pessoa.endereco}</td>
							<td>${pessoa.telefone}</td>
							<td><a href="remove-usuario?id=${pessoa.id}">Remover</a></td>
						</tr>
					</c:forEach>
			</table>
		</c:if>
		
	</div>

</body>
</html>