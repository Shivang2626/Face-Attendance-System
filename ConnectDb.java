package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConnectDb {

    public Statement stm;
    public ResultSet rs;

    public Connection conn;

    private final String driver = "org.apache.derby.jdbc.ClientDriver";
    private final String root = "jdbc:derby://localhost:1527/face";
    private final String user = "shivang";
    private final String pass = "shivang";

    public void connects() {
        try {
            System.setProperty("jdbc.Driver", driver);
            conn = DriverManager.getConnection(root, user, pass);
            System.out.println("OK!"); 
              //JOptionPane.showMessageDialog(null, "connection successful","success",JOptionPane.INFORMATION_MESSAGE);
    
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    public void disconnect() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    public void executeSQL(String SQL) {
        try {
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stm.executeQuery(SQL);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
   
}
