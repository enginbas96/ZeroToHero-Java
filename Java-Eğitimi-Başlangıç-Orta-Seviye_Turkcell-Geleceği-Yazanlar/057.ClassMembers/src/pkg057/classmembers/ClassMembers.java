package pkg057.classmembers;

public class ClassMembers 
{
    public static void main(String[] args) 
    {
        Bisiklet bisiklet1 = new Bisiklet();
        bisiklet1.hiz = 30;
        bisiklet1.vites = 18;
        Bisiklet.bisikletSayisi = 1;
        System.out.println(bisiklet1.hiz);
        System.out.println(bisiklet1.vites);
        
        System.out.println("---------------------------------");
        bisiklet1.bilgileriYazdir();
        
        System.out.println("---------------------------------");
        
        Bisiklet bisiklet2 = new Bisiklet();
        bisiklet2.hiz = 41;
        bisiklet2.vites = 21;
        Bisiklet.bisikletSayisi = 2;
        bisiklet2.bilgileriYazdir();
        
    }    
}
