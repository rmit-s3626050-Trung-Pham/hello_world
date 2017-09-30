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
import javax.swing.JOptionPane;

/**
 *
 * @author phamtrung
 */
public class Carer {
//    DatabaseConnection dbConn = new DatabaseConnection();
    PreparedStatement stat = null;
    String username;
    String password;
    public String name;
    public String gender;
    public String DOB;
    public String address;
    public String email;
    public String phoneNum;
    public int iStatus = 0;
    public void loadCarerUsername(){
        
    }
    public void loadCarerAccount(){
    
    }
    public void createCarerUsername(DatabaseConnection dbConn, String username, String password){
        String query = "Insert into CarerAccount values (?,?)";
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
    public void createCarerAccount(DatabaseConnection dbConn, String username, String name, String gender, String DOB, String address, String photo, String email, String phoneNum){
        String query = "Insert into Carer values (?,?,?,?,?,?,?,?)";
        try {
            stat = dbConn.conn.prepareStatement(query);
            stat.setString(1, username);
            stat.setString(2, name);
            stat.setString(3, gender);
            stat.setString(4, DOB);
            stat.setString(5, address);
            stat.setString(6, photo);
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

    public void loadCarerDB(DatabaseConnection dbConn, String username){
        String query = "Select * from Carer";
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
    
    public void deleteCarerUsername(DatabaseConnection dbconn, String username){
        PreparedStatement preStatement = null;
        String deleteSQL = "delete CarerAccount where username = ?";
        try {
            preStatement = dbconn.conn.prepareStatement(deleteSQL);
            preStatement.setString(1, username);
            preStatement.executeUpdate();
            System.out.println("delete carer username successful!!");
        } catch (SQLException ex) {
            Logger.getLogger(Carer.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("delete carer username fail!!");
        }
    }
    public void deleteCarerAccount(DatabaseConnection dbconn, String username){
        PreparedStatement preStatement = null;
        String deleteSQL = "delete Carer where username = ?";
        try {
            preStatement = dbconn.conn.prepareStatement(deleteSQL);
            preStatement.setString(1, username);
            preStatement.executeUpdate();
            System.out.println("delete carer account successful!!");
        } catch (SQLException ex) {
            Logger.getLogger(Carer.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("delete carer account fail!!");
        }
    }
    
    public static void main(String[] args) {
        Model.Carer ca = new Model.Carer();
        DatabaseConnection dbconn = new DatabaseConnection();
        ca.createCarerAccount(dbconn, "C0002", "Trung", "Male", "01/02/1990", "ha noi", "", "trungtx92@gmail.com", "023434");
//        ca.deleteCarerAccount(dbconn, "C0001");
//        ca.deleteCarerUsername(dbconn, "C0001");
//        ca.loadCarerDB("null");
//        System.out.println(ca.username);
//        System.out.println(ca.name);
//        System.out.println(ca.DOB);
//        System.out.println(ca.gender);
//        System.out.println(ca.address);
//        System.out.println(ca.email);
//        System.out.println(ca.phoneNum);
        
        
    }
}
