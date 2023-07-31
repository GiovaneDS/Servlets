package br.com.servlets;

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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        System.out.println("Empresas Cadastradas");
        String nomeEmpresa = req.getParameter("nome");

        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<ul>");
        for (Empresa empresa : lista) {
            out.println("<li>" +empresa.getNome() + "</li>");
        }
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");

        System.out.println("o servlet nova empresa foi chamado");
    }
}
