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
         <link href="Estilo.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <center>
        <h1>Actualizar datos</h1>
        <br>
        <div >
            <form method="post" action="Actualiza" >
        <label>Buscar por ID </label>
        <input type="text" name="buscarID">
        </br>
          <br>
        <label>Nuevo curso </label>
        <select name="idCurso">
            <br>
          <br>
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
      </select>
          <br>
          <br>
          <label>Nueva forma de pago</label>
        <select method="POST" name="idFormaPago">
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
      <br>
          <br>
      <input type="submit" name="Enviar" value="Modificar">
          
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
        <br>
            <table>
		<tr>
			<td><a href="index.jsp" >Ir al menú</a> </td>
		</tr>
	</table>
        
    </center>
        
    </body>
</html>
