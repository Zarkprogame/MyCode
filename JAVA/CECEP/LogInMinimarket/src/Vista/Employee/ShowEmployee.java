package Vista.Employee;

import Modelo.DBConexion;
import Vista.MdiMain;
import static Vista.MdiMain.User;
import static Vista.MdiMain.desktopPane;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ShowEmployee extends javax.swing.JFrame {
    
    Connection conect;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    
    public ShowEmployee() {
        initComponents();
        btnsQueries.add(id);
        btnsQueries.add(username);
        btnsQueries.add(password);
        btnsQueries.add(job);
        setLocationRelativeTo(null);
        setResizable(false);
        Consultar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsQueries = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtQuery = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        id = new javax.swing.JRadioButton();
        username = new javax.swing.JRadioButton();
        password = new javax.swing.JRadioButton();
        job = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        btnConsult = new javax.swing.JButton();
        btnConsult1 = new javax.swing.JButton();
        btnShowAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Username", "Password", "Job", "Image"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 1, 48)); // NOI18N
        jLabel1.setText("Queries");

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel2.setText("Letter or Word:");

        txtQuery.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtQuery.setForeground(new java.awt.Color(153, 153, 153));
        txtQuery.setText("Enter the Letter or Word that you want to Search");
        txtQuery.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtQuery.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQueryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQueryFocusLost(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        id.setText("Id");

        username.setText("Username");

        password.setText("Password");

        job.setText("Job");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(job, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id)
                    .addComponent(username)
                    .addComponent(password)
                    .addComponent(job))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel3.setText("Type Query:");

        btnConsult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConsult.setText("Consult");
        btnConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultActionPerformed(evt);
            }
        });

        btnConsult1.setBackground(new java.awt.Color(255, 204, 204));
        btnConsult1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConsult1.setMnemonic('e');
        btnConsult1.setText("Exit");
        btnConsult1.setToolTipText("Exit");
        btnConsult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsult1ActionPerformed(evt);
            }
        });

        btnShowAll.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnShowAll.setText("Show All");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConsult1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConsult)
                                .addGap(45, 45, 45)
                                .addComponent(btnShowAll)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnConsult1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConsult)
                            .addComponent(btnShowAll)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQueryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQueryFocusGained
        if (txtQuery.getText().equals("Enter the Letter or Word that you want to Search")) {
            txtQuery.setText("");
            txtQuery.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtQueryFocusGained

    private void txtQueryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQueryFocusLost
        if (txtQuery.getText().equals("")) {
            txtQuery.setText("Enter the Letter or Word that you want to Search");
            txtQuery.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtQueryFocusLost

    private void btnConsult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsult1ActionPerformed
        dispose();
        if (User == null || User.isClosed()) {
                User = new EmployeeForm();
                MdiMain.desktopPane.add(User);
                Dimension desktopSize = desktopPane.getSize();
                Dimension FrameSize = User.getSize();
                User.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        }
        User.setVisible(true);   
    }//GEN-LAST:event_btnConsult1ActionPerformed

    private void btnConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultActionPerformed
        
        String word = txtQuery.getText();
        String Query = "";
        if (id.isSelected()) {
                Query = "Id";
            } else if (username.isSelected()) {
                Query = "Username";
            }else if (password.isSelected()) {
                Query = "Password";
            }else if (job.isSelected()) {
                Query = "Job";
            }
        
        btnConsultar(word, Query);
        JOptionPane.showMessageDialog(null, "This are the results of your Consult");
        
        
    }//GEN-LAST:event_btnConsultActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        limpiarTabla();
        Consultar();
        txtQuery.setText("Enter the Letter or Word that you want to Search");
    }//GEN-LAST:event_btnShowAllActionPerformed

    /**
     * @param args the command line arguments5
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
            java.util.logging.Logger.getLogger(ShowEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowEmployee().setVisible(true);
            }
        });
    }

    void btnConsultar(String word,String Query){
        
        String sql = "select * from employee where " + Query + " like " + '"' + word + "%" + '"' + ";" ;
        limpiarTabla();
        try {
            conect = DBConexion.Conectar();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            Object[] employee = new Object[5];
            modelo = (DefaultTableModel) tabla.getModel(); 
            while (rs.next()) {
                employee[0] = rs.getInt("id");
                employee[1] = rs.getString("Username");
                employee[2] = rs.getString("Password");
                employee[3] = rs.getString("Job");
                employee[4] = rs.getString("RutaImg");
                
                modelo.addRow(employee);
            }
            tabla.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Left Fields to do a Consult");
            limpiarTabla();
        }
    }
    
    void limpiarTabla(){
        for (int i = 0; i < tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    
    void Consultar(){
        
        String sql = "select * from employee;";
        
        try {
            conect = DBConexion.Conectar();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            Object[] employee = new Object[5];
            modelo = (DefaultTableModel) tabla.getModel(); 
            while (rs.next()) {
                employee[0] = rs.getInt("id");
                employee[1] = rs.getString("Username");
                employee[2] = rs.getString("Password");
                employee[3] = rs.getString("Job");
                employee[4] = rs.getString("RutaImg");
                
                modelo.addRow(employee);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsult;
    private javax.swing.JButton btnConsult1;
    private javax.swing.JButton btnShowAll;
    private javax.swing.ButtonGroup btnsQueries;
    private javax.swing.JRadioButton id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton job;
    private javax.swing.JRadioButton password;
    public static javax.swing.JTable tabla;
    private javax.swing.JTextField txtQuery;
    private javax.swing.JRadioButton username;
    // End of variables declaration//GEN-END:variables
}
