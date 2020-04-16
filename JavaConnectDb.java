package com;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author me
 */
public class JavaConnectDb {

    public static Connection ConnecrDb() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dba10","sql");
            
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
return null;
    }
}

