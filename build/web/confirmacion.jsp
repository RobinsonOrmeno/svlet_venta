
<%
    int idInsc = (Integer) request.getAttribute("idInsc");
%>

<html> 
    <head>
          <link rel="stylesheet"  href="css/bootstrap.min.css">
          <link rel="stylesheet"  href="css/estilos.css">
        
    </head>
    <body>
    <center>
        <h1>Felicitaciones</h1>
        Su codigo de inscripcion es: <%=idInsc%>
        
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

