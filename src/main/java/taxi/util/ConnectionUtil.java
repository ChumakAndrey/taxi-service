package taxi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
    private static final String dbServer = "sql11.freesqldatabase.com";
    private static final String USERNAME = "sql11506635";
    private static final String PASSWORD = "V5ylb1UW7T";
    private static final String dbName = "taxi-service";

    private static final int dbPort = 3306;
    /*private static final String URL = String.format("jdbc:mysql:"
                    + "//%s:%d?user=%s&password=%s/sql11506635",
            dbServer, dbPort, USERNAME, PASSWORD);*/
    private static final String URL = "jdbc:mysql://sql11.freesqldatabase.com:3306;"
            + "database=sql11506635;user=sql11506635;password=V5ylb1UW7T;";

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
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            throw new RuntimeException("Can't create connection to DB ", e);
        }
    }
}
