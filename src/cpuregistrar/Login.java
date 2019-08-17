package cpuregistrar;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Yohannes Yalew
 */
public class Login extends javax.swing.JFrame {
    String user ="root";
    String pass = "";
    Connection myconn = null;
    Statement mystmt = null;
    ResultSet myresult =null;
    ResultSet find = null;
    ResultSet redb = null;
    PreparedStatement register = null;
    PreparedStatement registerdb1 = null;
    PreparedStatement registerdb2 = null;
    Statement sql = null;
    int rs = 0;
    int rdb1 = 0;
    int rdb2 = 0;
    
    public Login() 
                  {
         initComponents();
         jpanelhome.setVisible(false);
         jpanelRegister.setVisible(false);
         jpanelFind.setVisible(false);
         jpanellogin.setVisible(true);
                   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanellogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtusername = new javax.swing.JTextField();
        jpassword = new javax.swing.JPasswordField();
        jlabelusername = new javax.swing.JLabel();
        jlabelpassword = new javax.swing.JLabel();
        jbuttonlogin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jpanelhome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jpanelRegister = new javax.swing.JPanel();
        jLabelname = new javax.swing.JLabel();
        jLabelgender = new javax.swing.JLabel();
        jLabelbirthday = new javax.swing.JLabel();
        jLabelprogram = new javax.swing.JLabel();
        jLabeldepartement = new javax.swing.JLabel();
        jbuttonregister = new javax.swing.JButton();
        jtextname = new javax.swing.JTextField();
        jcombosex = new javax.swing.JComboBox<>();
        jcomboprogram = new javax.swing.JComboBox<>();
        jcombodepartement = new javax.swing.JComboBox<>();
        jtextbirthday = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jpanelFind = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtfindname = new javax.swing.JTextField();
        jtxtfindgender = new javax.swing.JTextField();
        jtxtfindbirthday = new javax.swing.JTextField();
        jtxtfindprogram = new javax.swing.JTextField();
        jtxtfinddepartement = new javax.swing.JTextField();
        jbuttonfind = new javax.swing.JButton();
        jbuttondelete = new javax.swing.JButton();
        jbuttonupdate = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CPU ");
        setBackground(new java.awt.Color(255, 255, 255));

        jpanellogin.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpuregistrar/logo_64.jpg"))); // NOI18N

        jtxtusername.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jtxtusername.setBorder(null);
        jtxtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtusernameActionPerformed(evt);
            }
        });

        jpassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jpassword.setBorder(null);
        jpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpasswordActionPerformed(evt);
            }
        });

        jlabelusername.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jlabelusername.setText("User Name");

        jlabelpassword.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jlabelpassword.setText("Password");

        jbuttonlogin.setBackground(new java.awt.Color(255, 255, 255));
        jbuttonlogin.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jbuttonlogin.setText("Login");
        jbuttonlogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbuttonlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuttonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonloginActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(188, 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setPreferredSize(new java.awt.Dimension(188, 2));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpanelloginLayout = new javax.swing.GroupLayout(jpanellogin);
        jpanellogin.setLayout(jpanelloginLayout);
        jpanelloginLayout.setHorizontalGroup(
            jpanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelloginLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(jpanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelloginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabelusername, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlabelpassword, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jpanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(jpassword)
                            .addComponent(jtxtusername)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                        .addGap(128, 128, 128))
                    .addGroup(jpanelloginLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jbuttonlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(194, Short.MAX_VALUE))))
        );
        jpanelloginLayout.setVerticalGroup(
            jpanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelloginLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jpanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanelloginLayout.createSequentialGroup()
                        .addGroup(jpanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpanelloginLayout.createSequentialGroup()
                                .addComponent(jtxtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlabelusername))
                        .addGap(36, 36, 36)
                        .addGroup(jpanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpanelloginLayout.createSequentialGroup()
                                .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlabelpassword))
                        .addGap(50, 50, 50)
                        .addComponent(jbuttonlogin))
                    .addComponent(jLabel1))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jpanelhome.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Register");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Find");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpuregistrar/logo_64.jpg"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpuregistrar/addemplo.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpuregistrar/search.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpanelhomeLayout = new javax.swing.GroupLayout(jpanelhome);
        jpanelhome.setLayout(jpanelhomeLayout);
        jpanelhomeLayout.setHorizontalGroup(
            jpanelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelhomeLayout.createSequentialGroup()
                .addGroup(jpanelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelhomeLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel13))
                    .addGroup(jpanelhomeLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel2)))
                .addGroup(jpanelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelhomeLayout.createSequentialGroup()
                        .addGroup(jpanelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelhomeLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addGroup(jpanelhomeLayout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addComponent(jLabel14)))
                        .addContainerGap(207, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelhomeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(234, 234, 234))))
        );
        jpanelhomeLayout.setVerticalGroup(
            jpanelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelhomeLayout.createSequentialGroup()
                .addGroup(jpanelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelhomeLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jpanelhomeLayout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jpanelRegister.setBackground(new java.awt.Color(255, 255, 255));

        jLabelname.setBackground(new java.awt.Color(255, 255, 255));
        jLabelname.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelname.setForeground(new java.awt.Color(0, 153, 153));
        jLabelname.setText("Name");

        jLabelgender.setBackground(new java.awt.Color(255, 255, 255));
        jLabelgender.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelgender.setForeground(new java.awt.Color(0, 153, 153));
        jLabelgender.setText("Gender");

        jLabelbirthday.setBackground(new java.awt.Color(255, 255, 255));
        jLabelbirthday.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelbirthday.setForeground(new java.awt.Color(0, 153, 153));
        jLabelbirthday.setText("Birthday");

        jLabelprogram.setBackground(new java.awt.Color(255, 255, 255));
        jLabelprogram.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelprogram.setForeground(new java.awt.Color(0, 153, 153));
        jLabelprogram.setText("Program");

        jLabeldepartement.setBackground(new java.awt.Color(255, 255, 255));
        jLabeldepartement.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabeldepartement.setForeground(new java.awt.Color(0, 153, 153));
        jLabeldepartement.setText("Departement");

        jbuttonregister.setBackground(new java.awt.Color(0, 153, 153));
        jbuttonregister.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jbuttonregister.setForeground(new java.awt.Color(0, 153, 153));
        jbuttonregister.setText("Register");
        jbuttonregister.setBorder(null);
        jbuttonregister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuttonregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbuttonregisterMouseClicked(evt);
            }
        });
        jbuttonregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonregisterActionPerformed(evt);
            }
        });

        jtextname.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtextname.setBorder(null);

        jcombosex.setBackground(new java.awt.Color(255, 255, 255));
        jcombosex.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jcombosex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jcombosex.setSelectedIndex(-1);
        jcombosex.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jcombosex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombosexActionPerformed(evt);
            }
        });

        jcomboprogram.setBackground(new java.awt.Color(255, 255, 255));
        jcomboprogram.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jcomboprogram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Graduate", "Undergraduate", "TVET" }));
        jcomboprogram.setSelectedIndex(-1);
        jcomboprogram.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcombodepartement.setBackground(new java.awt.Color(255, 255, 255));
        jcombodepartement.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jcombodepartement.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Accounting & Managemnt" }));
        jcombodepartement.setSelectedIndex(-1);
        jcombodepartement.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jcombodepartement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombodepartementActionPerformed(evt);
            }
        });

        jtextbirthday.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtextbirthday.setBorder(null);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("ADD STUDENT ");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(188, 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(188, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpuregistrar/menu.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpanelRegisterLayout = new javax.swing.GroupLayout(jpanelRegister);
        jpanelRegister.setLayout(jpanelRegisterLayout);
        jpanelRegisterLayout.setHorizontalGroup(
            jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRegisterLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeldepartement)
                    .addGroup(jpanelRegisterLayout.createSequentialGroup()
                        .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelprogram)
                            .addComponent(jLabelbirthday)
                            .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(jLabelgender)
                                .addComponent(jLabelname)))
                        .addGap(73, 73, 73)
                        .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(jcomboprogram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcombodepartement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcombosex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtextname)
                            .addComponent(jtextbirthday, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRegisterLayout.createSequentialGroup()
                .addContainerGap(349, Short.MAX_VALUE)
                .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRegisterLayout.createSequentialGroup()
                        .addComponent(jbuttonregister, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(310, 310, 310))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRegisterLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242))))
        );
        jpanelRegisterLayout.setVerticalGroup(
            jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRegisterLayout.createSequentialGroup()
                .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRegisterLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4))
                    .addGroup(jpanelRegisterLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel16)))
                .addGap(43, 43, 43)
                .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanelRegisterLayout.createSequentialGroup()
                        .addComponent(jtextname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelname))
                .addGap(35, 35, 35)
                .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRegisterLayout.createSequentialGroup()
                        .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelgender)
                            .addComponent(jcombosex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jtextbirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelbirthday, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35)
                .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRegisterLayout.createSequentialGroup()
                        .addGroup(jpanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcomboprogram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelprogram))
                        .addGap(35, 35, 35)
                        .addComponent(jLabeldepartement))
                    .addComponent(jcombodepartement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jbuttonregister, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jpanelFind.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("FIND STUDENT");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("ID");

        jtxtID.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Name");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Gender");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Birthday");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Program");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Departement");

        jtxtfindname.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jtxtfindgender.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jtxtfindbirthday.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jtxtfindprogram.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jtxtfinddepartement.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jbuttonfind.setBackground(new java.awt.Color(0, 153, 153));
        jbuttonfind.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jbuttonfind.setForeground(new java.awt.Color(255, 255, 255));
        jbuttonfind.setText("Search");
        jbuttonfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonfindActionPerformed(evt);
            }
        });

        jbuttondelete.setBackground(new java.awt.Color(0, 153, 153));
        jbuttondelete.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jbuttondelete.setForeground(new java.awt.Color(255, 255, 255));
        jbuttondelete.setText("Delete");
        jbuttondelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbuttondeleteMouseClicked(evt);
            }
        });
        jbuttondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttondeleteActionPerformed(evt);
            }
        });

        jbuttonupdate.setBackground(new java.awt.Color(0, 153, 153));
        jbuttonupdate.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jbuttonupdate.setForeground(new java.awt.Color(255, 255, 255));
        jbuttonupdate.setText("Update");
        jbuttonupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbuttonupdateMouseClicked(evt);
            }
        });
        jbuttonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonupdateActionPerformed(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpuregistrar/menu.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpanelFindLayout = new javax.swing.GroupLayout(jpanelFind);
        jpanelFind.setLayout(jpanelFindLayout);
        jpanelFindLayout.setHorizontalGroup(
            jpanelFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelFindLayout.createSequentialGroup()
                .addGroup(jpanelFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelFindLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel17)
                        .addGap(138, 138, 138)
                        .addComponent(jLabel5))
                    .addGroup(jpanelFindLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(jpanelFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelFindLayout.createSequentialGroup()
                                .addGroup(jpanelFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(70, 70, 70))
                            .addGroup(jpanelFindLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jpanelFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpanelFindLayout.createSequentialGroup()
                                .addComponent(jbuttondelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbuttonupdate))
                            .addComponent(jtxtfindprogram, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(jtxtfinddepartement)
                            .addComponent(jtxtfindbirthday)
                            .addComponent(jtxtfindgender, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpanelFindLayout.createSequentialGroup()
                                .addComponent(jtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbuttonfind))
                            .addComponent(jtxtfindname, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(334, Short.MAX_VALUE))
        );
        jpanelFindLayout.setVerticalGroup(
            jpanelFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelFindLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jpanelFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel17))
                .addGap(38, 38, 38)
                .addGroup(jpanelFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbuttonfind))
                .addGap(18, 18, 18)
                .addGroup(jpanelFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtxtfindname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jpanelFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtxtfindgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jpanelFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtxtfindbirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtxtfindprogram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtxtfinddepartement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(jpanelFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuttondelete)
                    .addComponent(jbuttonupdate))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanellogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanelhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanelRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanelFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanellogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanelhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanelFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtusernameActionPerformed

    private void jpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpasswordActionPerformed

    private void jbuttonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonloginActionPerformed
        try {
            myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", user, pass);
        } 
        catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex); //Fault log Service
                                }
        String sql = "select * from user where name=? and password=?";
       try 
       {
           PreparedStatement pst = myconn.prepareStatement(sql);
           pst.setString(1, jtxtusername.getText());
           pst.setString(2, jpassword.getText());
           ResultSet rs =pst.executeQuery();
           
           if (rs.next())
           {
               try {
                       jpanellogin.setVisible(false);
                       jpanelRegister.setVisible(false);
                       jpanelFind.setVisible(false);
                       jpanelhome.setVisible(true);
               }
           catch (HeadlessException ex)
                   {
                   JOptionPane.showMessageDialog(this, ex); //Fault log Service
                   }
       }
           else {
               JOptionPane.showMessageDialog(null, "please try again");
           }
       }
       catch (SQLException | HeadlessException e)
       {
           JOptionPane.showMessageDialog(null, e); //Fault log Service
       }
    }//GEN-LAST:event_jbuttonloginActionPerformed
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jpanellogin.setVisible(false);
        jpanelhome.setVisible(false);
        jpanelFind.setVisible(false);
        jpanelRegister.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
         jpanelFind.setVisible(true);
         jpanelhome.setVisible(false);
         jpanelRegister.setVisible(false);
         jpanellogin.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked
    private void jcombosexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombosexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcombosexActionPerformed
    private void jbuttonregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonregisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbuttonregisterActionPerformed
    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        jpanellogin.setVisible(false);
        jpanelhome.setVisible(false);
        jpanelFind.setVisible(false);
        jpanelRegister.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked
    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        jpanellogin.setVisible(false);
        jpanelhome.setVisible(false);
        jpanelFind.setVisible(true);
        jpanelRegister.setVisible(false);
    }//GEN-LAST:event_jLabel14MouseClicked
    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        jpanellogin.setVisible(false);
        jpanelhome.setVisible(true);
        jpanelFind.setVisible(false);
        jpanelRegister.setVisible(false);
        jtextname.setText("");
        jcombosex.setSelectedIndex(-1);
        jtextbirthday.setText("");
        jcomboprogram.setSelectedIndex(-1);
        jcombodepartement.setSelectedIndex(-1);
    }//GEN-LAST:event_jLabel16MouseClicked
    private void jbuttonregisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonregisterMouseClicked
        /*ACTIVE REDUNDANCY*/
        String fname = jtextname.getText().trim();
        String sex = "";
        String birthday = jtextbirthday.getText().trim();
        String program = "";
        String departement = "";
        if (jcombosex.getSelectedIndex() == 0) {
                sex = "Male";
            } 
        else {
                sex = "Female";
            }
        //Graduate, Undergraduate, TVET
         switch (jcomboprogram.getSelectedIndex()) {  
                case 0:
                    program = "Graduate";
                    break;
                case 1:
                    program = "Undergraduate";
                    break;
                case 2:
                    program = "TVET";
                    break;
                
            }
         //Computer Science, Accounting & Managemnt
          switch (jcombodepartement.getSelectedIndex()) {  
                case 0:
                    departement = "Computer Science";
                    break;
                case 1:
                    departement = "Accounting & Managemnt";
                    break;
            }
              if (!fname.isEmpty() && !sex.isEmpty() && !birthday.isEmpty() && !program.isEmpty() && !departement.isEmpty()) {
            try { 
                myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", user, pass);
                register = myconn.prepareStatement( " insert into student (name,sex,birthday,program,departemnt)"
                    + " values (?,?,?,?,?)");

            register.setString(1, fname);
            register.setString(2, sex);
            register.setString(3, birthday);
            register.setString(4, program);
            register.setString(5, departement);
     
            rs = register.executeUpdate();
            
      try {
            sql = myconn.createStatement();
              ResultSet rs = null;
            rs = sql.executeQuery(
                    "select id from student "
                    + "where Name= " + "'" + jtextname.getText() + "'");
            while (rs.next()) {
                String ID = rs.getString("id");
                JOptionPane.showMessageDialog(null, "Student Successfully registerd! With ID number " + ID);
            if (jcombodepartement.getSelectedIndex() == 0) {
               try { 
                  /*ACTIVE REDUNDANCY*/
            myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Departement", user, pass);
            registerdb1 = myconn.prepareStatement( " insert into computerscience (Id,name,sex,birthday,program)"
                    + " values (?,?,?,?,?)");
            registerdb1.setString(1, ID);
            registerdb1.setString(2, fname);
            registerdb1.setString(3, sex);
            registerdb1.setString(4, birthday);
            registerdb1.setString(5, program);
            rdb1=registerdb1.executeUpdate();
            } 
            catch (SQLException s) {
            s.printStackTrace();
            } 
               }
        else {
                try { 
                myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Departement", user, pass);
                registerdb2 = myconn.prepareStatement( " insert into accounting (id,name,sex,birthday,program)"
                    + " values (?,?,?,?,?)");
            registerdb2.setString(1, ID);
            registerdb2.setString(2, fname);
            registerdb2.setString(3, sex);
            registerdb2.setString(4, birthday);
            registerdb2.setString(5, program);
            rdb2=registerdb2.executeUpdate();
            } 
            catch (SQLException s) {
            } 
            }
            }
        } catch (SQLException e) {
        }
        }
            catch (SQLException s) {
            } 
        jtextname.setText("");
        jcombosex.setSelectedIndex(-1);
        jtextbirthday.setText("");
        jcomboprogram.setSelectedIndex(-1);
        jcombodepartement.setSelectedIndex(-1);
              }
              else
              {
                   JOptionPane.showMessageDialog(null, "Make sure that you entered all the fields"); 
              }
    }//GEN-LAST:event_jbuttonregisterMouseClicked
    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        jpanellogin.setVisible(false);
        jpanelhome.setVisible(true);
        jpanelFind.setVisible(false);
        jpanelRegister.setVisible(false);
        jtxtID.setText("");
        jtxtfindname.setText("");
        jtxtfindbirthday.setText("");
        jtxtfinddepartement.setText("");
        jtxtfindgender.setText("");
        jtxtfindprogram.setText("");
    }//GEN-LAST:event_jLabel17MouseClicked
    private void jbuttonfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonfindActionPerformed
        // TODO add your handling code here:
        try {
               myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Register", user, pass);
            int count = 0;
            String id = jtxtID.getText();
            sql = myconn.createStatement();
            find = sql.executeQuery("select * from student where id=" + id);
            while (find.next()) {
                jtxtfindname.setText(find.getString("name"));
                jtxtfindgender.setText(find.getString("sex"));
                jtxtfindbirthday.setText(find.getString("birthday"));
                jtxtfindprogram.setText(find.getString("program"));
                jtxtfinddepartement.setText(find.getString("departemnt"));
                count = count + 1;
            }
            if (count == 0) {
                JOptionPane.showMessageDialog(null, "ID Number Not Found!! ");
                jtxtfindname.setText("");
                jtxtfindgender.setText("");
                jtxtfindbirthday.setText("");
                jtxtfindprogram.setText("");
                jtxtfinddepartement.setText("");
            } else if (count == 1) {
            }
            find.close();
            sql.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }//GEN-LAST:event_jbuttonfindActionPerformed
    private void jbuttondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttondeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbuttondeleteActionPerformed

    private void jbuttondeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttondeleteMouseClicked
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(rootPane,
                    "Are you sure you want to Delete?", "Delete confirmation", JOptionPane.YES_NO_OPTION);
            if (option == 0) {
                 try { 
            myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", user, pass);
            String query = "delete from student where id = '" + jtxtID.getText()+"'";
            PreparedStatement pst = myconn.prepareStatement(query);
            pst.execute();
            myconn.setAutoCommit(false);
            myconn.commit();
            JOptionPane.showMessageDialog(null, "Student sucessfully deleted");
        jtxtID.setText("");
        jtxtfindname.setText("");
        jtxtfindbirthday.setText("");
        jtxtfinddepartement.setText("");
        jtxtfindgender.setText("");
        jtxtfindprogram.setText("");
        
       } catch (SQLException ex) {
                     try {
                         Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                         myconn.rollback();  /*ROLL BACK*/
                     } catch (SQLException ex1) {
                         Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex1);
                     }
        }
            }
        else {
        jpanellogin.setVisible(false);
        jpanelhome.setVisible(false);
        jpanelFind.setVisible(true);
        jpanelRegister.setVisible(false);
        }
    }//GEN-LAST:event_jbuttondeleteMouseClicked

    private void jbuttonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbuttonupdateActionPerformed

    private void jbuttonupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuttonupdateMouseClicked
        // TODO add your handling code here: 
        String ID = jtxtID.getText();
        String fname = jtxtfindname.getText().trim();
        String sex = jtxtfindgender.getText();
        String birthday = jtxtfindbirthday.getText().trim();
        String program = jtxtfindprogram.getText();
        String departemnt = jtxtfinddepartement.getText();
        try{
            sql=myconn.createStatement();
          myresult=sql.executeQuery("select * from student where id=" + ID);
        
        while(myresult.next())  //sex ='" + sex + "' birthday ='"  + birthday + "' program ='" + program + "'  departemnt='" + departemnt + "'  
        {
       
       PreparedStatement idp1 = myconn.prepareStatement
        ("UPDATE student SET name = ?, sex =?, birthday=?, program=?, departemnt=? Where id = '"+ID+"'");
            idp1.setString(1, fname);
            idp1.setString(2, sex);
            idp1.setString(3, birthday);
            idp1.setString(4, program);
            idp1.setString(5, departemnt);
            idp1.executeUpdate();
            myconn.setAutoCommit(false);
            myconn.commit();
                JOptionPane.showMessageDialog(null, "Updated sucessfully!");
        }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            try {
                myconn.rollback(); /*ROLL BACK*/
            } catch (SQLException ex1) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }//GEN-LAST:event_jbuttonupdateMouseClicked
    private void jcombodepartementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombodepartementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcombodepartementActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelbirthday;
    private javax.swing.JLabel jLabeldepartement;
    private javax.swing.JLabel jLabelgender;
    private javax.swing.JLabel jLabelname;
    private javax.swing.JLabel jLabelprogram;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbuttondelete;
    private javax.swing.JButton jbuttonfind;
    private javax.swing.JButton jbuttonlogin;
    private javax.swing.JButton jbuttonregister;
    private javax.swing.JButton jbuttonupdate;
    private javax.swing.JComboBox<String> jcombodepartement;
    private javax.swing.JComboBox<String> jcomboprogram;
    private javax.swing.JComboBox<String> jcombosex;
    private javax.swing.JLabel jlabelpassword;
    private javax.swing.JLabel jlabelusername;
    private javax.swing.JPanel jpanelFind;
    private javax.swing.JPanel jpanelRegister;
    private javax.swing.JPanel jpanelhome;
    private javax.swing.JPanel jpanellogin;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jtextbirthday;
    private javax.swing.JTextField jtextname;
    private javax.swing.JTextField jtxtID;
    private javax.swing.JTextField jtxtfindbirthday;
    private javax.swing.JTextField jtxtfinddepartement;
    private javax.swing.JTextField jtxtfindgender;
    private javax.swing.JTextField jtxtfindname;
    private javax.swing.JTextField jtxtfindprogram;
    private javax.swing.JTextField jtxtusername;
    // End of variables declaration//GEN-END:variables
    private void alert(String please_fill_in_all_the_details) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
