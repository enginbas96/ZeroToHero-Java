package pkg004.strings;

public class Strings
{
    public static void main(String[] args) 
    {
        String s1 = new String("aaaa");
        System.out.println(s1);
        s1 = "ssss";        
        System.out.println(s1);  
        
        char chars[] = {'a','b','c','d','e'};
        String s2 = new String(chars);
        System.out.println(s2);
        
        char chars2[] = {'a','b','c','d','e','f','g'};
        String s3 =  new String(chars2, 2, 4); // ilk değer başlangıç değeri, ikinci değer kaç karakter gideceğini belirtir.
        System.out.println(s3);
        
        // String ifadelerde toplama işlemi kelimelerin birleşmesi ile gerçekleşir
        String value1 = "ABCDEFG";
        String value2 = "HIJKLMN";    
        System.out.println("Deger = " + value1);
        System.out.println("Uzunluk = " + value1.length());
        System.out.println("Birlesim = " + value1 + value2);
        
        // String ifadelerde toplama işlemi kelimelerin birleşmesi ile gerçekleşir
        int sayi1 = 10, sayi2 = 20;
        System.out.println("Toplam = " + (sayi1 + sayi2));  // Parantez içine alındıgında integer gibi davranır
        System.out.println("Toplam = " + sayi1 + sayi2);
        
        // charAt metodu bir string ifadede bulunan karakterlere birer index atar ve metoda tanımlanan index değeri geri dönderir
        System.out.println(value1.charAt(1));;
        
        // getChars Bir string ifadedeki tanımlanan aralıktaki indexleri bir diziye tanımlamakta kullanılır
        char chars3[] = new char[4]; 
        chars3[0]='A'; 
        value1.getChars(3, 6, chars3, 1 ); // İndexi 3 olan karakterden başlıyor ve 6 dahil olmamakla beraber 3-4-5 degerlerini alıyor ve bunu chars3 dizisine atıyor indexini 1 den başatmak şartıyla 
        System.out.println(chars3);        
        
        //toCharArray metodu bir string değerini bir karakter dizisine aktarmak için kullanılır, karakter dizisi ile metnin boyutu aynı olmalıdır
        char chars4[]  = new char[7];    
        chars4= value2.toCharArray();
        System.out.println(chars4[3]);
        System.out.println(chars4);
        
        String s4 = "HelloWorld";
        String s5 = "HelloWorld";
        String s6 = "ASDASD";
        
        //String değerler karşılaştırılırken "==" operatörü kullanılamaz        
        // Karşılaştırma yaparken küçük büyük uyumuna dikkat eder 
        System.out.println(s4.equals(s5));
        System.out.println(s4.equals("HelloWorlD")); 
        System.out.println(s4.equals(s6));
        System.out.println(s4.equals("ASD")); 
         
         //İgnore case metodu büyük küçük ayrımı yapmadan karşılaştırır
        System.out.println(s4.equalsIgnoreCase(s5));
        System.out.println(s4.equalsIgnoreCase("HelloWorLD"));  
        System.out.println(s4.equalsIgnoreCase(s6));
        System.out.println(s4.equalsIgnoreCase("asd"));
                
        System.out.println("Hello".startsWith("He")); // Kelimenin yazılan metin ile başlayıp başlamadığını bulmak için kullanılır
        System.out.println("Hello".endsWith("lo")); // Aynı şekilde kelimenin yazılan metin ile bitip bitmediğini bulmak için kullanılır
        
        System.out.println(s4.indexOf("l")); //Belirli bir karakterin string içerisinde hangi indexte oldugunu bulur taramaya baştan başlar
        System.out.println(s4.lastIndexOf("l")); // Taramaya sondan başlar
        
        //substring metodu bir string ifadenin hangi aralığının yazılacağını belirtir
        String value3 = "12345678912345";
        System.out.println(value3.substring(3)); // 3.indexten başlar ve sonuna kadar yazar
        System.out.println(value3.substring(2,10)); // 2.indexten başlar 10.indexe kadar yazar ama 10u dahil etmez
        
        // Concat metodu + operatorü ile aynı işleve sahiptir.
        System.out.println(value1.concat(value2).concat(value3));
        System.out.println(value1 + value2 + value3);
        
        // replace metodu bir ifade yerine başka bir ifade yerleştirmeye yarar
        String value4 = "Selam";
        System.out.println(value4.replace("Se", "Ke"));
        
        // trim metodu string değerinin başında ve sonunda bulunan boşlukları kaldırır ve değeri döndürür
        String value5 = "   Bosluklu Deger ";
        System.out.println(value5.trim());
        
        // toUpperCase metodu string değerinin tüm karakterlerini büyük harf yapar 
        System.out.println(value5.toUpperCase());
        // toLowerCase metodu string değerinin tüm karakterlerini küçük harf yapar
        System.out.println(value5.toLowerCase());  
        
        // length metodu string değerin karakter uzunlugunu dönderir
        System.out.println(value5.length());
        System.out.println(value5.trim().length());
    }    
}
