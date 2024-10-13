package pkg084.abstractclasses;

public abstract class Oyuncu 
{
    private String isim;
    private int numara;
    
    public String getIsim(){return isim;}
    public void setIsim(String isim){this.isim = isim;}
    
    public int getNumara(){return numara;}
    public void setNumara(int numara){this.numara = numara;}
    
    public abstract void sutCek(); ////Soyut metotların bodysi olmak zorunda değildir bu metotlar zaten kullanılamayacağından içeriği olması gerekmiyor
    public abstract void pasVer();
}
