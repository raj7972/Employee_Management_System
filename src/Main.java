
import java.io.*;
import java.sql.*;

class Main {

    static Connection getConnection() throws Exception {
        String url
                = "jdbc:mysql://localhost:3306/employee_management";
        String username = "root";
        String password = "radara@121";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        return con;

    }

    public static void main(String[] args) throws Exception{
        Connection data = getConnection();
        System.out.println("connection established");

    }
}
