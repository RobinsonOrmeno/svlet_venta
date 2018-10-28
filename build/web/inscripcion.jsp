<%@page import="app.domain.FormaPagoDTO"%>
<%@page import="app.domain.CursoDTO"%>
<%@page import="java.util.List"%>
<%
   List<CursoDTO> cursos;
   List<FormaPagoDTO> formasPago;

    // obtengo los atributos que llegan en el request
   cursos = (List)request.getAttribute("cursos");
   formasPago = (List)request.getAttribute("formasPago");
  
%>

<html> 
    
    <head>
          <link rel="stylesheet"  href="css/bootstrap.min.css">
          <link rel="stylesheet"  href="css/estilos.css">
    </head>
<body>
<center>
    <h1>INSCRIPCION DE CURSOS</h1>
    <br>
    <div class="container">
   <form name="formulario" action="posInscripcion">
       <label for="nombre">Nombre:</label>
       <input class="form-control" id="nombre" type="text" name="nombre" title="Ingresa tu nombre" required><br>
  
      <label for="telefono">Telefono:</label>
       <input class="form-control" type="text" name="telefono" title="Ingresa tu telefono" required><br>

      Cursos:
      <select class="form-control" name="idCurso">
<%
      for(CursoDTO dto: cursos)
      {
%>
         <option value="<%=dto.getIdCurso()%>">
            <%=dto.getDescripcion()%>
         </option>      
<%
      }
%>      
      </select><br>
      
      Formas de pago:
      <select class="form-control" name="idFormaPago">
<%
      for(FormaPagoDTO dto: formasPago)
      {
%>
         <option value="<%=dto.getIdFormaPago()%>">
            <%=dto.getDescripcion()%>
         </option>      
<%
      }
%>      
      </select><br> 
      
      <input class="btn btn-primary" type="submit"  value="Enviar">
     
   </form>
      
      <div class="container">
      
      <table>
		<tr>
			<td><button class="btn btn-secondary" onclick="location.href='index.jsp'">Inicio</button> </td>
                       
		</tr>
	</table>
      
      </center>
      
      
       <script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
  
        
</body>
</html>

