<%-- 
    Document   : validaBuscaUsuario
    Created on : 09/04/2021, 10:17:33
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pizzacliente.model.bean.Pedido" %>
<%@page import="pizzacliente.controller.ControlePedido" %>

<%
    int ID = Integer.parseInt(request.getParameter("ID"));
   Pedido pedEntrada = new Pedido(ID);
    ControlePedido pedCont = new ControlePedido();
    Pedido pedSaida = pedCont.buscar(pedEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>BUSCA</h1> <br>
        <% if (pedSaida != null) { %> 
            Pedido = <%=pedSaida.getId()%> | <%=pedSaida.getSabor()%> | <%=pedSaida.getTamanho()%> | <%=pedSaida.getBorda()%> | <%=pedSaida.getObs()%> | <%=pedSaida.getBebida()%>
        <% } else { %> 
            Pedido = Não encontrado
        <% } %> 
    </div>
    </body>
</html>
