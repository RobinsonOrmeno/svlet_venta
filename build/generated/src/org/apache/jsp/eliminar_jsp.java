package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import app.domain.FormaPagoDTO;
import app.domain.CursoDTO;
import java.util.List;
import app.domain.InscripcionDTO;
import java.util.List;
import java.util.List;
import app.domain.InscripcionDTO;

public final class eliminar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    List<InscripcionDTO> aux1 = (List) request.getAttribute("lista");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("          <link rel=\"stylesheet\"  href=\"css/bootstrap.min.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Eliminar</h1>\n");
      out.write("        <div>\n");
      out.write("            <h2>Ingrese el ID a eliminar</h2>\n");
      out.write("            <form>\n");
      out.write("                ID: <input type=\"text\" name=\"buscaID\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td><a href=\"index.jsp\" >Ir al menú</a> </td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("        </center>\n");
      out.write("    \n");
      out.write("    <br>\n");
      out.write("    <table id=\"tabla\"  align=\"center\" width=\"289\" border=\"1\" class=\"datos_form\">\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>NOMBRE</th>\n");
      out.write("                <th>TELEFONO</th>\n");
      out.write("                <th>CURSO</th>\n");
      out.write("                <th>FORMA PAGO</th>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");
 for (InscripcionDTO dto : aux1) {
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(dto.getIdCurso());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(dto.getNombre());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(dto.getTelefono());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(dto.getIdCurso());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(dto.getIdFormaPago());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("        </table>\n");
      out.write("     <script src=\"js/jquery.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
