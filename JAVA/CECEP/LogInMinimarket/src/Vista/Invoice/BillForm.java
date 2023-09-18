package Vista.Invoice;

import Modelo.DBConexion;
import Vista.Clients.ClientForm;
import Vista.Clients.ShowClients;
import Vista.LogIn;
import Vista.MdiMain;
import static Vista.MdiMain.client;
import static Vista.MdiMain.desktopPane;
import Vista.Products.ShowProduct;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BillForm extends javax.swing.JInternalFrame {

    public static String CompanyName;
    public static String clientName, clientLastame, clientDocument;
    public static String productId, productName, productBrand;
    public static String Id, Name,Quantity,ValueperUnit,FullValue;
    public static int PriceUnit, FullPrice;
    public static int Discount,Subtotal;
    public static double Total;
    public static int counter,counterId;
    public static int fk_idclient, fk_idemployee, fk_idcompany;
    public static String fecha;
    public static boolean create = false;
    public static boolean findProduct = false;
    public static boolean Search = false;
    public static boolean Search2 = false;
    
    DefaultTableModel modelo;
    Connection conect = null;
    Statement st = null;
    ResultSet rs = null;
    
    public BillForm() {
        initComponents();
        setTitle("Invoice Control");
        Title();
        counterId();
        counterId++;
        txtIdBill.setText(counterId + "");
        lblCompany.setText(CompanyName);
        txtEmployee.setText(LogIn.Employee);
    }

    private void counterId(){
        String sql = "select count(id_header) as numRows from header;";
        try {
            conect = DBConexion.Conectar();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            counterId = rs.getInt("numRows");
        } catch (SQLException e) {
        }
    }
    
    private void Title(){
        String sql = "select Name from company;";
        try {
            conect = DBConexion.Conectar();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            CompanyName = rs.getString("Name");
        } catch (SQLException e) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        lblCompany = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDocument = new javax.swing.JTextField();
        txtClient = new javax.swing.JTextField();
        txtEmployee = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdBill = new javax.swing.JTextField();
        spDate = new javax.swing.JSpinner();
        ComboBoxPay = new javax.swing.JComboBox<>();
        btnSearchClients = new javax.swing.JButton();
        btnCreateClient = new javax.swing.JButton();
        btnSearchClients1 = new javax.swing.JButton();
        btnSearchClients2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pnlProducts = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnSearchProduct = new javax.swing.JButton();
        btnCreateProducts = new javax.swing.JButton();
        txtIdProduct = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNameProduct = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPerUnit = new javax.swing.JTextField();
        txtFullValue = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnSearchClients3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnModify = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));

        lblCompany.setFont(new java.awt.Font("Britannic Bold", 1, 36)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel1.setText("Document:");

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel2.setText("Client:");

        jLabel3.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel3.setText("Employee:");

        txtDocument.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtDocument.setForeground(new java.awt.Color(51, 51, 51));
        txtDocument.setText("Document");
        txtDocument.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDocumentFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDocumentFocusLost(evt);
            }
        });
        txtDocument.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDocumentKeyPressed(evt);
            }
        });

        txtClient.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtClient.setForeground(new java.awt.Color(51, 51, 51));
        txtClient.setText("Client Name");
        txtClient.setEnabled(false);

        txtEmployee.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtEmployee.setForeground(new java.awt.Color(51, 51, 51));
        txtEmployee.setText("Employee");
        txtEmployee.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel4.setText("Bill Number: ");

        jLabel5.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel5.setText("Date: ");

        jLabel6.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel6.setText("Way to Pay:");

        txtIdBill.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtIdBill.setForeground(new java.awt.Color(51, 51, 51));
        txtIdBill.setText("Id");
        txtIdBill.setEnabled(false);

        spDate.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        spDate.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(1685333174434L), new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));

        ComboBoxPay.setFont(new java.awt.Font("Britannic Bold", 0, 16)); // NOI18N
        ComboBoxPay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","Cash", "Credit Card", "Check" }));

        btnSearchClients.setBackground(new java.awt.Color(153, 255, 255));
        btnSearchClients.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        btnSearchClients.setText("Search");
        btnSearchClients.setMaximumSize(new java.awt.Dimension(86, 26));
        btnSearchClients.setMinimumSize(new java.awt.Dimension(86, 26));
        btnSearchClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchClientsActionPerformed(evt);
            }
        });

        btnCreateClient.setBackground(new java.awt.Color(153, 255, 153));
        btnCreateClient.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        btnCreateClient.setText("Create");
        btnCreateClient.setMaximumSize(new java.awt.Dimension(86, 26));
        btnCreateClient.setMinimumSize(new java.awt.Dimension(86, 26));
        btnCreateClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateClientActionPerformed(evt);
            }
        });

        btnSearchClients1.setBackground(new java.awt.Color(153, 255, 153));
        btnSearchClients1.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        btnSearchClients1.setText("Save Bill");
        btnSearchClients1.setMaximumSize(new java.awt.Dimension(86, 26));
        btnSearchClients1.setMinimumSize(new java.awt.Dimension(86, 26));
        btnSearchClients1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchClients1ActionPerformed(evt);
            }
        });

        btnSearchClients2.setBackground(new java.awt.Color(0, 153, 255));
        btnSearchClients2.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        btnSearchClients2.setText("Print Bill");
        btnSearchClients2.setMaximumSize(new java.awt.Dimension(86, 26));
        btnSearchClients2.setMinimumSize(new java.awt.Dimension(86, 26));

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addComponent(txtDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearchClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCreateClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(35, 35, 35)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdBill)
                            .addComponent(spDate)
                            .addComponent(ComboBoxPay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSearchClients2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearchClients1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jSeparator1)
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMainLayout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnSearchClients, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnCreateClient, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlMainLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spDate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ComboBoxPay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtIdBill, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearchClients1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnSearchClients2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
        );

        pnlProducts.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Britannic Bold", 0, 22)); // NOI18N
        jLabel7.setText("Code:");

        btnSearchProduct.setBackground(new java.awt.Color(153, 255, 255));
        btnSearchProduct.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        btnSearchProduct.setText("Search");
        btnSearchProduct.setMaximumSize(new java.awt.Dimension(86, 26));
        btnSearchProduct.setMinimumSize(new java.awt.Dimension(86, 26));
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        btnCreateProducts.setBackground(new java.awt.Color(153, 255, 153));
        btnCreateProducts.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        btnCreateProducts.setText("Create");
        btnCreateProducts.setMaximumSize(new java.awt.Dimension(86, 26));
        btnCreateProducts.setMinimumSize(new java.awt.Dimension(86, 26));

        txtIdProduct.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtIdProduct.setForeground(new java.awt.Color(51, 51, 51));
        txtIdProduct.setText("Id Product");
        txtIdProduct.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdProductFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdProductFocusLost(evt);
            }
        });
        txtIdProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdProductKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Britannic Bold", 0, 22)); // NOI18N
        jLabel8.setText("Name:");

        txtNameProduct.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtNameProduct.setForeground(new java.awt.Color(51, 51, 51));
        txtNameProduct.setText("Name Product");
        txtNameProduct.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Britannic Bold", 0, 22)); // NOI18N
        jLabel9.setText("Quantity:");

        txtQuantity.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtQuantity.setForeground(new java.awt.Color(51, 51, 51));
        txtQuantity.setText("Quantity of Products");
        txtQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantityFocusLost(evt);
            }
        });
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantityKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Britannic Bold", 0, 22)); // NOI18N
        jLabel10.setText("Value per Unit:");

        txtPerUnit.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtPerUnit.setForeground(new java.awt.Color(51, 51, 51));
        txtPerUnit.setText("Value per Unit");
        txtPerUnit.setEnabled(false);

        txtFullValue.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtFullValue.setForeground(new java.awt.Color(51, 51, 51));
        txtFullValue.setText("Full Value");
        txtFullValue.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Britannic Bold", 0, 22)); // NOI18N
        jLabel11.setText("Full Value:");

        btnSearchClients3.setBackground(new java.awt.Color(255, 102, 102));
        btnSearchClients3.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        btnSearchClients3.setText("Delete");
        btnSearchClients3.setMaximumSize(new java.awt.Dimension(86, 26));
        btnSearchClients3.setMinimumSize(new java.awt.Dimension(86, 26));
        btnSearchClients3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchClients3ActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name Product", "Quantity", "Value Per Unit", "Full Value"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnAdd.setBackground(new java.awt.Color(153, 255, 153));
        btnAdd.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        btnAdd.setMnemonic('a');
        btnAdd.setText("Add");
        btnAdd.setMaximumSize(new java.awt.Dimension(86, 26));
        btnAdd.setMinimumSize(new java.awt.Dimension(86, 26));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Britannic Bold", 0, 22)); // NOI18N
        jLabel12.setText("Subtotal:");

        txtSubtotal.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtSubtotal.setForeground(new java.awt.Color(51, 51, 51));
        txtSubtotal.setText("Subtotal");
        txtSubtotal.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Britannic Bold", 0, 22)); // NOI18N
        jLabel13.setText("Discount:");

        txtDiscount.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtDiscount.setForeground(new java.awt.Color(51, 51, 51));
        txtDiscount.setText("Discount");
        txtDiscount.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Britannic Bold", 0, 22)); // NOI18N
        jLabel14.setText("Total:");

        txtTotal.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(51, 51, 51));
        txtTotal.setText("Total");
        txtTotal.setEnabled(false);

        btnModify.setBackground(new java.awt.Color(102, 153, 255));
        btnModify.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        btnModify.setMnemonic('a');
        btnModify.setText("Modify");
        btnModify.setMaximumSize(new java.awt.Dimension(86, 26));
        btnModify.setMinimumSize(new java.awt.Dimension(86, 26));
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProductsLayout = new javax.swing.GroupLayout(pnlProducts);
        pnlProducts.setLayout(pnlProductsLayout);
        pnlProductsLayout.setHorizontalGroup(
            pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlProductsLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(pnlProductsLayout.createSequentialGroup()
                            .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtIdProduct)
                                .addGroup(pnlProductsLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCreateProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(50, 50, 50)
                            .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(txtNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(txtPerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(txtFullValue, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProductsLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(18, 18, 18)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlProductsLayout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(18, 18, 18)
                            .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearchClients3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlProductsLayout.setVerticalGroup(
            pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductsLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlProductsLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchClients3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(pnlProductsLayout.createSequentialGroup()
                        .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlProductsLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFullValue, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProductsLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProductsLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProductsLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProductsLayout.createSequentialGroup()
                                .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCreateProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDocumentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDocumentFocusGained
        if (txtDocument.getText().equals("Document")) {
            txtDocument.setText("");
            txtDocument.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtDocumentFocusGained

    private void txtDocumentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDocumentFocusLost
        if (txtDocument.getText().equals("")) {
            txtDocument.setText("Document");
            txtDocument.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtDocumentFocusLost

    private void txtDocumentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String sql = "select Document,Name,Lastname from client where Document = " + txtDocument.getText() + ";";
            PutClient(sql);
        }
    }//GEN-LAST:event_txtDocumentKeyPressed

    private void btnCreateClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateClientActionPerformed
        create = true;
        dispose();
        if (client == null || client.isClosed()) {
            client = new ClientForm();
            MdiMain.desktopPane.add(client);
            Dimension desktopSize = desktopPane.getSize();
            Dimension FrameSize = client.getSize();
            client.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        }
        client.setVisible(true);
    }//GEN-LAST:event_btnCreateClientActionPerformed

    private void btnSearchClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchClientsActionPerformed
        Search = true;
        new ShowClients().setVisible(true);
    }//GEN-LAST:event_btnSearchClientsActionPerformed

    private void txtIdProductFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdProductFocusGained
        if (txtIdProduct.getText().equals("Id Product")) {
            txtIdProduct.setText("");
            txtIdProduct.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtIdProductFocusGained

    private void txtIdProductFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdProductFocusLost
        if (txtIdProduct.getText().equals("")) {
            txtIdProduct.setText("Id Product");
            txtIdProduct.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtIdProductFocusLost

    private void txtQuantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusGained
        if (txtQuantity.getText().equals("Quantity of Products")) {
            txtQuantity.setText("");
            txtQuantity.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtQuantityFocusGained

    private void txtQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusLost
        if (txtQuantity.getText().equals("")) {
            txtQuantity.setText("Quantity of Products");
            txtQuantity.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtQuantityFocusLost

    private void txtIdProductKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProductKeyPressed
        
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                String sql = "select Id,Name,Brand from products where Id = " + txtIdProduct.getText() + ";";
                PutProduct(sql);
            }
            findProduct = false;
        
    }//GEN-LAST:event_txtIdProductKeyPressed

    private void btnSearchClients3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchClients3ActionPerformed
        
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "You didnt Select any Row");
        }else{
            modelo.removeRow(fila);
            SumarColumna();
        }
    }//GEN-LAST:event_btnSearchClients3ActionPerformed

    private void txtQuantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            counter++;
            if (txtQuantity.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Empty Field");
            }else {
                int cantidad = Integer.parseInt(txtQuantity.getText());
                String sql = "select Price from products where Id = " + "'" + txtIdProduct.getText() + "'" + ";";
                PutValues(sql,cantidad);
            }
            if (counter % 2 == 0) {
                AgregarFila();
            }
        }
    }//GEN-LAST:event_txtQuantityKeyPressed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AgregarFila();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "You didnt Select any Row");
        }else{
            Id = (String) tabla.getValueAt(fila, 0).toString();
            Name = (String) tabla.getValueAt(fila, 1).toString();
            Quantity = (String) tabla.getValueAt(fila, 2).toString();
            ValueperUnit = (String) tabla.getValueAt(fila, 3).toString();
            FullValue = (String) tabla.getValueAt(fila, 4).toString();
            
            txtIdProduct.setText(Id);
            txtNameProduct.setText(Name);
            txtQuantity.setText(Quantity);
            txtPerUnit.setText(ValueperUnit);
            txtFullValue.setText(FullValue);
            
            modelo.removeRow(fila);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        Search2 = true;
        new ShowProduct().setVisible(true);
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void btnSearchClients1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchClients1ActionPerformed
        AgregarEncabezadoFactura();
        AgregarDetalleFactura();
        JOptionPane.showMessageDialog(null, "The invoice was successfully saved");
        JOptionPane.showMessageDialog(null, "The program will close to save the changes.");
        this.dispose();
    }//GEN-LAST:event_btnSearchClients1ActionPerformed

    private void PutValues(String sql, int cantidad){
        try {
            conect = DBConexion.Conectar();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            PriceUnit = rs.getInt("Price");
        } catch (SQLException e) {
        }
        txtPerUnit.setText(Integer.toString(PriceUnit));
        txtFullValue.setText(Integer.toString((PriceUnit * cantidad)));
    }
    
    private void PutProduct(String sql){
        try {
            conect = DBConexion.Conectar();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            productId = rs.getString("Id");
            productName = rs.getString("Name");
            productBrand = rs.getString("Brand");
            findProduct = true;
        } catch (SQLException e) {
            findProduct = false;
        }
        
        if (txtIdProduct.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Field");
            txtNameProduct.setText("Name Product");
        }else if (findProduct == false) {
            JOptionPane.showMessageDialog(null, "This Product doesnt Exist");
            txtNameProduct.setText("Name Product");
            txtIdProduct.setText("");
        }else {
            txtIdProduct.setText(productId);
            txtNameProduct.setText(productName + " " + productBrand);
            (txtQuantity).requestFocus();
        }
    }

    private void PutClient(String sql){
        try {
            conect = DBConexion.Conectar();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            rs.next();    
            clientDocument = rs.getString("Document");
            clientName = rs.getString("Name");
            clientLastame = rs.getString("Lastname");
        } catch (SQLException e) {
        }
        txtDocument.setText(clientDocument);
        txtClient.setText(clientName + " " + clientLastame);
    }
    
    private void SumarColumna(){
        int fila;
        Subtotal = 0;
        
        for (int i = 0; i < tabla.getRowCount(); i++) {
            fila = Integer.parseInt(tabla.getValueAt(i, 4).toString());
            Subtotal += fila;
        }
        txtSubtotal.setText(Subtotal + "");
        
        double desc1 = 0.025,desc2 = 0.08;
        double discount = 0;
        
        String combo = (String)ComboBoxPay.getSelectedItem();
        
        if (combo.equals("Cash")) {
            txtDiscount.setText("0");
            txtTotal.setText(Subtotal + "");
        }else if (combo.equals("Credit Card")) {
            discount = desc2 * Subtotal;
            txtDiscount.setText((int)discount + "");
        }else{
            discount = desc1 * Subtotal;
            txtDiscount.setText((int)discount + "");
        }
        Total = Subtotal - discount;
        txtTotal.setText((int)Total + "");
    }
    
    private void AgregarFila(){
        String combo = (String)ComboBoxPay.getSelectedItem();
        if (combo.equals("")) {
            JOptionPane.showMessageDialog(null, "Select a payment Method");
        }else{
            if (txtIdProduct.getText().equals("Id Product") || txtNameProduct.getText().equals("Name Product") || txtQuantity.getText().equals("Quantity of Products") ||
                txtPerUnit.getText().equals("Value per Unit") || txtFullValue.getText().equals("Full Value")) {
                JOptionPane.showMessageDialog(null, "Left Fields");
            }else{
                Object[] addRow = new Object[5];
                modelo = (DefaultTableModel) tabla.getModel(); 
                addRow[0] = txtIdProduct.getText();
                addRow[1] = txtNameProduct.getText();
                addRow[2] = txtQuantity.getText();
                addRow[3] = txtPerUnit.getText();
                addRow[4] = txtFullValue.getText();
                modelo.addRow(addRow);
                tabla.setModel(modelo);
            }       

            SumarColumna();
            txtIdProduct.setText("Id Product");
            txtIdProduct.setForeground(Color.LIGHT_GRAY);
            txtNameProduct.setText("Name Product");
            txtQuantity.setText("Quantity of Products");
            txtQuantity.setForeground(Color.LIGHT_GRAY);
            txtPerUnit.setText("Value per Unit");
            txtFullValue.setText("Full Value");
            (txtIdProduct).requestFocus();
        }
    }
    
    private void clientQuery(){
        if (txtIdProduct.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Left Client Document");
        }else {
            try {
                
            String sql = "Select Id from client where Document = "+ txtDocument.getText() + ";";
            conect = DBConexion.Conectar();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            fk_idclient = rs.getInt("Id");
            } catch (SQLException e) {
            }
        }
    }
    
    private void employeeQuery(){
        if (txtEmployee.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Left Employee");
        }else {
            try {
                
            String sql = "Select Id from employee where Username = "+ "'" + txtEmployee.getText() + "'" + ";";
            conect = DBConexion.Conectar();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            fk_idemployee = rs.getInt("Id");
            } catch (SQLException e) {
            }
        }
    }
    
    private void companyQuery(){
        if (lblCompany.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Left company");
        }else {
            try {
                
            String sql = "Select Id from company where Name = "+ "'" + lblCompany.getText() + "'" + ";";
            conect = DBConexion.Conectar();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            fk_idcompany = rs.getInt("Id");
            } catch (SQLException e) {
            }
        }
    }
    
    private void AgregarEncabezadoFactura(){
        clientQuery();
        employeeQuery();
        companyQuery();
        String fecha = spDate.getValue().toString();
        
        try {
            if (txtTotal.getText().equals("Total") || txtSubtotal.getText().equals("Subtotal") || txtClient.getText().equals("Client Name")) {
                JOptionPane.showMessageDialog(null, "Left Fields");
            }else {
                String sql = "insert into header(id_header,fecha,subtotal,total,fk_id_company,fk_id_client,fk_id_employee) values ("+counterId+",'"+fecha+"',"+Subtotal+","+Total+","+fk_idcompany+","+fk_idclient+","+fk_idemployee+" );";
                conect = DBConexion.Conectar();
                st = conect.createStatement();
                st.executeUpdate(sql);
            }
            
        } catch (SQLException e) {
        }
        fk_idclient = 0;
        fk_idcompany = 0;
        fk_idemployee = 0;
        Subtotal = 0;
        Total = 0;
    }
    
    private void AgregarDetalleFactura(){
    
        try {
            if (tabla.getRowCount() < 0) {
                JOptionPane.showMessageDialog(null, "The table is Empty");
            }else {
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    String sql = "insert into detail(fk_id_header, fk_id_product, quantity, total_product) values ("+counterId+",'"+tabla.getValueAt(i, 0)+"',"+tabla.getValueAt(i, 2)+","+tabla.getValueAt(i, 4)+" );";
                    JOptionPane.showMessageDialog(null, sql);
                    conect = DBConexion.Conectar();
                    st = conect.createStatement();
                    st.executeUpdate(sql);
                }
            }
        } catch (Exception e) {
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxPay;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCreateClient;
    private javax.swing.JButton btnCreateProducts;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSearchClients;
    private javax.swing.JButton btnSearchClients1;
    private javax.swing.JButton btnSearchClients2;
    private javax.swing.JButton btnSearchClients3;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlProducts;
    private javax.swing.JSpinner spDate;
    private javax.swing.JTable tabla;
    public static javax.swing.JTextField txtClient;
    private javax.swing.JTextField txtDiscount;
    public static javax.swing.JTextField txtDocument;
    private javax.swing.JTextField txtEmployee;
    private javax.swing.JTextField txtFullValue;
    private javax.swing.JTextField txtIdBill;
    public static javax.swing.JTextField txtIdProduct;
    public static javax.swing.JTextField txtNameProduct;
    private javax.swing.JTextField txtPerUnit;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
