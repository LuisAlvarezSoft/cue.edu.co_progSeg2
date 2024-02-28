package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static String url = "jdbc:mysql://localhost:3306/new-schema";
    private static String user= "root";
    private static String password = "";
    private static Connection connection;
    public static Connection getInstance() throws SQLException{
        if(connection==null || connection.isClosed()    ){
            connection = DriverManager.getConnection(url,user,password);
        }
        return connection;
    }
}
