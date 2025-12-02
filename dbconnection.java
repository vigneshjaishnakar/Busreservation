

package busresv.edu.co;

import java.sql.*;

public class dbconnection {

    private static final String url = "jdbc:mysql://localhost:3306/busresv";
    private static final String username = "root";
    private static final String password = "2100";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
