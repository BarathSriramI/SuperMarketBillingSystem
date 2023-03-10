/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.supermarketbilling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Category extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Category() {
        initComponents();
        selectseller();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CategoryTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CategoryId = new javax.swing.JTextField();
        CategoryName = new javax.swing.JTextField();
        CategoryDescription = new javax.swing.JTextField();
        EditButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        SellerLabel = new javax.swing.JLabel();
        ProductLabel = new javax.swing.JLabel();
        LogoutLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        CategoryTable.setBackground(new java.awt.Color(153, 153, 153));
        CategoryTable.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        CategoryTable.setForeground(new java.awt.Color(0, 153, 153));
        CategoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Category Id", "Name", "Description"
            }
        ));
        CategoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CategoryTable);

        jLabel1.setBackground(new java.awt.Color(255, 204, 51));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jLabel1.setText("CATEGORY LIST");

        jLabel2.setBackground(new java.awt.Color(255, 204, 51));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel2.setText("MANAGE CATEGORIES");

        jLabel3.setBackground(new java.awt.Color(255, 204, 51));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jLabel3.setText("CATEGORY ID");

        jLabel4.setBackground(new java.awt.Color(255, 204, 51));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jLabel4.setText("NAME");

        jLabel5.setBackground(new java.awt.Color(255, 204, 51));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jLabel5.setText("DESCRIPTION");

        CategoryDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryDescriptionActionPerformed(evt);
            }
        });

        EditButton.setBackground(new java.awt.Color(255, 255, 153));
        EditButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        EditButton.setText("EDIT");
        EditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditButtonMouseClicked(evt);
            }
        });
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        AddButton.setBackground(new java.awt.Color(255, 255, 153));
        AddButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        AddButton.setText("ADD");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(255, 255, 153));
        ClearButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        ClearButton.setText("CLEAR");
        ClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearButtonMouseClicked(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(255, 255, 153));
        DeleteButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        DeleteButton.setText("DELETE");
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CategoryId, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(CategoryName)
                                    .addComponent(CategoryDescription))
                                .addGap(110, 110, 110)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EditButton)
                                    .addComponent(AddButton)
                                    .addComponent(ClearButton)
                                    .addComponent(DeleteButton))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CategoryDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(AddButton)
                        .addGap(18, 18, 18)
                        .addComponent(EditButton)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteButton)
                        .addGap(18, 18, 18)
                        .addComponent(ClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        SellerLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SellerLabel.setText("SELLER");
        SellerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellerLabelMouseClicked(evt);
            }
        });

        ProductLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProductLabel.setText("PRODUCT");
        ProductLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductLabelMouseClicked(evt);
            }
        });

        LogoutLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LogoutLabel.setText("LOGOUT");
        LogoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoutLabel)
                    .addComponent(ProductLabel)
                    .addComponent(SellerLabel))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(SellerLabel)
                .addGap(45, 45, 45)
                .addComponent(ProductLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutLabel)
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CategoryDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryDescriptionActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditButtonActionPerformed

     private void selectseller()
    {
//        Connection con;
//        PreparedStatement pre;
//        int cc;// need to know the no coclumn to be printed
        try {
            Connection con;
           PreparedStatement pre;
           int cc;
            Class.forName("com.mysql.cj.jdbc.Driver");//establish a connection
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/managementsystem","root","monkeydluffy@123");
            java.sql.Statement s=con.createStatement();
            pre=con.prepareStatement("select * from categorytable");// query to the sql
            ResultSet rs= pre.executeQuery();// execute the sql query in netbeans for printing it 
            ResultSetMetaData rsmd=rs.getMetaData();// infoemation that is present inside a table 
            cc=rsmd.getColumnCount();
            DefaultTableModel dft= (DefaultTableModel)CategoryTable.getModel();//crete a default table based on the sql table in netbeans
            dft.setRowCount(0);
            while(rs.next())
            {
                Vector v2;
                v2 = new Vector();
                for(int i=1;i<=cc;i++)
                {
                    v2.add(rs.getString("CategoryId"));
                    v2.add(rs.getString("CategoryName"));
                    v2.add(rs.getString("CategoryDescription"));
//                    v2.add(rs.getString("ProductPrice"));
//                    v2.add(rs.getString("ProductCategory"));
                }
                dft.addRow(v2);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        // TODO add your handling code here:
        if(CategoryId.getText().isEmpty() || CategoryName.getText().isEmpty() || CategoryDescription.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"The data is missing");
        }
        else
        {
            Connection con=null;
            PreparedStatement pre= null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/managementsystem","root","monkeydluffy@123");
                pre=con.prepareStatement("Insert into categorytable VALUES(?,?,?)");
                pre.setInt(1,Integer.parseInt(CategoryId.getText()));
                pre.setString(2,CategoryName.getText());
                pre.setString(3,CategoryDescription.getText());
//                pre.setString(4,ProductPrice.getText());
//                pre.setString(5,ProductCategory.getSelectedItem().toString());
                int row= pre.executeUpdate();
                JOptionPane.showMessageDialog(this,"The Category is added");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
            }
            selectseller();  
        }
        
    }//GEN-LAST:event_AddButtonMouseClicked

    private void ClearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearButtonMouseClicked
        // TODO add your handling code here:
                CategoryId.setText("");
                CategoryName.setText("");
                CategoryDescription.setText("");
               
    }//GEN-LAST:event_ClearButtonMouseClicked

    private void CategoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)CategoryTable.getModel();
        int myindex=CategoryTable.getSelectedRow();
        CategoryId.setText(model.getValueAt(myindex,0).toString());
        CategoryName.setText(model.getValueAt(myindex,1).toString());
        CategoryDescription.setText(model.getValueAt(myindex,2).toString());
       
    }//GEN-LAST:event_CategoryTableMouseClicked

    public void clear()
    {
                CategoryId.setText("");
                CategoryName.setText("");
                CategoryDescription.setText("");
               
    }
    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        // TODO add your handling code here:
        if(CategoryId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter the Category to be deleted");
        }
        else {
            Connection con= null;
            try {
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/managementsystem","root","monkeydluffy@123");
                String categoryid=CategoryId.getText();
                String query="Delete from managementsystem.producttable where CategoryId =" +categoryid;
                Statement pre=  con.createStatement();
                pre.executeUpdate(query);
                selectseller();
                JOptionPane.showMessageDialog(this, "The Category deleted successfully");
                clear();
                
            } catch (SQLException ex) {
                Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void EditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseClicked
        // TODO add your handling code here:
        if(CategoryId.getText().isEmpty() || CategoryName.getText().isEmpty() || CategoryDescription.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Missing information");
        }
        else
        {
            Connection con=null;
            try {
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/managementsystem","root","monkeydluffy@123");
                String query="Update managementsystem.categorytable set CategoryName='"+CategoryName.getText()+"'"+", CategoryDescription='"+CategoryDescription.getText()+"'"+"Where CategoryId="+CategoryId.getText();
                Statement pre=con.createStatement();
                pre.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "The CategoryId has been updated");
                selectseller();
            } catch (SQLException ex) {
                Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_EditButtonMouseClicked

    private void SellerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellerLabelMouseClicked
        // TODO add your handling code here:
        Seller sellerPage = new Seller();
        sellerPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SellerLabelMouseClicked

    private void ProductLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductLabelMouseClicked
        // TODO add your handling code here:
        Products productpage= new Products();
        productpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductLabelMouseClicked

    private void LogoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLabelMouseClicked
        // TODO add your handling code here:
        Login loginpage= new Login();
        loginpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutLabelMouseClicked

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField CategoryDescription;
    private javax.swing.JTextField CategoryId;
    private javax.swing.JTextField CategoryName;
    private javax.swing.JTable CategoryTable;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JLabel LogoutLabel;
    private javax.swing.JLabel ProductLabel;
    private javax.swing.JLabel SellerLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
