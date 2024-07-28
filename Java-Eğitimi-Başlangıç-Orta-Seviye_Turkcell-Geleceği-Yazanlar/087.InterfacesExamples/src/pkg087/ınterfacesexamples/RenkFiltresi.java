package pkg087.ınterfacesexamples;

public class RenkFiltresi implements ElmaFiltre
{
    @Override
    public boolean filtrele(Elma elma)
    {
        return elma.getRenk().equals("Sari");
    }
}
