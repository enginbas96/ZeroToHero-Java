package notationPackage;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/Anasayfa"}) //Burası anasayfada çalışacak

public class Notation extends HttpServlet
{
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
        {
            PrintWriter writer = resp.getWriter();
            resp.setCharacterEncoding("UTF-8");
            resp.setHeader("content-type", "text/html;charset=UTF-8"); 
            
            List<String> takimlarList = new ArrayList<>()
            {
                {
                    add("Galatasaray");
                    add("Fenerbahçe");
                    add("Beşiktaş");
                    add("Trabzonspor");
                    //Buraya istenilen takım eklenildiğinde tablo otomatik olarak güncellenecek                    
                    add("Beykozspor");
                }
            };
            
            writer.write("<table>");
            writer.write("<tr>");   writer.write("TAKIMLAR");   writer.write("</tr>");              
            for(String takim:takimlarList){writer.write("<tr>");    writer.write("<td>");   writer.write(takim); writer.write("</td>"); writer.write("</tr>");} 
            writer.write("</table>");            
        }
}