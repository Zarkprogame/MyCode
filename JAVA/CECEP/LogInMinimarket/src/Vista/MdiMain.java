package Vista;

import Vista.Clients.ClientForm;
import Vista.Employee.EmployeeForm;
import java.awt.Dimension;

public class MdiMain extends javax.swing.JFrame {
    
    public static EmployeeForm User = null;
    public static ClientForm client = null;
    
    public MdiMain() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setResizable(false);
        setTitle("MINIMARKET");
        if (LogIn.activeEmployee.equals("Employee")) {
            Employeed.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        AdminMenu = new javax.swing.JMenu();
        Employeed = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        ClientMenu = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();

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

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        AdminMenu.add(exitMenuItem);

        menuBar.add(AdminMenu);

        editMenu.setMnemonic('t');
        editMenu.setText("Tables");

        ClientMenu.setMnemonic('c');
        ClientMenu.setText("Clients");
        ClientMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientMenuActionPerformed(evt);
            }
        });
        editMenu.add(ClientMenu);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Products");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Company");
        pasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Cash");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

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
        EmployeeForm.counterRow = 0;
        dispose();
        User = null;
        new SplashOut().setVisible(true);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void ClientMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientMenuActionPerformed
        
        if (User != null) {
            User.dispose();
        }
        
        if (client == null || client.isClosed()) {
                client = new ClientForm();
                MdiMain.desktopPane.add(client);
                Dimension desktopSize = desktopPane.getSize();
                Dimension FrameSize = client.getSize();
                client.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        }
        client.setVisible(true);  
    }//GEN-LAST:event_ClientMenuActionPerformed

    private void pasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasteMenuItemActionPerformed

    private void EmployeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeedActionPerformed
        
        if (client != null) {
            client.dispose();
        }
        
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

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyMenuItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AdminMenu;
    private javax.swing.JMenuItem ClientMenu;
    public static javax.swing.JMenuItem Employeed;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables

}
