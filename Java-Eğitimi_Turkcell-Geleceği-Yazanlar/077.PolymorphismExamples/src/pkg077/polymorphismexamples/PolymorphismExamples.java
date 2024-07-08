package pkg077.polymorphismexamples;

import java.util.Scanner;

public class PolymorphismExamples
{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        DbConnection connection = new DbConnection();
        connection.openConnection();
        connection.executeQuery("Select * From Ogrenci");
        connection.closeConnection();
        
        System.out.println("-------------------------------------------------");
        
        MySQLConnection mySql = new MySQLConnection();
        mySql.openConnection();
        mySql.executeQuery("Select * From Ogrenci");
        mySql.closeConnection();
        
        System.out.println("-------------------------------------------------");
        
        MsSQLConnection msSql = new MsSQLConnection();
        msSql.openConnection();
        msSql.executeQuery("Select * From Ogrenci");
        msSql.closeConnection();
        
        System.out.println("-------------------------------------------------");
        
        DbConnection dbConnection = new MySQLConnection();
        dbConnection.openConnection();
        dbConnection.executeQuery("Select * From Ogrenci");
        dbConnection.closeConnection();
        
        System.out.println("-------------------------------------------------");
        
        //BaseClass                                            //SubClass
        DbConnection dbConnection2 = new OracleConnection();
        dbConnection2.openConnection();
        dbConnection2.executeQuery("Select * From Ogrenci");
        dbConnection2.closeConnection();
        
        System.out.println("-------------------------------------------------");
        
        
        //Burada SOLID prensiplerinin ihlali söz konusudur
        //open/closed prensibi genişlemeye açık ancak değişime kapalıdır
        //Bu örnekte başka bir database modeli eklemek için case bolumune yeni bir değişiklik yapmamız gerekecektir ve biz bunu istemiyoruz
        Scanner sc = new Scanner(System.in);
        System.out.println("Database turleri: [1-MsSql, 2-MySql, 3-Oracle]");
        System.out.print("Database turunuzu seciniz: ");
        int dbType = sc.nextInt();        
        DbConnection dbConnection3 = null;
        switch (dbType) 
        {
            case 1 : dbConnection3 = new MsSQLConnection(); break;
            case 2 : dbConnection3 = new MySQLConnection(); break;
            case 3 : dbConnection3 = new OracleConnection(); break;  
            default : System.out.println("Seciminiz yanlis."); break;
        }
        if (dbConnection3 != null)
        {
            dbConnection3.openConnection();
            dbConnection3.executeQuery("Select * From Ogrenci");
            dbConnection3.closeConnection();
        }        
    }    
}
