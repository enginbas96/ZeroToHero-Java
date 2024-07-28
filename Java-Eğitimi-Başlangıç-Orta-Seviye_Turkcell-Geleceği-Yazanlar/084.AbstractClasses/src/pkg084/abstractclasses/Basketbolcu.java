package pkg084.abstractclasses;

public class Basketbolcu  extends Oyuncu
{
    // oyuncu sınıfının içindeki abstract metotlar yani sutcek ve pasver metodu oyuncu sınıfından miras alan sınıflarda tanımlanmak zorunda.
    // Yani bodysi doldurulmak zorunda
    public void sutCek()
    {
        System.out.println("Basketci sut cekti.");
    }
    public void pasVer()
    {
        System.out.println("Basketci pas verdi.");
    }   
    
}
