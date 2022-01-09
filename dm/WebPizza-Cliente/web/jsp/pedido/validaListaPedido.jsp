<%-- 
    Document   : validaBuscaUsuario
    Created on : 09/04/2021, 10:17:33
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="pizzacliente.model.bean.Pedido" %>
<%@page import="pizzacliente.controller.ControlePedido" %>

<%
    String sabor = request.getParameter("SABOR");
    Pedido peEntrada = new Pedido(sabor);
    ControlePedido contPed = new ControlePedido();
    List<Pedido> peSaida = contPed.listar(peEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>LISTA</h1> <br>
        <% if(!(peSaida.isEmpty())) { %>
            <% for (Pedido listaPed :peSaida){ %>
            Pedido = ID = <%=listaPed.getId()%> | SABOR = <%=listaPed.getSabor()%> | TAMANHO = <%=listaPed.getTamanho()%> | BORDA = <%=listaPed.getBorda()%> | OBS = <%=listaPed.getObs()%> | BEBIDA = <%=listaPed.getBebida()%> - <a href="alteraPedido.jsp?ID=<%=listaPed.getId()%>">Altera</a> - <a href="validaExcluiPedido.jsp?ID=<%=listaPed.getId()%>">Excluir</a> <br>
            <% } %>
       <% } else { %>
            LISTA VAZIA
       <% } %>

    </div>

    </div>
    </body>
</html>
