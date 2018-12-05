package org.apache.jsp.restrito.pacientes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class atualizar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("    \n");
      out.write("        ");

            //Conexão com o banco
            Connection con;
            //String url = "jdbc:mysql://localhost:3306/grupo1";
            //String Driver = "com.mysql.jdbc.Driver";
            //String user = "root";
           // String chave = "";
            String url="jdbc:mysql://davesmartins.com.br/grupo1_";
            String Driver="com.mysql.jdbc.Driver";
            String user="grupo1";
            String chave="Dts7I5zQb8iPcDqq";
            Class.forName(Driver);
            con = DriverManager.getConnection(url, user, chave);
            PreparedStatement ps;
           //Listar os pacientes
            Statement smt;
            ResultSet rs;
            smt = con.createStatement();
            rs = smt.executeQuery("select * from paciente");
         
        
      out.write("\n");
      out.write("        \n");
      out.write("              \n");
      out.write("        <br>\n");
      out.write("        <div >               \n");
      out.write("            <!--<a  class=\"btn btn-success\" href=\"Agregar.jsp\">Nuevo Registro</a> Esto es Cuando se Crea un nuevo Archivo Agregar.jsp -->         \n");
      out.write("            <fieldset> \n");
      out.write("            <table border=\"3\" width=\"2\" cellspacing=\"2\" cellpadding=\"2\" >\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Id</th>\n");
      out.write("                            <th>Nome</th>\n");
      out.write("                            <th>Cpf</th>\n");
      out.write("                            <th>Telefone</th>\n");
      out.write("                            <th>Email</th>\n");
      out.write("                         \n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                  \n");
      out.write("                     \n");
      out.write("                  \n");
      out.write("                        ");

                            while (rs.next()) {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print( rs.getString("Id"));
      out.write("</td>\n");
      out.write("                            <td >");
      out.print( rs.getString("Nome"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("Cpf"));
      out.write("</td>\n");
      out.write("                            <td >");
      out.print( rs.getString("Telefone"));
      out.write("</td>\n");
      out.write("                            <td >");
      out.print( rs.getString("Email"));
      out.write("</td>\n");
      out.write("                            \n");
      out.write("                            <td >\n");
      out.write("                             \n");
      out.write("                                <!-- <input type=\"hidden\" value=\"<//%= rs.getInt(\"Id_Usuario\")%>\" id=\"Editar\"/>\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-warning\" data-toggle=\"modal\" data-target=\"#myModal1\" value=\"Editar\"/>  -->\n");
      out.write("                             <a href=\"Delete.jsp?id=");
      out.print( rs.getInt("Id"));
      out.write("\" ><input type=\"button\" value=\"Deletar\" /></a>\n");
      out.write("                             <a href=\"Editar.jsp?id=");
      out.print( rs.getInt("Id"));
      out.write("\" ><input type=\"button\" value=\"Editar\" /></a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                </table>\n");
      out.write("                </fieldset>\n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("                <a href=\"index.jsp\" ><input type=\"button\" value=\"Cadastrar\" /></a>\n");
      out.write("\n");
      out.write("            </div>        \n");
      out.write("        <div>          \n");
      out.write("        \n");
      out.write("            ");

                 String nome, cpf, telefone, email, senha;
                    nome=request.getParameter("txtNome");
                    cpf=request.getParameter("txtCpf");  
                    telefone=request.getParameter("txtTelefone");
                    email=request.getParameter("txtEmail");
                    senha=request.getParameter("txtSenha");
                   if(nome!=null && cpf!=null && telefone!=null && email!=null){
                     ps=con.prepareStatement("insert into paciente(Nome, Cpf, Telefone, Email, Senha)values('"+ nome +"','"+ cpf +"','"+ telefone +"','"+ email +"','"+ senha +"')");
                     ps.executeUpdate();         
                     response.sendRedirect("atualizar.jsp");
           
                    }
            
      out.write("\n");
      out.write("        </div>        \n");
      out.write(" \n");
      out.write("        ");
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
