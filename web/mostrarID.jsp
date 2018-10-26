<%@page import="app.domain.InscripcionDTO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    InscripcionDTO aux1 = (InscripcionDTO) request.getAttribute("dtoID");
%>
<!DOCTYPE html>
<html>
    <head>
         <link href="Estilo.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalle ID</title>
    </head>
    <body>
      
    <center>
        
        <h1>RESULTADO DE LA CONSULTA</h1>
          <div>
            <form action="buscarID" method="GET" >
                ID <input type="text" name="id">
                <input type="submit" value="Buscar">
            </form>
        </div>
        <br>
         <table id="tabla"  align="center" width="289" border="1" class="datos_form">
            <tr>
                <th>ID</th>
                <th>NOMBRE</th>
                <th>TELEFONO</th>
                <th>CURSO</th>
                <th>FORMA PAGO</th>
            </tr>
            <tr>
                <td><%=aux1.getIdInsc()%></td>
                <td><%=aux1.getNombre()%></td>
                <td><%=aux1.getTelefono()%></td>
                <td><%=aux1.getIdCurso()%></td>
                <td><%=aux1.getIdFormaPago()%></td>
                
                
                
            </tr>
              </center>

        <br>
        <a href="index.jsp" >Ir al menú</a>
    </body>
    
    
</html>
