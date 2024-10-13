package ToplamaPackage;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = {"/Toplama","/Addition"}) //Localization için önemli

public class Toplama extends HttpServlet
{
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
        {
            resp.setCharacterEncoding("UTF-8");
            resp.setHeader("content-type", "text/html;charset=UTF-8"); 
            resp.sendRedirect("./index.html"); //Toplama sayfasına giriş yapılırsa index.html'e yönlendiriliyor
        }
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException
        {
            PrintWriter writer = resp.getWriter();
            resp.setCharacterEncoding("UTF-8");
            resp.setHeader("content-type", "text/html;charset=UTF-8"); 
            
            int sayi1 = Integer.parseInt(req.getParameter("sayi1"));
            int sayi2 = Integer.parseInt(req.getParameter("sayi2"));
            int sonuc = sayi1 + sayi2;            
            writer.println("<p>Sonuç:" + sonuc + "</p>");          
        }
}