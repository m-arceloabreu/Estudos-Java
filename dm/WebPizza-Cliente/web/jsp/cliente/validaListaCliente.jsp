<%-- 
    Document   : validaBuscaUsuario
    Created on : 09/04/2021, 10:17:33
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="pizzacliente.model.bean.Cliente" %>
<%@page import="pizzacliente.controller.ControleCliente" %>

<%
    String nome = request.getParameter("NOME");
    Cliente clEntrada = new Cliente(nome);
    ControleCliente contCli = new ControleCliente();
    List<Cliente> clSaida = contCli.listar(clEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>LISTA</h1> <br>
        <% if(!(clSaida.isEmpty())) { %>
            <% for (Cliente listaCli :clSaida){ %>
            Cliente = ID = <%=listaCli.getId()%> | NOME = <%=listaCli.getNome()%> | TELEFONE = <%=listaCli.getTelefone()%> | ENDERECO = <%=listaCli.getEndereco()%>  - <a href="alteraCliente.jsp?ID=<%=listaCli.getId()%>">Altera</a> - <a href="validaExcluCliente.jsp?ID=<%=listaCli.getId()%>">Excluir</a> <br>
            <% } %>
       <% } else { %>
            LISTA VAZIA
       <% } %>

    </div>
    </body>
</html>
