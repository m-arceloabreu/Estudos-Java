<%-- 
    Document   : validaExcluiUsuario
    Created on : 08/04/2021, 20:34:03
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pizzacliente.model.bean.Pedido" %>
<%@page import="pizzacliente.controller.ControlePedido" %>




<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Pedido pedEntrada = new Pedido(id);
    ControlePedido pedCont = new ControlePedido();
    Pedido pedSaida = pedCont.excluir(pedEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>VALIDA EXCLUSÃO</h1>
        ID = <%=pedSaida.getId()%> <br>
        SABOR = <%=pedSaida.getSabor()%> <br>
        TAMANHO = <%=pedSaida.getTamanho()%> <br>
        BORDA = <%=pedSaida.getBorda()%> <br>
        OBS = <%=pedSaida.getObs()%> <br>
        BEBIDA = <%=pedSaida.getBebida()%> <br>
      
        
    </div>
    </body>
</html>