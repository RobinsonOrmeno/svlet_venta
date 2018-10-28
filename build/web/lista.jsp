<%@page import="java.util.List"%>
<%@page import="app.domain.InscripcionDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    List<InscripcionDTO> aux1 = (List) request.getAttribute("lista");
%>

<!DOCTYPE html>
<html>
    <head>
            <link href="Estilo.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet"  href="css/bootstrap.min.css">
          <link rel="stylesheet"  href="css/estilos.css">
        <title>Listado de Inscripciones</title>
    </head>
    <body>
    <center>
        <h1>Listado de inscripciones</h1>
        </br>
        <form action="buscarID" method="GET">
            Buscar ID <input type="text" name="id" required>
            <input class="btn btn-secondary" type="submit" value="Buscar">
        </form>
        <br>
            <table>
		<tr>
			<td><button class="btn btn-secondary" onclick="location.href='index.jsp'">Inicio</button> </td>
                        
		</tr>
	</table>
        <div class="container">
        <table class="table table-striped" id="tabla"  align="center" width="289" border="1" class="datos_form">
            <tr>
                <th>ID</th>
                <th>NOMBRE</th>
                <th>TELEFONO</th>
                <th>CURSO</th>
                <th>FORMA PAGO</th>
            </tr>

            <% for (InscripcionDTO dto : aux1) {%>
            <tr>
                <td><%=dto.getIdInsc()%></td>
                <td><%=dto.getNombre()%></td>
                <td><%=dto.getTelefono()%></td>
                <td><%=dto.getIdCurso()%></td>
                <td><%=dto.getIdFormaPago()%></td>
            </tr>
            <% }%>
            
            
        </table>
        </div>
        
     
        </center>
         <script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
    </body>
</html>
