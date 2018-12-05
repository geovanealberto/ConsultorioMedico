
<%@include file="pagina/header.jsp" %>

<article class="top-content">
    <header>
        <h1>Acesso Médicos</h1>
    </header>
    <footer>
        ConsulMed. Todos os direitos reservados &copy;
    </footer>
    <div class="container">
        <form action="ServletLoginMedico" method="POST">
            <label for="txtLogin"><b>Login:</b></label>
            <input type="text" placeholder="Login" name="txtLogin" required>

            <label for="txtSenha"><b>Senha:</b></label>
            <input type="password" placeholder="Senha" name="txtSenha" required>

            <button type="submit">Login</button>
        </form>
    </div>
</article>

<%@include file="pagina/footer.jsp" %>
