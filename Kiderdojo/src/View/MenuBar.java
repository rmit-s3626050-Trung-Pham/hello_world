/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DatabaseConnection;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author phamtrung
 */
public class MenuBar extends javax.swing.JFrame {

    /**
     * Creates new form MenuBar
     */
    private int ID;
    BufferedImage bfImage;
    BufferedImage bfImage1;
    BufferedImage bfFacialPhotoHotGirl;
    BufferedImage bfMenuParentIcon;
    BufferedImage bfMenuCarerIcon;
    BufferedImage bfMenuChildIcon;
    BufferedImage bfMenuClassIcon;
    BufferedImage bfMenuSettingIcon;
    BufferedImage bfMenuItemHome;
    BufferedImage bfMenuItemLogOut;
    JFileChooser fcher;
    File file;
    String carerFacialPhotoPath = "";
//    String parentFacialPhotoPath = "";
    String fileName = "";
    String fileType = "";
    FileInputStream is;
    FileOutputStream os;
    
    DatabaseConnection dbConn;
    public MenuBar() {
        initComponents();
        setFrame();
    }
    
    void setFrame(){
        setLocation(300, 100);
        setResizable(false);
        setImage();
        
//        mnBar.setSize(getSize().width, getSize().height+400);
        
    }
    void setImage(){
        mnBar.setPreferredSize(new Dimension(getWidth(), 40));
        System.out.println(mnBar.getWidth());
        System.out.println(mnBar.getHeight());
        try {
            bfMenuCarerIcon = ImageIO.read(new File("src/Image/CarerMenuIcon.png"));
            ImageIcon iconCarerMenu = new ImageIcon(bfMenuCarerIcon.getScaledInstance(mnCarerMan.getWidth()/3, mnCarerMan.getHeight(), bfMenuCarerIcon.SCALE_SMOOTH));
            mnCarerMan.setIcon(iconCarerMenu);
            
            bfMenuParentIcon = ImageIO.read(new File("src/Image/parentMenuIcon1.png"));
            ImageIcon iconParentMenu = new ImageIcon(bfMenuParentIcon.getScaledInstance(mnParentMan.getWidth()/3, mnParentMan.getHeight(), bfMenuParentIcon.SCALE_SMOOTH));
            mnParentMan.setIcon(iconParentMenu);
            
            bfMenuChildIcon = ImageIO.read(new File("src/Image/ChildMenuIcon1.png"));
            ImageIcon iconChildMenu = new ImageIcon(bfMenuChildIcon.getScaledInstance(mnChildMan.getWidth()/3, mnChildMan.getHeight(), bfMenuChildIcon.SCALE_SMOOTH));
            mnChildMan.setIcon(iconChildMenu);
            
            bfMenuClassIcon = ImageIO.read(new File("src/Image/MenuHomeIcon.png"));
            ImageIcon iconClassMenu = new ImageIcon(bfMenuClassIcon.getScaledInstance(mnClassMan.getWidth()/3, mnClassMan.getHeight(), bfMenuClassIcon.SCALE_SMOOTH));
//            ImageIcon iconHome = new ImageIcon(bfMenuClassIcon.getScaledInstance(miHome.getWidth()/3, miHome.getHeight()/3, bfMenuClassIcon.SCALE_SMOOTH));

            mnClassMan.setIcon(iconClassMenu);
            
            bfImage = ImageIO.read(new File("src/Image/MainPanel2.jpg"));
            ImageIcon icon = new ImageIcon(bfImage.getScaledInstance(lbMainPanle.getWidth(), lbMainPanle.getHeight(), bfImage.SCALE_SMOOTH));
            lbMainPanle.setText("");
            lbMainPanle.setIcon(icon);
            
            bfImage1 = ImageIO.read(new File("src/Image/MainPanel1.jpg"));
            ImageIcon icon1 = new ImageIcon(bfImage1.getScaledInstance(lbMainPanel1.getWidth(), lbMainPanel1.getHeight(), bfImage1.SCALE_SMOOTH));
            lbMainPanel1.setText("");
            lbMainPanel1.setIcon(icon1);
            
            bfFacialPhotoHotGirl = ImageIO.read(new File("src/Image/FacialPhoto/FacialPhoto_hotGirl.jpg"));
            ImageIcon iconHotGirl = new ImageIcon(bfFacialPhotoHotGirl.getScaledInstance(lbCarerPhoto.getWidth(), lbCarerPhoto.getHeight(), bfFacialPhotoHotGirl.SCALE_SMOOTH));
            lbCarerPhoto.setText("");
            lbCarerPhoto.setIcon(iconHotGirl);
            lbCarerUpdatePhoto.setText("");
            lbCarerUpdatePhoto.setIcon(iconHotGirl);
            lbCarerDeletePhoto.setText("");
            lbCarerDeletePhoto.setIcon(iconHotGirl);
            
            bfMenuSettingIcon = ImageIO.read(new File("src//Image/setting.png"));
            ImageIcon iconSetting = new ImageIcon(bfMenuSettingIcon.getScaledInstance(mnSetting.getWidth(), mnSetting.getHeight() ,  bfMenuSettingIcon.SCALE_SMOOTH));
            mnSetting.setIcon(iconSetting);
            
            bfMenuItemHome = ImageIO.read(new File("src/Image/MenuHomeIcon.png"));
            ImageIcon iconHome = new ImageIcon(bfMenuItemHome.getScaledInstance(20, 20, bfMenuItemHome.SCALE_SMOOTH));
            miHome.setIcon(iconHome);
            
            bfMenuItemLogOut = ImageIO.read(new File("src//Image//logout.png"));
            ImageIcon iconLogout = new ImageIcon(bfMenuItemLogOut.getScaledInstance(20, 20, bfMenuItemLogOut.SCALE_SMOOTH));
            miLogOut.setIcon(iconLogout);

        } catch (IOException ex) {
            Logger.getLogger(MenuBar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnLayoutPanel = new javax.swing.JPanel();
        pnMainPanel = new javax.swing.JPanel();
        lbMainPanle = new javax.swing.JLabel();
        lbMainPanel1 = new javax.swing.JLabel();
        pnCarerCreateNew = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfCarerCreateName = new javax.swing.JTextField();
        cbCarerCreateDOBD = new javax.swing.JComboBox<>();
        cbCarerCreateDOBM = new javax.swing.JComboBox<>();
        cbCarerCreateDOBY = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfCarerCreateAddress = new javax.swing.JTextField();
        tfCarerCreateEmailAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfCarerCreatePhoneNum = new javax.swing.JTextField();
        btCarerCreateNewCancel = new javax.swing.JButton();
        btCarerCreateCreate = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lbCarerPhoto = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbCarerCreateGenderMale = new javax.swing.JRadioButton();
        rbCarerCreateGenderFemale = new javax.swing.JRadioButton();
        tfCarerCreateID = new javax.swing.JTextField();
        pnCarerUpdateList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btCarerUpdateListBack = new javax.swing.JButton();
        pnCarerUpdate = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        btCarerUpdateCancel = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        lbCarerUpdatePhoto = new javax.swing.JLabel();
        pnCarerDeleteList = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField10 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        btCarerUpdateListBack1 = new javax.swing.JButton();
        pnCarerDelete = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btCarerDeleteCancel = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        lbCarerDeletePhoto = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        pnParentCreateNew = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        tfParentCreateName = new javax.swing.JTextField();
        cbParentCreateDOBD = new javax.swing.JComboBox<>();
        cbParentCreateDOBM = new javax.swing.JComboBox<>();
        cbParentCreateDOBY = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        tfParentCreateAddress = new javax.swing.JTextField();
        tfParentCreateEmailAddress = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        tfParentCreatePhoneNum = new javax.swing.JTextField();
        btParentCreateNewCancel = new javax.swing.JButton();
        btParentCreateCreate = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        lbParentPhoto = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        rbParentCreateGenderMale = new javax.swing.JRadioButton();
        rbParentCreateGenderFemale = new javax.swing.JRadioButton();
        tfParentCreateID = new javax.swing.JTextField();
        pnParentUpdateList = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbParentUpdateListTable = new javax.swing.JTable();
        jTextField11 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btParentUpdateListBack = new javax.swing.JButton();
        pnParentUpdate = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        tfParentUpdateName = new javax.swing.JTextField();
        cbParentUpdateDOBD = new javax.swing.JComboBox<>();
        cbParentUpdateDOBM = new javax.swing.JComboBox<>();
        cbParentUpdateDOBY = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        tfParentUpdateAddress = new javax.swing.JTextField();
        tfParentUpdateEmail = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        tfParentUpdatePhoneNum = new javax.swing.JTextField();
        btParentUpdateCancel = new javax.swing.JButton();
        btParentUpdateUpdate = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        lbParentUpdatePhoto = new javax.swing.JLabel();
        tfParentUpdateID = new javax.swing.JTextField();
        pnParentDeleteList = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbParentDeleteLishTable = new javax.swing.JTable();
        tfParentDeleteListSearch = new javax.swing.JTextField();
        btParentDeleteListSearch = new javax.swing.JButton();
        btParentDeleteListBack = new javax.swing.JButton();
        pnParentDelete = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        lbParentDeleteID = new javax.swing.JLabel();
        btParentDeleteCancel = new javax.swing.JButton();
        btParentDeleteDelete = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        lbCarerDeletePhoto1 = new javax.swing.JLabel();
        lbParentDeleteName = new javax.swing.JLabel();
        lbParentDeleteDOB = new javax.swing.JLabel();
        lbParentDeleteAddress = new javax.swing.JLabel();
        lbParentDeleteEmail = new javax.swing.JLabel();
        lbParentDeletePhoneNum = new javax.swing.JLabel();
        pnClassCreateNew = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        pnClassUpdateList = new javax.swing.JPanel();
        pnClassUpdate = new javax.swing.JPanel();
        pnClassDeleteList = new javax.swing.JPanel();
        pnClassDelete = new javax.swing.JPanel();
        pnClassAssign = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel68 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        pnClassAssignCarerList = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        cbAssignCarer = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        pnClassAssignCarerInfo = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        btCarerDeleteCancel1 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        lbCarerDeletePhoto2 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        pnClassAssignChildenList = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        cbAssignChildren = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        pnClassAssignChildrenInfo = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        btCarerDeleteCancel2 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        lbCarerDeletePhoto3 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        mnBar = new javax.swing.JMenuBar();
        mnCarerMan = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnParentMan = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnChildMan = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        mnClassMan = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        mnSetting = new javax.swing.JMenu();
        miHome = new javax.swing.JMenuItem();
        miLogOut = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnLayoutPanel.setBackground(new java.awt.Color(255, 255, 255));
        pnLayoutPanel.setLayout(new java.awt.CardLayout());

        pnMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        lbMainPanle.setText("lbMainPanle");

        lbMainPanel1.setText("lbMainPanel1");

        javax.swing.GroupLayout pnMainPanelLayout = new javax.swing.GroupLayout(pnMainPanel);
        pnMainPanel.setLayout(pnMainPanelLayout);
        pnMainPanelLayout.setHorizontalGroup(
            pnMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMainPanelLayout.createSequentialGroup()
                        .addComponent(lbMainPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMainPanelLayout.createSequentialGroup()
                        .addComponent(lbMainPanle, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        pnMainPanelLayout.setVerticalGroup(
            pnMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMainPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbMainPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(lbMainPanle, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        pnLayoutPanel.add(pnMainPanel, "card4");

        pnCarerCreateNew.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        jLabel3.setText("Date Of Birth:");

        jLabel4.setText("Address:");

        jLabel5.setText("Email");

        jLabel6.setText("Phone Number:");

        cbCarerCreateDOBD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbCarerCreateDOBM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        cbCarerCreateDOBY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002" }));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setText("/");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setText("/");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setText("@gmail.com");

        btCarerCreateNewCancel.setText("Cancel");
        btCarerCreateNewCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarerCreateNewCancelActionPerformed(evt);
            }
        });

        btCarerCreateCreate.setText("Create");
        btCarerCreateCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarerCreateCreateActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel11.setText("Create new Carer");

        lbCarerPhoto.setText("jLabel12");
        lbCarerPhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCarerPhotoMouseClicked(evt);
            }
        });

        jLabel7.setText("Gender:");

        buttonGroup1.add(rbCarerCreateGenderMale);
        rbCarerCreateGenderMale.setText("Male");

        buttonGroup1.add(rbCarerCreateGenderFemale);
        rbCarerCreateGenderFemale.setText("Female");

        javax.swing.GroupLayout pnCarerCreateNewLayout = new javax.swing.GroupLayout(pnCarerCreateNew);
        pnCarerCreateNew.setLayout(pnCarerCreateNewLayout);
        pnCarerCreateNewLayout.setHorizontalGroup(
            pnCarerCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCarerCreateNewLayout.createSequentialGroup()
                .addGroup(pnCarerCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCarerCreateNewLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lbCarerPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCarerCreateNewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(pnCarerCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCarerCreateNewLayout.createSequentialGroup()
                        .addGroup(pnCarerCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(pnCarerCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCarerCreateNewLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btCarerCreateCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btCarerCreateNewCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnCarerCreateNewLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(pnCarerCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCarerCreateID, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCarerCreatePhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCarerCreateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnCarerCreateNewLayout.createSequentialGroup()
                                        .addComponent(cbCarerCreateDOBD, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbCarerCreateDOBM, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbCarerCreateDOBY, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnCarerCreateNewLayout.createSequentialGroup()
                                        .addComponent(tfCarerCreateEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10))
                                    .addGroup(pnCarerCreateNewLayout.createSequentialGroup()
                                        .addComponent(rbCarerCreateGenderMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbCarerCreateGenderFemale))
                                    .addComponent(tfCarerCreateName, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        pnCarerCreateNewLayout.setVerticalGroup(
            pnCarerCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCarerCreateNewLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(pnCarerCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCarerCreateNewLayout.createSequentialGroup()
                        .addGroup(pnCarerCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCarerCreateNewLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCarerCreateNewLayout.createSequentialGroup()
                                .addComponent(tfCarerCreateID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfCarerCreateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(pnCarerCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(rbCarerCreateGenderMale)
                            .addComponent(rbCarerCreateGenderFemale))
                        .addGap(25, 25, 25)
                        .addGroup(pnCarerCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbCarerCreateDOBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCarerCreateDOBM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCarerCreateDOBY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(21, 21, 21)
                        .addGroup(pnCarerCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfCarerCreateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(pnCarerCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfCarerCreateEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(23, 23, 23)
                        .addGroup(pnCarerCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfCarerCreatePhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(pnCarerCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCarerCreateNewCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCarerCreateCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnCarerCreateNewLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lbCarerPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        pnLayoutPanel.add(pnCarerCreateNew, "card3");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Cr001", "Leona", "23/05/1992", "F"},
                {"Cr002", "Racheal", "21/09/1992", "M"},
                {"Cr003", "Carlot", "23/09/1992", null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1.setText("Search");

        btCarerUpdateListBack.setText("Back");
        btCarerUpdateListBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarerUpdateListBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCarerUpdateListLayout = new javax.swing.GroupLayout(pnCarerUpdateList);
        pnCarerUpdateList.setLayout(pnCarerUpdateListLayout);
        pnCarerUpdateListLayout.setHorizontalGroup(
            pnCarerUpdateListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCarerUpdateListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btCarerUpdateListBack, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCarerUpdateListLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(42, 42, 42))
        );
        pnCarerUpdateListLayout.setVerticalGroup(
            pnCarerUpdateListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCarerUpdateListLayout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addGroup(pnCarerUpdateListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCarerUpdateListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCarerUpdateListLayout.createSequentialGroup()
                        .addComponent(btCarerUpdateListBack, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        pnLayoutPanel.add(pnCarerUpdateList, "card4");

        jLabel12.setText("ID");

        jLabel13.setText("Name");

        jLabel14.setText("Date Of Birth:");

        jLabel15.setText("Address:");

        jLabel16.setText("Email");

        jLabel17.setText("Phone Number:");

        jLabel18.setText("CR0001");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002" }));

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel19.setText("/");

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel20.setText("/");

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel21.setText("@gmail.com");

        btCarerUpdateCancel.setText("Cancel");
        btCarerUpdateCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarerUpdateCancelActionPerformed(evt);
            }
        });

        jButton3.setText("Update");

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel22.setText("Update Carer Account");

        lbCarerUpdatePhoto.setText("jLabel12");

        javax.swing.GroupLayout pnCarerUpdateLayout = new javax.swing.GroupLayout(pnCarerUpdate);
        pnCarerUpdate.setLayout(pnCarerUpdateLayout);
        pnCarerUpdateLayout.setHorizontalGroup(
            pnCarerUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCarerUpdateLayout.createSequentialGroup()
                .addGroup(pnCarerUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCarerUpdateLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lbCarerUpdatePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCarerUpdateLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnCarerUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGroup(pnCarerUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCarerUpdateLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btCarerUpdateCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCarerUpdateLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(pnCarerUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCarerUpdateLayout.createSequentialGroup()
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCarerUpdateLayout.createSequentialGroup()
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnCarerUpdateLayout.setVerticalGroup(
            pnCarerUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCarerUpdateLayout.createSequentialGroup()
                .addGroup(pnCarerUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCarerUpdateLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCarerUpdatePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCarerUpdateLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(pnCarerUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(pnCarerUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(pnCarerUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(21, 21, 21)
                        .addGroup(pnCarerUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(pnCarerUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(23, 23, 23)
                        .addGroup(pnCarerUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(pnCarerUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCarerUpdateCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pnLayoutPanel.add(pnCarerUpdate, "card5");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Cr001", "Leona", "23/05/1992", "F"},
                {"Cr002", "Racheal", "21/09/1992", "M"},
                {"Cr003", "Carlot", "23/09/1992", null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jButton4.setText("Search");

        btCarerUpdateListBack1.setText("Back");
        btCarerUpdateListBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarerUpdateListBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCarerDeleteListLayout = new javax.swing.GroupLayout(pnCarerDeleteList);
        pnCarerDeleteList.setLayout(pnCarerDeleteListLayout);
        pnCarerDeleteListLayout.setHorizontalGroup(
            pnCarerDeleteListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCarerDeleteListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btCarerUpdateListBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCarerDeleteListLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(42, 42, 42))
        );
        pnCarerDeleteListLayout.setVerticalGroup(
            pnCarerDeleteListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCarerDeleteListLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnCarerDeleteListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCarerDeleteListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCarerDeleteListLayout.createSequentialGroup()
                        .addComponent(btCarerUpdateListBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        pnLayoutPanel.add(pnCarerDeleteList, "card6");

        jLabel23.setText("ID");

        jLabel24.setText("Name");

        jLabel25.setText("Date Of Birth:");

        jLabel26.setText("Address:");

        jLabel27.setText("Email");

        jLabel28.setText("Phone Number:");

        jLabel29.setText("CR0001");

        btCarerDeleteCancel.setText("Cancel");
        btCarerDeleteCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarerDeleteCancelActionPerformed(evt);
            }
        });

        jButton5.setText("Delete");

        jLabel33.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel33.setText("Delete Carer Account");

        lbCarerDeletePhoto.setText("jLabel12");

        jLabel34.setText("Cristiano Ronaldo");

        jLabel30.setText("10/12/1990");

        jLabel31.setText("4 - Glenmoyne square - Werribee");

        jLabel32.setText("s3560345@student.rmit.edu.au");

        jLabel35.setText("0456872305");

        javax.swing.GroupLayout pnCarerDeleteLayout = new javax.swing.GroupLayout(pnCarerDelete);
        pnCarerDelete.setLayout(pnCarerDeleteLayout);
        pnCarerDeleteLayout.setHorizontalGroup(
            pnCarerDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCarerDeleteLayout.createSequentialGroup()
                .addGroup(pnCarerDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCarerDeleteLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lbCarerDeletePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCarerDeleteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnCarerDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addGroup(pnCarerDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCarerDeleteLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btCarerDeleteCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCarerDeleteLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(pnCarerDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnCarerDeleteLayout.setVerticalGroup(
            pnCarerDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCarerDeleteLayout.createSequentialGroup()
                .addGroup(pnCarerDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCarerDeleteLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCarerDeletePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCarerDeleteLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(pnCarerDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel29))
                        .addGap(18, 18, 18)
                        .addGroup(pnCarerDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnCarerDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnCarerDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(pnCarerDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(pnCarerDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(pnCarerDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCarerDeleteCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pnLayoutPanel.add(pnCarerDelete, "card7");

        pnParentCreateNew.setBackground(new java.awt.Color(255, 255, 255));

        jLabel36.setText("ID");

        jLabel37.setText("Name");

        jLabel38.setText("Date Of Birth:");

        jLabel39.setText("Address:");

        jLabel40.setText("Email");

        jLabel41.setText("Phone Number:");

        cbParentCreateDOBD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbParentCreateDOBM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        cbParentCreateDOBY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002" }));

        jLabel42.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel42.setText("/");

        jLabel43.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel43.setText("/");

        jLabel44.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel44.setText("@gmail.com");

        btParentCreateNewCancel.setText("Cancel");
        btParentCreateNewCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btParentCreateNewCancelActionPerformed(evt);
            }
        });

        btParentCreateCreate.setText("Create");
        btParentCreateCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btParentCreateCreateActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel45.setText("Create Parent");

        lbParentPhoto.setText("jLabel12");
        lbParentPhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbParentPhotoMouseClicked(evt);
            }
        });

        jLabel46.setText("Gender:");

        buttonGroup1.add(rbParentCreateGenderMale);
        rbParentCreateGenderMale.setText("Male");

        buttonGroup1.add(rbParentCreateGenderFemale);
        rbParentCreateGenderFemale.setText("Female");

        javax.swing.GroupLayout pnParentCreateNewLayout = new javax.swing.GroupLayout(pnParentCreateNew);
        pnParentCreateNew.setLayout(pnParentCreateNewLayout);
        pnParentCreateNewLayout.setHorizontalGroup(
            pnParentCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnParentCreateNewLayout.createSequentialGroup()
                .addGroup(pnParentCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnParentCreateNewLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lbParentPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnParentCreateNewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(pnParentCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnParentCreateNewLayout.createSequentialGroup()
                        .addGroup(pnParentCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41))
                        .addGroup(pnParentCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnParentCreateNewLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btParentCreateCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btParentCreateNewCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnParentCreateNewLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(pnParentCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfParentCreateID, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfParentCreatePhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfParentCreateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnParentCreateNewLayout.createSequentialGroup()
                                        .addComponent(cbParentCreateDOBD, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbParentCreateDOBM, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbParentCreateDOBY, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnParentCreateNewLayout.createSequentialGroup()
                                        .addComponent(tfParentCreateEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel44))
                                    .addGroup(pnParentCreateNewLayout.createSequentialGroup()
                                        .addComponent(rbParentCreateGenderMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbParentCreateGenderFemale))
                                    .addComponent(tfParentCreateName, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel46))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        pnParentCreateNewLayout.setVerticalGroup(
            pnParentCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnParentCreateNewLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(pnParentCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnParentCreateNewLayout.createSequentialGroup()
                        .addGroup(pnParentCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnParentCreateNewLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel36)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel37)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnParentCreateNewLayout.createSequentialGroup()
                                .addComponent(tfParentCreateID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfParentCreateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(pnParentCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(rbParentCreateGenderMale)
                            .addComponent(rbParentCreateGenderFemale))
                        .addGap(25, 25, 25)
                        .addGroup(pnParentCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(cbParentCreateDOBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbParentCreateDOBM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbParentCreateDOBY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43))
                        .addGap(21, 21, 21)
                        .addGroup(pnParentCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(tfParentCreateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(pnParentCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(tfParentCreateEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44))
                        .addGap(23, 23, 23)
                        .addGroup(pnParentCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(tfParentCreatePhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(pnParentCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btParentCreateNewCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btParentCreateCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnParentCreateNewLayout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lbParentPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        pnLayoutPanel.add(pnParentCreateNew, "card3");

        tbParentUpdateListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Cr001", "Leona", "23/05/1992", "F"},
                {"Cr002", "Racheal", "21/09/1992", "M"},
                {"Cr003", "Carlot", "23/09/1992", null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbParentUpdateListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbParentUpdateListTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbParentUpdateListTable);

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jButton2.setText("Search");

        btParentUpdateListBack.setText("Back");
        btParentUpdateListBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btParentUpdateListBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnParentUpdateListLayout = new javax.swing.GroupLayout(pnParentUpdateList);
        pnParentUpdateList.setLayout(pnParentUpdateListLayout);
        pnParentUpdateListLayout.setHorizontalGroup(
            pnParentUpdateListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnParentUpdateListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btParentUpdateListBack, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnParentUpdateListLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(42, 42, 42))
        );
        pnParentUpdateListLayout.setVerticalGroup(
            pnParentUpdateListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnParentUpdateListLayout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addGroup(pnParentUpdateListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnParentUpdateListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnParentUpdateListLayout.createSequentialGroup()
                        .addComponent(btParentUpdateListBack, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        pnLayoutPanel.add(pnParentUpdateList, "card4");

        jLabel47.setText("ID");

        jLabel48.setText("Name");

        jLabel49.setText("Date Of Birth:");

        jLabel50.setText("Address:");

        jLabel51.setText("Email");

        jLabel52.setText("Phone Number:");

        cbParentUpdateDOBD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbParentUpdateDOBM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        cbParentUpdateDOBY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002" }));

        jLabel54.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel54.setText("/");

        jLabel55.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel55.setText("/");

        jLabel56.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel56.setText("@gmail.com");

        btParentUpdateCancel.setText("Cancel");
        btParentUpdateCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btParentUpdateCancelActionPerformed(evt);
            }
        });

        btParentUpdateUpdate.setText("Update");

        jLabel57.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel57.setText("Update Carer");

        lbParentUpdatePhoto.setText("jLabel12");

        javax.swing.GroupLayout pnParentUpdateLayout = new javax.swing.GroupLayout(pnParentUpdate);
        pnParentUpdate.setLayout(pnParentUpdateLayout);
        pnParentUpdateLayout.setHorizontalGroup(
            pnParentUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnParentUpdateLayout.createSequentialGroup()
                .addGroup(pnParentUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnParentUpdateLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lbParentUpdatePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnParentUpdateLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnParentUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52))
                .addGroup(pnParentUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnParentUpdateLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btParentUpdateUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btParentUpdateCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnParentUpdateLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(pnParentUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfParentUpdateID, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfParentUpdatePhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfParentUpdateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnParentUpdateLayout.createSequentialGroup()
                                .addComponent(cbParentUpdateDOBD, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbParentUpdateDOBM, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbParentUpdateDOBY, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfParentUpdateName, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnParentUpdateLayout.createSequentialGroup()
                                .addComponent(tfParentUpdateEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel56)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnParentUpdateLayout.setVerticalGroup(
            pnParentUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnParentUpdateLayout.createSequentialGroup()
                .addGroup(pnParentUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnParentUpdateLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbParentUpdatePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnParentUpdateLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(pnParentUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel47)
                            .addComponent(tfParentUpdateID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnParentUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(tfParentUpdateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(pnParentUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(cbParentUpdateDOBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbParentUpdateDOBM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbParentUpdateDOBY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54)
                            .addComponent(jLabel55))
                        .addGap(21, 21, 21)
                        .addGroup(pnParentUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(tfParentUpdateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(pnParentUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(tfParentUpdateEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56))
                        .addGap(23, 23, 23)
                        .addGroup(pnParentUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(tfParentUpdatePhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(pnParentUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btParentUpdateCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btParentUpdateUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pnLayoutPanel.add(pnParentUpdate, "card5");

        tbParentDeleteLishTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Cr001", "Leona", "23/05/1992", "F"},
                {"Cr002", "Racheal", "21/09/1992", "M"},
                {"Cr003", "Carlot", "23/09/1992", null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbParentDeleteLishTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbParentDeleteLishTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbParentDeleteLishTable);

        tfParentDeleteListSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfParentDeleteListSearchActionPerformed(evt);
            }
        });

        btParentDeleteListSearch.setText("Search");

        btParentDeleteListBack.setText("Back");
        btParentDeleteListBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btParentDeleteListBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnParentDeleteListLayout = new javax.swing.GroupLayout(pnParentDeleteList);
        pnParentDeleteList.setLayout(pnParentDeleteListLayout);
        pnParentDeleteListLayout.setHorizontalGroup(
            pnParentDeleteListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnParentDeleteListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btParentDeleteListBack, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnParentDeleteListLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfParentDeleteListSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btParentDeleteListSearch)
                .addGap(42, 42, 42))
        );
        pnParentDeleteListLayout.setVerticalGroup(
            pnParentDeleteListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnParentDeleteListLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnParentDeleteListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfParentDeleteListSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btParentDeleteListSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnParentDeleteListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnParentDeleteListLayout.createSequentialGroup()
                        .addComponent(btParentDeleteListBack, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        pnLayoutPanel.add(pnParentDeleteList, "card6");

        jLabel58.setText("ID");

        jLabel59.setText("Name");

        jLabel60.setText("Date Of Birth:");

        jLabel61.setText("Address:");

        jLabel62.setText("Email");

        jLabel63.setText("Phone Number:");

        lbParentDeleteID.setText("CR0001");

        btParentDeleteCancel.setText("Cancel");
        btParentDeleteCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btParentDeleteCancelActionPerformed(evt);
            }
        });

        btParentDeleteDelete.setText("Delete");

        jLabel65.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel65.setText("Delete Carer Account");

        lbCarerDeletePhoto1.setText("jLabel12");

        lbParentDeleteName.setText("Cristiano Ronaldo");

        lbParentDeleteDOB.setText("10/12/1990");

        lbParentDeleteAddress.setText("4 - Glenmoyne square - Werribee");

        lbParentDeleteEmail.setText("s3560345@student.rmit.edu.au");

        lbParentDeletePhoneNum.setText("0456872305");

        javax.swing.GroupLayout pnParentDeleteLayout = new javax.swing.GroupLayout(pnParentDelete);
        pnParentDelete.setLayout(pnParentDeleteLayout);
        pnParentDeleteLayout.setHorizontalGroup(
            pnParentDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnParentDeleteLayout.createSequentialGroup()
                .addGroup(pnParentDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnParentDeleteLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lbCarerDeletePhoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnParentDeleteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnParentDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60)
                    .addComponent(jLabel61)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63))
                .addGroup(pnParentDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnParentDeleteLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btParentDeleteDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btParentDeleteCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnParentDeleteLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(pnParentDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbParentDeleteAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbParentDeleteDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbParentDeleteName, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbParentDeleteID, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbParentDeleteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbParentDeletePhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnParentDeleteLayout.setVerticalGroup(
            pnParentDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnParentDeleteLayout.createSequentialGroup()
                .addGroup(pnParentDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnParentDeleteLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCarerDeletePhoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnParentDeleteLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(pnParentDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(lbParentDeleteID))
                        .addGap(18, 18, 18)
                        .addGroup(pnParentDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addComponent(lbParentDeleteName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnParentDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60)
                            .addComponent(lbParentDeleteDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnParentDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addComponent(lbParentDeleteAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(pnParentDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(lbParentDeleteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(pnParentDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(lbParentDeletePhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(pnParentDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btParentDeleteCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btParentDeleteDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pnLayoutPanel.add(pnParentDelete, "card7");

        jLabel53.setText("Class ID:");

        jLabel64.setText("Class type:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel66.setText("Year offering");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton6.setText("Create");

        jButton7.setText("Cancle");

        jLabel67.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel67.setText("Create a new class");

        javax.swing.GroupLayout pnClassCreateNewLayout = new javax.swing.GroupLayout(pnClassCreateNew);
        pnClassCreateNew.setLayout(pnClassCreateNewLayout);
        pnClassCreateNewLayout.setHorizontalGroup(
            pnClassCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClassCreateNewLayout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addGroup(pnClassCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnClassCreateNewLayout.createSequentialGroup()
                        .addGroup(pnClassCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addComponent(jLabel53)
                            .addComponent(jLabel66))
                        .addGap(22, 22, 22)
                        .addGroup(pnClassCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnClassCreateNewLayout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7))
                            .addGroup(pnClassCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(155, 155, 155))
        );
        pnClassCreateNewLayout.setVerticalGroup(
            pnClassCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClassCreateNewLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(pnClassCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnClassCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnClassCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel66)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pnClassCreateNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pnLayoutPanel.add(pnClassCreateNew, "card13");

        javax.swing.GroupLayout pnClassUpdateListLayout = new javax.swing.GroupLayout(pnClassUpdateList);
        pnClassUpdateList.setLayout(pnClassUpdateListLayout);
        pnClassUpdateListLayout.setHorizontalGroup(
            pnClassUpdateListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        pnClassUpdateListLayout.setVerticalGroup(
            pnClassUpdateListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );

        pnLayoutPanel.add(pnClassUpdateList, "card14");

        javax.swing.GroupLayout pnClassUpdateLayout = new javax.swing.GroupLayout(pnClassUpdate);
        pnClassUpdate.setLayout(pnClassUpdateLayout);
        pnClassUpdateLayout.setHorizontalGroup(
            pnClassUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        pnClassUpdateLayout.setVerticalGroup(
            pnClassUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );

        pnLayoutPanel.add(pnClassUpdate, "card15");

        javax.swing.GroupLayout pnClassDeleteListLayout = new javax.swing.GroupLayout(pnClassDeleteList);
        pnClassDeleteList.setLayout(pnClassDeleteListLayout);
        pnClassDeleteListLayout.setHorizontalGroup(
            pnClassDeleteListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        pnClassDeleteListLayout.setVerticalGroup(
            pnClassDeleteListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );

        pnLayoutPanel.add(pnClassDeleteList, "card16");

        javax.swing.GroupLayout pnClassDeleteLayout = new javax.swing.GroupLayout(pnClassDelete);
        pnClassDelete.setLayout(pnClassDeleteLayout);
        pnClassDeleteLayout.setHorizontalGroup(
            pnClassDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        pnClassDeleteLayout.setVerticalGroup(
            pnClassDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );

        pnLayoutPanel.add(pnClassDelete, "card17");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable3);

        jLabel68.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel68.setText("Class 0001 - semeter 2 - 2017");

        jButton8.setText("Search");

        javax.swing.GroupLayout pnClassAssignLayout = new javax.swing.GroupLayout(pnClassAssign);
        pnClassAssign.setLayout(pnClassAssignLayout);
        pnClassAssignLayout.setHorizontalGroup(
            pnClassAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClassAssignLayout.createSequentialGroup()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(pnClassAssignLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnClassAssignLayout.setVerticalGroup(
            pnClassAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClassAssignLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnClassAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnLayoutPanel.add(pnClassAssign, "card18");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Carer 1", "", null, null},
                {"Carer 2", null, null, null},
                {"Carer 3", null, null, null},
                {"Carer 4", null, null, null}
            },
            new String [] {
                "Carer 1", "Carer 2", "Carer 3", "Carer 4"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable4);

        cbAssignCarer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Assign carer into class", "Assign children into class" }));
        cbAssignCarer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAssignCarerItemStateChanged(evt);
            }
        });

        jButton9.setText("Search");

        javax.swing.GroupLayout pnClassAssignCarerListLayout = new javax.swing.GroupLayout(pnClassAssignCarerList);
        pnClassAssignCarerList.setLayout(pnClassAssignCarerListLayout);
        pnClassAssignCarerListLayout.setHorizontalGroup(
            pnClassAssignCarerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClassAssignCarerListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnClassAssignCarerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnClassAssignCarerListLayout.createSequentialGroup()
                        .addComponent(cbAssignCarer, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );
        pnClassAssignCarerListLayout.setVerticalGroup(
            pnClassAssignCarerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClassAssignCarerListLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(pnClassAssignCarerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAssignCarer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnLayoutPanel.add(pnClassAssignCarerList, "card19");

        jLabel69.setText("ID");

        jLabel70.setText("Name");

        jLabel71.setText("Date Of Birth:");

        jLabel72.setText("Address:");

        jLabel73.setText("Email");

        jLabel74.setText("Phone Number:");

        jLabel75.setText("CR0001");

        btCarerDeleteCancel1.setText("Cancel");
        btCarerDeleteCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarerDeleteCancel1ActionPerformed(evt);
            }
        });

        jButton11.setText("Delete");

        jLabel76.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel76.setText("Assign carer");

        lbCarerDeletePhoto2.setText("jLabel12");

        jLabel77.setText("Cristiano Ronaldo");

        jLabel78.setText("10/12/1990");

        jLabel79.setText("4 - Glenmoyne square - Werribee");

        jLabel80.setText("s3560345@student.rmit.edu.au");

        jLabel81.setText("0456872305");

        javax.swing.GroupLayout pnClassAssignCarerInfoLayout = new javax.swing.GroupLayout(pnClassAssignCarerInfo);
        pnClassAssignCarerInfo.setLayout(pnClassAssignCarerInfoLayout);
        pnClassAssignCarerInfoLayout.setHorizontalGroup(
            pnClassAssignCarerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClassAssignCarerInfoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnClassAssignCarerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnClassAssignCarerInfoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lbCarerDeletePhoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnClassAssignCarerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel69)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71)
                    .addComponent(jLabel72)
                    .addComponent(jLabel73)
                    .addComponent(jLabel74))
                .addGroup(pnClassAssignCarerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnClassAssignCarerInfoLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btCarerDeleteCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnClassAssignCarerInfoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(pnClassAssignCarerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        pnClassAssignCarerInfoLayout.setVerticalGroup(
            pnClassAssignCarerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClassAssignCarerInfoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnClassAssignCarerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnClassAssignCarerInfoLayout.createSequentialGroup()
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCarerDeletePhoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnClassAssignCarerInfoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(pnClassAssignCarerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69)
                            .addComponent(jLabel75))
                        .addGap(18, 18, 18)
                        .addGroup(pnClassAssignCarerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnClassAssignCarerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnClassAssignCarerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(pnClassAssignCarerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(pnClassAssignCarerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(pnClassAssignCarerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCarerDeleteCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pnLayoutPanel.add(pnClassAssignCarerInfo, "card20");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"children 1", null, null, null},
                {"children 2", null, null, null},
                {"children 3", null, null, null},
                {"children 4", null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable5);

        cbAssignChildren.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Assign carer into class", "Assign children into class" }));
        cbAssignChildren.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAssignChildrenItemStateChanged(evt);
            }
        });

        jButton10.setText("Search");

        javax.swing.GroupLayout pnClassAssignChildenListLayout = new javax.swing.GroupLayout(pnClassAssignChildenList);
        pnClassAssignChildenList.setLayout(pnClassAssignChildenListLayout);
        pnClassAssignChildenListLayout.setHorizontalGroup(
            pnClassAssignChildenListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClassAssignChildenListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnClassAssignChildenListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnClassAssignChildenListLayout.createSequentialGroup()
                        .addComponent(cbAssignChildren, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addComponent(jScrollPane7))
                .addContainerGap())
        );
        pnClassAssignChildenListLayout.setVerticalGroup(
            pnClassAssignChildenListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClassAssignChildenListLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(pnClassAssignChildenListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAssignChildren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnLayoutPanel.add(pnClassAssignChildenList, "card21");

        jLabel82.setText("ID");

        jLabel83.setText("Name");

        jLabel84.setText("Date Of Birth:");

        jLabel85.setText("Address:");

        jLabel88.setText("CR0001");

        btCarerDeleteCancel2.setText("Cancel");
        btCarerDeleteCancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarerDeleteCancel2ActionPerformed(evt);
            }
        });

        jButton12.setText("Assign");

        jLabel89.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel89.setText("Assign children");

        lbCarerDeletePhoto3.setText("jLabel12");

        jLabel90.setText("Cristiano Ronaldo");

        jLabel91.setText("10/12/1990");

        jLabel92.setText("4 - Glenmoyne square - Werribee");

        jLabel86.setText("Gender");

        jLabel93.setText("Male");

        jLabel87.setText("Parent:");

        jLabel94.setText("Mr William");

        javax.swing.GroupLayout pnClassAssignChildrenInfoLayout = new javax.swing.GroupLayout(pnClassAssignChildrenInfo);
        pnClassAssignChildrenInfo.setLayout(pnClassAssignChildrenInfoLayout);
        pnClassAssignChildrenInfoLayout.setHorizontalGroup(
            pnClassAssignChildrenInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClassAssignChildrenInfoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnClassAssignChildrenInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnClassAssignChildrenInfoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lbCarerDeletePhoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnClassAssignChildrenInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnClassAssignChildrenInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnClassAssignChildrenInfoLayout.createSequentialGroup()
                            .addGroup(pnClassAssignChildrenInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel82)
                                .addComponent(jLabel83))
                            .addGroup(pnClassAssignChildrenInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnClassAssignChildrenInfoLayout.createSequentialGroup()
                                    .addGap(115, 115, 115)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(btCarerDeleteCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnClassAssignChildrenInfoLayout.createSequentialGroup()
                                    .addGap(104, 104, 104)
                                    .addGroup(pnClassAssignChildrenInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(pnClassAssignChildrenInfoLayout.createSequentialGroup()
                            .addComponent(jLabel86)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnClassAssignChildrenInfoLayout.createSequentialGroup()
                        .addGroup(pnClassAssignChildrenInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel84)
                            .addComponent(jLabel85)
                            .addComponent(jLabel87))
                        .addGap(55, 55, 55)
                        .addGroup(pnClassAssignChildrenInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnClassAssignChildrenInfoLayout.setVerticalGroup(
            pnClassAssignChildrenInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClassAssignChildrenInfoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnClassAssignChildrenInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnClassAssignChildrenInfoLayout.createSequentialGroup()
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCarerDeletePhoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnClassAssignChildrenInfoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(pnClassAssignChildrenInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel82)
                            .addComponent(jLabel88))
                        .addGap(18, 18, 18)
                        .addGroup(pnClassAssignChildrenInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel83)
                            .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnClassAssignChildrenInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel86))
                        .addGap(29, 29, 29)
                        .addGroup(pnClassAssignChildrenInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel84)
                            .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnClassAssignChildrenInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel85)
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnClassAssignChildrenInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87))
                        .addGap(34, 34, 34)
                        .addGroup(pnClassAssignChildrenInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCarerDeleteCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pnLayoutPanel.add(pnClassAssignChildrenInfo, "card22");

        mnBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mnBar.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        mnBar.setSize(new java.awt.Dimension(86, 23));

        mnCarerMan.setText("Carer Manage |     ");

        jMenuItem2.setText("Create Carer Account");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnCarerMan.add(jMenuItem2);

        jMenuItem1.setText("Update Carer Account");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnCarerMan.add(jMenuItem1);

        jMenuItem3.setText("Delete Carer Account");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnCarerMan.add(jMenuItem3);

        mnBar.add(mnCarerMan);

        mnParentMan.setText("Parent Manage |     ");

        jMenuItem4.setText("Create Parent Account");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnParentMan.add(jMenuItem4);

        jMenuItem5.setText("Update Parent Account");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mnParentMan.add(jMenuItem5);

        jMenuItem6.setText("Delete Parent Account");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        mnParentMan.add(jMenuItem6);

        mnBar.add(mnParentMan);

        mnChildMan.setText("Children Manage |     ");

        jMenuItem7.setText("Create children");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        mnChildMan.add(jMenuItem7);

        jMenuItem8.setText("Update children Infomation");
        mnChildMan.add(jMenuItem8);

        jMenuItem9.setText("Delete children");
        mnChildMan.add(jMenuItem9);

        mnBar.add(mnChildMan);

        mnClassMan.setText("Class Manage |     ");

        jMenuItem10.setText("Create class");
        mnClassMan.add(jMenuItem10);

        jMenuItem11.setText("assign children into class");
        mnClassMan.add(jMenuItem11);

        jMenuItem12.setText("Assign carer into class");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        mnClassMan.add(jMenuItem12);

        jMenuItem13.setText("View class detail");
        mnClassMan.add(jMenuItem13);

        mnBar.add(mnClassMan);

        mnSetting.setText("Setting");
        mnSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSettingActionPerformed(evt);
            }
        });

        miHome.setText("Home");
        miHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miHomeActionPerformed(evt);
            }
        });
        mnSetting.add(miHome);

        miLogOut.setText("Log out");
        miLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLogOutActionPerformed(evt);
            }
        });
        mnSetting.add(miLogOut);

        mnBar.add(mnSetting);

        setJMenuBar(mnBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLayoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLayoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
//        Frame_CarerCreateNew fmCarerCreate = new Frame_CarerCreateNew();
//        fmCarerCreate.setVisible(true);
////        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        dispose();
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnCarerCreateNew);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btCarerCreateNewCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarerCreateNewCancelActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnMainPanel);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
        
        
    }//GEN-LAST:event_btCarerCreateNewCancelActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnCarerUpdate);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnCarerUpdateList);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btCarerUpdateListBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarerUpdateListBackActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnMainPanel);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_btCarerUpdateListBackActionPerformed

    private void btCarerUpdateCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarerUpdateCancelActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnCarerUpdateList);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_btCarerUpdateCancelActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnCarerDelete);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void btCarerUpdateListBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarerUpdateListBack1ActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnMainPanel);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_btCarerUpdateListBack1ActionPerformed

    private void btCarerDeleteCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarerDeleteCancelActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnCarerDeleteList);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_btCarerDeleteCancelActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnCarerDeleteList);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_jMenuItem3ActionPerformed
//java swing
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
//        JOptionPane.showMessageDialog(null, "you are welcome");
//      JOptionPane.showMessageDialog(null, "Welcome to Java!", "Example 1.2 Output", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void btCarerCreateCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarerCreateCreateActionPerformed
        // TODO add your handling code here:
        Model.Carer carer = new Model.Carer();
        String username = tfCarerCreateID.getText();
        String name = tfCarerCreateName.getText();
        String genderMale = rbCarerCreateGenderMale.getText();
        String genderFemale = rbCarerCreateGenderFemale.getText();
        String DD = (String) cbCarerCreateDOBD.getSelectedItem().toString();
        String MM = (String) cbCarerCreateDOBM.getSelectedItem().toString();
        String YY = (String) cbCarerCreateDOBY.getSelectedItem().toString();
        String DOB = DD+"/"+MM+"/"+YY;
//        System.out.println(DOB);
        String address = tfCarerCreateAddress.getText();
        String facialPhoto = carerFacialPhotoPath;
        String email = tfCarerCreateEmailAddress.getText() + "Gmail.com";
        String phoneNum = tfCarerCreatePhoneNum.getText();
        carer.createCarerUsername(dbConn ,"C"+username, "123456");
        if(carer.iStatus == 1)
            {
                carer.createCarerAccount(dbConn , "C"+username, name, genderMale, DOB, address, facialPhoto, email, phoneNum);
            }
        
        if(carer.iStatus == 2)
            JOptionPane.showMessageDialog(null, "create is successful!!!!!!!!!!");
        else
        {
            JOptionPane.showMessageDialog(null, "create is fail!!!!!!!!");
            if(carer.iStatus == 1){
                carer.deleteCarerUsername(dbConn, username);
            }
        }
        tfCarerCreateID.setText("");
        tfCarerCreateName.setText("");
        tfCarerCreateAddress.setText("");
        tfCarerCreateEmailAddress.setText("");
        tfCarerCreatePhoneNum.setText("");
        lbCarerPhoto.setText("Click here!");
        lbCarerPhoto.setIcon(null);
    }//GEN-LAST:event_btCarerCreateCreateActionPerformed

    private void btParentCreateNewCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btParentCreateNewCancelActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnMainPanel);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_btParentCreateNewCancelActionPerformed

    private void btParentCreateCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btParentCreateCreateActionPerformed
        // TODO add your handling code here:
        Model.Parent parent = new Model.Parent();
        String username = tfParentCreateID.getText();
        String name = tfParentCreateName.getText();
        String genderMale = rbParentCreateGenderMale.getText();
        String genderFemale = rbParentCreateGenderFemale.getText();
        String DD = (String) cbParentCreateDOBD.getSelectedItem().toString();
        String MM = (String) cbParentCreateDOBM.getSelectedItem().toString();
        String YY = (String) cbParentCreateDOBY.getSelectedItem().toString();
        String DOB = DD+"/"+MM+"/"+YY;
        String FacialPhotoPath = this.parentFacialPhotoPath;
        String address = tfParentCreateAddress.getText();
        String email = tfParentCreateEmailAddress.getText() + "Gmail.com";
        String phoneNum = tfParentCreatePhoneNum.getText();
        parent.createParentUsername(dbConn,"P"+username, "123456");
        if(parent.iStatus == 1)
            {
                parent.createParentAccount(dbConn, "P"+username, name, genderMale, DOB, address, FacialPhotoPath ,email, phoneNum);
            }
        
        if(parent.iStatus == 2)
            JOptionPane.showMessageDialog(null, "create is successful!!!!!!!!!!");
        else{
            JOptionPane.showMessageDialog(null, "create is fail!!!!!!!!");
            if(parent.iStatus == 1){
                parent.deleteParentUsername(dbConn, username);
            }
                
        }
            
        tfParentCreateID.setText("");
        tfParentCreateName.setText("");
        tfParentCreateAddress.setText("");
        tfParentCreateEmailAddress.setText("");
        tfParentCreatePhoneNum.setText("");
        lbParentPhoto.setText("Click here!");
        lbParentPhoto.setIcon(null);
    }//GEN-LAST:event_btParentCreateCreateActionPerformed

    private void tbParentUpdateListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbParentUpdateListTableMouseClicked
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnParentUpdate);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_tbParentUpdateListTableMouseClicked

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void btParentUpdateListBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btParentUpdateListBackActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnMainPanel);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_btParentUpdateListBackActionPerformed

    private void btParentUpdateCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btParentUpdateCancelActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnParentUpdateList);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_btParentUpdateCancelActionPerformed

    private void tbParentDeleteLishTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbParentDeleteLishTableMouseClicked
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnParentDelete);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_tbParentDeleteLishTableMouseClicked

    private void tfParentDeleteListSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfParentDeleteListSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfParentDeleteListSearchActionPerformed

    private void btParentDeleteListBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btParentDeleteListBackActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnMainPanel);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_btParentDeleteListBackActionPerformed

    private void btParentDeleteCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btParentDeleteCancelActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnParentDeleteList);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_btParentDeleteCancelActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnParentCreateNew);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnParentUpdateList);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnParentDeleteList);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void mnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSettingActionPerformed
        
    }//GEN-LAST:event_mnSettingActionPerformed

    private void miHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miHomeActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnMainPanel);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_miHomeActionPerformed

    private void miLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLogOutActionPerformed
        // TODO add your handling code here:
        Login lg = new Login();
        lg.setVisible(true);
        dispose();
    }//GEN-LAST:event_miLogOutActionPerformed

    private void btCarerDeleteCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarerDeleteCancel1ActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnClassAssignCarerList);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_btCarerDeleteCancel1ActionPerformed

    private void btCarerDeleteCancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarerDeleteCancel2ActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnClassAssignChildenList);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_btCarerDeleteCancel2ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnClassAssign);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnClassAssignCarerList);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnClassAssignCarerInfo);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_jTable4MouseClicked

    private void cbAssignCarerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAssignCarerItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == ItemEvent.SELECTED){
            if(evt.getItem().equals("Assign children into class")){
                pnLayoutPanel.removeAll();
                pnLayoutPanel.add(pnClassAssignChildenList);
                pnLayoutPanel.repaint();
                pnLayoutPanel.revalidate();
                cbAssignCarer.setSelectedIndex(0);
                cbAssignChildren.setSelectedIndex(1);
            }
        }
            //        if(evt.getItemSelectable().getSelectedObjects()){
//            System.out.println("hhaahahahah");
//        }
//        if(evt.getItemSelectable().equals("Assign children into class")){
//            System.out.println("hihihihii");
//        }
    }//GEN-LAST:event_cbAssignCarerItemStateChanged

    private void cbAssignChildrenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAssignChildrenItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            if(evt.getItem().equals("Assign carer into class")){
                pnLayoutPanel.removeAll();
                pnLayoutPanel.add(pnClassAssignCarerList);
                pnLayoutPanel.repaint();
                pnLayoutPanel.revalidate();
                cbAssignCarer.setSelectedIndex(0);
                cbAssignChildren.setSelectedIndex(1);
            }
        }
    }//GEN-LAST:event_cbAssignChildrenItemStateChanged

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        // TODO add your handling code here:
        pnLayoutPanel.removeAll();
        pnLayoutPanel.add(pnClassAssignChildrenInfo);
        pnLayoutPanel.repaint();
        pnLayoutPanel.revalidate();
    }//GEN-LAST:event_jTable5MouseClicked

    private void lbCarerPhotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCarerPhotoMouseClicked
        // TODO add your handling code here:
        fcher = new JFileChooser(new File("/Users/phamtrung"));
        fcher.setDialogTitle("save a file");
        fcher.showSaveDialog(null);
        file = fcher.getSelectedFile();
        fileType = "";
        
        try{
            int length = (int)file.getName().length();
            fileName = file.getName();
            for(int i = length-3; i < length; i++){
                    fileType += String.valueOf(fileName.charAt(i));
            }   
            System.out.println(length);
            System.out.println(fileName);
            System.out.println(fileType);
        }catch(NullPointerException ex){
            System.out.println("hahhaha");
        }
        if(fileType.equals("jpg") || fileType.equals("png")){
            copyCarerImage();
            loadCarerImage();
        }
        else 
            JOptionPane.showMessageDialog(null, "chosen file is not a image!!");
        
        
    }//GEN-LAST:event_lbCarerPhotoMouseClicked
    File fileParentPhoto;
    String fileParentType = "";
    String fileParentName = "";
    String parentFacialPhotoPath = "";
    FileInputStream isParent = null;
    FileOutputStream osParent = null;
    BufferedImage bfImageFacialPhotoParent;
    private void lbParentPhotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbParentPhotoMouseClicked
        // TODO add your handling code here:
        JFileChooser fChooParent = new JFileChooser(new File("/Users/phamtrung"));
        fChooParent.setDialogTitle("Save a file");
        fChooParent.showSaveDialog(null);
        fileParentType = "";
        fileParentPhoto = fChooParent.getSelectedFile();
        try{
            int length = (int)fileParentPhoto.getName().length();
            fileParentName = fileParentPhoto.getName();
            for(int i = length-3; i < length; i++){
                    fileParentType += String.valueOf(fileParentName.charAt(i));
            }   
            System.out.println(length);
            System.out.println(fileParentName);
            System.out.println(fileParentType);
        }catch(NullPointerException ex){
            System.out.println("hahhaha");
        }
        if(fileParentType.equals("jpg") || fileParentType.equals("png")){
            copyParentImage();
            loadParentImage();
        }
        else 
            JOptionPane.showMessageDialog(null, "chosen file is not a image!!");
    }//GEN-LAST:event_lbParentPhotoMouseClicked
    public void copyCarerImage(){
        try {
            is = new FileInputStream(new File(file.getAbsolutePath()));
            os = new FileOutputStream(new File("src/Image/FacialPhoto/"+fileName));
            carerFacialPhotoPath = "src/Image/FacialPhoto/"+fileName;
            byte[] buffer = new byte[1024];
            int length = 0;
            while ((length = is.read(buffer)) > 0){
                os.write(buffer, 0, length);
            }
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex){
            
        }
    }
    
    void loadCarerImage(){
        try {
            bfImage = ImageIO.read(new File("src/Image/FacialPhoto/"+fileName));
            ImageIcon icon = new ImageIcon(bfImage.getScaledInstance(lbCarerPhoto.getWidth(), lbCarerPhoto.getHeight(), bfImage.SCALE_SMOOTH));
            lbCarerPhoto.setIcon(icon);
        } catch (IOException ex) {
            
        }
    }
    
    public void copyParentImage(){
        try {
            isParent = new FileInputStream(new File(fileParentPhoto.getAbsolutePath()));
            osParent = new FileOutputStream(new File("src/Image/FacialPhoto/"+fileParentName));
            parentFacialPhotoPath = "src/Image/FacialPhoto/"+fileParentName;
            byte[] buffer = new byte[1024];
            int length = 0;
            while ((length = isParent.read(buffer)) > 0){
                osParent.write(buffer, 0, length);
            }
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex){
            
        }
    }
    
    void loadParentImage(){
        try {
            bfImageFacialPhotoParent = ImageIO.read(new File("src/Image/FacialPhoto/"+fileParentName));
            ImageIcon icon = new ImageIcon(bfImageFacialPhotoParent.getScaledInstance(lbParentPhoto.getWidth(), lbParentPhoto.getHeight(), bfImageFacialPhotoParent.SCALE_SMOOTH));
            lbParentPhoto.setIcon(icon);
        } catch (IOException ex) {
            
        } catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "this image can't display!!");
        }
    }
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
            java.util.logging.Logger.getLogger(MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCarerCreateCreate;
    private javax.swing.JButton btCarerCreateNewCancel;
    private javax.swing.JButton btCarerDeleteCancel;
    private javax.swing.JButton btCarerDeleteCancel1;
    private javax.swing.JButton btCarerDeleteCancel2;
    private javax.swing.JButton btCarerUpdateCancel;
    private javax.swing.JButton btCarerUpdateListBack;
    private javax.swing.JButton btCarerUpdateListBack1;
    private javax.swing.JButton btParentCreateCreate;
    private javax.swing.JButton btParentCreateNewCancel;
    private javax.swing.JButton btParentDeleteCancel;
    private javax.swing.JButton btParentDeleteDelete;
    private javax.swing.JButton btParentDeleteListBack;
    private javax.swing.JButton btParentDeleteListSearch;
    private javax.swing.JButton btParentUpdateCancel;
    private javax.swing.JButton btParentUpdateListBack;
    private javax.swing.JButton btParentUpdateUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbAssignCarer;
    private javax.swing.JComboBox<String> cbAssignChildren;
    private javax.swing.JComboBox<String> cbCarerCreateDOBD;
    private javax.swing.JComboBox<String> cbCarerCreateDOBM;
    private javax.swing.JComboBox<String> cbCarerCreateDOBY;
    private javax.swing.JComboBox<String> cbParentCreateDOBD;
    private javax.swing.JComboBox<String> cbParentCreateDOBM;
    private javax.swing.JComboBox<String> cbParentCreateDOBY;
    private javax.swing.JComboBox<String> cbParentUpdateDOBD;
    private javax.swing.JComboBox<String> cbParentUpdateDOBM;
    private javax.swing.JComboBox<String> cbParentUpdateDOBY;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbCarerDeletePhoto;
    private javax.swing.JLabel lbCarerDeletePhoto1;
    private javax.swing.JLabel lbCarerDeletePhoto2;
    private javax.swing.JLabel lbCarerDeletePhoto3;
    private javax.swing.JLabel lbCarerPhoto;
    private javax.swing.JLabel lbCarerUpdatePhoto;
    private javax.swing.JLabel lbMainPanel1;
    private javax.swing.JLabel lbMainPanle;
    private javax.swing.JLabel lbParentDeleteAddress;
    private javax.swing.JLabel lbParentDeleteDOB;
    private javax.swing.JLabel lbParentDeleteEmail;
    private javax.swing.JLabel lbParentDeleteID;
    private javax.swing.JLabel lbParentDeleteName;
    private javax.swing.JLabel lbParentDeletePhoneNum;
    private javax.swing.JLabel lbParentPhoto;
    private javax.swing.JLabel lbParentUpdatePhoto;
    private javax.swing.JMenuItem miHome;
    private javax.swing.JMenuItem miLogOut;
    private javax.swing.JMenuBar mnBar;
    private javax.swing.JMenu mnCarerMan;
    private javax.swing.JMenu mnChildMan;
    private javax.swing.JMenu mnClassMan;
    private javax.swing.JMenu mnParentMan;
    private javax.swing.JMenu mnSetting;
    private javax.swing.JPanel pnCarerCreateNew;
    private javax.swing.JPanel pnCarerDelete;
    private javax.swing.JPanel pnCarerDeleteList;
    private javax.swing.JPanel pnCarerUpdate;
    private javax.swing.JPanel pnCarerUpdateList;
    private javax.swing.JPanel pnClassAssign;
    private javax.swing.JPanel pnClassAssignCarerInfo;
    private javax.swing.JPanel pnClassAssignCarerList;
    private javax.swing.JPanel pnClassAssignChildenList;
    private javax.swing.JPanel pnClassAssignChildrenInfo;
    private javax.swing.JPanel pnClassCreateNew;
    private javax.swing.JPanel pnClassDelete;
    private javax.swing.JPanel pnClassDeleteList;
    private javax.swing.JPanel pnClassUpdate;
    private javax.swing.JPanel pnClassUpdateList;
    private javax.swing.JPanel pnLayoutPanel;
    private javax.swing.JPanel pnMainPanel;
    private javax.swing.JPanel pnParentCreateNew;
    private javax.swing.JPanel pnParentDelete;
    private javax.swing.JPanel pnParentDeleteList;
    private javax.swing.JPanel pnParentUpdate;
    private javax.swing.JPanel pnParentUpdateList;
    private javax.swing.JRadioButton rbCarerCreateGenderFemale;
    private javax.swing.JRadioButton rbCarerCreateGenderMale;
    private javax.swing.JRadioButton rbParentCreateGenderFemale;
    private javax.swing.JRadioButton rbParentCreateGenderMale;
    private javax.swing.JTable tbParentDeleteLishTable;
    private javax.swing.JTable tbParentUpdateListTable;
    private javax.swing.JTextField tfCarerCreateAddress;
    private javax.swing.JTextField tfCarerCreateEmailAddress;
    private javax.swing.JTextField tfCarerCreateID;
    private javax.swing.JTextField tfCarerCreateName;
    private javax.swing.JTextField tfCarerCreatePhoneNum;
    private javax.swing.JTextField tfParentCreateAddress;
    private javax.swing.JTextField tfParentCreateEmailAddress;
    private javax.swing.JTextField tfParentCreateID;
    private javax.swing.JTextField tfParentCreateName;
    private javax.swing.JTextField tfParentCreatePhoneNum;
    private javax.swing.JTextField tfParentDeleteListSearch;
    private javax.swing.JTextField tfParentUpdateAddress;
    private javax.swing.JTextField tfParentUpdateEmail;
    private javax.swing.JTextField tfParentUpdateID;
    private javax.swing.JTextField tfParentUpdateName;
    private javax.swing.JTextField tfParentUpdatePhoneNum;
    // End of variables declaration//GEN-END:variables
}
