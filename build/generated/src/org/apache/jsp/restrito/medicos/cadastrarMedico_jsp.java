package org.apache.jsp.restrito.medicos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.JOptionPane;
import java.sql.*;

public final class cadastrarMedico_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/pagina/header.jsp");
    _jspx_dependants.add("/pagina/footer.jsp");
  }

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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>ConsulMed</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/style.css\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header class=\"main-header\">\n");
      out.write("            <img src=\"img/logo.png\" />\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"dados-estatisticos.jsp\">Dados Estatísticos</a></li>\n");
      out.write("                    <li><a href=\"acesso-pacientes.jsp\">Acesso Pacientes</a></li>\n");
      out.write("                    <li><a href=\"acesso-medicos.jsp\">Acesso Médicos</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<form name=\"frm\"  method=\"post\">   \n");
      out.write("     <h1>Cadastro de Medicos</h1>\n");
      out.write("<fieldset>\n");
      out.write("   <table >\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <label for=\"nome\">Nome: </label>\n");
      out.write("        </td>\n");
      out.write("        <td align=\"left\">\n");
      out.write("            <input type=\"text\" name=\"txtNome\" id=\"txtNome\" required=\"required\">\n");
      out.write("        </td>\n");
      out.write("    </tr>  \n");
      out.write("     \n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <label>Area de Atuação:</label>\n");
      out.write("        </td>\n");
      out.write("        <td align=\"left\">\n");
      out.write("            <input type=\"text\" name=\"txtArea\" id=\"txtArea\" required=\"required\"> \n");
      out.write("        </td>   \n");
      out.write("    </tr>\n");
      out.write(" \n");
      out.write("   \n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <label>Numero CRM: </label>\n");
      out.write("        </td>\n");
      out.write("        <td align=\"rigth\">\n");
      out.write("            <input type=\"text\" name=\"txtCRM\" id=\"txtCRM\" required=\"required\"> \n");
      out.write("        </td> \n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("       \n");
      out.write("    \n");
      out.write(" </table> \n");
      out.write("</fieldset>\n");
      out.write("\n");
      out.write("<br />\n");
      out.write("\n");
      out.write("\n");
      out.write("<input  type=\"submit\" value=\"Enviar\">\n");
      out.write("<input  type=\"reset\" value=\"Limpar\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write(" ");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <footer class=\"main-footer\">\n");
      out.write("            <p>ConsulMed | 2018</p>\n");
      out.write("        </footer>\n");
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
