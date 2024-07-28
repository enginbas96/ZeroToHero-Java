package pkg078.polymorphismexamples;

public class PolymorphismExamples 
{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        //SOLID- Open/Closed Prensibine uymak için kod geliştirilmeli ama değiştirilmemeli.        
        DbConnection universalConnection = (DbConnection) Class.forName(args[1]).newInstance();
        universalConnection.openConnection();
        universalConnection.executeQuery("Select * From Ogrenci");
        universalConnection.closeConnection();
    }    
}
