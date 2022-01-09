<%-- 
    Document   : inseriUsuario
    Created on : 08/04/2021, 20:37:49
    Author     : User
--%>


<%@page import="java.util.List"%>
<%@page import="pizzacliente.model.bean.ClientePedido" %>
<%@page import="pizzacliente.controller.ControleClientePedido" %>
<%@page import="pizzacliente.model.bean.Cliente" %>
<%@page import="pizzacliente.controller.ControleCliente" %>
<%@page import="pizzacliente.model.bean.Pedido" %>
<%@page import="pizzacliente.controller.ControlePedido" %>

<%
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
        <h1>INSERI</h1>
        <form name="validaInseriClientePedido" action="validaInseriClientePedido.jsp" method="post">
            ID DO CLIENTE 
            <select name="SELECTCLIENTE" class="browser-default">
                <% for (Cliente listaCli :listaSaidaCli){ %>
                    <option value="<%=listaCli.getId()%>"><%=listaCli.getNome()%></option>
                <% } %>
            </select>
            Pedido 
            <select name="SELECTPEDIDO" class="browser-default">
                <% for (Pedido listaPed :listaSaidaPed){ %>
                    <option value="<%=listaPed.getId()%>"><%=listaPed.getSabor()%></option>
                <% } %>
            </select>
            SERVIR <input type="text" name="servir" value=""> <br>
            PAGA <input type="text" name="paga" value=""> <br>
            
            <input type="submit" name="INSERIR" value="INSERIR"> <br>
        </form>
    </div>
   </body>
</html>