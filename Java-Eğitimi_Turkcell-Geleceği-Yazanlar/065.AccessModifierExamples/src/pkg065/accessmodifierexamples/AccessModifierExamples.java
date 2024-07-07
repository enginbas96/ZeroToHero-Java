package pkg065.accessmodifierexamples;

import java.util.Date;

public class AccessModifierExamples
{
    public static void main(String[] args) 
    {
        //Set ve Get metotları ile çalışmak
        Calisan c1 = new Calisan();
        c1.setIsim("Mehmet");
        c1.setMaas(2570);
        c1.setGirisTarih(new Date());
        
        System.out.println(c1.getIsim());        
        System.out.println(c1.getMaas());
        System.out.println(c1.getGirisTarihi());      
    }    
}
