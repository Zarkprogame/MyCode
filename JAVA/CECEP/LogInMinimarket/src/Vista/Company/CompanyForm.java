package Vista.Company;

import Modelo.DBConexion;
import java.sql.*;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class CompanyForm extends javax.swing.JInternalFrame {

    public static int counter;
    public static int counter1;
    public static int sqlRows;
    public static boolean temp;
    public static boolean modify;
    
    Connection conect = null;
    Statement st = null;
    ResultSet rs = null;
    
    public CompanyForm() {
        initComponents();
        setTitle("Company Management");
        txtId.setEnabled(false);
        Bloq();
        dbRows();
        if (sqlRows == 1) {
            btnAdd.setEnabled(false);
            String sql = "select * from company;";
            PonerDatos(sql);
        }
    }
    
    private void dbRows(){
        String sql = "select count(Id) as numRows from company;";
        try {
            conect = DBConexion.Conectar();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            sqlRows = rs.getInt("numRows");
        } catch (SQLException e) {
        }
    }
    
    private void Bloq(){
        for (Component a : pnlForm.getComponents()) {
            a.setEnabled(false);
        }
    }
    
    private void Desbloq(){
        for (Component a : pnlForm.getComponents()) {
            a.setEnabled(true);
        }
        txtId.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtNit = new javax.swing.JTextField();
        pnlTools = new javax.swing.JPanel();
        pnl_mtto2 = new javax.swing.JPanel();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JToggleButton();
        pnl_fnEspeciales = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        pnlForm.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel1.setText("Id:");

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel2.setText("Name:");

        txtId.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtId.setForeground(new java.awt.Color(51, 51, 51));
        txtId.setText("Id");

        txtName.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 51, 51));
        txtName.setText("Name");

        jLabel5.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel5.setText("Nit:");

        jLabel6.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel6.setText("Address:");

        txtAddress.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(51, 51, 51));
        txtAddress.setText("Address");

        jLabel7.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel7.setText("Phone:");

        txtPhone.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(51, 51, 51));
        txtPhone.setText("Phone");

        txtNit.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtNit.setForeground(new java.awt.Color(51, 51, 51));
        txtNit.setText("Nit");

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtAddress)
                        .addComponent(txtName)
                        .addComponent(txtNit, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .addComponent(txtId))
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pnlTools.setBackground(new java.awt.Color(255, 255, 255));

        pnl_mtto2.setBackground(new java.awt.Color(255, 255, 255));
        pnl_mtto2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 187, 187)), "Mtto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mod.png"))); // NOI18N
        btnModify.setToolTipText("Edit / Cancel");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnDelete.setToolTipText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.png"))); // NOI18N
        btnAdd.setToolTipText("Add / Save");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_mtto2Layout = new javax.swing.GroupLayout(pnl_mtto2);
        pnl_mtto2.setLayout(pnl_mtto2Layout);
        pnl_mtto2Layout.setHorizontalGroup(
            pnl_mtto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mtto2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_mtto2Layout.setVerticalGroup(
            pnl_mtto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mtto2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_mtto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(btnModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl_fnEspeciales.setBackground(new java.awt.Color(255, 255, 255));
        pnl_fnEspeciales.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 187, 187)), "Fn Especiales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consulta.png"))); // NOI18N
        btnSearch.setToolTipText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayuda.png"))); // NOI18N
        btnHelp.setToolTipText("Help");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        btnExit.setToolTipText("<html>\n<body>\n<div>\n<img src =  \"file:C:/Users/Usuario/MyCode/JAVA/CECEP/LogInMinimarket/src/img/loco.jpg\" />\n</div>\n</body>\n </html>");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/impresora.png"))); // NOI18N
        btnPrint.setToolTipText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_fnEspecialesLayout = new javax.swing.GroupLayout(pnl_fnEspeciales);
        pnl_fnEspeciales.setLayout(pnl_fnEspecialesLayout);
        pnl_fnEspecialesLayout.setHorizontalGroup(
            pnl_fnEspecialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fnEspecialesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        pnl_fnEspecialesLayout.setVerticalGroup(
            pnl_fnEspecialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fnEspecialesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_fnEspecialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlToolsLayout = new javax.swing.GroupLayout(pnlTools);
        pnlTools.setLayout(pnlToolsLayout);
        pnlToolsLayout.setHorizontalGroup(
            pnlToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToolsLayout.createSequentialGroup()
                .addGroup(pnlToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlToolsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlToolsLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(pnl_mtto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(pnl_fnEspeciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnlToolsLayout.setVerticalGroup(
            pnlToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlToolsLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(pnlToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_fnEspeciales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_mtto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTools, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        
        setTitle("Client Management");
        counter1++;
        
        if (counter1 % 2 == 0) {
            btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mod.png")));
            JOptionPane.showMessageDialog(null, "You have been cancel the Operation");
            btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.png")));
            counter = 0;
            Bloq();
            btnAdd.setEnabled(false);
            btnDelete.setEnabled(true);
            String sql = "select * from company;";
            PonerDatos(sql);

        }else {
            modify = true;
            String sql = "select * from company;";
            PonerDatos(sql);
            btnAdd.setEnabled(true);
            if (temp) {
                counter++;
                btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png")));
                Desbloq();
                btnDelete.setEnabled(false);
                btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/desactivar.png"))); 
            }else {
                counter1 --; 
            }
        }
        temp = false;
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        setTitle("Company Management");
        int choose = JOptionPane.showConfirmDialog(null, "Are you Sure to Delete the Company?");
        if ( choose == 0) {
            Eliminar();
        }else{
            JOptionPane.showMessageDialog(null, "You have been cancel the Operation");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        setTitle("Company Management");
        counter++;
        
        if (counter % 2 == 0) {
            btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.png")));
            btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mod.png")));
            counter1 = 0;
            Bloq();
            if (modify) {
                Modificar();
            }else {
                Agregar();
            }
            btnDelete.setEnabled(true);
            String sql = "select * from company;";
            PonerDatos(sql);

        }else {            
            Desbloq();
            counter1++;
            btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/desactivar.png"))); 
            btnDelete.setEnabled(false);
            txtId.setText("");
            txtName.setText("");
            txtAddress.setText("");
            txtPhone.setText("");
            txtNit.setText("");
            btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png")));         
        }
        
        modify = false;
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        
        try {
            File file = new File("C:\\Users\\Usuario\\MyCode\\JAVA\\CECEP\\LogInMinimarket\\src\\img\\poo.pdf");
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                }else{
                    JOptionPane.showMessageDialog(null, "Not supported");
                }
            }else {
                JOptionPane.showMessageDialog(null, "File not Exist");
            }
            
        } catch (HeadlessException | IOException e) {
        }
        
        
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        JOptionPane.showMessageDialog(null, "See you Soon");
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        JOptionPane.showMessageDialog(null, "This Option is not available for the moment");
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        JOptionPane.showMessageDialog(null, "This Form doesnt have this Action");
    }//GEN-LAST:event_btnSearchActionPerformed

    public void Agregar(){
    
        String nit = txtNit.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String phone = txtPhone.getText();
        
        try {
            if (nit.equals("") || name.equals("") || address.equals("") || phone.equals("")) {
                JOptionPane.showMessageDialog(null, "Missing data to be entered");
                setTitle("Company Management");
            }else {
                String sql = "insert into company(Nit,Name,Address,Phone) values (" + nit + ",'"+name+"','"+address+"','"+phone+"' );";
                conect = DBConexion.Conectar();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "New Company SignUp Succesfully");
                JOptionPane.showMessageDialog(null, "The window will close to save the changes");
                this.dispose();
            }
            
        } catch (SQLException e) {
        }
    }
    
    public void PonerDatos(String sql){
        
        Object[] company = new Object[5];
        
        try {
            conect = DBConexion.Conectar();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                company[0] = rs.getInt("Id");
                company[1] = rs.getInt("Nit");
                company[2] = rs.getString("Name");
                company[3] = rs.getString("Address");
                company[4] = rs.getString("Phone");
            }
        } catch (SQLException e) {
        }
        
        if (company[0] == null) {
            JOptionPane.showMessageDialog(null, "This Company doesnt Exist");
            temp = false;
        }else{
            txtId.setText(company[0].toString());
            txtNit.setText(company[1].toString());
            txtName.setText(company[2].toString());
            txtAddress.setText(company[3].toString());
            txtPhone.setText(company[4].toString());
            temp = true;
        }
    }

    public void Modificar(){
    
        String nit = txtNit.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String phone = txtPhone.getText();
       
        try {
            if (nit.equals("") || name.equals("") || address.equals("") || phone.equals("")) {
                JOptionPane.showMessageDialog(null, "Missing data to be entered");
            }else {
                String sql = "update company set Nit = '"+nit+"', Name = '"+name+"',Address = '"+address+"',Phone = '"+phone+"';";                                            
                conect = DBConexion.Conectar();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "The Company Modify Succesfully");
            }
            
        } catch (SQLException e) {
        }
    }
    
    public void Eliminar(){
        
        try {
            if (sqlRows == 0) {
                JOptionPane.showMessageDialog(null, "There isnt Company");
            }else {
                String sql = "delete from company;";                                            
                conect = DBConexion.Conectar();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "The Company has been Deleted");
                JOptionPane.showMessageDialog(null, "The window will close to save the changes");
                this.dispose();
            }
        } catch (Exception e) {
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JPanel pnlTools;
    private javax.swing.JPanel pnl_fnEspeciales;
    private javax.swing.JPanel pnl_mtto2;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
