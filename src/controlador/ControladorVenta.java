/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import db.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Venta;

/**
 *
 * @author Alfonso
 */
public class ControladorVenta {
    public int agregarVenta(Venta venta){
        int confirmar = JOptionPane.showConfirmDialog(null, "¿ESTÁ SEGURO DE INGRESAR ESTOS DATOS?");
        if(confirmar == JOptionPane.YES_OPTION){
            Conexion conexion = new Conexion();
            try{
                Connection conn = conexion.getConnection();
                Statement stmt = conn.createStatement();
                String consulta = "INSERT INTO VENTA VALUES ("
                        +"STR_TO_DATE('"+ venta.getFecha()+"','%d-%m-%Y'), "
                        + venta.getBoleta()+","
                        + venta.getTransbank()+", "
                        + venta.getTotal()+");";
                System.out.println("CONSULTA: "+consulta);
                stmt.executeUpdate(consulta);
                JOptionPane.showMessageDialog(null, "VENTA INGRESADA DE FORMA EXITOSA");
                return 1;

            }
            catch(Exception err){
                JOptionPane.showMessageDialog(null, "ERROR: "+err.getMessage());
                System.out.println("ERROR: "+err.getMessage());
                return 0;
            }
            
        }
        else
            return 0;
    }
    
    public Venta obtenerVentaPorFecha(String fecha){
        Venta venta = new Venta();
        Conexion conexion = new Conexion();
        try{
           Connection conn = conexion.getConnection();
           Statement stmt = conn.createStatement();
           String consulta= "SELECT FECHA, BOLETA, TRANSBANK, TOTAL_VENTA FROM VENTA"
                   + " WHERE DATE_FORMAT(FECHA,'%d-%m-%Y') = '"+fecha+"';";
            System.out.println(consulta);
            ResultSet rs = stmt.executeQuery(consulta);
            while(rs.next()){
                venta.setFecha(rs.getString(1));
                venta.setBoleta(rs.getInt(2));
                venta.setTransbank(rs.getInt(3));
                venta.setTotal(rs.getInt(4));
            }

        }
        catch(Exception err){
            System.out.println("ERROR: "+err.getMessage());
        }
        
        
        return venta;
    }
    
    public int modificarVenta(Venta venta){
        int confirmar = JOptionPane.showConfirmDialog(null, "¿ESTÁ SEGURO DE INGRESAR ESTOS DATOS?");
        if(confirmar == JOptionPane.YES_OPTION){
            Conexion conexion = new Conexion();
            try{
                Connection conn = conexion.getConnection();
                Statement stmt = conn.createStatement();
                String consulta = "UPDATE VENTA SET "
                        +"BOLETA = " + venta.getBoleta()+","
                        +"TRANSBANK = "+ venta.getTransbank()+", "
                        +"TOTAL_VENTA= " +venta.getTotal()
                        + " WHERE DATE_FORMAT(FECHA,'%d-%m-%Y') = '"+venta.getFecha()+"';";
                System.out.println("CONSULTA: "+consulta);
                stmt.executeUpdate(consulta);
                JOptionPane.showMessageDialog(null, "VENTA EDITADA DE FORMA EXITOSA");
                return 1;

            }
            catch(Exception err){
                JOptionPane.showMessageDialog(null, "ERROR: "+err.getMessage());
                System.out.println("ERROR: "+err.getMessage());
                return 0;
            }
            
        }
        else
            return 0;
    }
    
}
