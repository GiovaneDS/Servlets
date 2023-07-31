package br.com.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        System.out.println("Cadastrando nova empresa");
        String nomeEmpresa = req.getParameter("nome");
        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);

        Banco banco = new Banco();
        banco.adiciona(empresa);

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("Empresa " + nomeEmpresa + " cadastrada!");
        out.println("</body>");
        out.println("</html>");

        System.out.println("o servlet nova empresa foi chamado");
    }
}
