package V2;

import java.sql.*;

public class SQLConnection {

    public Connection getConnection() {
        Connection connection = null;
        try {
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/students", "root", "");
        } catch (SQLException ex) {
            System.out.println("Connection Fails");
        }
        return connection;
    }

}
