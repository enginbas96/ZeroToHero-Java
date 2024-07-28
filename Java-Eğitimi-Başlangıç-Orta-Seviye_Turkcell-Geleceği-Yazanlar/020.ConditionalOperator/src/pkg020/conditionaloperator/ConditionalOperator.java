package pkg020.conditionaloperator;

import java.util.Scanner;

public class ConditionalOperator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz: ");
        int yas = sc.nextInt();  
        
        //Standart koşullu ifadeler
        if(yas <= 17)
        {
            System.out.println("Uzgunum bu yasta ehliyet alamazsiniz.");
            System.out.println("Ehliyet alma yasi en az 18'dir. Siz " +(18-yas)+" yas sonra ehliyet alabileceksiniz.");
        }
        else if(yas >= 18 && yas <=  65 )
        {
            System.out.println("Ehliyet basvurusu yapmaya hakkiniz bulunmaktadir.");
        }
        else
        {
            System.out.println("Yasiniz 65'ten buyuk oldugu icin ehliyet icin yeterli kriterleri saglayamiyorsunuz.");
        }   
        System.out.println("-----------------------------------------------------------------------------------------------------");
        
        //Birde böyle var
        // kosullar ? truedeger : falsedeger
        System.out.println(yas >= 18 && yas <= 65 ? "Ehliyet alabilirsiniz." : "Ehliyet alamazsiniz."); 
    }   
}
