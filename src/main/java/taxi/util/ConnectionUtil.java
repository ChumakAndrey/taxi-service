package taxi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtil {
    /*private static final String URL = "jdbc:mysql://localhost:3306/taxi";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "11111111";
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Can't find SQL Driver", e);
        }
    }

    public static Connection getConnection() {
        Properties dbProperties = new Properties();
        dbProperties.setProperty("user", USERNAME);
        dbProperties.setProperty("password", PASSWORD);
        try {
            return DriverManager.getConnection(URL, dbProperties);
        } catch (SQLException e) {
            throw new RuntimeException("Can't create connection to DB ", e);
        }*/
    private static final String dbServer = "mysql-82179-0.cloudclusters.net";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "lYi1XQGx";
    private static final String dbName = "taxi-service";

    private static final int dbPort = 10637;
    private static final String URL = String.format("jdbc:mysql://%s:%d?user=%s&password=%s",
            dbServer, dbPort, USERNAME, PASSWORD);
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Can't find SQL Driver", e);
        }
    }

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL);
            String sqlusedb = "use " + dbName;
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sqlusedb);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException("Can't create connection to DB ", e);
        }
    }
}
