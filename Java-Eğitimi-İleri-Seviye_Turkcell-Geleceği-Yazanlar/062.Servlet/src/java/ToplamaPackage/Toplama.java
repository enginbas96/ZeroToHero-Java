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
            
            ArrayList<String> renkler = new ArrayList<>()
            {
                {
                    add("red");
                    add("blue");
                    add("green");
                    add("yellow");
                }                
            };
            
            String[] stilRenkleri = new String[renkler.size()];
            stilRenkleri = renkler.toArray(stilRenkleri);
            //String[] stilRenkleri = renkler.toArray(new String[0]);            
            int index = 0;
            
            writer.write("<table>");
            
            writer.write("<th>");
            writer.write("TAKIMLAR");
            writer.write("</th>");           
            
            for(String takim:takimlarList)
            {
                writer.write("<tr>");
                writer.write("<td style='color:"+stilRenkleri[index++ % stilRenkleri.length]+"'>");
                //writer.write("<td style='color:"+stilRenkleri[index++]+"'>"); //Problemler çıkabilir renk ve takım sayılarının birbirine eşit olması lazım
                
                writer.write(takim);
                
                writer.write("</td>");                
                writer.write("</tr>");
            } 
            
            writer.write("</table>");            
        }
}