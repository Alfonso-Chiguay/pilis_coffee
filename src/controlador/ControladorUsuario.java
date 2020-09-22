package controlador;

import db.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class ControladorUsuario {
    public void crearNuevoUsuario(Usuario usuario){
        Conexion conexion = new Conexion();
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            String consulta = "INSERT INTO USUARIO VALUES ("
                    + "'"+usuario.getUsername()+"',"
                    + "'"+usuario.getPassword()+"',"
                    + usuario.isCrearUsuario()+","
                    + usuario.isModificarContrasena()+","
                    + usuario.isEliminarUsuario()+","
                    + usuario.isDarquitarPermisos()+","
                    + usuario.isIngresarTrabajador()+","
                    + usuario.isGenerarContrato()+","
                    + usuario.isGenerarFiniquito()+","
                    + usuario.isLiquidaciones()+","
                    + usuario.isIngresarVentaDiaria()+","
                    + usuario.isModificarVentaDiaria()+","
                    + usuario.isInformeVenta()+","
                    + usuario.isCumpleanos()+","
                    + usuario.isNuevoProducto()+","
                    + usuario.isAdministrarStock()+","
                    + usuario.isCrearProveedor()+");";
            System.out.println("CONSULTA INSERT: "+consulta);
            stmt.executeUpdate(consulta);
            JOptionPane.showMessageDialog(null, "USUARIO CREADO CORRECTAMENTE");
                  
        }
        catch(Exception err){
            JOptionPane.showMessageDialog(null, "ERROR: "+err.getMessage());
            System.out.println("ERROR [Metodo crearNuevoUsuario]: "+err.getMessage());
            
            
        }
        
        
    }
    
    public ArrayList<Usuario> credencialesLogin(){
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Conexion conexion = new Conexion();
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            String consulta = "SELECT * FROM USUARIO;";
            ResultSet rs = stmt.executeQuery(consulta);
            
            while(rs.next()){
                Usuario u = new Usuario();
                u.setUsername(rs.getString(1));
                u.setPassword(rs.getString(2));            
                u.setCrearUsuario(rs.getBoolean(3));          
                u.setModificarContrasena(rs.getBoolean(4));            
                u.setEliminarUsuario(rs.getBoolean(5));           
                u.setDarquitarPermisos(rs.getBoolean(6));            
                u.setIngresarTrabajador(rs.getBoolean(7));           
                u.setGenerarContrato(rs.getBoolean(8));           
                u.setGenerarFiniquito(rs.getBoolean(9));       
                u.setLiquidaciones(rs.getBoolean(10));            
                u.setIngresarVentaDiaria(rs.getBoolean(11));            
                u.setModificarVentaDiaria(rs.getBoolean(12));           
                u.setInformeVenta(rs.getBoolean(13));            
                u.setCumpleanos(rs.getBoolean(14));
                u.setNuevoProducto(rs.getBoolean(15));
                u.setAdministrarStock(rs.getBoolean(16));
                u.setCrearProveedor(rs.getBoolean(17));
                usuarios.add(u);
            }
            return usuarios;
        }
        catch(Exception err){
            JOptionPane.showMessageDialog(null, "ERROR: "+err.getMessage());
            System.out.println("ERROR [Metodo credencialesLogin]: "+err.getMessage());
            return usuarios;
            
        }   
    }
    
    public int cambiarContrasena(String usuario, String nuevaContrasena){
        Conexion conexion = new Conexion();
        try {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            String consulta = "UPDATE USUARIO SET PASSWORD = '"+nuevaContrasena+"' "
                    + "WHERE UPPER(USERNAME) = '"+usuario+"';";
            System.out.println(consulta);
            stmt.executeUpdate(consulta);
            
            return 1;
        } 
        
        catch (Exception err) {
            JOptionPane.showMessageDialog(null, "ERROR: "+err.getMessage());
            System.out.println("ERROR [Metodo cambiarContrasena]: "+err.getMessage());
            return 0;
        }
    }
}
