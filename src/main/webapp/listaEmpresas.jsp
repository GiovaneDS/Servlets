<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.servlets.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="ISO-8859-1">
    <title>Empresas Cadastradas</title>
</head>
<body>
    <h1>Lista de Empresas</h1>

    <ul>
         <c:forEach items="${empresas}" var="empresa">
            <li>${empresa.nome}  | - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/></li>
         </c:forEach>
    </ul>

</body>
</html>