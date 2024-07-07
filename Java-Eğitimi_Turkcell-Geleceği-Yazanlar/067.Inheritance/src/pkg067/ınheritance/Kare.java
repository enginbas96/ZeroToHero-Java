package pkg067.ınheritance;

public class Kare extends Sekil //Sekil sınıfındakileri kullanabiliriz fakat private erişime erişemez
{
    private int kenarUzunluk;

    public int getKenarUzunluk(){return kenarUzunluk;}
    public void setKenarUzunluk(int ku){kenarUzunluk = ku;}
}
