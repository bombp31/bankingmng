package banksys;
import java.sql.*;

public class con {
    Connection connection;
    Statement statement;
    public con(){
        try{
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/banksys","root","Sony31@2003");
         statement=connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
