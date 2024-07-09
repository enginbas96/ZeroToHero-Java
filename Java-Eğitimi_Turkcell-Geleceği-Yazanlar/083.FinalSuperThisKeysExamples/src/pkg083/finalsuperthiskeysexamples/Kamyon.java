package pkg083.finalsuperthiskeysexamples;

public class Kamyon extends YukTasimaAraci
{
    private int konteynerSayisi;
    public Kamyon(String plaka,String marka, int yukKapasite, int konteynerSayisi)
    {
        super(plaka, marka, yukKapasite);
        this.konteynerSayisi = konteynerSayisi;
    }
    public int getKonteynerSayisi(){return konteynerSayisi;}
    public void setKonteynerSayisi(int konteynerSayisi){this.konteynerSayisi = konteynerSayisi;}    
    
    public void yazdir()
    {
        super.yazdir();
        System.out.println("Konteyner Sayisi : " + konteynerSayisi);
    }
}
