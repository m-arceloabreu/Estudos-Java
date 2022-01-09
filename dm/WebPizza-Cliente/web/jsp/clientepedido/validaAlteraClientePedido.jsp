<%-- 
    Document   : validaAlteraUsuario.jsp
    Created on : 08/04/2021, 20:26:56
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="pizzacliente.model.bean.ClientePedido" %>
<%@page import="pizzacliente.controller.ControleClientePedido" %>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    int idCli = Integer.parseInt(request.getParameter("SELECTCLIENTE"));
    int idPed =Integer.parseInt (request.getParameter("SELECTPEDIDO"));
    String servir = request.getParameter("LOCAL DE RETIRADA");
    String paga = request.getParameter("FORMA DE PAGAMENTO");
    
   

    ClientePedido cpEntrada = new ClientePedido(id,idCli,idPed,servir,paga);
    ControleClientePedido cpCont = new ControleClientePedido();
    ClientePedido cpSaida = cpCont.alterar(cpEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>ALTERAÇÃO CONCLUIDA</h1>
        ID = <%=cpSaida.getId()%> <br>
        IDCLI = <%=cpSaida.getIdCli()%> <br>
        IDPED = <%=cpSaida.getIdPed()%> <br>
        SERVIR = <%=cpSaida.getServir()%> <br>
        PAGA = <%=cpSaida.getPaga()%> <br>
        
        
    </div>
    </body>
</html>
