
package pkg075.polymorphism;

public class Memur extends Calisan
{
    private String birim;
            
    public Memur(String i, String g, int m, String b)
    {
        super(i, g, m);        
        birim = b;
    }
    
    public void setBirim(String b){birim=b;}
    public String getBirim(){return birim;}
    
    public void Ozet()
    {
        //Çalışan sınıfında olan metotların hepsi memur sınıfında da çalışacaktır.
        System.out.println("Isim : " + getIsım());
        System.out.println("Gorev : " + getGorev());
        System.out.println("Maas : " + getMaas());
        System.out.println("Birim : " + birim);
    }
    
    
}
