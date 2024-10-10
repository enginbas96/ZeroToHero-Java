import jakarta.security.auth.message.callback.PrivateKeyCallback;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/","/ogrenciler"})
public class Main extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {        
        String bilgi = "ogrenciler servletinden geldim.";
        req.setAttribute("info", bilgi);
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("jspUseBean/ogrenciler.jsp");
        dispatcher.forward(req, resp);
    }
}