package pkg087.ınterfacesexamples;

public class AgirlikFiltresi implements ElmaFiltre
{
    @Override
    public boolean filtrele(Elma elma) 
    {
        return elma.getAgirlik() <= 55;
    }
 }
