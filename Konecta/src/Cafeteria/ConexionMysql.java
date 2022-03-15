package Cafeteria;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Anonimo
 */
public class ConexionMysql {

    
    Connection conectar = null;
    
    public Connection conexion(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/cafeteria","root","admin");
            JOptionPane.showMessageDialog(null, "Conexion exitosa.");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error de conexion.");
            
        }
        
        return conectar;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
}
