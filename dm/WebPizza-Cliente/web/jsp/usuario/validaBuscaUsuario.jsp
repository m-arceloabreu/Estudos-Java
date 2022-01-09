<%-- 
    Document   : validaBuscaUsuario
    Created on : 09/04/2021, 10:17:33
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pizzacliente.model.bean.Usuario" %>
<%@page import="pizzacliente.controller.ControleUsuario" %>

<%
    int ID = Integer.parseInt(request.getParameter("ID"));
    Usuario uEntrada = new Usuario(ID);
    ControleUsuario contUsu = new ControleUsuario();
    Usuario uSaida = contUsu.buscar(uEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>BUSCA</h1> <br>
        <% if (uSaida != null) { %> 
            Usuario = <%=uSaida.getId()%> | <%=uSaida.getLogin()%> | <%=uSaida.getSenha()%> | <%=uSaida.getStatus()%> | <%=uSaida.getTipo()%>
        <% } else { %> 
            Usuario = Não encontrado
        <% } %> 
    </div>
    </body>
</html>
