<%-- 
    Document   : alteraUsuario.jsp
    Created on : 08/04/2021, 20:13:33
    Author     : User
--%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="pizzacliente.model.bean.ClientePedido" %>
<%@page import="pizzacliente.model.bean.Cliente" %>
<%@page import="pizzacliente.model.bean.Pedido" %>
<%@page import="pizzacliente.controller.ControleClientePedido" %>
<%@page import="pizzacliente.controller.ControleCliente" %>
<%@page import="pizzacliente.controller.ControlePedido" %>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    ClientePedido cpEntrada = new ClientePedido(id);
    ControleClientePedido cpCont = new ControleClientePedido();
    ClientePedido cpSaida = cpCont.buscar(cpEntrada);
    
    Cliente cli = new Cliente("");
    Pedido ped = new Pedido("");
    ControleCliente contCli = new ControleCliente();
    ControlePedido contPed = new ControlePedido();
    List<Cliente> listaSaidaCli = contCli.listar(cli);
    List<Pedido> listaSaidaPed = contPed.listar(ped);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>ALTERA</h1>
        <form name="validaAlteraClientePedido" action="validaAlteraClientePedido.jsp" method="post">
            CLIENTE
            <select name="SELECTCLIENTE" class="browser-default">
                <% for (Cliente listaCli :listaSaidaCli){ %>
                    <%if(cpSaida.getIdCli() == listaCli.getId() ) { %>
                        <option selected value="<%=listaCli.getId()%>"><%=listaCli.getNome()%></option>
                    <% } else { %>
                        <option value="<%=listaCli.getId()%>"><%=listaCli.getNome()%></option>
                    <% } %>
                <% } %>
            </select>
            PEDIDO 
            <select name="SELECTPEDIDO" class="browser-default">
                <% for (Pedido listaPed :listaSaidaPed){ %>
                    <%if(cpSaida.getIdPed() == listaPed.getId() ) { %>
                        <option selected value="<%=listaPed.getId()%>"><%=listaPed.getSabor()%></option>
                    <% } else { %>
                        <option value="<%=listaPed.getId()%>"><%=listaPed.getSabor()%></option>
                    <% } %>
                <% } %>
            SERVIR <input type="text" name="LOCAL DE RETIRADA" value="<%=cpSaida.getServir()%>"> <br>
            PAGA <input type="text" name="FORMA DE PAGAMENTO" value="<%=cpSaida.getPaga()%>"> <br>
            
           
            <input type="hidden" name="ID" value="<%=cpSaida.getId()%>"> <br>
            <input type="submit" name="ALTERAR" value="ALTERAR"> <br>
        </form>
    </div>
    </body>
</html>