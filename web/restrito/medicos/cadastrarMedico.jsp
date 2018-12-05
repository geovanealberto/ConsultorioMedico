
<%@include file="/pagina/header.jsp" %>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<form name="frm"  method="post">   
     <h1>Cadastro de Medicos</h1>
<fieldset>
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
            <label>Area de Atuação:</label>
        </td>
        <td align="left">
            <input type="text" name="txtArea" id="txtArea" required="required"> 
        </td>   
    </tr>
 
   
    <tr>
        <td>
            <label>Numero CRM: </label>
        </td>
        <td align="rigth">
            <input type="text" name="txtCRM" id="txtCRM" required="required"> 
        </td> 
    </tr>
    
       
    
 </table> 
</fieldset>

<br />


<input  type="submit" value="Enviar">
<input  type="reset" value="Limpar">

</form>
 <%@include file="/pagina/footer.jsp" %>