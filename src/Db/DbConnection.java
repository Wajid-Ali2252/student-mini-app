package Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    static Connection con;

    public static Connection createConn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String pass = ""; // Empty string for an empty password, or specify the correct password
            String url = "jdbc:mysql://localhost:3307/javastudents";
            con = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("MySQL JDBC driver not found.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to establish database connection.");
        }
        return con;
    }


}
