package pkg032.switchcaseexamples;

import java.util.Scanner;

public class SwitchCaseExamples
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Haftanin gununu giriniz: ");
        int gun = sc.nextInt();
        
        switch(gun)
        {
            case 1 :
            case 2 :
            case 3 : 
            case 4 :
            case 5 :
                System.out.println("Hafta ici");
                break;
            case 6 :
            case 7 :
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Girilen gun bulunamadi.");
                break;            
        }       
    }    
}
