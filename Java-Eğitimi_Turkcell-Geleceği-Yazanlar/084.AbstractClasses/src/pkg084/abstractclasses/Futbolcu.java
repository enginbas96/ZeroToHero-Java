package pkg084.abstractclasses;

public class Futbolcu extends Oyuncu
{
    //@Override abstract sınıflardaki abstract metotlar için alttaki üzerine yazdıgınız metotdun yanlıslıkla yazılmadıgını belirtmek için kullanılır.
    //Yani ben abstract sınıfındaki bir metodu kullandım ve bu yanlıslıkla değildi demek için kullanılır.
    @Override 
    public void sutCek()
    {
        System.out.println("Futbolcu sut cekti.");
    }
    @Override
    public void pasVer()
    {
        System.out.println("Futbolcu pas verdi.");
    }   
}
