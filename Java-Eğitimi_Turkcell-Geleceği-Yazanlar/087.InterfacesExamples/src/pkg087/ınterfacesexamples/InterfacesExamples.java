package pkg087.ınterfacesexamples;

public class InterfacesExamples 
{
    public static void main(String[] args) 
    {
        Elma[] elmalar = new Elma[10];
        elmalar[0] = new Elma(10, "Sari");
        elmalar[1] = new Elma(20, "Yesil");
        elmalar[2] = new Elma(80, "Kirmizi");
        elmalar[3] = new Elma(90, "Sari");
        elmalar[4] = new Elma(100, "Kirmizi");
        elmalar[5] = new Elma(65, "Kirmizi");
        elmalar[6] = new Elma(79, "Sari");        
        elmalar[7] = new Elma(64, "Yesil");
        elmalar[8] = new Elma(35, "Kirmizi");
        elmalar[9] = new Elma(40, "Yesil");     
        
        /*
        renkFiltre("Sari", elmalar);
        System.out.println("-----------------------------");
        agirlikFiltre(70, elmalar);
        System.out.println("-----------------------------");
        */        
        RenkFiltresi rf = new RenkFiltresi();
        filtrele(rf, elmalar);
        System.out.println("-----------------------------");
        AgirlikFiltresi af = new AgirlikFiltresi();
        filtrele(af, elmalar);
        System.out.println("---------------------------------");
        ElmaFiltre ef = new AgirlikFiltresi();
        filtrele(ef, elmalar);
        ef = new RenkFiltresi();
        filtrele(ef, elmalar);
    }    
    
    
    public static void filtrele(ElmaFiltre elmaFiltresi, Elma[] elmalar)
    {
        for(int i = 0; i < elmalar.length; i++)
        {
            Elma elma = elmalar[i];
            if(elmaFiltresi.filtrele(elma))
            {
                System.out.println(elma.getAgirlik() + " " + elma.getRenk());
            }
        }
    }
    //Burada yapılan işlemleri tek bir filtrele metodu içerisinde gerçekleştireceğiz bunun için interfaceler oluşturacağız
    /* 
    public static void renkFiltre(String renk, Elma[] elmalar )
    {
        for(int i = 0; i < elmalar.length; i++)
        {
            Elma elma = elmalar[i];
            if(elma.getRenk().equals(renk))
            {
                System.out.println(elma.getRenk() + " " + elma.getAgirlik());
            }
        }
    }
    
    public static void agirlikFiltre(int agirlik, Elma[] elmalar)
    {
        for(int i = 0; i < elmalar.length; i++)
        {
            Elma elma = elmalar[i];
            if(elma.getAgirlik() >= agirlik)
            {
                System.out.println(elma.getAgirlik() + " " + elma.getRenk());
            }
        }
    }
    */
}
