
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConexion {
    
    public static Connection Conectar(){
        
        Connection con = null;
        
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbminimarket","root","123456");
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la Conexion: " + e);
        }
        return con;
    }
}
