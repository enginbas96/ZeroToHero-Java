package pkg073.polymorphism;

public class Polymorphism 
{   
    public static void main(String[] args) 
    {
        Hayvan hayvan = new Hayvan();
        hayvan.ses();
        
        Kopek kopek = new Kopek();
        kopek.ses();
        
        Kedi kedi = new Kedi();
        kedi.ses();
        
        System.out.println("---------------------------------------");
       
        Hayvan hayvan1;
        hayvan1 = new Kopek();
        hayvan1.ses();
        
        Hayvan hayvan2 = new Kedi();
        hayvan2.ses();
                
        hayvan1 = new Kus();
        hayvan1.ses();               
    }    
}
