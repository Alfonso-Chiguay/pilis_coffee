package controlador;

import db.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Producto;

public class ControladorProducto {

    public int ingresarProducto(Producto producto){
        Conexion conexion = new Conexion();
        try {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            String consulta = "INSERT INTO PRODUCTO VALUES("
                    + "'"+producto.getCodigo()+"',"
                    + "'"+producto.getDescripcion()+"',"
                    + producto.getPrecioCosto()+",0);";
            stmt.executeUpdate(consulta);
            System.out.println("CONSULTA: "+consulta);
            return 1;
        } 
        catch (Exception err) {
            JOptionPane.showMessageDialog(null, "ERROR: "+err.getMessage());
            System.out.println("ERROR [Metodo ingresarProducto]: "+err.getMessage());
            return 0;
        }
    
                
    }
    
}
