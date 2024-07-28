package pkg066.accessmodifierexamples;

public class AccessModifierExamples 
{
    public static void main(String[] args) 
    {
        Kare k1 = new Kare();
        k1.setUzunluk(5);
        k1.setX(3);
        k1.setY(6);
        k1.ekranaBastir();
        
        System.out.println("----------------------------");
        
        Kare k2 = new Kare();
        k2.setUzunluk(0);
        k2.setX(-1);
        k2.setY(-3);
        k2.ekranaBastir();
        
        System.out.println("----------------------------");
        
        Kare k3 = new Kare();
        k3.ekranaBastir();
        k3.setX(15);
        System.out.println(k3.getX());
    }    
}
