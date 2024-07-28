package pkg082.finalsuperthiskeysexamples;

public class FinalSuperThisKeysExamples 
{        
    public static void main(String[] args) 
    {
        Arac a1 = new Arac("X Plaka", "Y Marka");
        System.out.println(a1.getMarka());
        System.out.println(a1.getPlaka());
        
        System.out.println("----------------------------------");
        
        YolcuTasimaAraci yolcuArac = new YolcuTasimaAraci("X Plaka", "Y Marka", 30);
        System.out.println(yolcuArac.getPlaka());
        System.out.println(yolcuArac.getMarka());
        System.out.println(yolcuArac.getKapasite());
        
        System.out.println("----------------------------------");
        
        YukTasimaAraci yukAraci = new YukTasimaAraci("X Plaka", "Y Marka", 5000);
        System.out.println(yukAraci.getPlaka());
        System.out.println(yukAraci.getMarka());
        System.out.println(yukAraci.getYukKapasite());
    }    
}
