/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splashscreen;

import java.awt.Color;
import javax.swing.JDialog;

/**
 *
 * @author RAVEN
 */
public class SplashScreen extends javax.swing.JDialog {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ShadowLabelUI labelUI = new ShadowLabelUI(Color.BLACK, 2, 3);
      lbStatus.setUI(labelUI);
        //  To disable key Alt+F4 to close dialog
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        pro = new splashscreen.ProgressBarCustom();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbStatus.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(255, 255, 0));
        lbStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStatus.setText("ĐANG KHỞI ĐỘNG ...");
        getContentPane().add(lbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 410, -1));

        pro.setBackground(new java.awt.Color(255, 105, 105));
        pro.setBorder(null);
        pro.setForeground(new java.awt.Color(102, 255, 255));
        pro.setMaximum(50);
        getContentPane().add(pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 800, 30));

        jLabel1.setBackground(new java.awt.Color(60, 45, 81));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/HD-wallpaper-anime-girl-grocery-store-meme-8k-anime-girl-anime-artist-artwork-digital-art.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    doTask("ĐANG TẢI ...", 10);
                    doTask("VUI LÒNG ĐỢI ...", 20);
                    doTask("VUI LÒNG ĐỢI ...", 30);
                    doTask("VUI LÒNG ĐỢI ...", 40);
                    doTask("VUI LÒNG ĐỢI ...", 50);
                    doTask("ĐANG KHỞI ĐỘNG ...", 50);
                    dispose();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }//GEN-LAST:event_formWindowOpened

    private void doTask(String taskName, int progress) throws Exception {
        lbStatus.setText(taskName);
        Thread.sleep(1000); 
        pro.setValue(progress);
    }

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SplashScreen dialog = new SplashScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbStatus;
    private splashscreen.ProgressBarCustom pro;
    // End of variables declaration//GEN-END:variables
}
