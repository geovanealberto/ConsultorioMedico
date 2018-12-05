package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
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
      out.write("        <link rel=\"stylesheet\" href=\"/style.css\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header class=\"main-header\">\n");
      out.write("            <img src=\"/logo.png\" />\n");
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
      out.write("<article class=\"top-content\">\n");
      out.write("    <header>\n");
      out.write("        <h1>Bem vindo(a)!</h1>\n");
      out.write("    </header>\n");
      out.write("    <footer>\n");
      out.write("        ConsulMed. Todos os direitos reservados &copy;\n");
      out.write("    </footer>\n");
      out.write("    <p>A ConsulMed é a mais completa ferramenta para marcações de consultas médicas online!</p>\n");
      out.write("    <p>Com a ConsulMed você consegue encontrar facilmente o seu médico de confiança e agendar sua consulta em poucos cliques! Prático, não?</p>\n");
      out.write("    <p><a class=\"home\" href=\"fale-conosco.jsp\">Possui alguma dúvida? Entre em contato conosco!</a></p>\n");
      out.write("    <p>Acesse sua conta clicando <a class=\"home\" href=\"acesso-pacientes.jsp\">aqui</a>. Ou faça o acesso através do menu <strong>Acesso Pacientes</strong>.</p>\n");
      out.write("    <p><a class=\"home\" href=\"index.jsp\">Retornar à página de boas vindas.</a></p>\n");
      out.write("</article>\n");
      out.write("\n");
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
      out.write('\n');
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
