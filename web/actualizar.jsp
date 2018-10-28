<%@page import="app.domain.FormaPagoDTO"%>
<%@page import="app.domain.CursoDTO"%>
<%@page import="java.util.List"%>
<%@page import="app.domain.InscripcionDTO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
   <%@page import="java.util.List"%>
<%@page import="app.domain.InscripcionDTO"%>


<%
    List<InscripcionDTO> aux1 = (List) request.getAttribute("lista");
%>

<%
   List<CursoDTO> cursos;
   List<FormaPagoDTO> formasPago;

    // obtengo los atributos que llegan en el request
   cursos = (List)request.getAttribute("cursos");
   formasPago = (List)request.getAttribute("formasPago");
   
    

  
%>

<!DOCTYPE html>
<html>
    <head>
          <link rel="stylesheet"  href="css/bootstrap.min.css">
          <link rel="stylesheet"  href="css/estilos.css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <center>
        <h1>Actualizar datos</h1>
        <br>
        
            <form method="post" action="Actualiza" >
        <label for="buscarID">Buscar por ID </label>
        <input class="form-control" type="text" name="buscarID" required>
        </br>
          <br>
        <label>Nuevo curso </label>
        <select class="form-control" name="idCurso">
            <br>
          <br>
<%
      for(CursoDTO dto: cursos)
      {
%>
         <option class="form-control" value="<%=dto.getIdCurso()%>">
            <%=dto.getDescripcion()%>
         </option>    
<%
      }
%>      
      </select>
          <br>
          <br>
          <label>Nueva forma de pago</label>
        <select class="form-control" method="POST" name="idFormaPago">
<%
      for(FormaPagoDTO dto: formasPago)
      {
%>
         <option class="form-control" value="<%=dto.getIdFormaPago()%>">
            <%=dto.getDescripcion()%>
         </option>      
<%
      }
%>      
      </select><br> 
      <br>
          <br>
           <table>
		<tr>
                    <td>  <input class="btn btn-primary" type="submit" name="Enviar" value="Modificar"></td>
    			 <td><button class="btn btn-secondary" onclick="location.href='index.jsp'">Inicio</button> </td>
		</tr>
	</table>
     
          
            </form>
          
          </div>
          <br>
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
        <br>
           
        
    </center>
         <script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
        
    </body>
</html>
