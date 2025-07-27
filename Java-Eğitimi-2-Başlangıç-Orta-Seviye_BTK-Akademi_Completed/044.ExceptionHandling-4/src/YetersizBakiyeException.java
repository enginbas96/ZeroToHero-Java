public class YetersizBakiyeException extends Exception
{
    String message;
    public YetersizBakiyeException(String message)
    {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
