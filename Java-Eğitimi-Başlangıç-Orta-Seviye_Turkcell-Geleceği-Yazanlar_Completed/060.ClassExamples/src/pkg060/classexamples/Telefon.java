package pkg060.classexamples;

public class Telefon 
{
    TelefonTipi tip; //Buraya önceden tanımlanmış değerleri koydurmak istediğimizden enumları kullanalım
    String marka;
    String model;
    boolean wifi;
    boolean mobilVeri;
    
    boolean aramaVarmi;
    
    void aramaYap(String telefonNumarasi)
    {
        System.out.println(telefonNumarasi + " Aranıyor..");
        aramaVarmi = true;
    }
    
    void aramayiSonlandir()
    {
        if(aramaVarmi)
        {
            System.out.println("Arama sonlandirildi..");
            aramaVarmi = false;
        }
    }
    
    void mesajGonder(String mesaj)
    {
        if(mobilVeri || wifi)
        {
            System.out.println("Mesaj gönderildi..");
        }
    }        
}
