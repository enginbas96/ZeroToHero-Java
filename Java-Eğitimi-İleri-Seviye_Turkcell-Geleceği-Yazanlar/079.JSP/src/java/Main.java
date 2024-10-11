
import bean.pojo.Ogrenci;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/","/ogrenciler"})
public class Main extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {        
        Ogrenci ogrenci = new Ogrenci("142536", "Mehmet", "BAS", 12, 'A');
        req.setAttribute("ogrenci", ogrenci);
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("jspUseBean/ogrenciler.jsp");
        dispatcher.forward(req, resp);
    }
}