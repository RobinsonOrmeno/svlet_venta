/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.controller;

import app.domain.CursoDTO;
import app.domain.FormaPagoDTO;
import app.domain.InscripcionDAO;
import app.domain.InscripcionDTO;
import app.logical.Facade;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Actualiza", urlPatterns = {"/Actualiza"})
public class Actualiza extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         // obtengo el facade
        Facade f = new Facade();

        // obtengo las colecciones 
        List<CursoDTO> cursos = f.obtenerCursos();
        List<FormaPagoDTO> formasPago = f.obtenerFormasPago();
         List<InscripcionDTO> aux = f.obtenerListado();
               
       
        // adjunto las colecciones al request
        request.setAttribute("cursos", cursos);
        request.setAttribute("formasPago", formasPago);
        request.setAttribute("lista", aux);
        // redirecciono el request a la pagina JSP  
        request.getRequestDispatcher("actualizar.jsp")
                .forward(request, response);
        
        
       
    }
    
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Facade f = new Facade();
        String respuesta="";
        RequestDispatcher rd = null;
       try(PrintWriter out = response.getWriter()){
           
          if( request.getParameter("Enviar")!=null){
             InscripcionDTO dto = new InscripcionDTO();
             dto.setIdInsc(Integer.parseInt(request.getParameter("buscarID")));
            dto.setIdInsc(Integer.parseInt(request.getParameter("idCurso")));
            dto.setIdInsc(Integer.parseInt(request.getParameter("idFormaPago")));
            f.actualizar(dto);
              System.out.println("Modificado");
            request.setAttribute("respuesta", respuesta);
             
          
          }else{
              System.out.println("NOSEACTUALIZO");
          }
          
          rd = request.getRequestDispatcher("actualizar.jsp");
       }
       
   }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
             // obtengo el facade
        Facade f = new Facade();
      int id_inscripcion = Integer.parseInt(req.getParameter("buscarID"));
         
        int idCurso = Integer.parseInt(req.getParameter("idCurso"));
  
        int idFormaPago = Integer.parseInt(req.getParameter("idFormaPago"));
        
        resp.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = resp.getWriter()){
            out.print("<center>");
            out.print("Inscripcion actualizada N°: " +id_inscripcion );
            out.print("</br>");
            out.print("<td><a href=\"index.jsp\" >Ir al menú</a> </td>");
            out.print("</center>");
            req.setAttribute("buscarID", f);
             InscripcionDTO dto = new InscripcionDTO();
            dto.setIdInsc(id_inscripcion);
            dto.setIdCurso(idCurso);
        dto.setIdFormaPago(idFormaPago);
         
       f.actualizar(dto);

        }
         
           
          req.getRequestDispatcher("Actualiza")
                .forward(req, resp);
    }

    
   


}
