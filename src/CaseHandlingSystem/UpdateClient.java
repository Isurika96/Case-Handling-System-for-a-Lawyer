/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseHandlingSystem;

/**
 *
 * @author Isurika
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class UpdateClient extends javax.swing.JFrame {

    /**
     * Creates new form UpdateClient
     */
    public UpdateClient() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        secname = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        age = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        clientid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1016, 734));
        setPreferredSize(new java.awt.Dimension(1016, 734));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 150, 99, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Second Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 210, 115, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NIC");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 270, 65, 22);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 320, 85, 22);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 380, 73, 22);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Age");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(90, 440, 55, 22);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Phone Number");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(80, 500, 117, 22);

        fname.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(fname);
        fname.setBounds(250, 150, 250, 30);

        secname.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(secname);
        secname.setBounds(250, 210, 250, 30);

        nic.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(nic);
        nic.setBounds(250, 270, 250, 30);

        address.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(address);
        address.setBounds(250, 320, 250, 30);

        male.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");
        jPanel1.add(male);
        male.setBounds(250, 370, 80, 30);

        female.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        jPanel1.add(female);
        female.setBounds(410, 370, 81, 31);

        age.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(age);
        age.setBounds(250, 430, 80, 30);

        phone.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(phone);
        phone.setBounds(250, 500, 240, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(840, 210, 110, 40);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(700, 210, 110, 40);

        clientid.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        clientid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientidActionPerformed(evt);
            }
        });
        jPanel1.add(clientid);
        clientid.setBounds(700, 150, 250, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Client Id");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(580, 150, 102, 22);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(820, 60, 100, 40);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(390, 620, 100, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/p12.jpg"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 0, 1000, 700);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PreparedStatement pst=null;
        int count=0;
        String ci = clientid.getText();
         
        if(ci.equals("")){
        JOptionPane.showMessageDialog(this, "Select any client for update!");
         clientid.setText("");
        }else{
        count++;
        int p =JOptionPane.showConfirmDialog(null, "Doyou realy want to update this client");
        if(p==0){
        
        String nm=fname.getText();
        if(nm.equals("")){
        JOptionPane.showMessageDialog(this, "Please Enter First Name!");
        fname.setText("");
        }else{
        count++;
        }
        String secnm=secname.getText();
        if(secnm.equals("")){
        JOptionPane.showMessageDialog(this, "Please Enter Second Name!");
        secname.setText("");
        }else{
        count++;
        }
        
        String nicn=nic.getText();
        if(nicn.equals("")){
        JOptionPane.showMessageDialog(this, "Please Enter NIC!");
        nic.setText("");
        }else{
        count++;
        }
        String addn=address.getText();
        if(addn.equals("")){
        JOptionPane.showMessageDialog(this, "Please Enter Address!");
        address.setText("");
        }else{
        count++;
        }
       String gn = null;
       if(male.isSelected()){
        gn="Male";
        count++;
    }
        else if(female.isSelected()){
        gn ="Female";
        count++;
    }
        else{
         JOptionPane.showMessageDialog(this,"Select the Gender");
        }
        String agen=age.getText();
       if(agen.equals("")){
        JOptionPane.showMessageDialog(this, "Please Enter Age!");
       nic.setText("");
        }else{
            count++;
        }
        String tel=phone.getText();
        if(tel.length()<9){
            
        JOptionPane.showMessageDialog(this, "Telephone number is incorrect");
            
        phone.setText("");
        tel=null;
        }else{
            tel=phone.getText();
            count++;
        }
       
     
        
        
        String query= "UPDATE addclient SET FirstName=? ,SecondName=? ,NIC=? ,Age=? ,Phone=? ,Address=? ,Gender=? WHERE ClientID="+ci;
       
       
        if(count==8){
        try {
            
            pst=db.con().prepareStatement(query);
            pst.setString(1, nm);
            pst.setString(2, secnm);
            pst.setString(3, nicn);
            pst.setString(4, agen);
            pst.setString(5, tel);
            pst.setString(6, addn);
            pst.setString(7, gn);
           
            
            
            
            pst.execute();
           
            fname.setText("");
            secname.setText("");
            nic.setText("");
            phone.setText("");
            address.setText("");
           age.setText("");
           
            
        } catch (SQLException ex) {
            Logger.getLogger(UpdateClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Customer not found!");
        }
     
         finally {
            try {
                pst.close();
                JOptionPane.showMessageDialog(this, "Customer details updated successfully");
            } catch (SQLException ex) {
                Logger.getLogger(UpdateClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
       
        }
        }
        }
             



 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PreparedStatement pst=null;
        ResultSet rst=null;
        String sc=clientid.getText();
        
        String query="SELECT * FROM AddClient WHERE ClientID=?";
           
        try{
         pst=db.con().prepareStatement(query);
            pst.setString(1, sc);
           rst=pst.executeQuery();
           if(rst.next()){
          
        
        
          
          fname.setText(rst.getString("FirstName"));
          secname.setText(rst.getString("SecondName"));
          nic.setText(rst.getString("NIC"));
          age.setText(rst.getString("Age"));
          phone.setText(rst.getString("Phone"));
          address.setText(rst.getString("Address"));
          String gender  =rst.getString("Gender");
          if(gender.equals("Male"))
          {
              male.setSelected(true );
          }else
          {
              female.setSelected(true);
          }
         
          
           }  else { 
          JOptionPane.showMessageDialog(this, "Client not found!");
          clientid.setText("");
          fname.setText("");
          secname.setText("");
          nic.setText("");
          age.setText("");
          phone.setText("");
          address.setText("");
           }
            
        }catch (SQLException ex) {
            
            clientid.setText("");
        }catch(NullPointerException e){
            clientid.setText("");
        }
    
       finally{
            try {
                pst.close();
                rst.close();
            } catch (SQLException ex) {
                Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }  
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         clientid.setText("");
            fname.setText("");
            secname.setText("");
            nic.setText("");
            address.setText("");
            String gn = null;
            //gn.getSelected(null);
            age.setText(""); 
            phone.setText("");
            
    }//GEN-LAST:event_jButton4ActionPerformed

    private void clientidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientidActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField clientid;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField nic;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField secname;
    // End of variables declaration//GEN-END:variables
}
