package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
	public static Connection getConnection() {
        try {
        	String hostpost = "//LAPTOP-O1J8788C\\SQLEXPRESS";
            String username = "sa";
            String password = "1234";
            String url = "jdbc:sqlserver:" + hostpost + ":1433;encrypt=true;databaseName=QLTP;integratedSecurity=false;trustServerCertificate=true;authenticationScheme=NTLM";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connect = DriverManager.getConnection(url, username, password);
            return connect;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
