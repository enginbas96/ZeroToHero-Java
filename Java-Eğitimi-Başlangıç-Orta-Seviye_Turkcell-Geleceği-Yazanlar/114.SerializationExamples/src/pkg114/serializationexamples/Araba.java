package pkg114.serializationexamples;

import java.io.Serializable;

public class Araba implements Serializable
{
    private String plaka;
    private String marka;
    private String model;
    private int yil;
    private Motor motor;
    
    public Araba()
    {
        
    }
    
    public Araba(String plaka, String marka, String model, int yil, Motor motor)
    {
        this.plaka=plaka;
        this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.motor = motor;
    }
    
    public String getPlaka(){return plaka;}
    public String getMarka(){return marka;}
    public String getModel(){return model;}
    public int getYil(){return yil;}
    public Motor getMotor(){return motor;}
    
    public void setPlaka(String plaka){this.plaka = plaka;}
    public void setMarka(String marka){this.marka = marka;}
    public void setModel(String model){this.model = model;}
    public void setYil(int yil){this.yil = yil;}
    public void setMotor(Motor motor){this.motor = motor;}
    
    @Override
    public boolean equals(Object obj)
    {
        Araba araba = (Araba)obj;        
        return this.plaka.equals(araba.plaka);
    }
    
    @Override
    public String toString()
    {
        return "Plaka : " + plaka + " Marka : " + marka + " Model : " + model + " Yil : " + yil + " Motor : " + motor.toString();
    }
}
