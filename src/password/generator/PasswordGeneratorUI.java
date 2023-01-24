/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package password.generator;

import static java.lang.Integer.parseInt;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Mark Daniel
 */
public class PasswordGeneratorUI extends javax.swing.JFrame {

    /**
     * Creates new form PasswordGeneratorUI
     */
    public PasswordGeneratorUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtPassword = new javax.swing.JTextField();
        btnGenerate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPasswordLen = new javax.swing.JTextField();
        chkSpecialChar = new javax.swing.JCheckBox();
        chkNumbers = new javax.swing.JCheckBox();
        chkLowercaseLet = new javax.swing.JCheckBox();
        chkUppercaseLet = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("PASSWORD  GENERATOR");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPassword.setEditable(false);
        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), null));

        btnGenerate.setBackground(new java.awt.Color(51, 255, 51));
        btnGenerate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnGenerate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password/generator/refresh_50x50.png"))); // NOI18N
        btnGenerate.setText("REGENERATE");
        btnGenerate.setFocusable(false);
        btnGenerate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Password Length :");

        txtPasswordLen.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPasswordLen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPasswordLen.setText("8");

        chkSpecialChar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chkSpecialChar.setText("Include Special Characters");
        chkSpecialChar.setFocusable(false);

        chkNumbers.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chkNumbers.setText("Include Numbers");
        chkNumbers.setFocusable(false);

        chkLowercaseLet.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chkLowercaseLet.setText("Include Lowercase Letters");
        chkLowercaseLet.setFocusable(false);

        chkUppercaseLet.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chkUppercaseLet.setText("Include Uppercase Letters");
        chkUppercaseLet.setFocusable(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password/generator/padlock_183x183.png"))); // NOI18N
        jLabel3.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkUppercaseLet)
                    .addComponent(chkLowercaseLet)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtPasswordLen, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkSpecialChar)
                    .addComponent(chkNumbers))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPasswordLen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(chkSpecialChar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkNumbers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkLowercaseLet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkUppercaseLet)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        final String specialChar = ";,:.+-*/%><=!~^&|[]{}()";     // 23 Special Characters
        final String numbers = "0123456789";                      // 10 Numbers
        final String letterLower = "abcdefghijklmnopqrstuvwxyz";  // 26 Lowercase Letters
        final String letterUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";  // 26 Uppercase Letters
        final int specKeySize = 23, numberSize = 10, letterLowerSize = 26, letterUpperSize =26;
        boolean includSpecChar = false, includNum = false, includLowercase = false, includUppercase = false;
        int totalChar = 0;
        int passwordLen = parseInt(txtPasswordLen.getText());
        String characters = null;
        
        if(chkSpecialChar.isSelected()){
            includSpecChar = true;
        }
        if(chkNumbers.isSelected()){
            includNum = true;
        }
        if(chkLowercaseLet.isSelected()){
            includLowercase = true;
        }
        if(chkUppercaseLet.isSelected()){
            includUppercase = true;
        }
        
        
        if(passwordLen >= 8){
            if(includSpecChar == true && includNum == false && includLowercase == false && includUppercase == false){
                totalChar = specKeySize;
                characters = specialChar;
                generatePassord(passwordLen, totalChar, characters);
            }
            else if(includSpecChar == false && includNum == true && includLowercase == false && includUppercase == false){
                totalChar = numberSize;
                characters = numbers;
                generatePassord(passwordLen, totalChar, characters);
            }
            else if(includSpecChar == false && includNum == false && includLowercase == true && includUppercase == false){
                totalChar = letterLowerSize;
                characters = letterLower;
                generatePassord(passwordLen, totalChar, characters);
            }
            else if(includSpecChar == false && includNum == false && includLowercase == false && includUppercase == true){
                totalChar = letterUpperSize;
                characters = letterUpper;
                generatePassord(passwordLen, totalChar, characters);
            }
            else if(includNum == true && includSpecChar == true && includLowercase == false && includUppercase == false){
                totalChar = numberSize + specKeySize;  // Adding the sized of selected characters.
                characters = numbers + specialChar;    // Concatenating the selected char for password combination.
                generatePassord(passwordLen, totalChar, characters);
            }
            else if(includNum == true && includSpecChar == false && includLowercase == true && includUppercase == false){
                totalChar = numberSize + letterLowerSize;
                characters = numbers + letterLower;
                generatePassord(passwordLen, totalChar, characters);
            }
            else if(includNum == true && includSpecChar == false && includLowercase == false && includUppercase == true){
                totalChar = numberSize + letterUpperSize;
                characters = numbers + letterUpper;
                generatePassord(passwordLen, totalChar, characters);
            }
            else if(includNum == false && includSpecChar == true && includLowercase == true && includUppercase == false){
                totalChar = specKeySize + letterLowerSize;
                characters = specialChar + letterLower;
                generatePassord(passwordLen, totalChar, characters);
            }
            else if(includNum == false && includSpecChar == false && includLowercase == true && includUppercase == true){
                totalChar = letterLowerSize + letterUpperSize;
                characters = letterLower + letterUpper;
                generatePassord(passwordLen, totalChar, characters);
            }
            else if(includNum == true && includSpecChar == true && includLowercase == true && includUppercase == false){
                totalChar = numberSize + specKeySize + letterLowerSize;
                characters = numbers + specialChar + letterLower;
                generatePassord(passwordLen, totalChar, characters);
            }
            else if(includNum == true && includSpecChar == true && includLowercase == false && includUppercase == true){
                totalChar = numberSize + specKeySize + letterUpperSize;
                characters = numbers + specialChar + letterUpper;
                generatePassord(passwordLen, totalChar, characters);
            }
            else if(includNum == true && includSpecChar == false && includLowercase == true && includUppercase == true){
                totalChar = numberSize + letterLowerSize + letterUpperSize;
                characters = numbers + letterLower + letterUpper;
                generatePassord(passwordLen, totalChar, characters);
            }
            else if(includNum == false && includSpecChar == true && includLowercase == true && includUppercase == true){
                totalChar = specKeySize + letterLowerSize + letterUpperSize;
                characters = specialChar + letterLower + letterUpper;
                generatePassord(passwordLen, totalChar, characters);
            }
            else if(includNum == true && includSpecChar == true && includLowercase == true && includUppercase == true){
                totalChar = numberSize + specKeySize + letterLowerSize + letterUpperSize;
                characters = numbers + specialChar + letterLower + letterUpper;
                generatePassord(passwordLen, totalChar, characters);
            }
            else{
                JOptionPane.showMessageDialog(PasswordGeneratorUI.this, "Please select from, the checkbox below for the password characters combitnation.");
            }
        }
        else{
            JOptionPane.showMessageDialog(PasswordGeneratorUI.this, "Password Length must be longer than 8 characters");
        }
        
        
        
    }//GEN-LAST:event_btnGenerateActionPerformed

    void generatePassord(int passwordLen, int totalChar, String characters){
        Random randomNumGen = new Random();
        char[] password = new char[passwordLen]; 
        
        for(int i = 0; i < passwordLen; i++){
            password[i] = characters.charAt(randomNumGen.nextInt(characters.length()));
        }
        
        String string = String.valueOf(password);  
        txtPassword.setText(string); 
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
            java.util.logging.Logger.getLogger(PasswordGeneratorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordGeneratorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordGeneratorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordGeneratorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordGeneratorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerate;
    private javax.swing.JCheckBox chkLowercaseLet;
    private javax.swing.JCheckBox chkNumbers;
    private javax.swing.JCheckBox chkSpecialChar;
    private javax.swing.JCheckBox chkUppercaseLet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPasswordLen;
    // End of variables declaration//GEN-END:variables
}
