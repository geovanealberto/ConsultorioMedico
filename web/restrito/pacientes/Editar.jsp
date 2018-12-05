
<%@include file="/pagina/header.jsp" %>
<%@page import="java.sql.*"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

   
        <%
       //Conectando com o Banco de Dados
       Connection con;
       String url="jdbc:mysql://davesmartins.com.br/grupo1_";
       String Driver="com.mysql.jdbc.Driver";
       String user="grupo1";
       String chave="Dts7I5zQb8iPcDqq";
       Class.forName(Driver);
       con=DriverManager.getConnection(url,user,chave);
       //Emnpezamos Listando los Datos de la Tabla Usuario pero de la fila seleccionada
       PreparedStatement ps;
       ResultSet rs;
       int id=Integer.parseInt(request.getParameter("id"));
       ps=con.prepareStatement("select * from paciente where Id="+id);
       rs=ps.executeQuery();
       while(rs.next()){
                         %>
        <div >
            <fieldset>
            <h1>Modificar Registro</h1>
            <hr>
            <form action="" method="post" >
            <table>  
                <tr> 
                    <td>
                        ID:
                        <input type="text" readonly=""  value="<%= rs.getInt("Id")%>"/>
                    </td>
                </tr>   
                
                <tr> 
                    <td>
                        Nome:
                        <input type="text" name="txtNome" value="<%= rs.getString("Nome")%>"/><br>
                    </td>
                </tr>
                
                <tr> 
                    <td>
                        Cpf:
                        <input type="text" name="txtCpf"  value="<%= rs.getString("Cpf")%>"/>
                    </td>
                </tr>
                
                <tr> 
                    <td>
                 Telefone:
                <input type="text" name="txtTelefone"  value="<%= rs.getString("Telefone")%>"/>
                 </td>
                </tr>
                 
                <tr> 
                    <td>
                  Email:
                <input type="text" name="txtEmail"  value="<%= rs.getString("Email")%>"/>
                    </td>
                </tr>
                
                <tr> 
                    <td>
                        Senha:
                        <input type="text" name="txtSenha"  value="<%= rs.getString("Senha")%>"/>
                    </td>
                </tr>
                 
            </table> 
              <br>
            <input type="submit" value="Guardar" />
            <a href="atualizar.jsp"><input type="button" value="Regressar" /></a>   
            </form>
            <%}%>
             </fieldset>
              
        </div>

<%
    String nome,cpf,telefone,email,senha;
      nome=request.getParameter("txtNome");
      cpf=request.getParameter("txtCpf");
      telefone=request.getParameter("txtTelefone");
      email=request.getParameter("txtEmail");
      senha=request.getParameter("txtSenha");
      
       if(nome!=null && cpf!=null && telefone!=null && email!=null && senha!=null){
           ps=con.prepareStatement("update paciente set Nome='"+nome+"', Cpf='"+cpf+"',Telefone='"+telefone+"', Email='"+email+"',Senha='"+senha+"' where Id="+id);
           ps.executeUpdate();
           response.sendRedirect("atualizar.jsp");
       }
       
       
%>

<%@include file="/pagina/footer.jsp" %>