package pkg128.lists;

public class Film 
{
    private String ad;
    private String yonetmen;
    private FilmTip tip;
    private int yayinlanmaYili;
    
    public Film(){}
    public Film(String ad, String yonetmen, FilmTip tip, int yayinlanmaYili){this.ad = ad; this.yonetmen = yonetmen; this.tip = tip; this.yayinlanmaYili =yayinlanmaYili;}
    
    public String getAd(){return ad;}
    public String getYonetmen(){return yonetmen;}
    public FilmTip getTip(){return tip;}
    public int getYayinlanmaYili(){return yayinlanmaYili;}
    
    public void setAd(String ad){this.ad = ad;}
    public void setYonetmen(String yonetmen){this.yonetmen = yonetmen;}
    public void setTip(FilmTip tip){this.tip = tip;}
    public void setYaninlanmaYili(int yayinlanmaYili){this.yayinlanmaYili = yayinlanmaYili;}
    
    @Override
    public String toString()
    {
        return "Ad : " + ad + "\t Yonetmen" + yonetmen + "\t Tip : " + tip + "\t Yil : " + yayinlanmaYili;
    }
    
    @Override
    public boolean equals(Object o)
    {
        Film film = (Film) o;
        return film.ad.equals(this.ad) && film.yayinlanmaYili == this.yayinlanmaYili;
    }
    
    @Override
    public int hashCode()
    {
        return this.yayinlanmaYili + this.ad.hashCode();
    }
}
