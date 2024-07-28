package pkg054.methodparameterexamples;

public class MethodParameterExamples
{
    public static void main(String[] args) 
    {
        Ogrenci ogr = new Ogrenci();
        ogr.isim = "Mehmet";
        ogr.yas = 15;
        MethodParameterExamples mtds = new MethodParameterExamples();
        mtds.ogrenciBilgileri(ogr);               
    }        
    public void ogrenciBilgileri(Ogrenci ogrenci)
    {
        ogrenci.isim = "Engin";
        System.out.println(ogrenci.isim);
        System.out.println(ogrenci.yas);
    }
}
