package pkg017.arithmeticoperators;

public class ArithmeticOperators 
{    
    public static void main(String[] args)
    {
        
        int x = 10;
        int y = 20;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(((float)x / (float)y));
        System.out.println(5 % 2); // Mod alma işlemi bir sayı diğer bir sayıya bölünür ve kalan rakam ekrana yazdırılır
        System.out.println("----------------------------------------");
        
        int a = 10;
        a = a + 2;
        System.out.println(a);
        a+=2; 
        System.out.println(a);
        System.out.println("----------------------------------------");
        
        int q = 12;
        System.out.println(q++); // Yazdırıp arttırır
        System.out.println(q);
        
        int w = 10;
        System.out.println(++w); // Arttırıp yazdırır
        System.out.println(w);
        System.out.println("----------------------------------------");
        
        int j = 10; //00000000 00000000 00000000 00001010
        //~ operatörü sayının bit değerlerinin tersini alır yani 1 -> 0 olur 0 -> 1 olur
        System.out.println(~j);//11111111 11111111 11111111 11110101
        
        int k = 4; //00000000 00000000 00000000 00000100
        int l =  5; //00000000 00000000 00000000 00000101
        //& operatörü ve'leme işlemi yapar yani bit değerleri 1 olan ve çakışan değerleri 1 yapar diğer değerleri 0 yapar ve ekrana yeni sayıyı verir
        System.out.println(j & k); //00000000 00000000 00000000 00000000
        System.out.println(l & k); //00000000 00000000 00000000 00000100
        // | operatörü bit değerleri üzerinde veya işlemi uygular ve 1 olan her değerin basamağını 1 yapar
        System.out.println(l | k); //00000000 00000000 00000000 00000101
        System.out.println("----------------------------------------");
        
        int m = 13; //00000000 00000000 00000000 00001101
        // << ve >> değerleri gösterdiği yöne dogru belirtilen rakam kadar basamakları kaydırır
        System.out.println(m <<  2); //00000000 00000000 00000000 00110100
        System.out.println(m >> 1);  //00000000 00000000 00000000 00000110  
    }    
}
