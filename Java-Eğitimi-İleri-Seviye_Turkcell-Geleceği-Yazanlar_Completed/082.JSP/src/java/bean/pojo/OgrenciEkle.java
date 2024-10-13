package bean.pojo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/ogrenciEkle"})
public class OgrenciEkle extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/OgrenciEkle.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        Ogrenci ogrenci = new Ogrenci()
        {
            {
                setNo(req.getParameter("no")); //inputların içindeki isimler kullanılır
                setAd(req.getParameter("ad"));
                setSoyad(req.getParameter("soyad"));
                setSinif(Integer.parseInt(req.getParameter("sinif")));
                setSube(req.getParameter("sube").charAt(0));
            }     
        };
        req.setAttribute("eklenenOgrenci", ogrenci);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/OgrenciEkle.jsp");
        dispatcher.forward(req, resp);
    }   
    
}
