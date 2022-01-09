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
        <form name="validaInseriPedido" action="validaInseriPedido.jsp" method="post">
            SABOR <input type="text" name="SABOR" value=""> <br>
            TAMANHO <input type="text" name="TAMANHO" value=""> <br>
            BORDA <input type="text" name="BORDA" value=""> <br>
            OBS <input type="text" name="OBS" value=""> <br>
            BEBIDA <input type="text" name="BEBIDA" value=""> <br>
          
          
            <input type="submit" name="INSERIR" value="INSERIR"> <br>
        </form>
    </div>
   </body>
</html>