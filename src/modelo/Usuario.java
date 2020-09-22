package modelo;

public class Usuario {

    private String username;
    private String password;
    private boolean crearUsuario;
    private boolean modificarContrasena;
    private boolean eliminarUsuario;
    private boolean darquitarPermisos;
    private boolean ingresarTrabajador;
    private boolean generarContrato;
    private boolean generarFiniquito;
    private boolean liquidaciones;
    private boolean ingresarVentaDiaria;
    private boolean modificarVentaDiaria;
    private boolean informeVenta;
    private boolean cumpleanos;
    private boolean nuevoProducto;
    private boolean administrarStock;
    private boolean crearProveedor;
    
    
    public Usuario(){
        this.username="";
        this.password="";
        this.crearUsuario=false;
        this.modificarContrasena=false;
        this.eliminarUsuario=false;
        this.darquitarPermisos=false;
        this.ingresarTrabajador=false;
        this.generarContrato=false;
        this.generarFiniquito=false;
        this.liquidaciones=false;
        this.ingresarVentaDiaria=false;
        this.modificarVentaDiaria=false;
        this.informeVenta=false;
        this.cumpleanos=false;
        this.nuevoProducto=false;
        this.administrarStock=false; 
        this.crearProveedor=false;                
        
    }

    public boolean isCrearProveedor() {
        return crearProveedor;
    }

    public void setCrearProveedor(boolean crearProveedor) {
        this.crearProveedor = crearProveedor;
    }

    
    
    public boolean isNuevoProducto() {
        return nuevoProducto;
    }

    public void setNuevoProducto(boolean nuevoProducto) {
        this.nuevoProducto = nuevoProducto;
    }

    public boolean isAdministrarStock() {
        return administrarStock;
    }

    public void setAdministrarStock(boolean administrarStock) {
        this.administrarStock = administrarStock;
    }

    
    public boolean isCumpleanos() {
        return cumpleanos;
    }

    public void setCumpleanos(boolean cumpleanos) {
        this.cumpleanos = cumpleanos;
    }

    public boolean isCrearUsuario() {
        return crearUsuario;
    }

    public void setCrearUsuario(boolean crearUsuario) {
        this.crearUsuario = crearUsuario;
    }

    public boolean isModificarContrasena() {
        return modificarContrasena;
    }

    public void setModificarContrasena(boolean modificarContrasena) {
        this.modificarContrasena = modificarContrasena;
    }

    

    public boolean isEliminarUsuario() {
        return eliminarUsuario;
    }

    public void setEliminarUsuario(boolean eliminarUsuario) {
        this.eliminarUsuario = eliminarUsuario;
    }

    public boolean isDarquitarPermisos() {
        return darquitarPermisos;
    }

    public void setDarquitarPermisos(boolean darquitarPermisos) {
        this.darquitarPermisos = darquitarPermisos;
    }

    public boolean isIngresarTrabajador() {
        return ingresarTrabajador;
    }

    public void setIngresarTrabajador(boolean ingresarTrabajador) {
        this.ingresarTrabajador = ingresarTrabajador;
    }

    public boolean isGenerarContrato() {
        return generarContrato;
    }

    public void setGenerarContrato(boolean generarContrato) {
        this.generarContrato = generarContrato;
    }

    public boolean isGenerarFiniquito() {
        return generarFiniquito;
    }

    public void setGenerarFiniquito(boolean generarFiniquito) {
        this.generarFiniquito = generarFiniquito;
    }

    public boolean isLiquidaciones() {
        return liquidaciones;
    }

    public void setLiquidaciones(boolean liquidaciones) {
        this.liquidaciones = liquidaciones;
    }

    public boolean isIngresarVentaDiaria() {
        return ingresarVentaDiaria;
    }

    public void setIngresarVentaDiaria(boolean ingresarVentaDiaria) {
        this.ingresarVentaDiaria = ingresarVentaDiaria;
    }

    public boolean isModificarVentaDiaria() {
        return modificarVentaDiaria;
    }

    public void setModificarVentaDiaria(boolean modificarVentaDiaria) {
        this.modificarVentaDiaria = modificarVentaDiaria;
    }

    public boolean isInformeVenta() {
        return informeVenta;
    }

    public void setInformeVenta(boolean informeVenta) {
        this.informeVenta = informeVenta;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

    

   

    
    
    
}
