<%-- 
    Document   : alteraUsuario.jsp
    Created on : 08/04/2021, 20:13:33
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pizzacliente.model.bean.Pedido" %>
<%@page import="pizzacliente.controller.ControlePedido" %>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Pedido pedEntrada = new Pedido(id);
    ControlePedido pedCont = new ControlePedido();
    Pedido pedSaida = pedCont.buscar(pedEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>ALTERA</h1>
        <form name="validaAlteraPedido" action="validaAlteraPedido.jsp" method="post">
            ID <%=pedSaida.getId()%> <br>
            SABOR <input type="text" name="SABOR" value="<%=pedSaida.getSabor()%>"> <br>
            TAMANHO <input type="text" name="TAMANHO" value="<%=pedSaida.getTamanho()%>"> <br>
            BORDA <input type="text" name="BORDA" value="<%=pedSaida.getBorda()%>"> <br>
            OBS <input type="text" name="OBS" value="<%=pedSaida.getObs()%>"> <br>
            BEBIDA <input type="text" name="BEBIDA" value="<%=pedSaida.getBebida()%>"> <br>
           
           
            <input type="hidden" name="ID" value="<%=pedSaida.getId()%>"> <br>
            <input type="submit" name="ALTERAR" value="ALTERAR"> <br>
        </form>
    </div>
    </body>
</html>