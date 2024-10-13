package pkg024.operatorprecedence;

public class OperatorPrecedence 
{
    public static void main(String[] args) 
    {
        /*
           Öncelik sırası 
           Parantez > Negatifini veya Değilini alma > Çarpma, Bölme veya Mod alma Operatörleri 
           > Toplama, Çıkarma  Operatörleri > İlişkisel Operatörler > Eşitlik Operatörleri 
           > Mantıksal Ve Operatörü > Mantıksal Veya Operatörü
         */
        
        int x = 11 + 3 * 2;
        System.out.println(x); // Öncelik sıralamasına göre 11 + (2*3) işlemi yapılacaktır
        
        int y = 11 + (3 * 2); // Daha okunaklı bir kod
        System.out.println(y);
        
        int z = (11 + 3) * 2;
        System.out.println(z);        
    }    
}
