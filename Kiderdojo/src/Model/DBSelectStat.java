/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phamtrung
 */
public class DBSelectStat {
    public DatabaseConnection dbConn = new DatabaseConnection();
    public ArrayList<User> userArray = new ArrayList<>();
    public ArrayList<AccountManager> arrayM = new ArrayList<>();
    public ArrayList<AccountCarer> arrayC = new ArrayList<>();
    public ArrayList<AccountParent> arrayP = new ArrayList<>();
    public DBSelectStat(){
//        selectSqlStat();
        loadManagerAccount();
        loadCarerAccount();
        loadParentAccount();
    }
    public void selectSqlStat(){
        

    }
    public void loadManagerAccount(){
        String query = "Select * from ManagerAccount";
        Statement stat = null;
        
        try {
            stat = dbConn.conn.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()){
                AccountManager accMan = new AccountManager();
                accMan.username = rs.getString(1);
                accMan.password = rs.getString(2);
                arrayM.add(accMan);
            System.out.print(accMan.username);
            System.out.print("   |    ");
            System.out.print(accMan.password);
            System.out.println("");
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBSelectStat.class.getName()).log(Level.SEVERE, null, ex);
        }
//        for (User user : userArray) {
//            System.out.print(user.username);
//            System.out.print("   |    ");
//            System.out.print(user.password);
//            System.out.println("");
//        }
    }
    public void loadCarerAccount(){
        String query = "Select * from CarerAccount";
        Statement stat = null;
        
        try {
            stat = dbConn.conn.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()){
                AccountCarer accCar = new AccountCarer();
                accCar.username = rs.getString(1);
                accCar.password = rs.getString(2);
                arrayC.add(accCar);
            System.out.print(accCar.username);
            System.out.print("   |    ");
            System.out.print(accCar.password);
            System.out.println("");
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBSelectStat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void loadParentAccount(){
        String query = "Select * from ParentAccount";
        Statement stat = null;
        
        try {
            stat = dbConn.conn.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()){
                AccountParent accPar = new AccountParent();
                accPar.username = rs.getString(1);
                accPar.password = rs.getString(2);
                arrayP.add(accPar);
            System.out.print(accPar.username);
            System.out.print("   |    ");
            System.out.print(accPar.password);
            System.out.println("");
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBSelectStat.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void ManagerDisplay(){
        
    }
    public static void main(String[] args) {
        DBSelectStat dbSecl = new DBSelectStat();
        dbSecl.selectSqlStat();
    }
}
