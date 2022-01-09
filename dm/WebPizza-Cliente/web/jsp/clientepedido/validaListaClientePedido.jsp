<%-- 
    Document   : validaBuscaUsuario
    Created on : 09/04/2021, 10:17:33
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="pizzacliente.model.bean.ClientePedido" %>
<%@page import="pizzacliente.controller.ControleClientePedido" %>

<%
    String servir = request.getParameter("SERVIR");
    ClientePedido ccpEntrada = new ClientePedido(servir);
    ControleClientePedido contCp = new ControleClientePedido();
    List<ClientePedido> ccpSaida = contCp.listar(ccpEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>LISTA</h1> <br>
        <% if(!(ccpSaida.isEmpty())) { %>
            <% for (ClientePedido listaCcp :ccpSaida){ %>
            ClientePedido = ID = <%=listaCcp.getId()%> | IDCLI = <%=listaCcp.getIdCli()%> | IDPED = <%=listaCcp.getIdPed()%> | LOCAL DE RETIRADA = <%=listaCcp.getServir()%> | FORMA DE PAGAMENTO = <%=listaCcp.getPaga()%>  - <a href="alteraClientePedido.jsp?ID=<%=listaCcp.getId()%>">Altera</a> - <a href="validaExcluiClientePedido.jsp?ID=<%=listaCcp.getId()%>">Excluir</a> <br>
            <% } %>
       <% } else { %>
            LISTA VAZIA
       <% } %>

    </div>

    </div>
    </body>
</html>
