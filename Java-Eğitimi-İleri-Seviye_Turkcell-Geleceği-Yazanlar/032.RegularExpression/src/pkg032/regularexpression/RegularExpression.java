package pkg032.regularexpression;

public class RegularExpression 
{
    public static void main(String[] args) 
    {
        MailDogrulayici mailDogrula = new MailDogrulayici();
        
        System.out.println(mailDogrula.Dogrula("engin.bas96@gmail.com"));
        System.out.println(mailDogrula.Dogrula("engin.bas96@@gmail.com"));
        System.out.println(mailDogrula.Dogrula("engin_bas.96@gmail.com"));
        System.out.println(mailDogrula.Dogrula("engin-..___..-bas96@gmail.com"));
        System.out.println(mailDogrula.Dogrula("engin153451bas96@gmail.com"));
        System.out.println(mailDogrula.Dogrula("e!bas96@gmail.com"));
        System.out.println(mailDogrula.Dogrula("ebas$96@gmail.com"));
        System.out.println(mailDogrula.Dogrula("ebas96@gmail.com"));
        System.out.println(mailDogrula.Dogrula("ebas96@gmail.c"));
        System.out.println(mailDogrula.Dogrula("ebas96@gmail.comx"));        
        System.out.println(mailDogrula.Dogrula("ebas96@gmail..com"));        
        System.out.println(mailDogrula.Dogrula("ebas96@gmail.com"));        
    }
}