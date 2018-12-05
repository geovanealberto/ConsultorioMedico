
<%@include file="/pagina/header.jsp" %>  
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        <%
       //Conectando com o Banco de Dados:
       Connection con;       
       String url="jdbc:mysql://davesmartins.com.br/grupo1_";
       String Driver="com.mysql.jdbc.Driver";
       String user="grupo1";
       String chave="Dts7I5zQb8iPcDqq";
       Class.forName(Driver);
       con=DriverManager.getConnection(url,user,chave);
       //Emnpezamos Listando los Datos de la Tabla Usuario pero de la fila seleccionada
       PreparedStatement ps;       
       int id=Integer.parseInt(request.getParameter("id"));
       ps=con.prepareStatement("delete from paciente where Id="+id);
       ps.executeUpdate();
       response.sendRedirect("atualizar.jsp");
       
       %>

       
       <%@include file="/pagina/footer.jsp" %>  