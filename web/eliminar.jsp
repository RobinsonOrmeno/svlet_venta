<%@page import="java.util.List"%>
<%@page import="app.domain.InscripcionDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
  List<InscripcionDTO> aux1 = (List) request.getAttribute("lista");
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet"  href="css/bootstrap.min.css">
          <link rel="stylesheet"  href="css/estilos.css">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Eliminar</h1>
        <div class="container">
            <h2>Ingrese el ID a eliminar</h2>
             <form method="POST" action="Eliminar" >
               
                 <input class="form-control" type="text" name="id" required>
              <input class="btn btn-secondary" type="submit" value="eliminar" >             
                
            </form>
            
            
      
        <br>
        
        <table>
		<tr>
			<td><button class="btn btn-secondary" onclick="location.href='index.jsp'">Inicio</button> </td>
                        
                        
		</tr>
      
	</table>
        <br>
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
        <br>
        
        </center>
    
    <br>
    
     <script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
    </body>
</html>
