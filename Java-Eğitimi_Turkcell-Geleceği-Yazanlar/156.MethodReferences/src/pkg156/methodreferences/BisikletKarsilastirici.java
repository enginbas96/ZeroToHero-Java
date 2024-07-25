package pkg156.methodreferences;

import java.util.Comparator;

public class BisikletKarsilastirici implements Comparator<Bisiklet>
{

    @Override
    public int compare(Bisiklet o1, Bisiklet o2) 
    {
        return o2.getVitesSayisi() - o1.getVitesSayisi();
    }
    
    
}
