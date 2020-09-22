package controlador;

import db.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Proveedor;

public class ControladorProveedor {

    public int crearProveedor(Proveedor proveedor){
        Conexion conexion = new Conexion();
        try {
           Connection conn = conexion.getConnection();
           Statement stmt = conn.createStatement();
           String consulta = "INSERT INTO PROVEEDOR VALUES('"
                   + proveedor.getRut()+"', '"
                   + proveedor.getDv()+"', '"
                   + proveedor.getRazonSocial()+"','"
                   + proveedor.getEmail()+"','"
                   + proveedor.getTelefonoContacto()+"');";
            System.out.println("CONSULTA: "+consulta);
            stmt.executeUpdate(consulta);
            return 1;
        } 
        catch (Exception err) {
            JOptionPane.showMessageDialog(null, "ERROR: "+err.getMessage());
            System.out.println("ERROR [Metodo crearProveedor]: "+err.getMessage());
            return 0;
        }
    }
}
