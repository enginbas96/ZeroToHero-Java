package LoginPackage;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = {"/Login","/GirisYap"}) //Localization için önemli

public class Login extends HttpServlet
{
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
        {
            resp.setCharacterEncoding("UTF-8");
            resp.setHeader("content-type", "text/html;charset=UTF-8"); 
            resp.sendRedirect("./login.html"); //Toplama sayfasına giriş yapılırsa index.html'e yönlendiriliyor
        }
        
        @Override        
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException
        {
            PrintWriter writer = resp.getWriter();
            resp.setCharacterEncoding("UTF-8");
            resp.setHeader("content-type", "text/html;charset=UTF-8"); 
            String username = req.getParameter("kullanici_adi");
            String sifre = req.getParameter("kullanici_sifre");
            //Kullanıcı adının : Admin ---- Şifrenin : Admin123 oldugunu varsayıyoruz
            
            if(username.equals("Admin") && sifre.equals("Admin123"))
            {
                writer.println("Kullanıcı Başarı İle Giriş Yaptı.");
            }
            else if(!(username.equals("Admin")))            
            {
                writer.println("Kullanıcı bulunamadı.");
            }
            else if(!(sifre.equals("Admin")))            
            {
                writer.println("Kullanıcı adı ile şifre uyuşmuyor.");
            }
            else
            {
                writer.println("Beklenmedik bir hata oluştu.");
            }            
        }
}