package Vista.Clients;

import Modelo.DBConexion;
import java.sql.*;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ClientForm extends javax.swing.JInternalFrame {

    public static String ruta;
    public static int counter;
    public static int counter1;
    public static int counterRow = 0;
    public static String User = "";
    public static int sqlRows;
    public static String Path;
    public static boolean temp;
    public static boolean modify;
    public static boolean repetido;
    
    Connection conect = null;
    Statement st = null;
    ResultSet rs = null;
    
    public ClientForm() {
        initComponents();
        setTitle("Client Management");
        btnsGender.add(f);
        btnsGender.add(m);
        txtId.setEnabled(false);
        btnFirst.setEnabled(false);
        btnPrevius.setEnabled(false);
        Bloq();
        dbRows();
        if (sqlRows == 0) {
            btnNext.setEnabled(false);
            btnLast.setEnabled(false);
        }
    }
    
    private void dbRows(){
        String sql = "select count(Document) as numRows from client;";
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
        for (Component a : pnl_genero.getComponents()) {
            a.setEnabled(false);
        }
        btn_foto.setEnabled(false);
    }
    
    private void Desbloq(){
        for (Component a : pnlForm.getComponents()) {
            a.setEnabled(true);
        }
        for (Component a : pnl_genero.getComponents()) {
            a.setEnabled(true);
        }
        btn_foto.setEnabled(true);
        txtId.setEnabled(false);
    }
    
    private void NavP(){
        setTitle(String.format("Client %s of %s", counterRow,sqlRows));
        if (counterRow == 1) {
            btnPrevius.setEnabled(false);
            btnFirst.setEnabled(false);
        }
        
        if (counterRow == sqlRows) {
            btnNext.setEnabled(false);
            btnLast.setEnabled(false);
        }else{
            btnNext.setEnabled(true);
            btnLast.setEnabled(true);
        }
    }
    
    private void NavN(){
        setTitle(String.format("Client %s of %s", counterRow,sqlRows));
        if (counterRow == sqlRows) {
            btnNext.setEnabled(false);
            btnLast.setEnabled(false);
        }
        
        if (counterRow == 1) {
            btnPrevius.setEnabled(false);
            btnFirst.setEnabled(false);
        }else{
            btnPrevius.setEnabled(true);
            btnFirst.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsGender = new javax.swing.ButtonGroup();
        pnlForm = new javax.swing.JPanel();
        pnl_foto = new javax.swing.JPanel();
        btn_foto = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnl_genero = new javax.swing.JPanel();
        m = new javax.swing.JRadioButton();
        f = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        spEdad = new javax.swing.JSpinner();
        txtDocument = new javax.swing.JTextField();
        pnlTools = new javax.swing.JPanel();
        pnl_nav = new javax.swing.JPanel();
        btnPrevius = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
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

        pnl_foto.setBackground(new java.awt.Color(255, 255, 255));
        pnl_foto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 187, 187)), "Photo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        btn_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/camara.png"))); // NOI18N
        btn_foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_fotoLayout = new javax.swing.GroupLayout(pnl_foto);
        pnl_foto.setLayout(pnl_fotoLayout);
        pnl_fotoLayout.setHorizontalGroup(
            pnl_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fotoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btn_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(pnl_fotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_fotoLayout.setVerticalGroup(
            pnl_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fotoLayout.createSequentialGroup()
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel1.setText("Id:");

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel2.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel4.setText("Lastname:");

        txtId.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtId.setForeground(new java.awt.Color(51, 51, 51));
        txtId.setText("Id");

        txtName.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 51, 51));
        txtName.setText("Name");

        txtLastname.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtLastname.setForeground(new java.awt.Color(51, 51, 51));
        txtLastname.setText("Lastname");

        jLabel5.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel5.setText("Document:");

        jLabel3.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel3.setText("Age:");

        pnl_genero.setBackground(new java.awt.Color(255, 255, 255));
        pnl_genero.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 187, 187)), "Gender", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        m.setText("Masculino");
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });

        f.setText("Femenino");
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_generoLayout = new javax.swing.GroupLayout(pnl_genero);
        pnl_genero.setLayout(pnl_generoLayout);
        pnl_generoLayout.setHorizontalGroup(
            pnl_generoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_generoLayout.createSequentialGroup()
                .addComponent(m)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_generoLayout.setVerticalGroup(
            pnl_generoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_generoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_generoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m)
                    .addComponent(f))
                .addContainerGap(14, Short.MAX_VALUE))
        );

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

        txtDocument.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        txtDocument.setForeground(new java.awt.Color(51, 51, 51));
        txtDocument.setText("Document");

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtAddress)
                        .addComponent(txtLastname)
                        .addComponent(txtName)
                        .addComponent(txtDocument, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .addComponent(txtId))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(spEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_genero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77))
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnl_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pnlTools.setBackground(new java.awt.Color(255, 255, 255));

        pnl_nav.setBackground(new java.awt.Color(255, 255, 255));
        pnl_nav.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 187, 187)), "Nav", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        btnPrevius.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anterior.png"))); // NOI18N
        btnPrevius.setToolTipText("Previus");
        btnPrevius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviusActionPerformed(evt);
            }
        });

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/primero.png"))); // NOI18N
        btnFirst.setToolTipText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ultimo.png"))); // NOI18N
        btnLast.setToolTipText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/siguiente.png"))); // NOI18N
        btnNext.setToolTipText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_navLayout = new javax.swing.GroupLayout(pnl_nav);
        pnl_nav.setLayout(pnl_navLayout);
        pnl_navLayout.setHorizontalGroup(
            pnl_navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_navLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrevius, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_navLayout.setVerticalGroup(
            pnl_navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_navLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevius, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

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
                .addContainerGap()
                .addGroup(pnlToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlToolsLayout.createSequentialGroup()
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(503, Short.MAX_VALUE))
                    .addGroup(pnlToolsLayout.createSequentialGroup()
                        .addComponent(pnl_nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(pnl_mtto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnl_fnEspeciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnlToolsLayout.setVerticalGroup(
            pnlToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlToolsLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(pnlToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_fnEspeciales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnPreviusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviusActionPerformed
        
        counterRow --;
        NavP();
        
        String sql = "SELECT * from ( select *,row_number()over(order by id)as rownum from client ) as consulta where consulta.rownum = " + counterRow + ";";
        
        PonerDatos(sql);
        
    }//GEN-LAST:event_btnPreviusActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        
        counterRow = 1;
        NavP();
        
        String sql = "SELECT * from ( select *,row_number()over(order by id)as rownum from client ) as consulta where consulta.rownum = " + counterRow + ";";
        
        PonerDatos(sql);
        
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        
        counterRow = sqlRows;
        NavN();
        
        String sql = "SELECT * from ( select *,row_number()over(order by id)as rownum from client ) as consulta where consulta.rownum = " + counterRow + ";";
        
        PonerDatos(sql);
               
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        
        counterRow ++;
        NavN();
        
        String sql = "SELECT * from ( select *,row_number()over(order by id)as rownum from client ) as consulta where consulta.rownum = " + counterRow + ";";
        
        PonerDatos(sql);
                
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        
        setTitle("Client Management");
        counter1++;
        
        if (counter1 % 2 == 0) {
            btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mod.png")));
            JOptionPane.showMessageDialog(null, "You have been cancel the Operation");
            btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.png")));
            counter = 0;
            Bloq();
            btnNext.setEnabled(true);
            btnLast.setEnabled(true);
            btnDelete.setEnabled(true);
            spEdad.setValue(0);
            btnsGender.clearSelection();
            txtId.setText("Id");
            txtName.setText("Username");
            txtLastname.setText("Password");
            txtAddress.setText("Addres");
            txtPhone.setText("Phone");
            txtDocument.setText("Document");
            lblFoto.setIcon(null);
            counterRow = 0;

        }else {
            modify = true;
            User = JOptionPane.showInputDialog("Enter the User Document that you want to Modify");
            String sql = "select * from client where Document = "  + User  + ";";
            PonerDatos(sql);
            if (temp) {
                counter++;
                JOptionPane.showMessageDialog(null, "Client Found");
                btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png")));
                Desbloq();
                btnNext.setEnabled(false);
                btnPrevius.setEnabled(false);
                btnFirst.setEnabled(false);
                btnLast.setEnabled(false);
                btnDelete.setEnabled(false);
                btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/desactivar.png"))); 
            }else {
                counter1 --; 
            }
            //setTitle(String.format("Empleado %s de %s", counterRow,sqlRows));
        }
        temp = false;
        counterRow = 0;
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        counterRow = 0;
        setTitle("Client Management");
        Eliminar();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        setTitle("Client Management");
        counter++;
        
        if (counter % 2 == 0) {
            btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.png")));
            btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mod.png")));
            counter1 = 0;
            Bloq();
            if (modify) {
                Modificar(User);
            }else {
                Agregar();
            }
            btnNext.setEnabled(true);
            btnLast.setEnabled(true);
            btnDelete.setEnabled(true);
            txtId.setText("Id");
            txtName.setText("Username");
            txtLastname.setText("Password");
            txtAddress.setText("Addres");
            txtPhone.setText("Phone");
            txtDocument.setText("Document");
            lblFoto.setIcon(null);
            counterRow = 0;

        }else {            
            Desbloq();
            spEdad.setValue(0);
            btnsGender.clearSelection();
            counter1++;
            btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/desactivar.png"))); 
            btnNext.setEnabled(false);
            btnPrevius.setEnabled(false);
            btnFirst.setEnabled(false);
            btnLast.setEnabled(false);
            btnDelete.setEnabled(false);
            txtId.setText("");
            txtName.setText("");
            txtLastname.setText("");
            txtAddress.setText("");
            txtPhone.setText("");
            txtDocument.setText("");
            lblFoto.setIcon(null);
            btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png")));         
        }
        
        modify = false;
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        counterRow = 0;
        this.dispose();
        new ShowClients().setVisible(true);
        
    }//GEN-LAST:event_btnSearchActionPerformed

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
        counterRow = 0;
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        JOptionPane.showMessageDialog(null, "This Option is not available for the moment");
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btn_fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fotoActionPerformed

        ruta = "";
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JGP , PNG , JPEG", "jpg","png","jpeg");
        jf.setFileFilter(filtro);
        jf.setMultiSelectionEnabled(false);

        int respuesta = jf.showOpenDialog(this);

        if (respuesta == JFileChooser.APPROVE_OPTION) {
            ruta = jf.getSelectedFile().getPath();
            Path = ruta.replace("\\", "/");
            
            Image foto = new ImageIcon(ruta).getImage();
            ImageIcon icono = new ImageIcon(foto.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH));
            lblFoto.setIcon(icono);
        }
    }//GEN-LAST:event_btn_fotoActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        if (m.isSelected()) {
            JOptionPane.showMessageDialog(null, "Masculino");
        }
    }//GEN-LAST:event_mActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        if (f.isSelected()) {
            JOptionPane.showMessageDialog(null, "Femenino");
        }
    }//GEN-LAST:event_fActionPerformed

    public void Agregar(){
    
        String document = txtDocument.getText();
        String name = txtName.getText();
        String lastname = txtLastname.getText();
        String gender;
        if (m.isSelected()) {
                gender = "Masculino";
            } else if (f.isSelected()) {
                gender = "Femenino";
            } else {
                gender = "No se selecciono";
            }
        String age = spEdad.getValue().toString();
        String address = txtAddress.getText();
        String phone = txtPhone.getText();
        
        try {
            if (document.equals("") || name.equals("") || lastname.equals("") || gender.equals("No se selecciono") || age.equals("0") || address.equals("") || phone.equals("") || lblFoto.getIcon() == null) {
                JOptionPane.showMessageDialog(null, "Missing data to be entered");
                setTitle("Client Management");
                counterRow = 0;
            }else {
                String sql = "insert into client(Document,Name,Lastname,Gender,Age,Address,Phone,RutaImg) values ('"+document+"','"+name+"','"+lastname+"','"+gender+"','"+age+"','"+address+"','"+phone+"','"+Path+"' )";
                conect = DBConexion.Conectar();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "New Client SignUp Succesfully");
                JOptionPane.showMessageDialog(null, "The window will close to save the changes");
                this.dispose();
            }
            
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "This Client already Exist");
        }
    }
    
    public void PonerDatos(String sql){
        
        Object[] employee = new Object[9];
        
        try {
            conect = DBConexion.Conectar();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                employee[0] = rs.getInt("Id");
                employee[1] = rs.getString("Document");
                employee[2] = rs.getString("Name");
                employee[3] = rs.getString("Lastname");
                employee[4] = rs.getString("Gender");
                employee[5] = rs.getInt("Age");
                employee[6] = rs.getString("Address");
                employee[7] = rs.getString("Phone");
                employee[8] = rs.getString("RutaImg");
            }
        } catch (SQLException e) {
        }
        
        if (employee[0] == null) {
            JOptionPane.showMessageDialog(null, "This Client doesnt Exist");
            temp = false;
        }else{
            txtId.setText(employee[0].toString());
            txtDocument.setText(employee[1].toString());
            txtName.setText(employee[2].toString());
            txtLastname.setText(employee[3].toString());
            if (employee[4].toString().equals("Femenino")) {
                f.setSelected(true);
            }else{
                m.setSelected(true);
            }
            spEdad.setValue(employee[5]);
            txtAddress.setText(employee[6].toString());
            txtPhone.setText(employee[7].toString());
            Image foto = new ImageIcon(employee[8].toString()).getImage();
            ImageIcon icono = new ImageIcon(foto.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH));
            lblFoto.setIcon(icono);
            Path = employee[8].toString();
            temp = true;
        }
    }

    public void Modificar(String User){
    
        String document = txtDocument.getText();
        String name = txtName.getText();
        String lastname = txtLastname.getText();
        String gender;
        if (m.isSelected()) {
                gender = "Masculino";
            } else if (f.isSelected()) {
                gender = "Femenino";
            } else {
                gender = "No se selecciono";
            }
        String age = spEdad.getValue().toString();
        String address = txtAddress.getText();
        String phone = txtPhone.getText();
       
        try {
            if (document.equals("") || name.equals("") || lastname.equals("") || gender.equals("No se selecciono") || age.equals("0") || address.equals("") || phone.equals("") || lblFoto.getIcon() == null) {
                JOptionPane.showMessageDialog(null, "Missing data to be entered");
            }else {
                String sql = "update client set Document = '"+document+"', Name = '"+name+"', Lastname = '"+lastname+"',Gender = '"+gender+"',Age = '"+age+"',Address = '"+address+"',Phone = '"+phone+"', RutaImg = '"+Path+"' where Document = " + User + ";";                                            
                conect = DBConexion.Conectar();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "The Employee Modify Succesfully");
            }
            
        } catch (SQLException e) {
        }
    }
    
    public void Eliminar(){
        
        String User = JOptionPane.showInputDialog("Enter the Name that you want to Delete");
        repetido(User);
        
        if (!repetido) {
            JOptionPane.showMessageDialog(null, "This client doesnt Exist");
            counterRow = 0;
        }else {
            try {
                if (User.equals("")) {
                    JOptionPane.showMessageDialog(null, "Missing data to be entered");
                }else {
                    String sql = "delete from client where Name = " + '"' + User + '"' + ";";                                            
                    conect = DBConexion.Conectar();
                    st = conect.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "The Client has been Deleted");
                    JOptionPane.showMessageDialog(null, "The window will close to save the changes");
                    this.dispose();
                }   
            } catch (Exception e) {
            }
        }
        counterRow = 0;
    }
    
    void repetido(String User){
        
        String Users;
        repetido = false;
        
        try {
            String sql = "Select Name from client;";
            conect = DBConexion.Conectar();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                Users = rs.getString("Name");
                if (Users.equals(User)) {
                    repetido = true;
                }
            }
        } catch (SQLException e) {
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevius;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btn_foto;
    private javax.swing.ButtonGroup btnsGender;
    private javax.swing.JRadioButton f;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JRadioButton m;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JPanel pnlTools;
    private javax.swing.JPanel pnl_fnEspeciales;
    private javax.swing.JPanel pnl_foto;
    private javax.swing.JPanel pnl_genero;
    private javax.swing.JPanel pnl_mtto2;
    private javax.swing.JPanel pnl_nav;
    private javax.swing.JSpinner spEdad;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDocument;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
