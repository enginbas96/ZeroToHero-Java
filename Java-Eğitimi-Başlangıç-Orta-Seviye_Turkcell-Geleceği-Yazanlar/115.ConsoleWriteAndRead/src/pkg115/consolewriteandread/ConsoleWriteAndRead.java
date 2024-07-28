package pkg115.consolewriteandread;

import java.util.Scanner;

public class ConsoleWriteAndRead
{
    public static void main(String[] args)     
    {
        System.out.println("Merhaba Dunya");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line);
        
        String parola = sc.nextLine();
        // Konsol echo sayesinde yazılan parolayı ekranda görünür kıldık ama biz bunu istemiyoruz
        //Bunun için konsol sınıfını kullanmamız gerekecek 
    }    
}
