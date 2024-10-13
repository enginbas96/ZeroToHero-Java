package pkg008.generics;

import java.util.ArrayList;
import java.util.List;

class Hayvan
{
    private String isim;
    public Hayvan(String isim) 
    {
        //this.isim = isim;
        setIsim(isim);
    }
    public String getIsim(){return isim;}
    public void setIsim(String isim){this.isim = isim;}
    @Override
    public String toString()
    {
        return isim;
    }
}

class Kedi extends Hayvan
{    
    public Kedi(String isim) 
    {
        super(isim); //Super anahtar kelimesi ile miras alınan sınıfa erişmek için kullanılır
    }    
    @Override
    public String toString()
    {
        return super.toString() + " Miyavlar";
    }
}

class Kopek extends Hayvan
{    
    public Kopek(String isim) 
    {
        super(isim);
    }    
    @Override
    public String toString()
    {
        return super.toString() + " Havlar";
    }
}

class Helper
{
    public static void Hayvanlar(List<? extends Hayvan> hayvanListe) //Listenin türü belli değil ama mutlaka hayvandan miras alsın
    {
        for(Object eleman: hayvanListe)
        {
            System.out.println(eleman);
        }
    }
}

public class Generics
{
    public static void main(String[] args) 
    {
        ArrayList<Kedi> kediler = new ArrayList<>(){  
            {
                add(new Kedi("Tekir"));
                add(new Kedi("Boncuk"));
                add(new Kedi("Mavis"));
            }  
        };
        List<Kopek> kopekler = new ArrayList<>()
        {
            {
                add(new Kopek("Karabas"));
                add(new Kopek("Kont"));
                add(new Kopek("Poyraz"));
            }
        };
        
        Helper.Hayvanlar(kopekler);
        System.out.println("");
        Helper.Hayvanlar(kediler);
        System.out.println("");
        
        ArrayList<String> harfler = new ArrayList();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        //Aşağıdaki kodu çalıştırmayacaktır çünkü Hayvanlar metodu içerisine tanımlanan liste mutlaka Hayvan sınıfından türemiş bir tür olmalıdır
        Helper.Hayvanlar(harfler); 
    }    
}