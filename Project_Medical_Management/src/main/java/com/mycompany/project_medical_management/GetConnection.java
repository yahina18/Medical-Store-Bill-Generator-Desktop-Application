/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_medical_management;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class GetConnection {
    
    private Connection conn=null;
        public Connection getConnection()
        {
            try
            {
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Medical_store_db","root","Hinayadav18@");
            }
            catch(Exception e)
            {
                System.out.println(e+"Get Connection class problem");
            }
            finally{
                 
                return conn;
            }
        }
}
