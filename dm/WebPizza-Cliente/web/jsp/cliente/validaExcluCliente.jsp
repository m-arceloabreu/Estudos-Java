<%-- 
    Document   : validaExcluiUsuario
    Created on : 08/04/2021, 20:34:03
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pizzacliente.model.bean.Cliente" %>
<%@page import="pizzacliente.controller.ControleCliente" %>




<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Cliente cliEntrada = new Cliente(id);
    ControleCliente cliCont = new ControleCliente();
    Cliente cliSaida = cliCont.excluir(cliEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>VALIDA EXCLUSÃO</h1>
        ID = <%=cliSaida.getId()%> <br>
        NOME = <%=cliSaida.getNome()%> <br>
        TELEFONE = <%=cliSaida.getTelefone()%> <br>
        ENDERECO = <%=cliSaida.getEndereco()%> <br>
        
    </div>
    </body>
</html>
