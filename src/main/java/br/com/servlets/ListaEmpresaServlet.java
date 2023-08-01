package br.com.servlets;

        import javax.servlet.RequestDispatcher;
        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.io.PrintWriter;
        import java.util.List;

@WebServlet(urlPatterns = "/listaEmpresas")
public class ListaEmpresaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();

        req.setAttribute("empresas", lista);

        RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas.jsp");
        rd.forward(req, resp);

    }
}
