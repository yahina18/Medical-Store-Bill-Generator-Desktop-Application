/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.project_medical_management;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import javax.swing.JLabel;

public class PrintFrame extends javax.swing.JFrame implements Printable{
     
    JLabel[] m_names=new JLabel[6];
    JLabel[] cost=new JLabel[6];
   
    public PrintFrame() {
        initComponents();
        m_names[0]=n1_label1;
        m_names[1]=n2_label2;
        m_names[2]=n3_label3;
        m_names[3]=n4_label4;
        m_names[4]=n5_label5;
        m_names[5]=n6_label6;
        
        cost[0]=r1_label1;
        cost[1]=r2_label2;
        cost[2]=r3_label3;
        cost[3]=r4_label4;
        cost[4]=r5_label5;
        cost[5]=r6_label6;

             

    }
    public void setText(ArrayList name,ArrayList total,int sum)
    {
        for (int i=0;i<name.size();i++)
        {
            m_names[i].setText((String)name.get(i));
            cost[i].setText((String)total.get(i));
        }
        total_text_label.setText(sum+"");
    }
       public int print(Graphics g, PageFormat pf, int page) throws PrinterException
        {
             if (page > 0)
                return Printable.NO_SUCH_PAGE;
            printAll(g);
            return Printable.PAGE_EXISTS;
        }
       
        public void print() throws PrinterException
        {  setVisible(true);
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(this);
            if (job.printDialog()) 
            {
              
                job.print();
               this.setVisible(false);          
            }
        
        }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        n6_label6 = new javax.swing.JLabel();
        n2_label2 = new javax.swing.JLabel();
        n3_label3 = new javax.swing.JLabel();
        n4_label4 = new javax.swing.JLabel();
        n5_label5 = new javax.swing.JLabel();
        Dot_Label_jLabel14 = new javax.swing.JLabel();
        total_text_field = new javax.swing.JLabel();
        total_text_label = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        r2_label2 = new javax.swing.JLabel();
        r3_label3 = new javax.swing.JLabel();
        r1_label1 = new javax.swing.JLabel();
        r5_label5 = new javax.swing.JLabel();
        r4_label4 = new javax.swing.JLabel();
        n1_label1 = new javax.swing.JLabel();
        r6_label6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));

        n6_label6.setBackground(new java.awt.Color(51, 51, 255));
        n6_label6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        n2_label2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        n3_label3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        n4_label4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        n5_label5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Dot_Label_jLabel14.setText(" .............................................................................................................................................");

        total_text_field.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        total_text_field.setText("Total Bill");

        total_text_label.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Bill Reciept");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        r2_label2.setBackground(new java.awt.Color(51, 51, 255));
        r2_label2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        r3_label3.setBackground(new java.awt.Color(51, 51, 255));
        r3_label3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        r1_label1.setBackground(new java.awt.Color(51, 51, 255));
        r1_label1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        r5_label5.setBackground(new java.awt.Color(51, 51, 255));
        r5_label5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        r4_label4.setBackground(new java.awt.Color(51, 51, 255));
        r4_label4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        n1_label1.setBackground(new java.awt.Color(51, 51, 255));
        n1_label1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        r6_label6.setBackground(new java.awt.Color(51, 51, 255));
        r6_label6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dot_Label_jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(total_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(total_text_label, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(n6_label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(n4_label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(n3_label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(n5_label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(n2_label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(n1_label1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5_label5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4_label4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6_label6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n1_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n2_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n3_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n4_label4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4_label4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n5_label5)
                    .addComponent(r5_label5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n6_label6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6_label6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(Dot_Label_jLabel14)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_text_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dot_Label_jLabel14;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel n1_label1;
    private javax.swing.JLabel n2_label2;
    private javax.swing.JLabel n3_label3;
    private javax.swing.JLabel n4_label4;
    private javax.swing.JLabel n5_label5;
    private javax.swing.JLabel n6_label6;
    private javax.swing.JLabel r1_label1;
    private javax.swing.JLabel r2_label2;
    private javax.swing.JLabel r3_label3;
    private javax.swing.JLabel r4_label4;
    private javax.swing.JLabel r5_label5;
    private javax.swing.JLabel r6_label6;
    private javax.swing.JLabel total_text_field;
    private javax.swing.JLabel total_text_label;
    // End of variables declaration//GEN-END:variables
}
