public class Main
{
    public static void main(String[] args)
    {
        String[][] matris = new String[3][3];
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                matris[i][j] = i + ". satır, " + j + ". stun  |";
            }
        }
        System.out.println("---------------------------------------------------------------------");
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.print(matris[i][j] + "   ");
            }
            System.out.println();
            System.out.println("---------------------------------------------------------------------");
        }
    }
}
