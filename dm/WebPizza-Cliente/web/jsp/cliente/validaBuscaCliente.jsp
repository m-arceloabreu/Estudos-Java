<%-- 
    Document   : validaBuscaUsuario
    Created on : 09/04/2021, 10:17:33
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pizzacliente.model.bean.Cliente" %>
<%@page import="pizzacliente.controller.ControleCliente" %>

<%
    int ID = Integer.parseInt(request.getParameter("ID"));
   Cliente cliEntrada = new Cliente(ID);
    ControleCliente cliCont = new ControleCliente();
    Cliente cliSaida = cliCont.buscar(cliEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>BUSCA</h1> <br>
        <% if (cliSaida != null) { %> 
            Cliente = <%=cliSaida.getId()%> | <%=cliSaida.getNome()%> | <%=cliSaida.getTelefone()%> | <%=cliSaida.getEndereco()%>
        <% } else { %> 
            Cliente = Não encontrado
        <% } %> 
    </div>
    </body>
</html>
