/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.project_medical_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class BillGenrator extends javax.swing.JFrame {

  JFrame jf;
  private Connection conn;
  int rate;
  int flag=0;
  int curr_qty;
  private static ArrayList<String>al;
  private static String [] arr;
  private PrintFrame printframe;
  
  
    public BillGenrator() {
        
        getMedicine();
        arr=new String[al.size()];
        arr=al.toArray(arr);
        initComponents();
        setVisible(true);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel7.setVisible(false);
        jf=this;
        
    }

  public void getMedicine()
  {
      al=new ArrayList<String>();
      try{
          conn=new GetConnection().getConnection();
          PreparedStatement ps=conn.prepareStatement("select name from medicines1");
          ResultSet rs=ps.executeQuery();
          while(rs.next())
          {
              al.add(rs.getString("name"));
          }
          
      }
      catch(Exception e)
      {
          System.out.println(e+"Bill_Generator_Get_Medicines");
      }
      
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        n1 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>(arr);
        q1 = new javax.swing.JLabel();
        s1 = new javax.swing.JComboBox<>();
        r1 = new javax.swing.JLabel();
        rate1 = new javax.swing.JTextField();
        t1 = new javax.swing.JLabel();
        tt1 = new javax.swing.JTextField();
        AddBtn1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        n2 = new javax.swing.JLabel();
        c2 = new javax.swing.JComboBox<>(arr);
        q2 = new javax.swing.JLabel();
        s2 = new javax.swing.JComboBox<>();
        r2 = new javax.swing.JLabel();
        rate2 = new javax.swing.JTextField();
        t2 = new javax.swing.JLabel();
        tt2 = new javax.swing.JTextField();
        AddBtn2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        n3 = new javax.swing.JLabel();
        c3 = new javax.swing.JComboBox<>(arr);
        q3 = new javax.swing.JLabel();
        s3 = new javax.swing.JComboBox<>();
        r3 = new javax.swing.JLabel();
        rate3 = new javax.swing.JTextField();
        t3 = new javax.swing.JLabel();
        tt3 = new javax.swing.JTextField();
        AddBtn3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        n4 = new javax.swing.JLabel();
        c4 = new javax.swing.JComboBox<>(arr);
        q4 = new javax.swing.JLabel();
        s4 = new javax.swing.JComboBox<>();
        r4 = new javax.swing.JLabel();
        rate4 = new javax.swing.JTextField();
        t4 = new javax.swing.JLabel();
        tt4 = new javax.swing.JTextField();
        AddBtn4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        n5 = new javax.swing.JLabel();
        c5 = new javax.swing.JComboBox<>(arr);
        q5 = new javax.swing.JLabel();
        s5 = new javax.swing.JComboBox<>();
        r5 = new javax.swing.JLabel();
        rate5 = new javax.swing.JTextField();
        t5 = new javax.swing.JLabel();
        tt5 = new javax.swing.JTextField();
        AddBtn5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        n6 = new javax.swing.JLabel();
        c6 = new javax.swing.JComboBox<>(arr);
        q6 = new javax.swing.JLabel();
        s6 = new javax.swing.JComboBox<>();
        r6 = new javax.swing.JLabel();
        rate6 = new javax.swing.JTextField();
        t6 = new javax.swing.JLabel();
        tt6 = new javax.swing.JTextField();
        AddBtn6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        printbtn = new javax.swing.JButton();
        bill_btn = new javax.swing.JButton();
        Reset_btn = new javax.swing.JButton();
        r7 = new javax.swing.JLabel();
        Final_Total = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        Stock_Check_Menu_Item = new javax.swing.JMenuItem();
        Filter_Stock_Check_Menu_Item = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Stock_Entry_jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Generate Bill");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0), 2));

        n1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        n1.setText("Name");

        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        q1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        q1.setText("Quntity");

        s1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        s1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "set", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });

        r1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        r1.setText("Rate");

        t1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        t1.setText("Total");

        AddBtn1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddBtn1.setForeground(new java.awt.Color(255, 51, 51));
        AddBtn1.setText("+");
        AddBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rate1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tt1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(AddBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tt1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rate1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(t1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(AddBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153), 2));

        n2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        n2.setText("Name");

        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        q2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        q2.setText("Quntity");

        s2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        s2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "set", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });

        r2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        r2.setText("Rate");

        t2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        t2.setText("Total");

        AddBtn2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddBtn2.setForeground(new java.awt.Color(255, 51, 51));
        AddBtn2.setText("+");
        AddBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rate2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tt2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(AddBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tt2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rate2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(t2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(AddBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 204), 2));

        n3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        n3.setText("Name");

        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        q3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        q3.setText("Quntity");

        s3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        s3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "set", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });

        r3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        r3.setText("Rate");

        t3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        t3.setText("Total");

        AddBtn3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddBtn3.setForeground(new java.awt.Color(255, 51, 51));
        AddBtn3.setText("+");
        AddBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rate3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tt3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(AddBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tt3)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rate3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(t3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(AddBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204), 2));

        n4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        n4.setText("Name");

        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });

        q4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        q4.setText("Quntity");

        s4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        s4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "set", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });

        r4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        r4.setText("Rate");

        t4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        t4.setText("Total");

        AddBtn4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddBtn4.setForeground(new java.awt.Color(255, 51, 51));
        AddBtn4.setText("+");
        AddBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtn4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rate4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tt4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(AddBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tt4)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rate4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(t4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(AddBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));

        n5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        n5.setText("Name");

        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });

        q5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        q5.setText("Quntity");

        s5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        s5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "set", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        s5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5ActionPerformed(evt);
            }
        });

        r5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        r5.setText("Rate");

        t5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        t5.setText("Total");

        AddBtn5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddBtn5.setForeground(new java.awt.Color(255, 51, 51));
        AddBtn5.setText("+");
        AddBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtn5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rate5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tt5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(AddBtn5, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tt5)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rate5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(t5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(AddBtn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0), 2));

        n6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        n6.setText("Name");

        c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6ActionPerformed(evt);
            }
        });

        q6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        q6.setText("Quntity");

        s6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        s6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "set", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        s6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s6ActionPerformed(evt);
            }
        });

        r6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        r6.setText("Rate");

        t6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        t6.setText("Total");

        AddBtn6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddBtn6.setForeground(new java.awt.Color(255, 51, 51));
        AddBtn6.setText("+");
        AddBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtn6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(r6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rate6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tt6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(AddBtn6, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(tt6)
                        .addGap(4, 4, 4))
                    .addComponent(AddBtn6)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rate6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(t6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        printbtn.setBackground(new java.awt.Color(51, 255, 0));
        printbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        printbtn.setForeground(new java.awt.Color(255, 255, 255));
        printbtn.setText("Print");
        printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbtnActionPerformed(evt);
            }
        });

        bill_btn.setBackground(new java.awt.Color(255, 0, 0));
        bill_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bill_btn.setForeground(new java.awt.Color(255, 255, 255));
        bill_btn.setText("Generate Bill");
        bill_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_btnActionPerformed(evt);
            }
        });

        Reset_btn.setBackground(new java.awt.Color(255, 0, 204));
        Reset_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Reset_btn.setForeground(new java.awt.Color(255, 255, 255));
        Reset_btn.setText("Reset");
        Reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_btnActionPerformed(evt);
            }
        });

        r7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        r7.setText("Total");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(Reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(bill_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(r7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Final_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bill_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Reset_btn)
                    .addComponent(r7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Final_Total, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu3.setText("Menu Operation");

        Stock_Check_Menu_Item.setText("Stock Check");
        Stock_Check_Menu_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stock_Check_Menu_ItemActionPerformed(evt);
            }
        });
        jMenu3.add(Stock_Check_Menu_Item);

        Filter_Stock_Check_Menu_Item.setText("Filter Stock Check");
        Filter_Stock_Check_Menu_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filter_Stock_Check_Menu_ItemActionPerformed(evt);
            }
        });
        jMenu3.add(Filter_Stock_Check_Menu_Item);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("More");

        Stock_Entry_jMenuItem1.setText("Stock Entry");
        Stock_Entry_jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stock_Entry_jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(Stock_Entry_jMenuItem1);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtn1ActionPerformed
       if(tt1.getText().equals("")!=true)
       {
           jPanel3.setVisible(true);
       }
       else
       {
           JOptionPane.showMessageDialog(null, "Please fill the current row");
           
       }
    }//GEN-LAST:event_AddBtn1ActionPerformed

    private void AddBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtn2ActionPerformed
       if(tt2.getText().equals("")!=true)
       {
           jPanel4.setVisible(true);
       }
       else
       {
           JOptionPane.showMessageDialog(null, "Please fill the current row");
           
       }
    }//GEN-LAST:event_AddBtn2ActionPerformed

    private void AddBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtn3ActionPerformed
        if(tt3.getText().equals("")!=true)
       {
           jPanel5.setVisible(true);
       }
       else
       {
           JOptionPane.showMessageDialog(null, "Please fill the current row");
           
       }
    }//GEN-LAST:event_AddBtn3ActionPerformed

    private void AddBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtn4ActionPerformed
         if(tt4.getText().equals("")!=true)
       {
           jPanel6.setVisible(true);
       }
       else
       {
           JOptionPane.showMessageDialog(null, "Please fill the current row");
           
       }
    }//GEN-LAST:event_AddBtn4ActionPerformed

    private void AddBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtn5ActionPerformed
       if(tt5.getText().equals("")!=true)
       {
           jPanel7.setVisible(true);
       }
       else
       {
           JOptionPane.showMessageDialog(null, "Please fill the current row");
           
       }
    }//GEN-LAST:event_AddBtn5ActionPerformed

    private void AddBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtn6ActionPerformed
       if(tt6.getText().equals("")!=true)
       {
          //jPanel7.setVisible(true);
       }
       else
       {
           JOptionPane.showMessageDialog(null, "Please fill the current row");
           
       }
    }//GEN-LAST:event_AddBtn6ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
       getRate(c1,rate1);
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
       getRate(c2,rate2);
    }//GEN-LAST:event_c2ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
       getRate(c3,rate3);
    }//GEN-LAST:event_c3ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
      getRate(c4,rate4);
    }//GEN-LAST:event_c4ActionPerformed

    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ActionPerformed
      getRate(c5,rate5);
    }//GEN-LAST:event_c5ActionPerformed

    private void c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6ActionPerformed
        getRate(c6,rate6);
    }//GEN-LAST:event_c6ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
       int price=rate*Integer.parseInt((String)s1.getSelectedItem());
       tt1.setText(price+"");
    }//GEN-LAST:event_s1ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        int price=rate*Integer.parseInt((String)s2.getSelectedItem());
       tt2.setText(price+"");
    }//GEN-LAST:event_s2ActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
         int price=rate*Integer.parseInt((String)s3.getSelectedItem());
       tt3.setText(price+"");
    }//GEN-LAST:event_s3ActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
         int price=rate*Integer.parseInt((String)s4.getSelectedItem());
         tt4.setText(price+"");
    }//GEN-LAST:event_s4ActionPerformed

    private void s5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5ActionPerformed
         int price=rate*Integer.parseInt((String)s5.getSelectedItem());
       tt5.setText(price+"");
    }//GEN-LAST:event_s5ActionPerformed

    private void s6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s6ActionPerformed
         int price=rate*Integer.parseInt((String)s6.getSelectedItem());
       tt6.setText(price+"");
    }//GEN-LAST:event_s6ActionPerformed
