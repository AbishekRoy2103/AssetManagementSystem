package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DBPropertyUtil {

    // Method to retrieve the database connection string from a properties file
    public static String getConnectionString(String propertiesFileName) {
        Properties properties = new Properties();
        String connectionString = null;
        
        try (FileInputStream fis = new FileInputStream(propertiesFileName)) {
            properties.load(fis);
            connectionString = properties.getProperty("db.url");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return connectionString;
    }
}
