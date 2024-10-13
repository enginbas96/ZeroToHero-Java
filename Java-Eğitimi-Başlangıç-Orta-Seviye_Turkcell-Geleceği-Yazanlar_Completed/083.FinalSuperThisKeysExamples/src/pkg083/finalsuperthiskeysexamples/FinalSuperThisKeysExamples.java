package pkg083.finalsuperthiskeysexamples;

public class FinalSuperThisKeysExamples
{
    public static void main(String[] args) 
    {
        Arac arac = new Arac("34ASD1234", "X Marka");
        arac.yazdir();
        
        System.out.println("-----------------------------------------");
        
        Arac a1;
        a1 = new YolcuTasimaAraci("35AAA657", "S Marka", 4);
        a1.yazdir();
        
        System.out.println("-----------------------------------------");
                
        a1 = new Araba("52ASF123", "Y Marka", 5, 4);
        a1.yazdir();
        
        System.out.println("-----------------------------------------");
        
        a1 = new YukTasimaAraci("32BBB787", "F Marka", 2500);
        a1.yazdir();
        
        System.out.println("-----------------------------------------");
        
        a1 = new Kamyon("55ADD321", "Z Marka", 5000, 5);
        a1.yazdir();
        
    }    
}
