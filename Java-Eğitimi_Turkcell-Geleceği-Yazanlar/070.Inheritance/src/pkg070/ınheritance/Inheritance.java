package pkg070.ınheritance;

public class Inheritance 
{
    public static void main(String[] args) 
    {
        NakliyeArac Na = new NakliyeArac();
        Na.setUretici("X Marka");
        Na.setKapasite(2000);
        
        Tir tir1 = new Tir();
        tir1.setUretici("A Marka");
        tir1.setKonteynirSayisi(2);
        tir1.setKapasite(5000);        
        System.out.println(tir1.getKonteynirSayisi());
    }    
}
