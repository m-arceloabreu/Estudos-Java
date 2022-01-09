<%-- 
    Document   : validaInseriUsuario
    Created on : 08/04/2021, 20:39:51
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pizzacliente.model.bean.ClientePedido" %>
<%@page import="pizzacliente.controller.ControleClientePedido" %>

<%
    int idCli = Integer.parseInt(request.getParameter("SELECTCLIENTE"));
    int idPed = Integer.parseInt(request.getParameter("SELECTPEDIDO"));
    String servir = request.getParameter("servir");
    String paga = request.getParameter("paga");
   

    ClientePedido cpEntrada = new ClientePedido(0,idCli,idPed,servir,paga);
    ControleClientePedido cpCont = new ControleClientePedido();
    ClientePedido cpSaida = cpCont.inserir(cpEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>INCLUSÃO CONCLUIDA</h1>
        ID = <%=cpSaida.getId()%> <br>
        IDCLI = <%=cpSaida.getIdCli()%> <br>
        IDPED = <%=cpSaida.getIdPed()%> <br>
        SERVIR = <%=cpSaida.getServir()%> <br>
        PAGA = <%=cpSaida.getPaga()%> <br>
       
    </div>
    </body>
</html>
