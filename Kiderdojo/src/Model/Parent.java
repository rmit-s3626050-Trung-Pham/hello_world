/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phamtrung
 */
public class Parent {
    public DatabaseConnection dbConn ;
    PreparedStatement stat = null;
    public String name;
    public String gender;
    public String DOB;
    public String address;
    public String email;
    public String phoneNum;
    public int iStatus = 0;
    public void createParentUsername(DatabaseConnection dbConn ,String username, String password){
        String query = "Insert into ParentAccount values (?,?)";
        try {
            stat = dbConn.conn.prepareStatement(query);
            stat.setString(1, username);
            stat.setString(2, password);
            stat.executeUpdate();
//            JOptionPane.showMessageDialog(null, "create successfull!!!!!");
            iStatus++;
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "create fail!!!!!");
            System.out.println("create fail!!!!!!!");
        }
    }
    public void createParentAccount(DatabaseConnection dbConn ,String username, String name, String gender, String DOB, String address, String facialPhoto ,String email, String phoneNum){
        String query = "Insert into Parent values (?,?,?,?,?,?,?,?)";
        try {
            stat = dbConn.conn.prepareStatement(query);
            stat.setString(1, username);
            stat.setString(2, name);
            stat.setString(3, gender);
            stat.setString(4, DOB);
            stat.setString(5, address);
            stat.setString(6, facialPhoto);
            stat.setString(7, email);
            stat.setString(8, phoneNum);
            stat.executeUpdate();
//            JOptionPane.showMessageDialog(null, "create successfull!!!!!");
            iStatus++;
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "create fail!!!!!");
            System.out.println("Create fail!!!!!!!!");
        }
        
    }
    
    public void deleteParentUsername(DatabaseConnection dbconn, String username){
        PreparedStatement preStatement = null;
        String deleteSQL = "delete parentAccount where username = ?";
        try {
            preStatement = dbconn.conn.prepareStatement(deleteSQL);
            preStatement.setString(1, username);
            preStatement.executeUpdate();
            System.out.println("delete parent username successful!!");
        } catch (SQLException ex) {
            Logger.getLogger(Carer.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("delete parent username fail!!");
        }
    }
    public void deleteParentAccount(DatabaseConnection dbconn, String username){
        PreparedStatement preStatement = null;
        String deleteSQL = "delete Parent where username = ?";
        try {
            preStatement = dbconn.conn.prepareStatement(deleteSQL);
            preStatement.setString(1, username);
            preStatement.executeUpdate();
            System.out.println("delete Parent account successful!!");
        } catch (SQLException ex) {
            Logger.getLogger(Carer.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("delete parent account fail!!");
        }
    }
    
    public void loadParentDB(DatabaseConnection dbConn , String username){
        String query = "Select * from Parent";
        Statement stat = null;
        
        try {
            stat = dbConn.conn.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()){
                
                if(username.equals(rs.getString(1))){
                    name = rs.getString(2);
                    gender = rs.getString(3);
                    DOB = rs.getString(4);
                    address = rs.getString(5);
                    email = rs.getString(6);
                    phoneNum = rs.getString(7);
                    break;
                }
                
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBSelectStat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String args[]){
        Parent pr = new Parent();
        DatabaseConnection dbconn = new DatabaseConnection();
        pr.deleteParentAccount(dbconn, "P0002");
        pr.deleteParentUsername(dbconn, "P0002");
        
//        pr.loadParentDB("P0001");
//        System.out.println(pr.name);
//        System.out.println(pr.gender);
//        System.out.println(pr.DOB);
//        System.out.println(pr.address);
//        System.out.println(pr.email);
       
        
    }
}
