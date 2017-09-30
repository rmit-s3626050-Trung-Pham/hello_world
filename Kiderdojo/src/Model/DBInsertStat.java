/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phamtrung
 */
public class DBInsertStat {
    
    DatabaseConnection dbConn = new DatabaseConnection();
    String query = "Insert into ManagerAccount values (?,?)";
    PreparedStatement stat = null;
    Scanner S = new Scanner(System.in);
    public DBInsertStat(){
        try {
            stat = dbConn.conn.prepareStatement(query);
            System.out.println("input username:");
            String username = S.nextLine();
            System.out.println("input password:");
            String password = S.nextLine();
            stat.setString(1, username);
            stat.setString(2, password);
            stat.executeUpdate();
            System.out.println("insert successfully!!");
        } catch (SQLException ex) {
            Logger.getLogger(DBInsertStat.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void main(String[] args) {
        DBInsertStat insert = new DBInsertStat();
//        DBSelectStat select = new DBSelectStat();
    }
}
