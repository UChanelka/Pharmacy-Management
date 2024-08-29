
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Akesh Chathuranga
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    Connection  Con =null;
    Statement St     =null,St1=null;
    ResultSet Rs    =null,Rs1=null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        ups = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(169, 40, 144, 41);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("User Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(113, 124, 111, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(113, 181, 99, 25);
        jPanel1.add(uid);
        uid.setBounds(254, 124, 140, 30);
        jPanel1.add(ups);
        ups.setBounds(254, 181, 140, 30);

        jButton1.setBackground(new java.awt.Color(153, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.setMaximumSize(new java.awt.Dimension(79, 32));
        jButton1.setMinimumSize(new java.awt.Dimension(79, 32));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(260, 250, 100, 32);

        jButton2.setBackground(new java.awt.Color(153, 0, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(130, 250, 90, 32);

        jButton12.setBackground(new java.awt.Color(153, 0, 51));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton12.setText("X");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(456, 1, 23, 17);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled design0.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 490, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        String Query="select * from agenttb where A_name='"+uid.getText()+"'and A_pasw='"+ups.getText()+"'";
        try{
         Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy_m","root","");
        St=Con.createStatement();
        Rs=St.executeQuery(Query);
        if(Rs.next()){
        new manegemedi().setVisible(true);
        this.dispose();
        
        }
        else{
        JOptionPane.showMessageDialog(this,"wrong user id or password");
        }
        }
        catch(SQLException  e){
        e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField uid;
    private javax.swing.JTextField ups;
    // End of variables declaration//GEN-END:variables
}
