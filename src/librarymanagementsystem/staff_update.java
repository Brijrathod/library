/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagementsystem;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class staff_update extends javax.swing.JFrame {

    /**
     * Creates new form staff_update
     */
    public staff_update() {
        initComponents();
        getData();
    }

    private void getData() 
            
    {
            String qry="select * from staff";
                    
             try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
                        Statement st=con.createStatement();
                        
                        java.sql.ResultSet rs=st.executeQuery(qry);
                        
                        while(rs.next())
                        {
                            staffid.addItem(rs.getString("staff_id"));
                        }
                            
             }
             catch(Exception e)
             {
                  JOptionPane.showMessageDialog(null, e);
             }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        staff_name = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        copies = new javax.swing.JTextField();
        book_name = new javax.swing.JTextField();
        author_name = new javax.swing.JTextField();
        issue_date = new javax.swing.JTextField();
        return_date = new javax.swing.JTextField();
        staffid = new javax.swing.JComboBox<>();
        updatebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 86, 192)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 101, 192));
        jLabel1.setText("Update The Staff");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("STAFF ID ");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("NAME ");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("CONTACT NO");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("COPIES");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("BOOK NAME ");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("AUTHOR NAME ");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("DATE OF ISSUE ");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("RETURN DATE ");

        staff_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        contact.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });

        copies.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        book_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        author_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        author_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                author_nameActionPerformed(evt);
            }
        });

        issue_date.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        issue_date.setForeground(new java.awt.Color(153, 153, 153));
        issue_date.setText("DD-MM-YY");
        issue_date.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                issue_dateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                issue_dateFocusLost(evt);
            }
        });

        return_date.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        return_date.setForeground(new java.awt.Color(153, 153, 153));
        return_date.setText("DD-MM-YY");
        return_date.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                return_dateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                return_dateFocusLost(evt);
            }
        });
        return_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_dateActionPerformed(evt);
            }
        });

        staffid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        staffid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        staffid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffidActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(21, 86, 192));
        updatebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(21, 86, 192));
        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(staffid, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(staff_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(copies, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(72, 72, 72)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(issue_date, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(return_date, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(author_name, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 64, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(353, 353, 353)
                                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staff_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(author_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issue_date, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copies, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(return_date, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void author_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_author_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_author_nameActionPerformed

    private void return_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_return_dateActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_backbtnActionPerformed

    private void issue_dateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_issue_dateFocusGained
       
        if(issue_date.getText().equals("DD-MM-YY"))
        {
            issue_date.setText("");
            issue_date.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_issue_dateFocusGained

    private void issue_dateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_issue_dateFocusLost
        
        if(issue_date.getText().equals(""))
        {
            issue_date.setText("DD-MM-YY");
            issue_date.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_issue_dateFocusLost

    private void return_dateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_return_dateFocusGained
        
        if(return_date.getText().equals("DD-MM-YY"))
        {
            return_date.setText("");
            return_date.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_return_dateFocusGained

    private void return_dateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_return_dateFocusLost
        
        if(return_date.getText().equals(""))
        {
            return_date.setText("DD-MM-YY");
            return_date.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_return_dateFocusLost

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void staffidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffidActionPerformed
         String id=(String) staffid.getSelectedItem();
            
            String qry="select * from staff where staff_id='"+id+"'";
            
            try
            {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
                        Statement st=con.createStatement();
                        
                        java.sql.ResultSet rs=st.executeQuery(qry);
                        
                        if(rs.next())
                        {
                            staff_name.setText(rs.getString("Staff_name"));
                            
                            contact.setText(rs.getString("contact_no"));
                            //contact.setText(String.valueOf(Contact));
                            
                            int Copies=rs.getInt("copies");
                            copies.setText(String.valueOf(Copies));
                            
                            book_name.setText(rs.getString("book_name"));
                            author_name.setText(rs.getString("author_name"));
                            
                            issue_date.setText(rs.getString("date_of_issue"));
                            //issue_date.setText("Issue_date");
                            
                            return_date.setText(rs.getString("return_date"));
                            //return_date.setText("Return_date");
                            
                            
                        }
            }
            catch(Exception e)
            {
                    System.out.print(e.getMessage());
            }
    }//GEN-LAST:event_staffidActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        
        try
        {
            String qry = "update staff set staff_name='"+staff_name.getText()+"',contact_no='"+contact.getText()+"',book_name='"+book_name.getText()+"',author_name='"+author_name.getText()+"',copies='"+Integer.valueOf(copies.getText())+"',date_of_issue='"+issue_date.getText()+"',return_date='"+return_date.getText()+"' where staff_id='"+Integer.valueOf(staffid.getSelectedItem().toString())+"'";
            
             Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
                        Statement st=con.createStatement();
                        
                        int res= st.executeUpdate(qry);
                        JOptionPane.showMessageDialog(this,"Update Successfully");
                        
                       
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_updatebtnActionPerformed

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
            java.util.logging.Logger.getLogger(staff_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staff_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staff_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staff_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staff_update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author_name;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField book_name;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField copies;
    private javax.swing.JTextField issue_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField return_date;
    private javax.swing.JTextField staff_name;
    private javax.swing.JComboBox<String> staffid;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
