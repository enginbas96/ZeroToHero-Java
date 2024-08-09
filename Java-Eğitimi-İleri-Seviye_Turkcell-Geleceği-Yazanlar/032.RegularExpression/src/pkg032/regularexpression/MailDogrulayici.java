package pkg032.regularexpression;

import java.util.regex.*;

public class MailDogrulayici 
{
    private Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_PATTERN = "^[\\w-.]+@[a-zA-Z0-9]+\\.[a-zA-Z]{1,3}$";
    
    public MailDogrulayici()
    {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }
    
    public boolean Dogrula(String mail)
    {
        matcher = pattern.matcher(mail);
        return matcher.find();
    }
}
