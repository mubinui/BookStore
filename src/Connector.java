import java.sql.Connection;
import java.sql.DriverManager;
public class Connector {
    static Connection connection;
    public static Connection createConnection(){
        try{
            String user = "postgres";
            String password = "root";
            String url = "jdbc:postgresql://localhost:5432/bookstore";
            connection = DriverManager.getConnection(url,user,password);

        }
        catch(Exception e ){
            e.printStackTrace();

        }
        return connection;
    }
}
