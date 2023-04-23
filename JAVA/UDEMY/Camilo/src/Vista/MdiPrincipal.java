package Vista;

import javax.swing.JOptionPane;

public class MdiPrincipal extends javax.swing.JFrame {

    private ClienteForm cliente = null;
    public static int cant_users;
    
    public MdiPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(700,600);
        setResizable(false);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        clienteMenuItem = new javax.swing.JMenuItem();
        productosMenuItem = new javax.swing.JMenuItem();
        empresaMenuItem = new javax.swing.JMenuItem();
        cajaMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('e');
        fileMenu.setText("Entidades");

        clienteMenuItem.setMnemonic('c');
        clienteMenuItem.setText("Clientes");
        clienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(clienteMenuItem);

        productosMenuItem.setMnemonic('p');
        productosMenuItem.setText("Productos");
        fileMenu.add(productosMenuItem);

        empresaMenuItem.setMnemonic('e');
        empresaMenuItem.setText("Empresa");
        empresaMenuItem.setToolTipText("");
        fileMenu.add(empresaMenuItem);

        cajaMenuItem.setMnemonic('j');
        cajaMenuItem.setText("Caja");
        cajaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(cajaMenuItem);

        menuBar.add(fileMenu);

        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cajaMenuItemActionPerformed

    private void clienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteMenuItemActionPerformed
        
        try {
            
            String users = JOptionPane.showInputDialog("Digite Cantidad de Registros:");
            cant_users = Integer.parseInt(users);
            setTitle("Entidad Cliente");
            
            if (cant_users == 0) {
                JOptionPane.showMessageDialog(null, "No se Pueden Agregar 0 Registros");
                dispose();
                
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new logIn().setVisible(true); 
                    }
                });
                
            }
            
            if (cliente == null || cliente.isClosed()) {
                cliente = new ClienteForm();
                this.desktopPane.add(cliente);
            }
            
            cliente.setVisible(true);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Se requiere de un Numero. Error: " + e);
        }
        
        
        
    }//GEN-LAST:event_clienteMenuItemActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MdiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MdiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MdiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MdiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem cajaMenuItem;
    private javax.swing.JMenuItem clienteMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem empresaMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem productosMenuItem;
    // End of variables declaration//GEN-END:variables

}
