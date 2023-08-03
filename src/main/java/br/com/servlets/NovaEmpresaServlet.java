package br.com.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        System.out.println("Cadastrando nova empresa");
        String nomeEmpresa = req.getParameter("nome");
        String dataAberturaEmpresa = req.getParameter("data");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAbertura = null;
        try {
            dataAbertura = sdf.parse(dataAberturaEmpresa);
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);
        empresa.setDataAbertura(dataAbertura);

        Banco banco = new Banco();
        banco.adiciona(empresa);

        //chamar o JSP
        RequestDispatcher rd = req.getRequestDispatcher("/novaEmpresaCadastrada.jsp");
        req.setAttribute("empresa", empresa.getNome());
      //  req.setAttribute("empresa", empresa.getDataAbertura());
        rd.forward(req, resp);
    }
}
