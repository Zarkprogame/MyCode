/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author zarkprogame
 */
public class Splash extends javax.swing.JFrame {
    
    public static Splash sp;
    
    public Splash() {
        initComponents();
        Bar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        pnlBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pbLoading = new javax.swing.JProgressBar();
        lblLoading = new javax.swing.JLabel();
        lblLoadingValue = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlBackground.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 1, 40)); // NOI18N
        jLabel1.setText("MINIMARKET");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/workers.png"))); // NOI18N

        pbLoading.setBorder(null);

        lblLoading.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLoading.setForeground(new java.awt.Color(255, 255, 255));
        lblLoading.setText("Loading ...");

        lblLoadingValue.setBackground(new java.awt.Color(255, 255, 255));
        lblLoadingValue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLoadingValue.setForeground(new java.awt.Color(255, 255, 255));
        lblLoadingValue.setText("0 %");

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pbLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLoading)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 463, Short.MAX_VALUE)
                        .addComponent(lblLoadingValue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel1))
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLoadingValue)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void Bar(){
        
        Thread hilos = new Thread(){
                    @Override
                    public void run(){
                        for (int i = 0; i <= 100; i++) {
                            try {
                                Thread.sleep(30);
                                lblLoadingValue.setText(i + "%");
                
                                if (i==10) {
                                    lblLoading.setText("Turning On Modules...");
                                }
                                if (i==20) {
                                    lblLoading.setText("Loading Modules...");
                                }
                                if (i==40) {
                                    lblLoading.setText("Connecting to Database...");
                                }
                                if (i==60) {
                                    lblLoading.setText("Connection Succesful !");
                                }
                                if (i==80) {
                                    lblLoading.setText("Launching Application...");
                                }
                                pbLoading.setValue(i);
                                
                                if (pbLoading.getValue() == 100) {
                                    dispose();
                                    new MdiMain().setVisible(true);
                                }
                            } catch (Exception ex) {
                            }
                        }
                    }
                };
                hilos.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel lblLoading;
    public static javax.swing.JLabel lblLoadingValue;
    public static javax.swing.JProgressBar pbLoading;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables
}
