<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <div class="container">
        <form action="buscarID" method="GET">
            <label for="id">ID</label>
            <input class="form-control" type="text" name="id" required>
            <input type="submit" value="Buscar">
        </form>
             <button class="btn btn-secondary" onclick="location.href='index.jsp'">Inicio</button>
        </div>
        </center>
     <script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
    </body>
</html>
