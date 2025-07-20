public class AccountManager
{
    private double balance;
    public void deposit(double amount){ balance += amount; }
    public void withdraw(double amount) throws YetersizBakiyeException
    {
        /// if-else standart kontrol senaryosu
        /*
        if(balance>=amount){ balance -= amount; }
        else { System.out.println("Para çekilemedi. Bakiye yetersiz."); }
        */

        /*
        /// if-else throw kontrol senaryosu bu sayede bu metot kullanılırken kullanıcılar trycatch kullanmaya zorlanır.
        if(balance>=amount){ balance -= amount; }
        else { throw new Exception("Bakiye yetersiz."); }
        }
         */

        /// Custom exception
        if(balance>=amount){ balance -= amount; }
        else
        {
            throw new YetersizBakiyeException("Bakiye yetersiz. Custom");
        }
    }

    public double getBalance(){return balance;}
}
