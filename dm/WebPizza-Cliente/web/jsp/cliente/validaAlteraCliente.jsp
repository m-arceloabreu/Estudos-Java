<%-- 
    Document   : validaAlteraUsuario.jsp
    Created on : 08/04/2021, 20:26:56
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pizzacliente.model.bean.Cliente" %>
<%@page import="pizzacliente.controller.ControleCliente" %>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    String nome = request.getParameter("NOME");
    String telefone = request.getParameter("TELEFONE");
    String endereco = request.getParameter("ENDERECO");
   

    Cliente cliEntrada = new Cliente(id,nome,telefone,endereco);
    ControleCliente cliCont = new ControleCliente();
    Cliente cliSaida = cliCont.alterar(cliEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>ALTERAÇÃO CONCLUIDA</h1>
        ID = <%=cliSaida.getId()%> <br>
        NOME = <%=cliSaida.getNome()%> <br>
        TELEFONE = <%=cliSaida.getTelefone()%> <br>
        ENDERECO = <%=cliSaida.getEndereco()%> <br>
        
    </div>
    </body>
</html>
