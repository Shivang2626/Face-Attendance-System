/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;


import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection1 {
    private static Connection conn;
   static 
    {
            try
            {
           Class.forName("org.apache.derby.jdbc.ClientDriver");  
 System.out.println("Driver successfully loaded");
conn=DriverManager.getConnection("jdbc:derby://localhost:1527/sca", "shivang", "shivang");

           
         
            System.out.println("Connected successfully to the DB");
            }
            catch(Exception e)
            {
               System.out.println("Exception In Connecting To DB:"+e); 
            }
    }
    public static Connection getConnection()
    {
        return conn;
    }
}