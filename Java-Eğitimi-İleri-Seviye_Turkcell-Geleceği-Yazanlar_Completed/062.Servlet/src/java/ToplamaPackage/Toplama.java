package ToplamaPackage;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/Anasayfa"}) //Burası anasayfada çalışacak

public class Toplama extends HttpServlet
{
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
        {
            PrintWriter writer = resp.getWriter();
            resp.setCharacterEncoding("UTF-8");
            resp.setHeader("content-type", "text/html;charset=UTF-8"); 
            
            int sayi1 = Integer.parseInt(req.getParameter("sayi1"));
            int sayi2 = Integer.parseInt(req.getParameter("sayi2"));
            int sonuc = sayi1 + sayi2;            
            writer.println("<p>Sonuç:" + sonuc + "</p>");          
            
            //Get metodunu kullandığımız için tarayıcı barında tüm değerler şeffaf bir şekilde gözükecektir
            //Fakat biz bir şifre vs. alıyor olsaydık görünmesini istemeyecektik
            //Bunun için get metodu yerine post metodunu kullanmamız gerekecekti
        }
}