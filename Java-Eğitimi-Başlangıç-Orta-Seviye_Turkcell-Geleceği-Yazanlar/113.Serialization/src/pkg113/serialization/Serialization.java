package pkg113.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization 
{
    public static void main(String[] args) 
    {
        yaz();
        oku();
    } 
    
    public static void yaz()
    {
        Ogrenci o1 = new Ogrenci();
        o1.setNumara(100);
        o1.setAd("Mehmet");
        o1.setSoyad("BAS");
        o1.setSinif("12-AB");
        System.out.println(o1.toString());
        
        File file = new File("Ogrenci.txt");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try
        {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(o1);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            if(fileOutputStream != null)
            {
                try
                {
                    fileOutputStream.close();
                } 
                catch (Exception e) 
                {
                    System.out.println(e.getMessage());
                }
            }
             if(objectOutputStream != null)
            {
                try
                {
                    objectOutputStream.close();
                } 
                catch (Exception e) 
                {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
    public static void oku()
    {
        File file = new File("Ogrenci.txt");
        if(file.exists())
        {
            FileInputStream fileInputStream = null;
            ObjectInputStream objectInputStream = null;
            try
            {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                Ogrenci o2 = (Ogrenci)objectInputStream.readObject();
                System.out.println(o2.toString());
            }
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
            finally
            {
                try
                {
                    if(objectInputStream != null){objectInputStream.close();}
                    if(fileInputStream != null){fileInputStream.close();}
                }
                catch (Exception e) 
                {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
}