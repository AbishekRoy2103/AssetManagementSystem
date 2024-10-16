package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String PROPERTIES_FILE = "db.properties";
    
    public static Connection getConnection() {
        Connection connection = null;
        String dbUrl = DBPropertyUtil.getConnectionString(PROPERTIES_FILE);
        String dbUser = "root"; // Replace with the actual username
        String dbPassword = "Abishek2003"; // Replace with the actual password
        
        try {
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return connection;
    }
}

