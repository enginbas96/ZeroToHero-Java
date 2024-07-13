package pkg114.serializationexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExamples
{
    public static void main(String[] args) 
    {
        yaz();
        oku();
    }    
    public static void yaz()
    {
        Araba a1 = new Araba();
        a1.setMarka("X Marka");
        a1.setModel("Y Model");
        a1.setYil(2000);
        a1.setPlaka("34ASD123");
        Motor motor = new Motor();
        motor.setHacim(1600);
        a1.setMotor(motor);        
        System.out.println(a1);
        
        File file = new File("Araba.txt");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try
        {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(a1);
        }
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                if(fileOutputStream != null){fileOutputStream.close();}
                if(objectOutputStream != null){objectOutputStream.close();}
            }
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void oku()
    {
        File file = new File("Araba.txt");
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try
        {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            Araba a1 = (Araba)objectInputStream.readObject();
            System.out.println(a1);
        }
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                if(fileInputStream != null){fileInputStream.close();}
                if(objectInputStream != null){objectInputStream.close();}
            }
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        
    }
}