// function used for generate the final bill
    private void bill_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_btnActionPerformed
        flag=1;
        int sum=0;
        JTextField []jarr=new JTextField[6];
        JComboBox[] name=new JComboBox[6];
       JComboBox []quantity=new JComboBox[6]; 
       ArrayList medicinename=new ArrayList();
       ArrayList total=new ArrayList();
        jarr[0]=tt1;
        jarr[1]=tt2;
        jarr[2]=tt3;
        jarr[3]=tt4;
        jarr[4]=tt5;
        jarr[5]=tt6;
        
        name[0]=c1;
        name[1]=c2;
        name[2]=c3;
        name[3]=c4;
        name[4]=c5;
        name[5]=c6;
        
        quantity[0]=s1;
        quantity[1]=s2;
        quantity[2]=s3;
        quantity[3]=s4;
        quantity[4]=s5;
        quantity[5]=s6;
        
       for(int i=0;i<=5;i++)
       {
        try
        {
            sum=sum+Integer.parseInt(jarr[i].getText());
            medicinename.add(name[i].getSelectedItem());
            total.add(jarr[i].getText());
            
            updateDataBase(name[i],quantity[i]);
            
         }
        catch(Exception e)
        {
            System.out.println(e);
        }
       }
       Final_Total.setText("Total Bill :  "+sum);
       printframe=new PrintFrame();
       printframe.setText(medicinename,total,sum);
         
       
                
    }//GEN-LAST:event_bill_btnActionPerformed

    private void Reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_btnActionPerformed
                 jf.dispose();
                 new BillGenrator();
    }//GEN-LAST:event_Reset_btnActionPerformed

    private void Stock_Check_Menu_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stock_Check_Menu_ItemActionPerformed
        Stock_Check obj=new Stock_Check();
    }//GEN-LAST:event_Stock_Check_Menu_ItemActionPerformed

    private void Filter_Stock_Check_Menu_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filter_Stock_Check_Menu_ItemActionPerformed
        Filter_Stock_check obj=new Filter_Stock_check(arr);
    }//GEN-LAST:event_Filter_Stock_Check_Menu_ItemActionPerformed

    private void Stock_Entry_jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stock_Entry_jMenuItem1ActionPerformed
       StockEntry obj=new StockEntry(arr);
    }//GEN-LAST:event_Stock_Entry_jMenuItem1ActionPerformed

    private void printbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbtnActionPerformed
          if(flag==1)
                    {
                     
                     try{
                      printframe.print();
                       }
                     catch(Exception e )
                     {
                         System.out.println(e);
                     }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"please generate bill first");
                    }
                        
                             
        
    }//GEN-LAST:event_printbtnActionPerformed
