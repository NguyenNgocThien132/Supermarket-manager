/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package JPN;


import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import splashscreen.ShadowLabelUI;


/**
 *
 * @author NGUYEN THANH THIEN
 */
public class jpnTrangChu extends javax.swing.JPanel {

    /**
     * Creates new form jpnTrangChu
     */
    public jpnTrangChu() throws IOException {
        initComponents();
        ShadowLabelUI labelUI = new ShadowLabelUI(Color.BLACK, -2, 2);
        jLabel10.setUI(labelUI);
        jLabel11.setUI(labelUI);
       
        aduvip();
        anime();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jpbVideo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jpntt1 = new javax.swing.JPanel();
        jlbtt1 = new javax.swing.JLabel();
        jpntt2 = new javax.swing.JPanel();
        jlbtt2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/kimetsu-no-yaiba-movie-demon-slayer-1_43.jpeg"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        setBackground(new java.awt.Color(60, 45, 81));
        setPreferredSize(new java.awt.Dimension(963, 751));
        setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconButtom/icons8-whatsapp-50.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        add(jLabel6);
        jLabel6.setBounds(910, 10, 50, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconButtom/icons8-instagram-50.png"))); // NOI18N
        jLabel7.setText("jLabel6");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        add(jLabel7);
        jLabel7.setBounds(860, 10, 50, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconButtom/icons8-facebook-circled-50.png"))); // NOI18N
        jLabel8.setText("jLabel6");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        add(jLabel8);
        jLabel8.setBounds(810, 10, 50, 40);

        jpbVideo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jpbVideo.setForeground(new java.awt.Color(255, 255, 51));
        jpbVideo.setText("Xem Anime Online");
        jpbVideo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpbVideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpbVideoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpbVideoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpbVideoMouseExited(evt);
            }
        });
        add(jpbVideo);
        jpbVideo.setBounds(660, 200, 230, 32);

