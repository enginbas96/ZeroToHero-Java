package pkg012.comparatorandcomparable;

//Sınıflardan oluşturulan nesneler içerisindeki bilgiler birbirleriyle karşılaştırılsın istiyorsak

import java.util.List;

public class Telefon implements Comparable<Telefon>
{
    private String marka;
    private String model;
    private int ram;
    private int hafiza;
    private int cikisYili;

    public Telefon() {}

    public Telefon(String marka, String model, int ram, int hafiza, int cikisYili) 
    {
        this.marka = marka;
        this.model = model;
        this.ram = ram;
        this.hafiza = hafiza;
        this.cikisYili = cikisYili;
    }
    
    public String getMarka(){return marka;}
    public String getModel(){return model;}
    public int getRam(){return ram;}
    public int getHafiza(){return hafiza;}
    public int getCikisYili(){return cikisYili;}
    
    public void setMarka(String marka){this.marka = marka;}
    public void setModel(String model){this.model = model;}
    public void setRam(int ram){this.ram = ram;}
    public void setHafiza(int hafiza){this.hafiza = hafiza;}
    public void setCikisYili(int cikisYili){this.cikisYili = cikisYili;}
    
    @Override
    public String toString()
    {
        String bilgi = "Marka : " + marka + "\tModel : " + model + "\tRam : " + ram + "\tHafiza(GB) : " + hafiza + "\tCikis Yili : " + cikisYili;
        return bilgi;
    }

    @Override
    public int compareTo(Telefon o) 
    {
        Telefon telefon = (Telefon) o;
        if(this.cikisYili > telefon.cikisYili)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
    
    public static void TelefonlariYazdir(List<Telefon> telefonlar)
    {
        for(Telefon telefon: telefonlar){System.out.println(telefon);}
    }
}
