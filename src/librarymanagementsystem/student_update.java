
package librarymanagementsystem;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class student_update extends javax.swing.JFrame implements FocusListener {

    /**
     * Creates new form student_update
     */
    public student_update() {
        
        initComponents();
        getData();
    }

    private void getData() 
            
    {
                      String qry="select * from student";   
            
             try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
                        Statement st=con.createStatement();
                   
                        java.sql.ResultSet rs=st.executeQuery(qry);
                        
                        while(rs.next())
                        {
                            studentid.addItem(rs.getString("student_id"));
                        }
                            
             }
             catch(Exception e)
             {
                  System.out.println(e.getMessage());
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
        copies = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        student_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        book_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        author_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        issue_date = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        return_date = new javax.swing.JTextField();
        updatebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        studentid = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 86, 192)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 101, 192));
        jLabel1.setText("Update Studant ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("STUDENT ID ");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("STUDENT NAME ");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("CONTACT NO");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("COPIES");

        copies.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        copies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiesActionPerformed(evt);
            }
        });

        contact.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });

        student_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        student_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_nameActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("BOOK NAME ");

        book_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("AUTHOR NAME ");

        author_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("DATE OF ISSUE ");

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

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("RETURN DATE ");

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

        updatebtn.setBackground(new java.awt.Color(21, 86, 192));
        updatebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updatebtn.setText("UPDATE ");
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

        studentid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        studentid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        studentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(contact, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(copies, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(updatebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(student_name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(book_name, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(author_name, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(issue_date, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(return_date, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                            .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(author_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issue_date, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copies, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(return_date, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1026, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void return_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_return_dateActionPerformed

    private void student_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_nameActionPerformed

    private void copiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copiesActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

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

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
       
        try
        {
            String qry = "update student set student_name='"+student_name.getText()+"',contact_no='"+contact.getText()+"',book_name='"+book_name.getText()+"',author_name='"+author_name.getText()+"',copies='"+Integer.valueOf(copies.getText())+"',date_of_issue='"+issue_date.getText()+"',return_date='"+return_date.getText()+"' where student_id='"+Integer.valueOf(studentid.getSelectedItem().toString())+"'";
            
             Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
                        Statement st=con.createStatement();
                        
                        int res= st.executeUpdate(qry);
                        JOptionPane.showMessageDialog(this,"Update Successfully");

                        
                       
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void studentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentidActionPerformed

     String id=(String) studentid.getSelectedItem();
            
            String qry="select * from student where student_id='"+id+"'";
            
            try
            {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
                        Statement st=con.createStatement();
                        
                        java.sql.ResultSet rs=st.executeQuery(qry);
                        
                        if(rs.next())
                        {
                            student_name.setText(rs.getString("Student_name"));
                            
                            contact.setText(rs.getString("contact_no"));
                            //contact.setText(String.valueOf(Contact));
                            
                            copies.setText(rs.getString("copies"));
                            //copies.setText(String.valueOf(Copies));
                            
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
    }//GEN-LAST:event_studentidActionPerformed

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
            java.util.logging.Logger.getLogger(student_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_update().setVisible(true);
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
    private javax.swing.JTextField student_name;
    private javax.swing.JComboBox<String> studentid;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void focusGained(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void focusLost(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
