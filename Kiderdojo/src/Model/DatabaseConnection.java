/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.driver.DBConversion;

/**
 *
 * @author phamtrung
 */
public class DatabaseConnection {
    Connection conn = null;
    Statement stat = null;

    /**
     * @param args the command line arguments
     */
    public DatabaseConnection(){
        dbConnect();
    }
    public boolean dbConnect(){
        String url = "oracle.jdbc.driver.OracleDriver";
        System.out.println("---Oracle JDBC Connection test-----");
        try {
            Class.forName(url);
            System.out.println("Oracle database is registed!!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@s3626050.cjejiulg1zwr.ap-southeast-2.rds.amazonaws.com:1521:ORCL", "trungtx92", "Chungtrung1");
            
        } catch (SQLException ex) {
            System.out.println("Connection Failed!");
            ex.printStackTrace();
            
        }
        
        if(conn != null){
            System.out.println("connection is made!!");
            return true;
        }
        else
            System.out.println("Fail to make connection!");
            return false;
    }
    
}
    
    
    
   
