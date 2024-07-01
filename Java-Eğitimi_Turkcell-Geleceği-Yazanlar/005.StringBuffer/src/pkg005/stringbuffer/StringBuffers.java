package pkg005.stringbuffer;

import java.util.Scanner;

public class StringBuffers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //String userInput = sc.nextLine();
        //System.out.println(userInput);
        
        StringBuffer buffer = new StringBuffer();
        System.out.print("Name: ");
        buffer.append("Name: ");
        buffer.append(sc.nextLine());
        
        buffer.append(" ");
        
        System.out.print("Surname: ");
        buffer.append("Surname: ");
        buffer.append(sc.nextLine());        
        
        System.out.println(buffer.toString());
    }    
}
