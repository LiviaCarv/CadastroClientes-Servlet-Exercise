<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cadastro de clientes</title>
</head>
<body>
<div align="center">
    <h1>Cadastro de Clientes</h1>
    <h3>Por favor, digite seus dados para realização de cadastro.</h3>
    <form action="cadastro" method="post">
        <p>Nome: <input type="text" name="name" required></p>
        <p>CPF: <input type="text" name="cpf" required> </p>
        <p><input type="submit" value="cadastro"></p>
    </form>
</div>

</body>
</html>