public void getRate(JComboBox b,JTextField t)// fuction used for get rate from the db;
{
    String name=(String)b.getSelectedItem();
    try
    {
        PreparedStatement ps=conn.prepareStatement("select * from medicines1 where name=?");
        ps.setString(1, name);
        ResultSet rs=ps.executeQuery();
        rs.next();
        rate=rs.getInt("prize");
        curr_qty=rs.getInt("Quantity");
        t.setText(rate+"");
        if(curr_qty==0)
        {
            JOptionPane.showMessageDialog(null,name+" Out of Stcok!!");
        }
        
        
      /*  PreparedStatement ps=conn.prepareStatement("select * from medicines1 where name=?");
        ps.setString(1, name);
        ResultSet rs=ps.executeQuery();
        rs.next();
        rate=rs.getInt("prize");
        t.setText(rate+"");*/
        
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
public void updateDataBase(JComboBox name, JComboBox quntity ) throws SQLException
        
{
    String m_name=(String)name.getSelectedItem();
    int m_quntity=Integer.parseInt((String)quntity.getSelectedItem());
    PreparedStatement ps=conn.prepareStatement("select Quantity from medicines1 where name=?");
    ps.setString(1, m_name);
    ResultSet rs=ps.executeQuery();
    rs.next();
    curr_qty=rs.getInt(1);
    if(m_quntity<=curr_qty)
    {
        PreparedStatement ps1=conn.prepareStatement("update medicines1 set Quantity=Quantity-? where name=?");
        ps1.setInt(1, m_quntity);
        ps1.setString(2, m_name);
        ps1.executeUpdate();
    }
   
   // PreparedStatement ps=conn.prepareStatement("update medicines1 set Quantity=Quantity-? where name=?");
   // ps.setInt(1, m_quntity);
   // ps.setString(2, m_name);
   // ps.executeUpdate();

    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn1;
    private javax.swing.JButton AddBtn2;
    private javax.swing.JButton AddBtn3;
    private javax.swing.JButton AddBtn4;
    private javax.swing.JButton AddBtn5;
    private javax.swing.JButton AddBtn6;
    private javax.swing.JMenuItem Filter_Stock_Check_Menu_Item;
    private javax.swing.JTextField Final_Total;
    private javax.swing.JButton Reset_btn;
    private javax.swing.JMenuItem Stock_Check_Menu_Item;
    private javax.swing.JMenuItem Stock_Entry_jMenuItem1;
    private javax.swing.JButton bill_btn;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JComboBox<String> c3;
    private javax.swing.JComboBox<String> c4;
    private javax.swing.JComboBox<String> c5;
    private javax.swing.JComboBox<String> c6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel n4;
    private javax.swing.JLabel n5;
    private javax.swing.JLabel n6;
    private javax.swing.JButton printbtn;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel r1;
    private javax.swing.JLabel r2;
    private javax.swing.JLabel r3;
    private javax.swing.JLabel r4;
    private javax.swing.JLabel r5;
    private javax.swing.JLabel r6;
    private javax.swing.JLabel r7;
    private javax.swing.JTextField rate1;
    private javax.swing.JTextField rate2;
    private javax.swing.JTextField rate3;
    private javax.swing.JTextField rate4;
    private javax.swing.JTextField rate5;
    private javax.swing.JTextField rate6;
    private javax.swing.JComboBox<String> s1;
    private javax.swing.JComboBox<String> s2;
    private javax.swing.JComboBox<String> s3;
    private javax.swing.JComboBox<String> s4;
    private javax.swing.JComboBox<String> s5;
    private javax.swing.JComboBox<String> s6;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    private javax.swing.JTextField tt1;
    private javax.swing.JTextField tt2;
    private javax.swing.JTextField tt3;
    private javax.swing.JTextField tt4;
    private javax.swing.JTextField tt5;
    private javax.swing.JTextField tt6;
    // End of variables declaration//GEN-END:variables
}
