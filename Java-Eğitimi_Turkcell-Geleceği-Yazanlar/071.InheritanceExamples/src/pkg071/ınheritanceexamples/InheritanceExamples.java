package pkg071.ınheritanceexamples;

public class InheritanceExamples
{
    public static void main(String[] args) 
    {
        Kisi kisi = new Kisi();
        kisi.setIsim("Mehmet BAS");
        System.out.println(kisi.getIsim());
        
        System.out.println("-------------------------------------------");
        
        Ogrenci ogr = new Ogrenci();
        ogr.setIsim("Engin BAS");
        ogr.setNumara(12345);
        ogr.setDers("Matematik");
        System.out.println("Ad Soyad : " + ogr.getIsim());
        System.out.println("Numara : " + ogr.getNumara());
        System.out.println("Ders : " + ogr.getDers());
        
        System.out.println("-------------------------------------------");
        
        UniOgrencisi UniOgrenci = new UniOgrencisi();
        UniOgrenci.setIsim("Ahmet Mehmet");
        UniOgrenci.setNumara(153647);
        UniOgrenci.setDers("Programlama Temelleri 101");
        UniOgrenci.setKampus("Unye");
        System.out.println("Ad Soyad : " + UniOgrenci.getIsim());
        System.out.println("Numara : " + UniOgrenci.getNumara());
        System.out.println("Ders : " + UniOgrenci.getDers());
        System.out.println("Kampus : " + UniOgrenci.getKampus());
        
        System.out.println("-------------------------------------------");
        
        Doktor doktor = new Doktor();
        doktor.setIsim("Emre Aydin");
        doktor.setBrans("Beyin Cerrahi");
        System.out.println(doktor.getIsim());
        System.out.println(doktor.getBrans());
        
        System.out.println("-------------------------------------------");
        
        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setIsim("Mustafa Atmaca");
        ogretmen.setOkul("Barbaros Hayerttin Pasa Lisesi");
        System.out.println(ogretmen.getIsim());
        System.out.println(ogretmen.getOkul());
    }    
}