        jLabel11.setFont(new java.awt.Font("Cascadia Mono", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(97, 250, 250));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Công Nghệ Java - Rose");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel11);
        jLabel11.setBounds(220, 610, 620, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PHẦN_MỀM_ĐƯỢC_THỰC_HIỆN_BỞI_NHÓM_9-removebg-preview.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel2);
        jLabel2.setBounds(20, 640, 1090, 140);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PHẦN_MỀM-removebg-preview.png"))); // NOI18N
        jLabel16.setText("jLabel16");
        add(jLabel16);
        jLabel16.setBounds(0, 0, 960, 200);

        jpntt1.setBackground(new java.awt.Color(0, 0, 255));
        jpntt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 1, true));
        jpntt1.setForeground(new java.awt.Color(0, 239, 252));
        jpntt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpntt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpntt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpntt1MouseExited(evt);
            }
        });

        jlbtt1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbtt1.setForeground(new java.awt.Color(255, 255, 255));
        jlbtt1.setText(">XEM CHI TIẾT<");
        jlbtt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbtt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbtt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbtt1MouseExited(evt);
            }
        });
        jpntt1.add(jlbtt1);

        add(jpntt1);
        jpntt1.setBounds(300, 450, 110, 30);

        jpntt2.setBackground(new java.awt.Color(0, 0, 255));
        jpntt2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 1, true));
        jpntt2.setForeground(new java.awt.Color(0, 239, 252));
        jpntt2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpntt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpntt2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpntt2MouseExited(evt);
            }
        });

        jlbtt2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbtt2.setForeground(new java.awt.Color(255, 255, 255));
        jlbtt2.setText(">XEM CHI TIẾT<");
        jlbtt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbtt2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbtt2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbtt2MouseExited(evt);
            }
        });
        jpntt2.add(jlbtt2);

        add(jpntt2);
        jpntt2.setBounds(300, 550, 110, 28);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ADMIN-removebg-preview.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 410, 320, 180);

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 255, 255));
        jLabel10.setText("Admin");
        add(jLabel10);
        jLabel10.setBounds(110, 370, 180, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1000000.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1250, 676);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/anh-dong-dep-86_114435583.gif"))); // NOI18N
        add(jLabel15);
        jLabel15.setBounds(880, 0, 137, 260);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(new URI("http://www.facebook.com/"));  
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
         Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(new URI("https://www.instagram.com/"));  
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
         Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(new URI("https://web.whatsapp.com/"));  
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jpbVideoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpbVideoMouseClicked
//        try {
//            
//            // TODO add your handling code here:
//            File file = new File("src/Video_Home/KNY_Demo.mp4");
//            String absolutePath = file.getAbsolutePath();
//            Desktop.getDesktop().open(new File(absolutePath));
//        } catch (IOException ex) {
//            Logger.getLogger(jpnTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//        }
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(new URI("https://animevietsub.im/"));
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jpbVideoMouseClicked

    private void jpbVideoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpbVideoMouseEntered
        // TODO add your handling code here:
        jpbVideo.setForeground(new Color(255,0,204));
    }//GEN-LAST:event_jpbVideoMouseEntered

    private void jpbVideoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpbVideoMouseExited
        // TODO add your handling code here:
        jpbVideo.setForeground(new Color(255,255,51));
    }//GEN-LAST:event_jpbVideoMouseExited

    private void jlbtt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbtt1MouseEntered
        // TODO add your handling code here:
        jlbtt1.setForeground(new Color(255,255,0));
        jpntt1.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_jlbtt1MouseEntered

    private void jlbtt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbtt1MouseExited
        // TODO add your handling code here:
        jlbtt1.setForeground(new Color(255,255,255));
        jpntt1.setBackground(new Color(0,0,255));
    }//GEN-LAST:event_jlbtt1MouseExited

    private void jlbtt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbtt2MouseEntered
        // TODO add your handling code here:
        jlbtt2.setForeground(new Color(255,255,0));
        jpntt2.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_jlbtt2MouseEntered

    private void jlbtt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbtt2MouseExited
        // TODO add your handling code here:
        jlbtt2.setForeground(new Color(255,255,255));
        jpntt2.setBackground(new Color(0,0,255));
    }//GEN-LAST:event_jlbtt2MouseExited

    private void jpntt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpntt1MouseEntered
        // TODO add your handling code here:
        jpntt1.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_jpntt1MouseEntered

    private void jpntt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpntt1MouseExited
        // TODO add your handling code here:
        jpntt1.setBackground(new Color(0,0,255));
    }//GEN-LAST:event_jpntt1MouseExited

    private void jpntt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpntt2MouseEntered
        // TODO add your handling code here:
        jpntt2.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_jpntt2MouseEntered

    private void jpntt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpntt2MouseExited
        // TODO add your handling code here:
        jpntt2.setBackground(new Color(0,0,255));
    }//GEN-LAST:event_jpntt2MouseExited

    private void jlbtt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbtt1MouseClicked
        // TODO add your handling code here:
         Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(new URI("https://nguyenngocthien132.github.io/PofolioMidrain/?fbclid=IwAR2TIiV3OlBMhn_n3yHvpF71y0-57uCFHNbIA5EtC9W3B-oxlTCeI6iuAZk"));  
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jlbtt1MouseClicked

    private void jlbtt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbtt2MouseClicked
        // TODO add your handling code here:
         Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(new URI("https://thanhthien13072002.github.io/Profile/"));  
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jlbtt2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlbtt1;
    private javax.swing.JLabel jlbtt2;
    private javax.swing.JLabel jpbVideo;
    private javax.swing.JPanel jpntt1;
    private javax.swing.JPanel jpntt2;
    // End of variables declaration//GEN-END:variables

    private void aduvip() {
        final int MAX_X = 950;
        final int MAX_Y = 50;

        Thread animation = new Thread(new Runnable() {
            @Override
            public void run() {
               
                int x = 20;
                int y = 640;
                
          
                
                boolean check = true;
                
                while (true) {
                    if (check) {
                       
                        jLabel2.setLocation(x, y);

                        x += 10;
                       
                    }
                    else
                    {        
                        jLabel2.setLocation(x, y);
                       
                        x -= 10;
                       
                        
                    }
                    
                    if(x > MAX_X)
                    {
                        check = true;
                        x = -800;
                       
                    }
                    if(x < MAX_Y)
                    {
                        check = true;
                    }

                    try {
                        Thread.sleep(120);
                    } catch (Exception e) {
                    }
                }
            }

        });
        animation.start();
    }

    private void anime() {
         Thread animation = new Thread(new Runnable() {
            @Override
            public void run() { 
                
                
                int x = 20;
             
                 boolean check = true;
                while(true)
                {
                    if (check) {
                       
                        jpbVideo.setForeground(new Color(255,0,204));
                        
                        x+=10;
                    }
                    else
                    {
                          jpbVideo.setForeground(new Color(255,255,51));
                        x-=10;
                    }
                     if(x != 20)
                    {
                        check = false;
                       
                    }
                    if(x == 20)
                    {
                        check = true;
                    }
                    
                     try {
                        Thread.sleep(300);
                    } catch (Exception e) {
                    }
                }
            }

        });
        animation.start();
    }
}