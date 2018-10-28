package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import app.domain.FormaPagoDTO;
import app.domain.CursoDTO;
import java.util.List;

public final class inscripcion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

   List<CursoDTO> cursos;
   List<FormaPagoDTO> formasPago;

    // obtengo los atributos que llegan en el request
   cursos = (List)request.getAttribute("cursos");
   formasPago = (List)request.getAttribute("formasPago");
  

      out.write("\n");
      out.write("\n");
      out.write("<html> \n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("          <link rel=\"stylesheet\"  href=\"css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("    <h1>INSCRIPCION DE CURSOS</h1>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("   <form name=\"formulario\" action=\"#\">\n");
      out.write("      Nombre: <input type=\"text\" name=\"nombre\"><br>\n");
      out.write("      <label id=\"error\" style=\"color:red\"></label>\n");
      out.write("      Telefono: <input type=\"text\" name=\"telefono\"><br>\n");
      out.write("    <label id=\"error2\" style=\"color:red\"></label>\n");
      out.write("      Cursos:\n");
      out.write("      <select name=\"idCurso\">\n");

      for(CursoDTO dto: cursos)
      {

      out.write("\n");
      out.write("         <option value=\"");
      out.print(dto.getIdCurso());
      out.write("\">\n");
      out.write("            ");
      out.print(dto.getDescripcion());
      out.write("\n");
      out.write("         </option>      \n");

      }

      out.write("      \n");
      out.write("      </select><br>\n");
      out.write("      \n");
      out.write("      Formas de pago:\n");
      out.write("      <select name=\"idFormaPago\">\n");

      for(FormaPagoDTO dto: formasPago)
      {

      out.write("\n");
      out.write("         <option value=\"");
      out.print(dto.getIdFormaPago());
      out.write("\">\n");
      out.write("            ");
      out.print(dto.getDescripcion());
      out.write("\n");
      out.write("         </option>      \n");

      }

      out.write("      \n");
      out.write("      </select><br> \n");
      out.write("      \n");
      out.write("      <input type=\"submit\" onclick=\"return validar();\" value=\"Enviar\">\n");
      out.write("     \n");
      out.write("   </form>\n");
      out.write("      \n");
      out.write("      <table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td><a href=\"index.jsp\" >Inicio</a> </td>\n");
      out.write("                       \n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("      \n");
      out.write("      </center>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("       <script src=\"js/jquery.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function validar(){\n");
      out.write("                  \n");
      out.write("              validar_nombre();\n");
      out.write("               validar_telefono(); \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function validar_nombre(){\n");
      out.write("                var nombre = document.formulario.nombre.value;\n");
      out.write("                var error = document.getElementById(\"error\");\n");
      out.write("                var valida = '/^[a-z-A-Z]{1,30}$/';\n");
      out.write("                \n");
      out.write("                if(nombre==\"\"){\n");
      out.write("                    error.textContent='Debe ingresar un nombre';\n");
      out.write("                    alert('Debe ingresar un nombre');\n");
      out.write("                    return false;\n");
      out.write("                }else if(nombre.length>30){\n");
      out.write("                    \n");
      out.write("                      error.textContent='Demasiados caracteres';\n");
      out.write("                      alert('demasiados caracteres');\n");
      out.write("                      return false;\n");
      out.write("                }\n");
      out.write("                else if(valida.test(nombre)){\n");
      out.write("                     error.textContent='Ingrese solo letras';\n");
      out.write("                     alert('Ingrese solo letras');\n");
      out.write("                      return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            function validar_telefono(){\n");
      out.write("                var telefono = document.formulario.telefono.value;\n");
      out.write("                var error = document.getElementById(\"error2\");\n");
      out.write("                var valida = '/^[a-z-A-Z]{1,15}$/';\n");
      out.write("                \n");
      out.write("                if(telefono==\"\"){\n");
      out.write("                    error.textContent='Debe ingresar un Telefono';\n");
      out.write("                    alert('Debe ingresar un Telefono');\n");
      out.write("                    return false;\n");
      out.write("                }else if(telefono.length>15){\n");
      out.write("                    \n");
      out.write("                      error.textContent='Demasiados caracteres para el telefono';\n");
      out.write("                      alert('demasiados caracteres');\n");
      out.write("                      return false;\n");
      out.write("                }\n");
      out.write("                else if(!=valida.test(telefono)){\n");
      out.write("                     error.textContent='Ingrese solo numeros';\n");
      out.write("                     alert('Ingrese solo numeros');\n");
      out.write("                      return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
