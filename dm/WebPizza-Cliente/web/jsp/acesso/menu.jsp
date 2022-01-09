<%-- 
    Document   : menu
    Created on : 09/04/2021, 10:01:00
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pizzacliente.model.bean.Usuario" %>
<%@page import="pizzacliente.controller.ControleUsuario" %>

<%
    String login = request.getParameter("LOGIN");
    String senha = request.getParameter("SENHA");
    Usuario uEntrada = new Usuario(login,senha);
    ControleUsuario contUsu = new ControleUsuario();
    Usuario uSaida = contUsu.valida(uEntrada);
%>

<!DOCTYPE html>
<html>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
    <h1>MENU</h1> <br>
    <% if(uSaida != null) { %> 
        Usuario = <%=uSaida.getId()%> | <%=uSaida.getLogin()%> | <%=uSaida.getSenha()%> | <%=uSaida.getStatus()%> | <%=uSaida.getTipo()%> <br>
        <h1>Usuario</h1> 
        <a href="../usuario/buscaUsuario.jsp">Busca</a> 
        | <a href="../usuario/listaUsuario.jsp">Lista</a> 
        | <a href="../usuario/inseriUsuario.jsp">Inserir</a>
        
        <h1>Cliente</h1> 
        <a href="../cliente/buscaCliente.jsp">Busca</a> 
        | <a href="../cliente/listaCliente.jsp">Lista</a> 
        | <a href="../cliente/inseriCliente.jsp">Inserir</a>
        
        <h1>Pedido</h1> 
        <a href="../pedido/buscaPedido.jsp">Busca</a> 
        | <a href="../pedido/listaPedido.jsp">Lista</a> 
        | <a href="../pedido/inseriPedido.jsp">Inserir</a>
        
         <h1>ClientePedido</h1> 
        <a href="../clientepedido/buscaClientePedido.jsp">Busca</a> 
        | <a href="../clientepedido/listaClientePedido.jsp">Lista</a> 
        | <a href="../clientepedido/inseriClientePedido.jsp">Inserir</a>
        
        
        
    <% } else { %> 
        <h1>Usuário Invalido</h1> 
    <% } %> 
    </div>
   </body>
</html>
