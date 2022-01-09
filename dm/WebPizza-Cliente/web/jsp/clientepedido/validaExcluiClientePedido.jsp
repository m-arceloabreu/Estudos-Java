<%-- 
    Document   : validaExcluiUsuario
    Created on : 08/04/2021, 20:34:03
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pizzacliente.model.bean.ClientePedido" %>
<%@page import="pizzacliente.controller.ControleClientePedido" %>




<%
    int id = Integer.parseInt(request.getParameter("ID"));
    ClientePedido cpEntrada = new ClientePedido(id);
    ControleClientePedido cpCont = new ControleClientePedido();
    ClientePedido cpSaida = cpCont.excluir(cpEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>VALIDA EXCLUSÃO</h1>
        ID = <%=cpSaida.getId()%> <br>
        IDCLI = <%=cpSaida.getIdCli()%> <br>
        IDPED = <%=cpSaida.getIdPed()%> <br>
        SERVIR = <%=cpSaida.getServir()%> <br>
        PAGA = <%=cpSaida.getPaga()%> <br>
       
        
    </div>
    </body>
</html>