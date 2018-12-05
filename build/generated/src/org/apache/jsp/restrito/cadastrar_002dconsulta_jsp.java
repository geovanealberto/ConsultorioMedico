package org.apache.jsp.restrito;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrar_002dconsulta_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastrar Consulta</title>\n");
      out.write("        <link href=\"pacientes/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"col-sm-12\" style=\"text-align: center;\">\n");
      out.write("            <h1>Cadastrar Consulta</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- Linha -->\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <label for=\"LblPaciente\">Paciente</label>\n");
      out.write("                        <select id=\"ListPacientes\" class=\"form-control\">\n");
      out.write("                            <option value=\"p\">Paciente</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Linha -->\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <label for=\"LblPaciente\">Médico</label>\n");
      out.write("                        <select id=\"ListMedicos\" class=\"form-control\">\n");
      out.write("                            <option value=\"m\">Médico</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                     <!-- Linha -->\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <label for=\"LblData\">Tipo</label>\n");
      out.write("                        <input id=\"TxtTipo\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <label for=\"LblData\">Data</label>\n");
      out.write("                        <div class=\"col-10\">\n");
      out.write("                            <input id=\"TxtData\" class=\"form-control\" type=\"date\" value=\"2018-10-05\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Linha -->\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <label for=\"LblData\">Horário Inicial</label>\n");
      out.write("                        <select id=\"ListHoraInicial\" class=\"form-control\">\n");
      out.write("                            <option value=\"p\">Paciente</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <label for=\"LblData\">Horário Final</label>\n");
      out.write("                        <select id=\"ListHoraFinal\" class=\"form-control\">\n");
      out.write("                            <option value=\"p\">Paciente</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Linha -->\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <label for=\"LblData\">Observações</label>\n");
      out.write("                        <textarea id=\"TxtObservacoes\" class=\"form-control\" rows=\"8\" style=\"max-width: 100%; min-height: 100px; min-width: 100%; max-height: 400px;\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <!-- Linha -->\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <button id=\"BtnCadastrarConsulta\" type=\"submit\" class=\"btn btn-primary\">Cadastrar</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>   \n");
      out.write("              </form>\n");
      out.write("        </div>\n");
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
