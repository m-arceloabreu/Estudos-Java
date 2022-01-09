<%-- 
    Document   : alteraUsuario.jsp
    Created on : 08/04/2021, 20:13:33
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pizzacliente.model.bean.Cliente" %>
<%@page import="pizzacliente.controller.ControleCliente" %>

<%
    int ID = Integer.parseInt(request.getParameter("ID"));
    Cliente cliEntrada = new Cliente(ID);
    ControleCliente cliCont = new ControleCliente();
    Cliente cliSaida = cliCont.buscar(cliEntrada);
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>ALTERA</h1>
        <form name="validaAlteraCliente" action="validaAlteraCliente.jsp" method="post">
            ID <%=cliSaida.getId()%> <br>
            
            NOME <input type="text" name="NOME" value="<%=cliSaida.getNome()%>"> <br>
            TELEFONE <input type="text" name="TELEFONE" value="<%=cliSaida.getTelefone()%>"> <br>
            ENDERECO <input type="text" name="ENDERECO" value="<%=cliSaida.getEndereco()%>"> <br>
           
            <input type="hidden" name="ID" value="<%=cliSaida.getId()%>"> <br>
            <input type="submit" name="ALTERAR" value="ALTERAR"> <br>
        </form>
    </div>
    </body>
</html>