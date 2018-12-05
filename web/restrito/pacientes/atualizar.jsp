
<%@include file="/pagina/header.jsp" %>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    
        <%
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
         
        %>
        
              
        <br>
        <div >               
            <!--<a  class="btn btn-success" href="Agregar.jsp">Nuevo Registro</a> Esto es Cuando se Crea un nuevo Archivo Agregar.jsp -->         
            <fieldset> 
            <table border="3" width="2" cellspacing="2" cellpadding="2" >
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nome</th>
                            <th>Cpf</th>
                            <th>Telefone</th>
                            <th>Email</th>
                         
                        </tr>
                    </thead>
                  
                     
                  
                        <%
                            while (rs.next()) {
                        %>
                        <tr>
                            <td><%= rs.getString("Id")%></td>
                            <td ><%= rs.getString("Nome")%></td>
                            <td><%= rs.getString("Cpf")%></td>
                            <td ><%= rs.getString("Telefone")%></td>
                            <td ><%= rs.getString("Email")%></td>
                            
                            <td >
                             
                                <!-- <input type="hidden" value="<//%= rs.getInt("Id_Usuario")%>" id="Editar"/>
                                <input type="submit" class="btn btn-warning" data-toggle="modal" data-target="#myModal1" value="Editar"/>  -->
                             <a href="Delete.jsp?id=<%= rs.getInt("Id")%>" ><input type="button" value="Deletar" /></a>
                             <a href="Editar.jsp?id=<%= rs.getInt("Id")%>" ><input type="button" value="Editar" /></a>
                            </td>
                        </tr>
                        <%}%>
                </table>
                </fieldset>
                
                <br>
                <a href="index.jsp" ><input type="button" value="Cadastrar" /></a>

            </div>        
        <div>          
        
            <%
                 String nome, cpf, telefone, email, senha;
                    nome=request.getParameter("txtNome");
                    cpf=request.getParameter("txtCpf");  
                    telefone=request.getParameter("txtTelefone");
                    email=request.getParameter("txtEmail");
                    senha=request.getParameter("txtSenha");
                   if(nome!=null && cpf!=null && telefone!=null && email!=null && senha!=null){
                     ps=con.prepareStatement("insert into paciente(Nome, Cpf, Telefone, Email, Senha)values('"+ nome +"','"+ cpf +"','"+ telefone +"','"+ email +"','"+ senha +"')");
                     ps.executeUpdate();         
                     response.sendRedirect("atualizar.jsp");
           
                    }
            %>
        </div>        
 
        <%@include file="/pagina/footer.jsp" %>