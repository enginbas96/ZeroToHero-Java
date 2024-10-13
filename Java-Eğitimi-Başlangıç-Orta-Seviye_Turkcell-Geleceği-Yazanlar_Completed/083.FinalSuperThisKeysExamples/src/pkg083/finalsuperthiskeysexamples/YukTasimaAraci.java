package pkg083.finalsuperthiskeysexamples;

public class YukTasimaAraci extends Arac
{
    private int yukKapasite;
    
    public YukTasimaAraci(String plaka, String marka, int yukKapasite)
    {
        super(plaka, marka);
        this.yukKapasite = yukKapasite;
    }
    public int getYukKapasite(){return yukKapasite;}
    public void setYupKapasite(int yukKapasite){this.yukKapasite = yukKapasite;}    
    
    public void yazdir()
    {
        super.yazdir();
        System.out.println("Yuk Kapasite : " + yukKapasite);
    }
}
