package pkg008.arrays;

import java.util.Arrays;

public class Arrays2 
{
    public static void main(String[] args) 
    {
        int[][] numbers = new int[2][3];
        numbers[0][0] = 11;
        numbers[0][1] = 12;
        numbers[0][2] = 13;
        
        numbers[1][0] = 21;
        numbers[1][1] = 22;
        numbers[1][2] = 23;
        
        System.out.println(numbers[1][2]);
        for(int i = 0; i<= 1; i++)
        {
             for(int j = 0; j<= 2; j++)
             {
                 System.out.print("Dizi["+i+"]["+j+"]: " +numbers[i][j] + "    ");
             }  
             System.out.println("");
        }        
        
        String[][] ogrenciler = new String[3][3];
        
        ogrenciler[0][0] = "A"; 
        ogrenciler[0][1] = "B";
        ogrenciler[0][2] = "C";        
        
        ogrenciler[1][0] = "D"; 
        ogrenciler[1][1] = "E"; 
        ogrenciler[1][2] = "F";      
        
        ogrenciler[2][0] = "G"; 
        ogrenciler[2][1] = "H"; 
        ogrenciler[2][2] = "I"; 
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(ogrenciler[i][j] + " ");                
            }
            System.out.println("");
        }     
    }    
}
