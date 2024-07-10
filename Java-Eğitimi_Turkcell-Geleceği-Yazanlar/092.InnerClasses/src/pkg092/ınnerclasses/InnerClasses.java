package pkg092.ınnerclasses;

public class InnerClasses
{
    public static void main(String[] args) 
    {
        Araba a1 = new Araba();
        a1.setMarka("X Marka");
        a1.setModel("Y Model");        
        Araba.Motor motor1 = a1.new Motor();
        motor1.setHacim(4500);
        a1.setMotor(motor1);
        
        System.out.println(a1.getMarka());
        System.out.println(a1.getModel());
        System.out.println(a1.getMotor().getHacim());
        
    }    
}
