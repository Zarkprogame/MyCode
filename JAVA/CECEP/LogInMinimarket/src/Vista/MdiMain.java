package Vista;

import Vista.Clients.ClientForm;
import Vista.Company.CompanyForm;
import Vista.Employee.EmployeeForm;
import Vista.Invoice.BillForm;
import Vista.Products.ProductsForm;
import java.awt.Dimension;

public class MdiMain extends javax.swing.JFrame {
    
    public static EmployeeForm User = null;
    public static ClientForm client = null;
    public static ProductsForm product = null;
    public static CompanyForm company = null;
    public static BillForm bill = null;
    
    
    public MdiMain() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setResizable(false);
        setTitle("  Bienvenido  " + LogIn.Employee );
        if (LogIn.activeEmployee.equals("Employee")) {
            Employeed.setEnabled(false);
            Company.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        AdminMenu = new javax.swing.JMenu();
        Employeed = new javax.swing.JMenuItem();
        Company = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        TablesMenu = new javax.swing.JMenu();
        ClientMenu = new javax.swing.JMenuItem();
        ProductsMenu = new javax.swing.JMenuItem();
        InvoiceMenu = new javax.swing.JMenu();
        BillMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        AdminMenu.setMnemonic('m');
        AdminMenu.setText("Manage");

        Employeed.setMnemonic('e');
        Employeed.setText("Employees");
        Employeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeedActionPerformed(evt);
            }
        });
        AdminMenu.add(Employeed);

        Company.setMnemonic('c');
        Company.setText("Company");
        Company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyActionPerformed(evt);
            }
        });
        AdminMenu.add(Company);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        AdminMenu.add(exitMenuItem);

        menuBar.add(AdminMenu);

        TablesMenu.setMnemonic('t');
        TablesMenu.setText("Tables");

        ClientMenu.setMnemonic('c');
        ClientMenu.setText("Clients");
        ClientMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientMenuActionPerformed(evt);
            }
        });
        TablesMenu.add(ClientMenu);

        ProductsMenu.setMnemonic('p');
        ProductsMenu.setText("Products");
        ProductsMenu.setToolTipText("");
        ProductsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsMenuActionPerformed(evt);
            }
        });
        TablesMenu.add(ProductsMenu);

        menuBar.add(TablesMenu);

        InvoiceMenu.setMnemonic('i');
        InvoiceMenu.setText("Invoice");

        BillMenu.setMnemonic('b');
        BillMenu.setText("Bill");
        BillMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillMenuActionPerformed(evt);
            }
        });
        InvoiceMenu.add(BillMenu);

        menuBar.add(InvoiceMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        ClientForm.counterRow = 0;
        EmployeeForm.counterRow = 0;
        ProductsForm.counterRow = 0;
        User = null;
        client = null;
        product = null;
        dispose();
        new SplashOut().setVisible(true);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void ClientMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientMenuActionPerformed

        Unique();
        
        if (client == null || client.isClosed()) {
                client = new ClientForm();
                MdiMain.desktopPane.add(client);
                Dimension desktopSize = desktopPane.getSize();
                Dimension FrameSize = client.getSize();
                client.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        }
        client.setVisible(true);  
    }//GEN-LAST:event_ClientMenuActionPerformed

    private void EmployeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeedActionPerformed
        
        Unique();
        
        if (User == null || User.isClosed()) {
                //client.dispose();
                User = new EmployeeForm();
                MdiMain.desktopPane.add(User);
                Dimension desktopSize = desktopPane.getSize();
                Dimension FrameSize = User.getSize();
                User.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        }
        User.setVisible(true);    
    }//GEN-LAST:event_EmployeedActionPerformed

    private void ProductsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsMenuActionPerformed
        
        Unique();
        
        if (product == null || product.isClosed()) {
                //client.dispose();
                product = new ProductsForm();
                MdiMain.desktopPane.add(product);
                Dimension desktopSize = desktopPane.getSize();
                Dimension FrameSize = product.getSize();
                product.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        }
        product.setVisible(true); 
        
    }//GEN-LAST:event_ProductsMenuActionPerformed

    private void CompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyActionPerformed
        
        Unique();
        
        if (company == null || company.isClosed()) {
                //client.dispose();
                company = new CompanyForm();
                MdiMain.desktopPane.add(company);
                Dimension desktopSize = desktopPane.getSize();
                Dimension FrameSize = company.getSize();
                company.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        }
        company.setVisible(true); 
        
    }//GEN-LAST:event_CompanyActionPerformed

    private void BillMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillMenuActionPerformed
        Unique();
        
        if (bill == null || bill.isClosed()) {
                bill = new BillForm();
                MdiMain.desktopPane.add(bill);
                int alto = (int)desktopPane.getHeight();
                int ancho = (int)desktopPane.getWidth();
                bill.setSize(ancho, alto);
        }
        bill.setVisible(true);  
    }//GEN-LAST:event_BillMenuActionPerformed

    private void Unique(){
        
        ClientForm.counterRow = 0;
        EmployeeForm.counterRow = 0;
        ProductsForm.counterRow = 0;
        
        if (User != null) {
            User.dispose();
        }
        
        if (product != null) {
            product.dispose();
        }
        
        if (client != null) {
            client.dispose();
        }
        
        if (company != null) {
            company.dispose();
        }
        
        if (bill != null) {
            bill.dispose();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AdminMenu;
    private javax.swing.JMenuItem BillMenu;
    private javax.swing.JMenuItem ClientMenu;
    public static javax.swing.JMenuItem Company;
    public static javax.swing.JMenuItem Employeed;
    private javax.swing.JMenu InvoiceMenu;
    private javax.swing.JMenuItem ProductsMenu;
    private javax.swing.JMenu TablesMenu;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
