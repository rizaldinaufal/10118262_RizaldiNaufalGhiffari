/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizaldinaufal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Opal
 */
public class Koneksi {
    
    private static Connection KoneksiDatabase;
    
    public static Connection koneksiDB()throws SQLException
    {
        try
        {
           String url = "jdbc:mysql://localhost:3318/sewammc";
           String user = "root";
           String pass = "";
           
           DriverManager.registerDriver(new com.mysql.jdbc.Driver());
           KoneksiDatabase = (Connection)DriverManager.getConnection(url, user, pass);
           JOptionPane.showMessageDialog(null,"Koneksi Berhasil");         
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Koneksi Gagal");
        }
        return KoneksiDatabase;
    }
    
}
