<%-- 
    Document   : validaBuscaUsuario
    Created on : 09/04/2021, 10:17:33
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pizzacliente.model.bean.ClientePedido" %>
<%@page import="pizzacliente.controller.ControleClientePedido" %>

<%
    int ID = Integer.parseInt(request.getParameter("ID"));
   ClientePedido cpEntrada = new ClientePedido(ID);
   ControleClientePedido cpCont = new ControleClientePedido();
   ClientePedido cpSaida = cpCont.buscar(cpEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>BUSCA</h1> <br>
        <% if (cpSaida != null) { %> 
            ClientePedido = ID = <%=cpSaida.getId()%> | IDCLIENTE =<%=cpSaida.getIdCli()%> | IDPEDIDO = <%=cpSaida.getIdPed()%> | SERVIR = <%=cpSaida.getServir()%> |FORMA DE PAGAMENTO = <%=cpSaida.getPaga()%> 
            | SABOR = <%=cpSaida.getPed().getSabor()%>  | NOME CLIENTE = <%=cpSaida.getCli().getNome()%> 
            
            <% } else { %> 
            ClientePedido = Não encontrado
        <% } %> 
    </div>
    </body>
</html>
