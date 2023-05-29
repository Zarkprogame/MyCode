package Vista.Products;

import Modelo.DBConexion;
import Vista.Invoice.BillForm;
import Vista.MdiMain;
import static Vista.MdiMain.product;
import static Vista.MdiMain.desktopPane;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ShowProduct extends javax.swing.JFrame {
    
    Connection conect;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    
    public ShowProduct() {
        initComponents();
        btnSearch.setVisible(false);
        if (BillForm.Search2 == true) {
            btnExit.setVisible(false);
            btnSearch.setVisible(true);
        }
        btnsQueries.add(id);
        btnsQueries.add(name);
        btnsQueries.add(brand);
        btnsQueries.add(price);
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
        name = new javax.swing.JRadioButton();
        brand = new javax.swing.JRadioButton();
        price = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        btnConsult = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnShowAll = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Brand", "Price", "Image"
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

        name.setText("Name");

        brand.setText("Brand");

        price.setText("Price");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id)
                    .addComponent(name)
                    .addComponent(brand)
                    .addComponent(price))
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

        btnExit.setBackground(new java.awt.Color(255, 204, 204));
        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExit.setMnemonic('e');
        btnExit.setText("Exit");
        btnExit.setToolTipText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnShowAll.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnShowAll.setText("Show All");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
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
                                .addComponent(btnExit))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConsult)
                                .addGap(28, 28, 28)
                                .addComponent(btnShowAll)
                                .addGap(28, 28, 28)
                                .addComponent(btnSearch)
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
                    .addComponent(btnExit))
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
                            .addComponent(btnShowAll)
                            .addComponent(btnSearch)))
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

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
        if (product == null || product.isClosed()) {
                product = new ProductsForm();
                MdiMain.desktopPane.add(product);
                Dimension desktopSize = desktopPane.getSize();
                Dimension FrameSize = product.getSize();
                product.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        }
        product.setVisible(true);   
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultActionPerformed
        
        String word = txtQuery.getText();
        String Query = "";
        if (id.isSelected()) {
                Query = "Id";
            } else if (name.isSelected()) {
                Query = "Name";
            }else if (brand.isSelected()) {
                Query = "Brand";
            }else if (price.isSelected()) {
                Query = "Price";
            }
        
        btnConsultar(word, Query);
        JOptionPane.showMessageDialog(null, "This are the results of your Consult");
        
        
    }//GEN-LAST:event_btnConsultActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        btnsQueries.clearSelection();
        limpiarTabla();
        Consultar();
        txtQuery.setText("Enter the Letter or Word that you want to Search");
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "You didnt Select any Row");
        }else{
            BillForm.productId = (String) tabla.getValueAt(fila, 0).toString();
            BillForm.productName = (String) tabla.getValueAt(fila, 1).toString();
            BillForm.productBrand = (String) tabla.getValueAt(fila, 2).toString();
            
            BillForm.txtIdProduct.setText(BillForm.productId);
            BillForm.txtNameProduct.setText(BillForm.productName + " " + BillForm.productBrand);
        }
        BillForm.Search2 = false;
        this.dispose();
    }//GEN-LAST:event_btnSearchActionPerformed

    void btnConsultar(String word,String Query){
        
        String sql = "select * from products where " + Query + " like " + '"' + word + "%" + '"' + ";" ;
        limpiarTabla();
        try {
            conect = DBConexion.Conectar();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            Object[] employee = new Object[5];
            modelo = (DefaultTableModel) tabla.getModel(); 
            while (rs.next()) {
                employee[0] = rs.getInt("id");
                employee[1] = rs.getString("Name");
                employee[2] = rs.getString("Brand");
                employee[3] = rs.getInt("Price");
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
        
        String sql = "select * from products;";
        
        try {
            conect = DBConexion.Conectar();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            Object[] product = new Object[5];
            modelo = (DefaultTableModel) tabla.getModel(); 
            while (rs.next()) {
                product[0] = rs.getInt("Id");
                product[1] = rs.getString("Name");
                product[2] = rs.getString("Brand");
                product[3] = rs.getInt("Price");
                product[4] = rs.getString("RutaImg");
                
                modelo.addRow(product);
            }
            tabla.setModel(modelo);
        } catch (SQLException e) {
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton brand;
    private javax.swing.JButton btnConsult;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowAll;
    private javax.swing.ButtonGroup btnsQueries;
    private javax.swing.JRadioButton id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton name;
    private javax.swing.JRadioButton price;
    public static javax.swing.JTable tabla;
    private javax.swing.JTextField txtQuery;
    // End of variables declaration//GEN-END:variables
}
