package pkg012.comparatorandcomparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorAndComparable 
{
    public static void main(String[] args) 
    {
        ArrayList<Telefon> telefonlar = new ArrayList<>()
        {
            {                
                    add(new Telefon("IPhone","13",16,256,2017));            
                    add(new Telefon("Samsun","Note 5",4,32,2013));            
                    add(new Telefon("Xiaomi","Redmi Note 11",4,128,2022));            
                    add(new Telefon("Huawei","Nova Y90",6,128,2020));            
            }
        };
        
        //for(Telefon telefon: telefonlar){System.out.println(telefon);}
        Telefon.TelefonlariYazdir(telefonlar);
        
        System.out.println("----------------------------------------------------------------------------");
        
        //Yila göre sıralama yaptı çünkü biz compareTo metodunu override ederken yıla göre sıralama yaptırmıştık
        Collections.sort(telefonlar); 
        Telefon.TelefonlariYazdir(telefonlar);
        
        System.out.println("----------------------------------------------------------------------------");
        
        //Yapılan sıralamanın tam tersi istikamette sıralama alır örneğin metot içinde büyükten küçüğe yazılmış işse küçükten büyüğe sıralar
        Collections.reverse(telefonlar);
        Telefon.TelefonlariYazdir(telefonlar);
        
        System.out.println("----------------------------------------------------------------------------");
        
        Comparator<Telefon>  kucukHafiza = new Comparator<Telefon>() 
        {
            @Override
            public int compare(Telefon o1, Telefon o2)                     
            {
                if(o1.getHafiza() > o2.getHafiza()){return 1;}
                else{return -1;}
            }
        };
        
        Collections.sort(telefonlar, kucukHafiza); 
        Telefon.TelefonlariYazdir(telefonlar);
        System.out.println("*****************************");
        Collections.reverse(telefonlar); 
        Telefon.TelefonlariYazdir(telefonlar);
        
        System.out.println("----------------------------------------------------------------------------");
        
        //Ram sıralaması
        Collections.sort(telefonlar, (telefon1, telefon2) -> 
        {
            if(telefon1.getRam() > telefon2.getRam()){return 1;} 
            else return -1;
        });
        Telefon.TelefonlariYazdir(telefonlar);
        System.out.println("*************************************");                
        Collections.reverse(telefonlar);
        Telefon.TelefonlariYazdir(telefonlar);
    }    
}