package pkg060.classexamples;

public class ClassExamples 
{
    public static void main(String[] args) 
    {
        Telefon telefon1 = new Telefon();
        telefon1.marka = "X marka";
        telefon1.model = "Y model";
        telefon1.mobilVeri = true;
        telefon1.wifi = true;
        telefon1.tip = TelefonTipi.Cep;
        
        telefon1.aramaYap("555555447755");
        telefon1.aramayiSonlandir();
        telefon1.mesajGonder("Merhaba, nasılsın");
    }    
}
