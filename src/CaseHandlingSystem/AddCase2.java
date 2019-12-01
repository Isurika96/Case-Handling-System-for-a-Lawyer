/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseHandlingSystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Isurika
 */
public class AddCase2 extends javax.swing.JFrame {

    /**
     * Creates new form AddCase2
     */
    public AddCase2() {
        initComponents();
        combos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CaseDes = new javax.swing.JTextArea();
        jRadioButton2 = new javax.swing.JRadioButton();
        CaseNo = new javax.swing.JTextField();
        CaseId = new javax.swing.JTextField();
        ClientId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        courtno = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1016, 734));
        setPreferredSize(new java.awt.Dimension(1016, 734));

        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Court No");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 540, 74, 22);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(260, 610, 100, 40);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(420, 610, 100, 40);

        CaseDes.setColumns(20);
        CaseDes.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CaseDes.setRows(5);
        jScrollPane1.setViewportView(CaseDes);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(260, 380, 260, 140);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Call");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(410, 330, 110, 30);

        CaseNo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(CaseNo);
        CaseNo.setBounds(260, 280, 260, 30);

        CaseId.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(CaseId);
        CaseId.setBounds(260, 220, 260, 30);

        ClientId.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(ClientId);
        ClientId.setBounds(260, 160, 260, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Client Id");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 160, 97, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Case Id");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 220, 85, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Case No");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 280, 85, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Case Type");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 330, 80, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Case Description");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 380, 131, 22);

        dateChooserCombo1.setCalendarPreferredSize(new java.awt.Dimension(350, 250));
        dateChooserCombo1.setFormat(0);
        dateChooserCombo1.setWeekStyle(datechooser.view.WeekDaysStyle.FULL);
        dateChooserCombo1.setFieldFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 12));
        jPanel1.add(dateChooserCombo1);
        dateChooserCombo1.setBounds(690, 160, 230, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Case Date");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(680, 120, 92, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(830, 60, 100, 40);

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(2634, 610, 189, 56);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Trail");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(260, 330, 100, 30);

        courtno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        courtno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courtnoActionPerformed(evt);
            }
        });
        jPanel1.add(courtno);
        courtno.setBounds(260, 540, 260, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Status");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(690, 260, 60, 30);

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("New");
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(780, 280, 90, 31);

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Pending");
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(780, 330, 90, 31);

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("Closed");
        jPanel1.add(jRadioButton5);
        jRadioButton5.setBounds(780, 380, 90, 31);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/p7.jpg"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, -20, 1020, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void combos()
    {
        try {
            PreparedStatement ps = null;
            ResultSet rs=null;
            String query = "select CourtNo from court";
            ps= db.con().prepareStatement(query);
             rs=ps.executeQuery(query);
             while(rs.next())
             {
                 courtno.addItem(rs.getString("CourtNo"));
             }
        } catch (SQLException ex) {
            Logger.getLogger(AddCase2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ClientId.setText("");
        CaseId.setText("");
        CaseNo.setText("");
        CaseDes.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
         Calendar aDate = null;
          dateChooserCombo1.setCurrent(aDate);
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PreparedStatement ps = null;
        int c=0;
        String idcl = ClientId.getText();

        if(idcl.equals("")){
            JOptionPane.showMessageDialog(this, "Enter Client ID");
            ClientId.setText("");
        }
        else{
            c++;
        }
        String idcase = CaseId.getText();
        if(CaseId.equals("")){
            JOptionPane.showMessageDialog(this, "Enter Case ID");
            CaseId.setText("");
        }
        else{
            c++;

        }
        String caseno= CaseNo.getText();

        if(caseno.equals("")){
            JOptionPane.showMessageDialog(this, "Enter case Number");
            CaseNo.setText("");
        }
        else
        {
            c++;
        }
        String ctype = null;

        if(jRadioButton1.isSelected()){
            ctype="Trail";
            c++;
        }
        else if(jRadioButton2.isSelected()){
            ctype ="Call";
            c++;
        }
        else{
            JOptionPane.showMessageDialog(this,"Select the Case Type");
        }
         String cstatus = null;

    if(jRadioButton3.isSelected()){
        cstatus="New";
        c++;
    }
    else if(jRadioButton4.isSelected()){
        cstatus ="Pending";
        c++;
    }else if(jRadioButton5.isSelected()){
        cstatus ="Finish";
        c++;
    }
    else{
    JOptionPane.showMessageDialog(this,"Select the Case Status");
    }

        String casedes = CaseDes.getText();
        if(casedes.equals(""))
        {JOptionPane.showMessageDialog(this, "Enter Description of this case");
            CaseDes.setText("");
        }
        else {
            c++;
        }

//        String courtno = CourtNo.getText();
//        if(courtno.equals(""))
//        {JOptionPane.showMessageDialog(this, "Enter the Court Number");
//            CourtNo.setText("");
//        }
        

           String ts = new SimpleDateFormat("yyyy_MM_dd_HH:mm").format(dateChooserCombo1.getSelectedDate().getTime());

            

            if(c>5){

                //try {
                    String sg= "insert into AddCase(CaseID ,CaseNO ,CaseType,CaseDes,CaseDate,ClientID,CourtNo,Evidence, Status)"+"values(?,?,?,?,?,?,?,?,?)";
                    try {
                        ps= db.con().prepareStatement(sg);
                        ps.setString(1, idcase);
                        ps.setString(2, caseno);
                        ps.setString(3, ctype);
                        ps.setString(4, casedes);
                        ps.setString(5, ts);
                        ps.setString(6, idcl);
                        ps.setString(7,(String) courtno.getSelectedItem());
                        ps.setString(8,"");
                        ps.setString(9, cstatus);
                        ps.execute();
                        
                        JOptionPane.showMessageDialog(this, " Saved !");
                      } catch (SQLException ex) {

                JOptionPane.showMessageDialog(this, "Clientid does not exists\nOR\nCaseID already exists !");
            }

                    
                finally{
                    try {
                        ps.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(AddCase.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ClerkPortal ac= new ClerkPortal();
        ac.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void courtnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courtnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courtnoActionPerformed

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
            java.util.logging.Logger.getLogger(AddCase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCase2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CaseDes;
    private javax.swing.JTextField CaseId;
    private javax.swing.JTextField CaseNo;
    private javax.swing.JTextField ClientId;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> courtno;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}