<%-- 
    Document   : validaInseriUsuario
    Created on : 08/04/2021, 20:39:51
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pizzacliente.model.bean.Pedido" %>
<%@page import="pizzacliente.controller.ControlePedido" %>

<%
    String sabor = request.getParameter("SABOR");
    String tamanho = request.getParameter("TAMANHO");
    String borda = request.getParameter("BORDA");
    String obs = request.getParameter("OBS");
    String bebida = request.getParameter("BEBIDA");
    

    Pedido pedEntrada = new Pedido(0,sabor,tamanho,borda,obs,bebida);
    ControlePedido pedCont = new ControlePedido();
    Pedido pedSaida = pedCont.inserir(pedEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>INCLUSÃO CONCLUIDA</h1>
        ID = <%=pedSaida.getId()%> <br>
        SABOR = <%=pedSaida.getSabor()%> <br>
        TAMANHO = <%=pedSaida.getTamanho()%> <br>
        BORDA = <%=pedSaida.getBorda()%> <br>
        OBS = <%=pedSaida.getObs()%> <br>
        BEBIDA = <%=pedSaida.getBebida()%> <br>
        
    </div>
    </body>
</html>
