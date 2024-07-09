package pkg082.finalsuperthiskeysexamples;

public class YolcuTasimaAraci extends Arac
{
    private int kapasite;
    
    public YolcuTasimaAraci(String plaka, String marka, int kapasite)
    {
        super(plaka, marka);
        this.kapasite = kapasite;
    }    
    public int getKapasite(){return kapasite;}
    public void setKapasite(int kapasite){this.kapasite = kapasite;}    
}
