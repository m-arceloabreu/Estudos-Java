<%-- 
    Document   : validaAlteraUsuario.jsp
    Created on : 08/04/2021, 20:26:56
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pizzacliente.model.bean.Pedido" %>
<%@page import="pizzacliente.controller.ControlePedido" %>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    String sabor = request.getParameter("SABOR");
    String tamanho = request.getParameter("TAMANHO");
    String borda = request.getParameter("BORDA");
    String obs = request.getParameter("OBS");
    String bebida = request.getParameter("BEBIDA");
    

    Pedido peEntrada = new Pedido(id,sabor,tamanho,borda,obs,bebida);
    ControlePedido peCont = new ControlePedido();
    Pedido peSaida = peCont.alterar(peEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>ALTERAÇÃO CONCLUIDA</h1>
        ID = <%=peSaida.getId()%> <br>
        SABOR = <%=peSaida.getSabor()%> <br>
        TAMANHO = <%=peSaida.getTamanho()%> <br>
        BORDA = <%=peSaida.getBorda()%> <br>
        OBS = <%=peSaida.getObs()%> <br>
        BEBIDA = <%=peSaida.getBebida()%> <br>
    </div>
    </body>
</html>