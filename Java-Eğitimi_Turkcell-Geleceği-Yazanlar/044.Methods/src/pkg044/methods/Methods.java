package pkg044.methods;

import java.util.Scanner;

public class Methods 
{
    public static void main(String[] args) // Main metodu programlamaya başladığımızdan beri kullanıyoruz
    {
        System.out.println("Hello World!"); // Println metodu ekrana yazı yazdırmaya yarayan bir metot örneğidir
        System.out.println(Math.pow(2, 4)); //Math metodu bazı matematiksel işlemleri barındıran bir sınıftır bu sınıf içindeki pow metodu üs almaya yarar
        
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(); // nextLine Scanner sınıfının bir metodudur, kullanıcıdan giriş almaya yarar
        System.out.println(text.toUpperCase()); // Uppercase metodu string sınıfında olan bir metottur, yazıyı büyük harflerle yazdırmaya yarar
    }    
}
