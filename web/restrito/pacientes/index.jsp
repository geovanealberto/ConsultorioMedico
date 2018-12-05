<%-- 
    Document   : index
    Created on : 22/08/2018, 18:44:07
    Author     : geovane
--%>

<%@include file="/pagina/header.jsp" %>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


 
   
 <form name="frm"  method="post">   
            <h1>Cadastro de Pacientes</h1>
<!-- DADOS PESSOAIS-->
<fieldset>
 <legend>Dados Pessoais</legend>
 
  <table >
     
  <tr>
   <td>
    <label for="nome">Nome: </label>
   </td>
   <td align="left">
    <input type="text" name="txtNome" id="txtNome" required="required">
   </td>
  </tr> 
   
     <tr>
   <td>
    <label>CPF:</label>
   </td>
   <td align="left">
    <input type="text" name="txtCpf" size="11" maxlength="11" id="txtCpf" required="required"> 
   </td>   
  </tr>
  
   
   
   <%--
   
   <td>
    <label for="sobrenome">Sobrenome: </label>
   </td>
   <td align="left">
    <input type="text" name="sobrenome" id="sobrenomeid">
   </td>  
  </tr>

  <tr>
   <td>
    <label>Nascimento: </label>
   </td>
   <td align="left">
       <input id="dataid" type="date" name="data">
   </td>
    
   <td>
    <label>Sexo: </label>
   </td>
      <td align="rigth">
    <label class="checkbox"> 
        <input type="radio" name="sexo" value="masculino" checked="checked" > Masculino
    </label>
          <br />
    <label class="checkbox">
        <input type="radio" name="sexo" value="feminino"> Feminino
    </label>
   </td> 
   --%>
   
  <tr>
   <td>
    <label>Telefone: </label>
   </td>
      <td align="rigth">
    <input type="text" name="txtTelefone" size="13" maxlength="13" id="txtTelefone" required="required"> 
   </td> 
   
  <tr>
   <td>
    <label>Email: </label>
   </td>
      <td align="rigth">
    <input type="text" name="txtEmail" id="txtEmail"> 
   </td> 
  </tr>
 
  
  <tr>
   <td>
    <label for="rg">RG: </label>
   </td>
   <td align="left">
    <input type="text" name="rg" size="13" maxlength="13" id="rgid"> 
   </td>
  </tr>
  

  <tr>
   <td>
    <label>Senha</label>
   </td>
   <td align="left">
    <input type="password" name="txtSenha" size="20" maxlength="20" id="txtSenha" required="required"> 
   </td>   
  </tr>
 </table> 
</fieldset>

<br />

<%--
<!-- ENDEREÇO -->
<fieldset>
 <legend>Dados de Endereço</legend>
 
  <table>

  <tr>
   <td>
    <label for="rua">Rua:</label>
   </td>
   <td align="left">
    <input type="text" name="rua" id="ruaid">
   </td>
   <td>
    <label for="numero">Numero:</label>
   </td>
   <td align="left" >
    <input type="text" name="numero" id="numeroid" size="4">
   </td>
  </tr>
  <tr>
   <td>
    <label for="bairro">Bairro: </label>
   </td>
   <td align="left">
    <input type="text" name="bairro" id="bairroid">
   </td>
  </tr>
  <tr>
   <td>
    <label for="estado">Estado:</label>
   </td>
   <td align="left">
    <select name="estado"> 
    <option value="ac">Acre</option> 
    <option value="al">Alagoas</option> 
    <option value="am">Amazonas</option> 
    <option value="ap">Amapá</option> 
    <option value="ba">Bahia</option> 
    <option value="ce">Ceará</option> 
    <option value="df">Distrito Federal</option> 
    <option value="es">Espírito Santo</option> 
    <option value="go">Goiás</option> 
    <option value="ma">Maranhão</option> 
    <option value="mt">Mato Grosso</option> 
    <option value="ms">Mato Grosso do Sul</option> 
    <option value="mg">Minas Gerais</option> 
    <option value="pa">Pará</option> 
    <option value="pb">Paraíba</option> 
    <option value="pr">Paraná</option> 
    <option value="pe">Pernambuco</option> 
    <option value="pi">Piauí</option> 
    <option value="rj">Rio de Janeiro</option> 
    <option value="rn">Rio Grande do Norte</option> 
    <option value="ro">Rondônia</option> 
    <option value="rs">Rio Grande do Sul</option> 
    <option value="rr">Roraima</option> 
    <option value="sc">Santa Catarina</option> 
    <option value="se">Sergipe</option> 
    <option value="sp">São Paulo</option> 
    <option value="to">Tocantins</option> 
   </select>
   </td>
  </tr>
  <tr>
   <td>
    <label for="cidade">Cidade: </label>
   </td>
   <td align="left">
    <input type="text" name="cidade" id="cidadeid">
   </td>
  </tr>
  <tr>
   <td>
    <label for="cep">CEP: </label>
   </td>
   <td align="left">
    <input type="text" name="cep" size="5" maxlength="5" id="cep1id" > - <input type="text" name="cep2"  id="cep2id" size="3" maxlength="3">
   </td>
  </tr>
 </table>

</fieldset>
--%>
<br />
<input  type="submit" value="Enviar">
<input  type="reset" value="Limpar">

<br />

   </form>



<%
       //Conectando com o banco de dados
       Connection con;
       String url="jdbc:mysql://davesmartins.com.br/grupo1_";
       String Driver="com.mysql.jdbc.Driver";
       String user="grupo1";
       String chave="Dts7I5zQb8iPcDqq";
       Class.forName(Driver);
       con=DriverManager.getConnection(url,user,chave);
       PreparedStatement ps;
       String nome, cpf, telefone, email, senha;
       nome=request.getParameter("txtNome");
       cpf=request.getParameter("txtCpf");
       telefone=request.getParameter("txtTelefone"); 
       email=request.getParameter("txtEmail"); 
       senha=request.getParameter("txtSenha"); 
       
       if(nome!=null && cpf!=null && telefone!=null && email!=null  && senha!=null ){
           ps=con.prepareStatement("insert into paciente (Nome, Cpf, Telefone, Email, Senha)values('"+nome+"','"+cpf+"','"+telefone+"','"+email+"','"+senha+"')");
           ps.executeUpdate();          
           response.sendRedirect("atualizar.jsp");
           
       }
       
       
%>

<%@include file="/pagina/footer.jsp" %>