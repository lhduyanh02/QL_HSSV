/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhjava;

import java.sql.Connection;

/**
 *
 * @author Admin
 */
public class Program {
    public static Connection con;
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLTTSV().setVisible(true);
            }
        });
    }
}
