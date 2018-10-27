/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management.system.pkg1.pkg6;

/**
 *
 * @author Ratul
 */
import java.sql.*;
import javax.swing.*;
public class DatabaseConnection {
    
    Connection conn = null;
    public static Connection dbConnector()
    {
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Ratul\\Documents\\NetBeansProjects\\Student Management System 1.7\\StudentManagement.sqlite");
            //JOptionPane.showMessageDialog(null, "Connection Successful");
            return conn;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public static void main(String[] args)
    {
        dbConnector();
    }
}    

