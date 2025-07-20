public class Main
{
    public static void main(String[] args)
    {
        /// TRY-CATCH
        /// Uygulama çalışırken alınan hataları absorbe etmek için kullanılan yöntemdir

        /// Hatalı kodlar
        int[] sayilar = new int[]{1,2,3};
        System.out.println(sayilar[1]);
        //System.out.println(sayilar[6]); /// Hatalı kod 6.index yoktur
        try
        {
            System.out.println(sayilar[6]);
        }
        catch (Exception e)
        {
            System.out.println("Bir Hata Oluştu: " + e);
        }
        finally
        {
            System.out.println("Finally block her zaman çalışır.");
        }
    }
}