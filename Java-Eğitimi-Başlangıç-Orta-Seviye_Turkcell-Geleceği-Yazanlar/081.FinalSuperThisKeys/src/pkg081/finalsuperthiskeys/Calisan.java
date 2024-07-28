package pkg081.finalsuperthiskeys;

import java.util.Date;

public class Calisan 
{
    private String isim;
    private double maas;
    private Date iseBaslamaTarihi;
    
    //Bu çağırım türüne Constructor chaining yani zincirleme yapici metot çağrımı denmektedir
    
    public Calisan()
    {
        this("Bilinmiyor"); 
        // Tek değişkenli bir yollama yaptığımdan tek parametreli yapici metot çalışacak yani
        // Calisan(String isim)
    }
    
    public Calisan(String isim)
    {
        this(isim, 0);
        // İki değişkenli bir yollama yaptığımdan iki parametreli yapici metot çalışacak yani
        // Calisan(String isim, double maas)
    }
    
    public Calisan(String isim, double maas)
    {
        this(isim, maas, null);
        // üç değişkenli bir yollama yaptığımdan üç parametreli yapici metot çalışacak yani
        // Calisan(String isim, double maas, Date iseBaslamaTarihi)
    }
    
    public Calisan(String isim, double maas, Date iseBaslamaTarihi)
    {
        this.isim = isim;
        this.maas = maas;
        this.iseBaslamaTarihi = iseBaslamaTarihi;
    }
    
    public String getIsım(){return isim;}
    public void setIsim(String isim)
    {
        //This key kullanıldığında sınıfın içi referans gösterilir, metot için oluşturulan değil de sınıfın başında tanımlandıgı değişken alınır.
        //Ama bu kullanım genelde sınıf değişkeni ve metot değişkeni aynı değişken isimlerine sahipse yapılır
        this.isim = isim; 
    }
    
    public double getMaas(){return maas;}
    public void setMaas(int maas)
    {
        this.maas = maas;
    }
    
    public Date getTarih(){return iseBaslamaTarihi;}
    public void setTarih(Date iseBaslamaTarihi)
    {
        this.iseBaslamaTarihi = iseBaslamaTarihi;
    }
    
    public void yazdir()
    {
        System.out.println("Isim : " + isim);
        System.out.println("Maas : " + maas);
        System.out.println("Baslama Tarihi : " + iseBaslamaTarihi);
    }
}
