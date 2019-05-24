package Principal;

import Capture.RegisterPerson11;
import Recognizer.Recognizer;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu(String user) {
        initComponents();
        txt_title_menu.setText("Welcome, " + user);
    }

    private Menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        n_emp_image = new javax.swing.JLabel();
        n_emp_function = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txt_title_menu = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        n_emp_image1 = new javax.swing.JLabel();
        n_emp_function1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        n_emp_image2 = new javax.swing.JLabel();
        n_emp_function2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Security System - Menu");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Screenshot_6.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 370, 290));

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(104, 194, 98));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("This Application helps in ATTENDENCE system of department. Students can register their personal details having userID and password with captured faces. This application recognize the student's face and put PRESENT on that date.\n\nFaculty can also check the student's attendence datewise.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 380, 130));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n_emp_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n_emp_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_User_Male_50px.png"))); // NOI18N
        jPanel10.add(n_emp_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 100, 100));

        n_emp_function.setForeground(new java.awt.Color(113, 113, 113));
        n_emp_function.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n_emp_function.setText("Student's Panel");
        jPanel10.add(n_emp_function, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 170, -1));

        jButton4.setBackground(new java.awt.Color(200, 193, 92));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Data");
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setOpaque(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 120, 30));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 170, 170));

        txt_title_menu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_title_menu.setForeground(new java.awt.Color(104, 194, 98));
        txt_title_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_title_menu.setText("Welcome, user!");
        txt_title_menu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txt_title_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 410, -1));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n_emp_image1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n_emp_image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_User_Male_50px.png"))); // NOI18N
        jPanel11.add(n_emp_image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 100, 100));

        n_emp_function1.setForeground(new java.awt.Color(113, 113, 113));
        n_emp_function1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n_emp_function1.setText("You can register your face here");
        jPanel11.add(n_emp_function1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 170, -1));

        jButton5.setBackground(new java.awt.Color(92, 151, 200));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Capture");
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setOpaque(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 30));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 170, 170));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n_emp_image2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n_emp_image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_User_Male_50px.png"))); // NOI18N
        jPanel12.add(n_emp_image2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 100, 100));

        n_emp_function2.setForeground(new java.awt.Color(113, 113, 113));
        n_emp_function2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n_emp_function2.setText("Recognize the face from here");
        jPanel12.add(n_emp_function2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 170, -1));

        jButton6.setBackground(new java.awt.Color(93, 200, 119));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Recognize");
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setOpaque(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, 30));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 170, 170));

        jPanel3.setBackground(new java.awt.Color(93, 200, 119));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Close_Window_20px.png"))); // NOI18N
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 40, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("IT Attendence System");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 30));

        jPanel2.setBackground(new java.awt.Color(31, 65, 39));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("By  Department of Information Technology");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 820, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 520));

        setSize(new java.awt.Dimension(822, 517));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       new DataLogin().setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new RegisterPerson11().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        new Loading().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
           this.dispose();
           new Login().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel n_emp_function;
    private javax.swing.JLabel n_emp_function1;
    private javax.swing.JLabel n_emp_function2;
    private javax.swing.JLabel n_emp_image;
    private javax.swing.JLabel n_emp_image1;
    private javax.swing.JLabel n_emp_image2;
    private javax.swing.JLabel txt_title_menu;
    // End of variables declaration//GEN-END:variables
}
