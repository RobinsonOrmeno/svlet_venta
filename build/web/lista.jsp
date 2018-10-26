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
        <title>Listado de Inscripciones</title>
    </head>
    <body>
    <center>
        <h1>Listado de inscripciones</h1>
        </br>
        <form action="buscarID" method="GET">
            Buscar ID <input type="text" name="id">
            <input type="submit" value="Buscar">
        </form>
        <br>

        <table id="tabla"  align="center" width="289" border="1" class="datos_form">
            <tr>
                <th>ID</th>
                <th>NOMBRE</th>
                <th>TELEFONO</th>
                <th>CURSO</th>
                <th>FORMA PAGO</th>
            </tr>

            <% for (InscripcionDTO dto : aux1) {%>
            <tr>
                <td><%=dto.getIdCurso()%></td>
                <td><%=dto.getNombre()%></td>
                <td><%=dto.getTelefono()%></td>
                <td><%=dto.getIdCurso()%></td>
                <td><%=dto.getIdFormaPago()%></td>
            </tr>
            <% }%>
        </table>
        
         <table>
		<tr>
			<td><a href="index.jsp" >Ir al menú</a> </td>
                        
		</tr>
	</table>
        </center>
    </body>
</html>
