<%-- 
    Document   : inseriUsuario
    Created on : 08/04/2021, 20:37:49
    Author     : User
--%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/formatacao.inc" %>
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>INSERIR</h1>
        <form name="validaInseriCliente" action="validaInseriCliente.jsp" method="post">
            NOME <input type="text" name="NOME" value=""> <br>
            TELEFONE <input type="text" name="TELEFONE" value=""> <br>
            ENDERECO <input type="text" name="ENDERECO" value=""> <br>
          
            <input type="submit" name="INSERIR" value="INSERIR"> <br>
        </form>
    </div>
   </body>
</html>