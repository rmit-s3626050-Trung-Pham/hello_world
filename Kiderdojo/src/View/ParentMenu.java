/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DatabaseConnection;

/**
 *
 * @author Thuy
 */
public class ParentMenu extends javax.swing.JFrame {

    /**
     * Creates new form ParentMenu
     */
    String username;
    DatabaseConnection dbConn;
    Model.Parent parent;
    public ParentMenu() {
        initComponents();
        setLocation(300, 200);
        parent = new Model.Parent();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnMainMenu = new javax.swing.JPanel();
        LbLogo = new javax.swing.JLabel();
        BtMyChild = new javax.swing.JToggleButton();
        BtMyAccount = new javax.swing.JToggleButton();
        BtSchoolInFor = new javax.swing.JToggleButton();
        LbBackground = new javax.swing.JLabel();
        PnMyChild = new javax.swing.JPanel();
        LbChildID = new javax.swing.JLabel();
        LbChildID1 = new javax.swing.JLabel();
        LbChildName = new javax.swing.JLabel();
        LbChildName1 = new javax.swing.JLabel();
        LbChildStatus = new javax.swing.JLabel();
        LbBirthday1 = new javax.swing.JLabel();
        LbChildAvatar = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        LbBirthday = new javax.swing.JLabel();
        LbChildStatus1 = new javax.swing.JLabel();
        LbContactCarer = new javax.swing.JLabel();
        LbUpdateChildDetail = new javax.swing.JLabel();
        LbAlbum = new javax.swing.JLabel();
        LbViewAlbum = new javax.swing.JLabel();
        LbCloud = new javax.swing.JLabel();
        LbContactCarerPhone = new javax.swing.JLabel();
        LbMyChildBackground = new javax.swing.JLabel();
        PnMyAccount = new javax.swing.JPanel();
        LbParentAvatar = new javax.swing.JLabel();
        LbParentChangeAvatar = new javax.swing.JLabel();
        LbParentID = new javax.swing.JLabel();
        LbParentIDExample = new javax.swing.JLabel();
        LbParentPassword = new javax.swing.JLabel();
        LbPasswordExample = new javax.swing.JLabel();
        LbParentName = new javax.swing.JLabel();
        LbParentNameExample = new javax.swing.JLabel();
        LbParentDOB = new javax.swing.JLabel();
        LbParentDOBExample = new javax.swing.JLabel();
        LbParentAddress = new javax.swing.JLabel();
        LbParentAddressExample = new javax.swing.JLabel();
        LbParentEmailAddress = new javax.swing.JLabel();
        LbParentEmailExample1 = new javax.swing.JLabel();
        LbParentPhoneNumber = new javax.swing.JLabel();
        LbParentPhoneNumberExample = new javax.swing.JLabel();
        LbParentUpdatepersonalinformation = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Lbbackground = new javax.swing.JLabel();
        PnSchoolInformation = new javax.swing.JPanel();
        LbSchoolInforBackground = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnMainMenu.setLayout(null);

        LbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/Logo.PNG"))); // NOI18N
        PnMainMenu.add(LbLogo);
        LbLogo.setBounds(560, 10, 110, 100);

        BtMyChild.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        BtMyChild.setForeground(new java.awt.Color(153, 0, 153));
        BtMyChild.setText("My Child");
        BtMyChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMyChildActionPerformed(evt);
            }
        });
        PnMainMenu.add(BtMyChild);
        BtMyChild.setBounds(70, 90, 490, 70);

        BtMyAccount.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        BtMyAccount.setForeground(new java.awt.Color(153, 0, 153));
        BtMyAccount.setText("My Account");
        BtMyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMyAccountActionPerformed(evt);
            }
        });
        PnMainMenu.add(BtMyAccount);
        BtMyAccount.setBounds(70, 200, 490, 70);

        BtSchoolInFor.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        BtSchoolInFor.setForeground(new java.awt.Color(153, 0, 153));
        BtSchoolInFor.setText("School Information");
        BtSchoolInFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSchoolInForActionPerformed(evt);
            }
        });
        PnMainMenu.add(BtSchoolInFor);
        BtSchoolInFor.setBounds(70, 300, 490, 70);

        LbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/background.jpg"))); // NOI18N
        PnMainMenu.add(LbBackground);
        LbBackground.setBounds(1, 0, 680, 510);

        PnMyChild.setLayout(null);

        LbChildID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbChildID.setForeground(new java.awt.Color(153, 0, 153));
        LbChildID.setText("ChildID: ");
        PnMyChild.add(LbChildID);
        LbChildID.setBounds(180, 10, 120, 70);

        LbChildID1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbChildID1.setText("C0001");
        PnMyChild.add(LbChildID1);
        LbChildID1.setBounds(310, 10, 120, 70);

        LbChildName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbChildName.setForeground(new java.awt.Color(153, 0, 153));
        LbChildName.setText("Child Name:");
        PnMyChild.add(LbChildName);
        LbChildName.setBounds(180, 80, 120, 50);

        LbChildName1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbChildName1.setText("Cersie Lannister");
        PnMyChild.add(LbChildName1);
        LbChildName1.setBounds(310, 70, 190, 70);

        LbChildStatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbChildStatus.setForeground(new java.awt.Color(153, 0, 153));
        LbChildStatus.setText("ChildStatus");
        PnMyChild.add(LbChildStatus);
        LbChildStatus.setBounds(120, 260, 120, 70);

        LbBirthday1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbBirthday1.setText("12 December 2014");
        PnMyChild.add(LbBirthday1);
        LbBirthday1.setBounds(310, 130, 190, 70);

        LbChildAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/ChildAvatar.jpg"))); // NOI18N
        PnMyChild.add(LbChildAvatar);
        LbChildAvatar.setBounds(10, 40, 160, 180);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PnMyChild.add(jButton2);
        jButton2.setBounds(60, 410, 75, 29);

        LbBirthday.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbBirthday.setForeground(new java.awt.Color(153, 0, 153));
        LbBirthday.setText("Birthday");
        PnMyChild.add(LbBirthday);
        LbBirthday.setBounds(180, 130, 120, 70);

        LbChildStatus1.setText("Cersie is in a very good mood today! ");
        PnMyChild.add(LbChildStatus1);
        LbChildStatus1.setBounds(50, 290, 330, 90);

        LbContactCarer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbContactCarer.setForeground(new java.awt.Color(255, 255, 255));
        LbContactCarer.setText("Contact Carer");
        PnMyChild.add(LbContactCarer);
        LbContactCarer.setBounds(550, 280, 140, 70);

        LbUpdateChildDetail.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        LbUpdateChildDetail.setForeground(new java.awt.Color(51, 102, 255));
        LbUpdateChildDetail.setText("Update my child details");
        PnMyChild.add(LbUpdateChildDetail);
        LbUpdateChildDetail.setBounds(180, 200, 220, 20);

        LbAlbum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/photo_album_icon.jpg"))); // NOI18N
        PnMyChild.add(LbAlbum);
        LbAlbum.setBounds(500, 60, 260, 210);

        LbViewAlbum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbViewAlbum.setForeground(new java.awt.Color(153, 0, 153));
        LbViewAlbum.setText("Your Child Album");
        PnMyChild.add(LbViewAlbum);
        LbViewAlbum.setBounds(520, 0, 200, 70);

        LbCloud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/Cloud.png"))); // NOI18N
        PnMyChild.add(LbCloud);
        LbCloud.setBounds(30, 210, 370, 280);

        LbContactCarerPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/PhoneIcon.png"))); // NOI18N
        PnMyChild.add(LbContactCarerPhone);
        LbContactCarerPhone.setBounds(500, 300, 180, 210);

        LbMyChildBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/myChildbackground.jpg"))); // NOI18N
        PnMyChild.add(LbMyChildBackground);
        LbMyChildBackground.setBounds(1, 0, 680, 510);

        PnMainMenu.add(PnMyChild);
        PnMyChild.setBounds(0, 0, 680, 510);

        PnMyAccount.setLayout(null);

        LbParentAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/Parent Avatar.png"))); // NOI18N
        PnMyAccount.add(LbParentAvatar);
        LbParentAvatar.setBounds(20, 20, 210, 230);

        LbParentChangeAvatar.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        LbParentChangeAvatar.setForeground(new java.awt.Color(51, 102, 255));
        LbParentChangeAvatar.setText("Change Avatar");
        PnMyAccount.add(LbParentChangeAvatar);
        LbParentChangeAvatar.setBounds(30, 250, 110, 20);

        LbParentID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LbParentID.setText("ParentID:");
        PnMyAccount.add(LbParentID);
        LbParentID.setBounds(200, 40, 80, 20);

        LbParentIDExample.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbParentIDExample.setForeground(new java.awt.Color(102, 102, 102));
        LbParentIDExample.setText("P0001");
        PnMyAccount.add(LbParentIDExample);
        LbParentIDExample.setBounds(320, 40, 51, 20);

        LbParentPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LbParentPassword.setText("Password:");
        PnMyAccount.add(LbParentPassword);
        LbParentPassword.setBounds(200, 90, 90, 20);

        LbPasswordExample.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbPasswordExample.setForeground(new java.awt.Color(102, 102, 102));
        LbPasswordExample.setText("********");
        PnMyAccount.add(LbPasswordExample);
        LbPasswordExample.setBounds(320, 90, 120, 20);

        LbParentName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LbParentName.setText("Name:");
        PnMyAccount.add(LbParentName);
        LbParentName.setBounds(200, 140, 60, 20);

        LbParentNameExample.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbParentNameExample.setForeground(new java.awt.Color(102, 102, 102));
        LbParentNameExample.setText("Jaime Lannister");
        PnMyAccount.add(LbParentNameExample);
        LbParentNameExample.setBounds(320, 140, 180, 20);

        LbParentDOB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LbParentDOB.setText("Date Of Birth:");
        PnMyAccount.add(LbParentDOB);
        LbParentDOB.setBounds(200, 190, 150, 20);

        LbParentDOBExample.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbParentDOBExample.setForeground(new java.awt.Color(102, 102, 102));
        LbParentDOBExample.setText("7 July 1987");
        PnMyAccount.add(LbParentDOBExample);
        LbParentDOBExample.setBounds(320, 190, 180, 20);

        LbParentAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LbParentAddress.setText("Address:");
        PnMyAccount.add(LbParentAddress);
        LbParentAddress.setBounds(200, 230, 150, 20);

        LbParentAddressExample.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbParentAddressExample.setForeground(new java.awt.Color(102, 102, 102));
        LbParentAddressExample.setText("01 Castle Road, Kingslanding");
        PnMyAccount.add(LbParentAddressExample);
        LbParentAddressExample.setBounds(320, 230, 310, 20);

        LbParentEmailAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LbParentEmailAddress.setText("Email Address:");
        PnMyAccount.add(LbParentEmailAddress);
        LbParentEmailAddress.setBounds(200, 280, 150, 20);

        LbParentEmailExample1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbParentEmailExample1.setForeground(new java.awt.Color(102, 102, 102));
        LbParentEmailExample1.setText("JaimeLannister@gmail.com");
        PnMyAccount.add(LbParentEmailExample1);
        LbParentEmailExample1.setBounds(320, 270, 310, 40);

        LbParentPhoneNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LbParentPhoneNumber.setText("Phone Number:");
        PnMyAccount.add(LbParentPhoneNumber);
        LbParentPhoneNumber.setBounds(200, 330, 150, 20);

        LbParentPhoneNumberExample.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbParentPhoneNumberExample.setForeground(new java.awt.Color(102, 102, 102));
        LbParentPhoneNumberExample.setText("+6123456789");
        PnMyAccount.add(LbParentPhoneNumberExample);
        LbParentPhoneNumberExample.setBounds(320, 320, 310, 40);

        LbParentUpdatepersonalinformation.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        LbParentUpdatepersonalinformation.setForeground(new java.awt.Color(51, 102, 255));
        LbParentUpdatepersonalinformation.setText("Update my personal information");
        PnMyAccount.add(LbParentUpdatepersonalinformation);
        LbParentUpdatepersonalinformation.setBounds(200, 390, 300, 20);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PnMyAccount.add(jButton1);
        jButton1.setBounds(50, 430, 75, 29);

        Lbbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/MyAccountBackground.jpg"))); // NOI18N
        PnMyAccount.add(Lbbackground);
        Lbbackground.setBounds(1, 0, 680, 510);

        PnMainMenu.add(PnMyAccount);
        PnMyAccount.setBounds(0, 0, 680, 510);

        PnSchoolInformation.setLayout(null);

        LbSchoolInforBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/schoolchildren.jpg"))); // NOI18N
        PnSchoolInformation.add(LbSchoolInforBackground);
        LbSchoolInforBackground.setBounds(0, 20, 680, 450);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        PnSchoolInformation.add(jButton3);
        jButton3.setBounds(20, 460, 75, 29);

        PnMainMenu.add(PnSchoolInformation);
        PnSchoolInformation.setBounds(-2, -5, 680, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtMyChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMyChildActionPerformed
        // Add My Child Panel
        PnMainMenu.removeAll();
        PnMainMenu.add(PnMyChild);
        PnMainMenu.revalidate();
        PnMainMenu.repaint();
    }//GEN-LAST:event_BtMyChildActionPerformed

    private void BtMyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMyAccountActionPerformed
        // Add My Account Panel
        parent.loadParentDB(dbConn ,username);
        
        LbParentIDExample.setText(username);
        LbParentNameExample.setText(parent.name);
        LbParentDOBExample.setText(parent.DOB);
        LbParentAddressExample.setText(parent.address);
        LbParentEmailExample1.setText(parent.email);
        LbParentPhoneNumberExample.setText(parent.phoneNum);
        
        PnMainMenu.removeAll();
        PnMainMenu.add(PnMyAccount);
        PnMainMenu.revalidate();
        PnMainMenu.repaint();
        
        
       
        
    }//GEN-LAST:event_BtMyAccountActionPerformed

    private void BtSchoolInForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSchoolInForActionPerformed
        // Add School Information Panel
        PnMainMenu.removeAll();
        PnMainMenu.add(PnSchoolInformation);
        PnMainMenu.revalidate();
        PnMainMenu.repaint();
      
        
        
    }//GEN-LAST:event_BtSchoolInForActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PnMainMenu.removeAll();
        PnMainMenu.add(BtMyChild);
        PnMainMenu.add(BtMyAccount);
        PnMainMenu.add(BtSchoolInFor);
        PnMainMenu.add(LbLogo);
        PnMainMenu.add(LbBackground);
        
        PnMainMenu.revalidate();
        PnMainMenu.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        PnMainMenu.removeAll();
        PnMainMenu.add(BtMyChild);
        PnMainMenu.add(BtMyAccount);
        PnMainMenu.add(BtSchoolInFor);
        PnMainMenu.add(LbLogo);
        PnMainMenu.add(LbBackground);
        
        PnMainMenu.revalidate();
        PnMainMenu.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        PnMainMenu.removeAll();
        PnMainMenu.add(BtMyChild);
        PnMainMenu.add(BtMyAccount);
        PnMainMenu.add(BtSchoolInFor);
        PnMainMenu.add(LbLogo);
        PnMainMenu.add(LbBackground);
        
        PnMainMenu.revalidate();
        PnMainMenu.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParentMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtMyAccount;
    private javax.swing.JToggleButton BtMyChild;
    private javax.swing.JToggleButton BtSchoolInFor;
    private javax.swing.JLabel LbAlbum;
    private javax.swing.JLabel LbBackground;
    private javax.swing.JLabel LbBirthday;
    private javax.swing.JLabel LbBirthday1;
    private javax.swing.JLabel LbChildAvatar;
    private javax.swing.JLabel LbChildID;
    private javax.swing.JLabel LbChildID1;
    private javax.swing.JLabel LbChildName;
    private javax.swing.JLabel LbChildName1;
    private javax.swing.JLabel LbChildStatus;
    private javax.swing.JLabel LbChildStatus1;
    private javax.swing.JLabel LbCloud;
    private javax.swing.JLabel LbContactCarer;
    private javax.swing.JLabel LbContactCarerPhone;
    private javax.swing.JLabel LbLogo;
    private javax.swing.JLabel LbMyChildBackground;
    private javax.swing.JLabel LbParentAddress;
    private javax.swing.JLabel LbParentAddressExample;
    private javax.swing.JLabel LbParentAvatar;
    private javax.swing.JLabel LbParentChangeAvatar;
    private javax.swing.JLabel LbParentDOB;
    private javax.swing.JLabel LbParentDOBExample;
    private javax.swing.JLabel LbParentEmailAddress;
    private javax.swing.JLabel LbParentEmailExample1;
    private javax.swing.JLabel LbParentID;
    private javax.swing.JLabel LbParentIDExample;
    private javax.swing.JLabel LbParentName;
    private javax.swing.JLabel LbParentNameExample;
    private javax.swing.JLabel LbParentPassword;
    private javax.swing.JLabel LbParentPhoneNumber;
    private javax.swing.JLabel LbParentPhoneNumberExample;
    private javax.swing.JLabel LbParentUpdatepersonalinformation;
    private javax.swing.JLabel LbPasswordExample;
    private javax.swing.JLabel LbSchoolInforBackground;
    private javax.swing.JLabel LbUpdateChildDetail;
    private javax.swing.JLabel LbViewAlbum;
    private javax.swing.JLabel Lbbackground;
    private javax.swing.JPanel PnMainMenu;
    private javax.swing.JPanel PnMyAccount;
    private javax.swing.JPanel PnMyChild;
    private javax.swing.JPanel PnSchoolInformation;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
