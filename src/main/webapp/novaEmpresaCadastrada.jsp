<%
String nomeEmpresa = (String)request.getAttribute("empresa");
System.out.println(nomeEmpresa);
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>Cadastro de empresa</title>
</head>
<body>

    <h1>Empresa  <%= nomeEmpresa %> cadastrada com sucesso!</h1>

</body>
</html>