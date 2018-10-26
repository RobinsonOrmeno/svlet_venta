
<%
    int idInsc = (Integer) request.getAttribute("idInsc");
%>

<html> 
    <body>
    <center>
        <h1>Felicitaciones</h1>
        Su codigo de inscripcion es: <%=idInsc%>
        
        <table>
		<tr>
			<td><a href="preInscripcion" >Ir al menú</a> </td>
		</tr>
	</table>
        </center>
    </body>
</html>

