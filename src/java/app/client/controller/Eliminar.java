/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.controller;

import app.domain.InscripcionDTO;
import app.logical.Facade;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "Eliminar", urlPatterns = {"/Eliminar"})
public class Eliminar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      //  int id = Integer.parseInt(request.getParameter("id"));
           Facade f = new Facade();
           InscripcionDTO dto = new InscripcionDTO();
            //dto.setIdInsc(id_inscripcion);
          //  f.eliminar(0)
           
        // obtengo las colecciones 
        List<InscripcionDTO> aux = f.obtenerListado();

        // adjunto las colecciones al request
        request.setAttribute("lista", aux);

        // redirecciono el request a la pagina JSP  
        request.getRequestDispatcher("eliminar.jsp")
                .forward(request, response);
     
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Facade f = new Facade();
        f.eliminar(id);
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            out.print("<link rel=\"stylesheet\"  href=\"css/bootstrap.min.css\">>"); 
            out.print("<link rel=\"stylesheet\"  href=\"css/estilos.css\">");
            out.print("<center>");
            out.print("Inscripcion eliminada  N°: " +id );
            out.print("</br>");
              out.print("<button class=\"btn btn-secondary\" onclick=\"location.href='index.jsp'\">Inicio</button>");
            out.print("</center>");
        
     
    }
    }

}
