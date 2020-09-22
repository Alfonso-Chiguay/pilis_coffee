package controlador;

import db.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Trabajador;
import vista.AgregarTrabajador;

public class ControladorTrabajador {
    
    
    public void agregarTrabajador(Trabajador trabajador, AgregarTrabajador ventana){
        Conexion conexion = new Conexion();
   
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            String consulta = "INSERT INTO TRABAJADOR VALUES ('"+
                               trabajador.getRut()+"', '"+
                               trabajador.getDv_rut()+"', '"+
                               trabajador.getNombre()+"', '"+
                               trabajador.getApellido()+"', '"+
                               trabajador.getSexo()+"', "+
                               "STR_TO_DATE('"+trabajador.getFechaNacimiento()+"','%d-%m-%Y'), "+
                                "'"+trabajador.getNacionalidad()+"');";
            System.out.println("CONSULTA A EJECUTAR: "+consulta);
            stmt.executeUpdate(consulta);
            System.out.println("CONSULTA EJECUTADA CORRECTAMENTE");
            JOptionPane.showMessageDialog(ventana, "TRABAJADOR INGRESADO CORRECTAMENTE");
            int ingresarOtro =JOptionPane.showConfirmDialog(ventana, "DESEA INGRESAR OTRO TRABAJADOR?");
            if (ingresarOtro == 0){
              ventana.limpiarTodo();
              }
            else{
                ventana.dispose();
            }
        }
        catch(Exception err){
            System.out.println("ERROR AL AGREGAR");
            JOptionPane.showMessageDialog(ventana, "SE PRODUJO EL SIGUIENTE ERROR: "+ err.getMessage());
            System.out.println(err.getCause());
            }
        }
    
    public void modificarTrabajador(String rut){
        
        
    }
}
