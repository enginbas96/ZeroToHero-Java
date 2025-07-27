public class Main
{
    public static void main(String[] args)
    {
        KronometreThread kt1 = new KronometreThread("TH1");
        KronometreThread kt2 = new KronometreThread("TH2");
        KronometreThread kt3 = new KronometreThread("TH3");

        kt1.Start();
        kt2.Start();
        kt3.Start();
    }
}