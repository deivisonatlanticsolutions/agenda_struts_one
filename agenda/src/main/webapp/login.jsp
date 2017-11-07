<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Login</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
</head>
<body>
	<div class="container">
	
	<logic:notEmpty name="status" scope="request">
	<div class="alert alert-warning alert-dismissable fade in">
		<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
		<strong>Erro: </strong> Usuário não esta logado!
	</div>
	</logic:notEmpty>
	
	<h3>Login</h3>
	<html:form action="/login.do" method="post">
		<div class="form-group">
			<label>Nome:</label>
			<html:text property="nome" name="loginForm" styleClass="form-control" />
		</div>
		<div class="form-group">
			<label>Email:</label>
			<html:text property="email" name="loginForm" styleClass="form-control" />
		</div>
		<div class="form-group">
			<label>Senha:</label>
			<html:password property="senha" name="loginForm" styleClass="form-control" />
		</div>
		<html:submit styleClass="btn btn-default" value="Logar"/>
	</html:form>
	
	</div>
</body>
</html:html>