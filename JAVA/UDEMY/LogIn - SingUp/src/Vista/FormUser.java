/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import static Vista.MdiMain.User;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FormUser extends javax.swing.JInternalFrame {
    
    public static Object job;
    public static Object choose;
    public static int counter = 0;
    
    public FormUser() {
        initComponents();
        setTitle(String.format("Bienvenido %s", LogIn.UsuarioActivo));
        if (SignUp.counter == 5) {
            btnAdd.setEnabled(false);
        }  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnModify = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            SignUp.job,
            new String [] {
                "User name", "Password", "Job"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnAdd.setBackground(new java.awt.Color(153, 255, 153));
        btnAdd.setMnemonic('a');
        btnAdd.setText("Add");
        btnAdd.setBorder(null);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 255, 102));
        btnUpdate.setMnemonic('u');
        btnUpdate.setText("Update");
        btnUpdate.setBorder(null);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setMnemonic('d');
        jButton3.setText("Delete");
        jButton3.setBorder(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mini.jpg"))); // NOI18N

        btnModify.setBackground(new java.awt.Color(0, 204, 204));
        btnModify.setMnemonic('m');
        btnModify.setText("Modify");
        btnModify.setBorder(null);
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        for (int i = 0; i < SignUp.job.length; i++) {
            if (SignUp.job[counter][0] != null) { // revisar con eliminar
                counter++;
            }
        }
        
        SignUp.counter = counter;
        
        boolean repetido = false;
        String Username = JOptionPane.showInputDialog("User name: ");
        for (int i = 0; i < SignUp.job.length; i++) {
            if (Username.equals(SignUp.job[i][0])) {
                    repetido = true;
            }
        }
        if (repetido == true) {
            JOptionPane.showMessageDialog(null, "This User Already Exist");
        }else {
            SignUp.job[SignUp.counter][0] = Username;
            String Password = JOptionPane.showInputDialog("Password: ");
            SignUp.job[SignUp.counter][1] = Password;
            job = JOptionPane.showInputDialog(rootPane, "User Job?","Job", JOptionPane.QUESTION_MESSAGE,null,
            new Object[]{"Admin", "Employee"},"Admin");
            String Job = job.toString();
            SignUp.job[SignUp.counter][2] = Job;
            JOptionPane.showMessageDialog(rootPane, "User Add Succesfully");
            SignUp.counter ++;
            LogIn.SignUpCounter--;
        }
        
        if (SignUp.counter == 5) {
            JOptionPane.showMessageDialog(null, "You have reached the max Users");
            btnAdd.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        dispose();
        if (User == null || User.isClosed()) {
                User = new FormUser();
                MdiMain.desktopPane.add(User);
        }
        User.setVisible(true);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        
        String Username = JOptionPane.showInputDialog(rootPane,"Enter the User name: ","Modify",JOptionPane.PLAIN_MESSAGE);
        boolean find = false;
        int fila = 0;
        
        for (int i = 0; i < SignUp.job.length; i++) {
            if (Username.equals(SignUp.job[i][0])) {
                find = true;
                fila = i;
            }
        }
        
        if (find == true) {
            choose = JOptionPane.showInputDialog(rootPane, "Choose an Option: ","Choose", JOptionPane.QUESTION_MESSAGE,null,
            new Object[]{"User name", "Password", "Job"},"User name");
            String choosen = choose.toString();
            
            if (choosen.equals("User name")) {
                String newUser = JOptionPane.showInputDialog("Choose the New User");
                SignUp.job[fila][0] = newUser;
                JOptionPane.showMessageDialog(null, "User name changed Succefully");
            }else if (choosen.equals("Password")) {
                String newPassword = JOptionPane.showInputDialog("Choose the New Password");
                SignUp.job[fila][1] = newPassword;
                JOptionPane.showMessageDialog(null, "Password changed Succefully");
            }else{
                job = JOptionPane.showInputDialog(rootPane, "User Job?","Job", JOptionPane.QUESTION_MESSAGE,null,
                new Object[]{"Admin", "Employee"},"Admin");
                String newJob = job.toString();

                if (newJob.equals("Employee") && SignUp.job[LogIn.fila][2].equals("Admin")) {
                    JOptionPane.showMessageDialog(null, "You cant Change an Admin");
                }else {
                    SignUp.job[fila][2] = newJob;
                    JOptionPane.showMessageDialog(null, "Job changed Succefully");
                    if (SignUp.job[LogIn.fila][2].equals("Employee")) {
                        JOptionPane.showMessageDialog(null, "You dont have Access to the Manage Window");
                        dispose();
                        MdiMain.Employeed.setEnabled(false);
                    }
                }
                
            }
        }else{
            JOptionPane.showMessageDialog(null, "There isnt Users with This Username");
        }
        
        
        
    }//GEN-LAST:event_btnModifyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
