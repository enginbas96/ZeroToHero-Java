package pkg059.classexamples;

public class ClassExamples 
{
    public static void main(String[] args) 
    {
        Kalem kursunKalem = new Kalem();
        kursunKalem.doldurulabilir = false;
        kursunKalem.tip = "Kursun";
        kursunKalem.silinebilir = true;
        kursunKalem.marka = "ABC Marka";
        
        kursunKalem.yaz("Selam melam");
        kursunKalem.tekrarDoldur();
        kursunKalem.sil();       
        
        System.out.println("-------------------------------------");
        
        Kalem dolmaKalem = new Kalem();
        dolmaKalem.doldurulabilir = true;
        dolmaKalem.tip = "Dolma";
        dolmaKalem.silinebilir = false;
        dolmaKalem.marka = "ADSC Marka";
        
        dolmaKalem.yaz("Kekekekekekkeke");
        dolmaKalem.tekrarDoldur();
        dolmaKalem.sil();
    }    
}
