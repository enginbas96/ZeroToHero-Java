package pkg084.abstractclasses;

public class AbstractClasses 
{
    public static void main(String[] args) 
    {
        //Soyutlamanın temel mantığı kendisinden miras alan sınıflara ara bir katman oluşturmak ve ortak özelliklerini belirli yerlerde tutmaktır.         
        //Soyut sınıflar abstract key ile tanımlanırlar
        //Soyut sınfıların abstract ve abstract olmayan metotları olabilir.
        //İlklendirilemez ve onlardan bir nesne türetilemez
        //Final,yapici ve statik metotlara sahip olabilirler
        
        //Oyuncu sınıfını abstract yaptıgımız için böyle bir nesne oluşturulamıyor.
        //Oyuncu oyuncu = new Oyuncu(); 
        Oyuncu oyuncu = new Basketbolcu();
        oyuncu.setIsim("Ahmet");
        oyuncu.setNumara(15);
        oyuncu.pasVer();
        oyuncu.sutCek();
        
       
    }    
}
