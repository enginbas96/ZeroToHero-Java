package pkg146.lambdaexpressionexamples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExamples 
{
    public static void main(String[] args) 
    {
        Kisi kisi1 = new Kisi("QWE", LocalDate.parse("1990-03-01"), "qwe@qwe.qwe", Kisi.Cinsiyet.ERKEK);
        Kisi kisi2 = new Kisi("ASD", LocalDate.parse("2002-03-01"), "asd@asd.asd", Kisi.Cinsiyet.KADIN);
        Kisi kisi3 = new Kisi("ZXC", LocalDate.parse("2020-03-01"), "zxc@zxc.zxc", Kisi.Cinsiyet.ERKEK);
        
        System.out.println(kisi1);
        System.out.println(kisi2);
        System.out.println(kisi3);
        
        System.out.println("-----------------------------");
        
        ArrayList<Kisi> kisilerList = new ArrayList<>();
        kisilerList.add(kisi1);
        kisilerList.add(kisi2);
        kisilerList.add(kisi3);        
        
        //cinsiyeteGoreFiltrele(kisilerList, Kisi.Cinsiyet.KADIN);
        
        System.out.println("-----------------------------");
        
        //yasaGoreFiltrele(kisilerList, 22);
        
        System.out.println("-----------------------------");
        
        //yasAraliginaGoreFiltrele(kisilerList, 20,50);
        
        System.out.println("-----------------------------");
        
        //anonymous ile yapılması
        /*kisiFiltrele(kisilerList, new KisiFiltresi() 
        {
            @Override
            public boolean filtrele(Kisi kisi) 
            {
                return kisi.getYas() > 15 && kisi.getCinsiyet().equals(Kisi.Cinsiyet.ERKEK);
            }
        });*/
        
        //Lambda expression ile yapımı
        kisiFiltrele(kisilerList, (k) -> k.getYas() >= 20 && k.getCinsiyet().equals(Kisi.Cinsiyet.KADIN));        
    }
    /*
    public static void cinsiyeteGoreFiltrele(List<Kisi> kisiler, Kisi.Cinsiyet cinsiyet)
    {   for(Kisi i : kisiler){   if(i.getCinsiyet().equals(cinsiyet)){System.out.println(i);}    }  }
    
    public static void yasaGoreFiltrele(List<Kisi> kisiler, int yas)
    {   for(Kisi i : kisiler){   if(i.getYas() >= yas){System.out.println(i);}    }  }
    
    public static void yasAraliginaGoreFiltrele(List<Kisi> kisiler, int min, int max)
    {   for(Kisi i : kisiler){   if(i.getYas() > min && i.getYas() < max){System.out.println(i);}    }  }*/
        
    public static void kisiFiltrele(List<Kisi> kisiler, KisiFiltresi kisiFiltresi)
    {   for(Kisi i : kisiler)   {   if(kisiFiltresi.filtrele(i)){System.out.println(i);}    }   }    
}
