<%-- 
    Document   : validaInseriUsuario
    Created on : 08/04/2021, 20:39:51
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pizzacliente.model.bean.Cliente" %>
<%@page import="pizzacliente.controller.ControleCliente" %>

<%
    String nome = request.getParameter("NOME");
    String telefone = request.getParameter("TELEFONE");
    String endereco = request.getParameter("ENDERECO");

    Cliente cliEntrada = new Cliente(0,nome,telefone,endereco);
    ControleCliente cliCont = new ControleCliente();
    Cliente cliSaida = cliCont.inserir(cliEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>INCLUSÃO CONCLUIDA</h1>
        ID = <%=cliSaida.getId()%> <br>
        NOME = <%=cliSaida.getNome()%> <br>
        TELEFONE = <%=cliSaida.getTelefone()%> <br>
        ENDERECO = <%=cliSaida.getEndereco()%> <br>
       
    </div>
    </body>
</html>
