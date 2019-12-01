/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseHandlingSystem;

import java.sql.PreparedStatement;
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
public class AddClient2 extends javax.swing.JFrame {

    /**
     * Creates new form AddClient2
     */
    public AddClient2() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        id = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        secname = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        age = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1016, 734));
        setPreferredSize(new java.awt.Dimension(1016, 734));
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(1016, 734));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(830, 60, 100, 40);

        dateChooserCombo1.setCalendarPreferredSize(new java.awt.Dimension(350, 250));
        dateChooserCombo1.setFormat(0);
        dateChooserCombo1.setWeekStyle(datechooser.view.WeekDaysStyle.FULL);
        dateChooserCombo1.setFieldFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 12));
        jPanel1.add(dateChooserCombo1);
        dateChooserCombo1.setBounds(580, 190, 200, 30);

        id.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(id);
        id.setBounds(250, 150, 250, 30);

        fname.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname);
        fname.setBounds(250, 210, 250, 30);

        secname.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(secname);
        secname.setBounds(250, 270, 250, 30);

        nic.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(nic);
        nic.setBounds(250, 330, 250, 30);

        address.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(address);
        address.setBounds(250, 380, 250, 30);

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(260, 440, 90, 31);

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Female");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(410, 440, 100, 30);

        age.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(age);
        age.setBounds(250, 490, 90, 30);

        phone.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(phone);
        phone.setBounds(250, 540, 250, 30);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Next");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(830, 610, 100, 40);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(400, 610, 100, 40);

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
        jButton3.setBounds(250, 610, 100, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Phone Number");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(90, 550, 117, 22);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Age");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 490, 71, 22);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 440, 80, 22);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(90, 390, 120, 22);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NIC");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(90, 340, 50, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Second Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 270, 106, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 210, 85, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Client ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 150, 72, 22);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registered Date");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(580, 150, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/p6.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 700);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1016, 734);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ClerkPortal ac= new ClerkPortal();
        ac.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      if(x !=0){
        AddCase2 ac2= new AddCase2();
        ac2.setVisible(true);
        this.setVisible(false); 
      }else{
            JOptionPane.showMessageDialog(this, "Please save Client DEtails!");
        }

    }//GEN-LAST:event_jButton4ActionPerformed
      int x=0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        x++;
        PreparedStatement ps = null;
        int c=0;
        String idc = id.getText();

        if(idc.equals("")){
            JOptionPane.showMessageDialog(this, "Enter Client ID");
            id.setText("");
        }
        else{
            c++;
        }
        String fnamec = fname.getText();
        if(fnamec.equals("")){
            JOptionPane.showMessageDialog(this, "Enter First Name");
            fname.setText("");
        }
        else{
            c++;

        }
        String secnamec= secname.getText();

        if(secnamec.equals("")){
            JOptionPane.showMessageDialog(this, "Enter Second Name");
            secname.setText("");
        }
        else
        {
            c++;
        }
        String nicc= nic.getText();

        if(nicc.length()>10||nicc==null){
            JOptionPane.showMessageDialog(this, "Enter Valied NIC");
            nic.setText("");}
        else{
            c++;
        }

        String addressc = address.getText();
        if(addressc.equals(""))
        {JOptionPane.showMessageDialog(this, "Enter Address");
            address.setText("");
        }
        else {
            c++;
        }
        String gn = null;

        if(jRadioButton1.isSelected()){
            gn="Male";
            c++;
        }
        else if(jRadioButton2.isSelected()){
            gn ="Female";
            c++;
        }
        else{
            JOptionPane.showMessageDialog(this,"Select the Gender");
        }

        String agec = age.getText();
        if(agec.equals("")){
            JOptionPane.showMessageDialog(this,"Enter Age");
            age.setText("");}
        else if(agec.length()>2){
            JOptionPane.showMessageDialog(this,"Enter Valied Age");
            age.setText("");

        }
        else{
            c++;
        }

        String phonec= phone.getText();
        if(phonec.equals("")||phonec.length()!=10)
        {

            JOptionPane.showMessageDialog(this,"Enter Valied Phone Number");
            phone.setText("");
        }
        else{
            c++;
        }
       String ts = new SimpleDateFormat("yyyy_MM_dd_HH:mm").format(dateChooserCombo1.getSelectedDate().getTime());

        if(c>7){
            String sg= "insert into AddClient values(?,?,?,?,?,?,?,?,?)";
            try {
                ps= db.con().prepareStatement(sg);
                ps.setString(1, idc);
                ps.setString(4, nicc);
                ps.setString(5, agec);
                ps.setString(8, gn);
                ps.setString(7, addressc);;
                ps.setString(2, fnamec);
                ps.setString(3, secnamec);
                ps.setString(6, phonec);
                ps.setString(9,ts);
                ps.execute();
                JOptionPane.showMessageDialog(this, " Saved !");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Client id already exists!");
                id.setText("");
            }
            finally{
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AddCase.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            //
            //                id.setText("");
            //                fname.setText("");
            //                secname.setText("");
            //               age.setText("");
            //              phone.setText("");
            //             address.setText("");
            //             nic.setText("");
            //
            //
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        id.setText("");
        fname.setText("");
        secname.setText("");
        nic.setText("");
        address.setText("");
        age.setText("");
        phone.setText("");
        buttonGroup1.clearSelection();
            Calendar aDate = null;
          dateChooserCombo1.setCurrent(aDate);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AddClient2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddClient2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddClient2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddClient2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddClient2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.ButtonGroup buttonGroup1;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JTextField nic;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField secname;
    // End of variables declaration//GEN-END:variables
}
