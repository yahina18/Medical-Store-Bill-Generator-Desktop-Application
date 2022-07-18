/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.project_medical_management;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author HP
 */
public class Filter_Stock_check extends javax.swing.JFrame {

    
    
    String[]arr;
    public Filter_Stock_check(String[]arr) {
        this.arr=arr;
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        jPanel_3.setVisible(false);
        jPanel_4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel_6.setVisible(false);
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Name_jRadioButton1 = new javax.swing.JRadioButton();
        Qantity_jRadioButton2 = new javax.swing.JRadioButton();
        Alphabet_jRadioButton3 = new javax.swing.JRadioButton();
        jPanel_4 = new javax.swing.JPanel();
        jComboBox1_Qantity_Based = new javax.swing.JComboBox<>();
        Qantity_Search_btn = new javax.swing.JButton();
        jPanel_3 = new javax.swing.JPanel();
        jComboBox1_NameBased = new javax.swing.JComboBox<>(arr);
        Name_Search_btn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jComboBox1_AphabetBased = new javax.swing.JComboBox<>();
        Alphabet_search_btn = new javax.swing.JButton();
        jPanel_6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filter Based Stock Check");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));

        buttonGroup1.add(Name_jRadioButton1);
        Name_jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Name_jRadioButton1.setText("Name Based");
        Name_jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name_jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Qantity_jRadioButton2);
        Qantity_jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Qantity_jRadioButton2.setText("Qauntity Based");
        Qantity_jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Qantity_jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Alphabet_jRadioButton3);
        Alphabet_jRadioButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Alphabet_jRadioButton3.setText("Alphabet Based");
        Alphabet_jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alphabet_jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(Name_jRadioButton1)
                .addGap(203, 203, 203)
                .addComponent(Qantity_jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Alphabet_jRadioButton3)
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_jRadioButton1)
                    .addComponent(Qantity_jRadioButton2)
                    .addComponent(Alphabet_jRadioButton3))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel_4.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1_Qantity_Based.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1_Qantity_Based.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">10", "<10", ">20", "<20" }));

        Qantity_Search_btn.setBackground(new java.awt.Color(255, 255, 255));
        Qantity_Search_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Qantity_Search_btn.setForeground(new java.awt.Color(255, 51, 51));
        Qantity_Search_btn.setText("Search");
        Qantity_Search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Qantity_Search_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_4Layout = new javax.swing.GroupLayout(jPanel_4);
        jPanel_4.setLayout(jPanel_4Layout);
        jPanel_4Layout.setHorizontalGroup(
            jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jComboBox1_Qantity_Based, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264)
                .addComponent(Qantity_Search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_4Layout.setVerticalGroup(
            jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1_Qantity_Based, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Qantity_Search_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel_3.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1_NameBased.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Name_Search_btn.setBackground(new java.awt.Color(255, 255, 255));
        Name_Search_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Name_Search_btn.setForeground(new java.awt.Color(255, 51, 51));
        Name_Search_btn.setText("Search");
        Name_Search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name_Search_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_3Layout = new javax.swing.GroupLayout(jPanel_3);
        jPanel_3.setLayout(jPanel_3Layout);
        jPanel_3Layout.setHorizontalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jComboBox1_NameBased, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264)
                .addComponent(Name_Search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_3Layout.setVerticalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1_NameBased, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name_Search_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1_AphabetBased.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1_AphabetBased.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "L", "K", "L", "M", "N", "O", "P", "N", "Q", "R", "S", "T", "U", "V", "W", "X", "Y" }));

        Alphabet_search_btn.setBackground(new java.awt.Color(255, 255, 255));
        Alphabet_search_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Alphabet_search_btn.setForeground(new java.awt.Color(255, 51, 51));
        Alphabet_search_btn.setText("Search");
        Alphabet_search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alphabet_search_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jComboBox1_AphabetBased, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268)
                .addComponent(Alphabet_search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1_AphabetBased, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Alphabet_search_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel_6.setBackground(new java.awt.Color(255, 102, 102));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel_6Layout = new javax.swing.GroupLayout(jPanel_6);
        jPanel_6.setLayout(jPanel_6Layout);
        jPanel_6Layout.setHorizontalGroup(
            jPanel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
        );
        jPanel_6Layout.setVerticalGroup(
            jPanel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void getStock(int i, String str)
    {
        jPanel_6.setVisible(true);
        Connection conn=new GetConnection().getConnection();
        try{
            if(i==1)
            {
                PreparedStatement ps=conn.prepareStatement("select name,quantity from medicines1 where name=?");
                ps.setString(1, str);
                ResultSet rs=ps.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));      
                
            }
            else if(i==2)
            {
                String symbol=str.substring(0,1);//>10
                int count=Integer.parseInt(str.substring(1));
                PreparedStatement ps=conn.prepareStatement("select name,quantity from medicines1 where quantity " + symbol + "?" );
                ps.setInt(1,count);
                ResultSet rs=ps.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
            }
            else
            {
                PreparedStatement ps=conn.prepareStatement("select name,quantity from medicines1 where name like ?");
                ps.setString(1,str+"%");
                ResultSet rs=ps.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
                
                
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
  
    private void Qantity_Search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Qantity_Search_btnActionPerformed
        String str=(String)jComboBox1_Qantity_Based.getSelectedItem();
        getStock(2,str);
    }//GEN-LAST:event_Qantity_Search_btnActionPerformed

    private void Name_Search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name_Search_btnActionPerformed
        String str=(String)jComboBox1_NameBased.getSelectedItem();
        getStock(1,str);
    }//GEN-LAST:event_Name_Search_btnActionPerformed

    private void Alphabet_search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alphabet_search_btnActionPerformed
        String str=(String)jComboBox1_AphabetBased.getSelectedItem();
        getStock(3,str);
    }//GEN-LAST:event_Alphabet_search_btnActionPerformed

    private void Name_jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name_jRadioButton1ActionPerformed
        jPanel_3.setVisible(true);
         jPanel_4.setVisible(false);
          jPanel5.setVisible(false);
           jPanel_6.setVisible(false);
           
        
    }//GEN-LAST:event_Name_jRadioButton1ActionPerformed

    private void Qantity_jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Qantity_jRadioButton2ActionPerformed
        jPanel_3.setVisible(false);
         jPanel_4.setVisible(true);
          jPanel5.setVisible(false);
           jPanel_6.setVisible(false);
           
    }//GEN-LAST:event_Qantity_jRadioButton2ActionPerformed

    private void Alphabet_jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alphabet_jRadioButton3ActionPerformed
         jPanel_3.setVisible(false);
         jPanel_4.setVisible(false);
          jPanel5.setVisible(true);
           jPanel_6.setVisible(false);
           
    }//GEN-LAST:event_Alphabet_jRadioButton3ActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Alphabet_jRadioButton3;
    private javax.swing.JButton Alphabet_search_btn;
    private javax.swing.JButton Name_Search_btn;
    private javax.swing.JRadioButton Name_jRadioButton1;
    private javax.swing.JButton Qantity_Search_btn;
    private javax.swing.JRadioButton Qantity_jRadioButton2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1_AphabetBased;
    private javax.swing.JComboBox<String> jComboBox1_NameBased;
    private javax.swing.JComboBox<String> jComboBox1_Qantity_Based;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_4;
    private javax.swing.JPanel jPanel_6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
