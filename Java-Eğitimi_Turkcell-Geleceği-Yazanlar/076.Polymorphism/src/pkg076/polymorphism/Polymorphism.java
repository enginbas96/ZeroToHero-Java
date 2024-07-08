package pkg076.polymorphism;

public class Polymorphism
{
    public static void main(String[] args) 
    {
        Enstruman e1;
        e1 = new Keman();
        e1.akorYap();
        e1.cal();
        System.out.println("----------------------");
        Enstruman e2 = new Keman();
        e2.akorYap();
        e2.cal();
        e2 = new Gitar();
        e2.akorYap();
        e2.cal();
        e2 = new Davul();
        e2.akorYap();
        e2.cal();
        e2 = new Klarnet();
        e2.akorYap();
        e2.cal();
        
        
        
        
    }    
}
