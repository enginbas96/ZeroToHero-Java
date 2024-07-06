package pkg061.classexamples;

public class ClassExamples 
{    
    public static void main(String[] args) 
    {        
        //Enumlar çok önemli olabilir dikkat etmek gerek
        //Belirli seçimleri kullanıcıya sunarken kullanırız
        Kopek kangal = new Kopek();
        kangal.cins = "Sivas Kangal";
        kangal.boyut = Boyut.BUYUK;
        kangal.renk = Renk.SIYAH;
        kangal.yas = 6;
        
        kangal.yemekYe();
        kangal.kos();
        kangal.otur();
        kangal.uyu();       
    }    
}
