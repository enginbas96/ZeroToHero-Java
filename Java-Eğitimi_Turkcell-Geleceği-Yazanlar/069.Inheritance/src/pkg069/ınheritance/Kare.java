package pkg069.ınheritance;

public class Kare extends Sekil //Sekil sınıfındakileri kullanabiliriz fakat private erişime erişemez
{
    private int kenarUzunluk;

    public int getKenarUzunluk(){return kenarUzunluk;}
    public void setKenarUzunluk(int ku){kenarUzunluk = ku;}
    public void alanHesapla(){System.out.println("Alan: "  + (kenarUzunluk*kenarUzunluk));}
}
