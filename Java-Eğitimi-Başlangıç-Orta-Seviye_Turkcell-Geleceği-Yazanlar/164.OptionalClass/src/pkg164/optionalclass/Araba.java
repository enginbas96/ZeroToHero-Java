package pkg164.optionalclass;

import java.io.Serializable;
import java.util.Optional;
import java.util.function.Supplier;

public class Araba implements Serializable
{
    private String marka;
    private String model;
    private Motor motor;

    public Araba() {}

    public Araba(String marka, String model, Optional<Motor> motor) 
    {
        this.marka = marka;
        this.model = model;
        this.motor = motor.orElseThrow(new Supplier<IllegalArgumentException>()
        {
            @Override
            public IllegalArgumentException get() 
            {
                return new IllegalArgumentException("Motor null olamaz 2");
            }            
        });
    }
    /*
    public Araba(String marka, String model, Motor motor) 
    {
        this.marka = marka;
        this.model = model;
        if(motor == null)
        {
            throw new IllegalArgumentException("Motor null olamaz");
        }
        else{this.motor = motor;}
    }
    */
    
    public String getMarka(){return marka;}
    public String getModel(){return model;}
    public Motor getMotor(){return motor;}
    
    public void setMarka(String marka){this.marka = marka;}
    public void setModel(String model){this.model = model;}
    public void setMotor(Motor motor){this.motor = motor;}
    
    @Override
    public String toString()
    {
        return"Marka : " + marka + " Model : " + model + " Motor : " + motor;
    }    
}
