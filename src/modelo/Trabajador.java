package modelo;

public class Trabajador {

    private String nombre;
    private String apellido;
    private String rut;
    private String dv_rut;
    private String nacionalidad;
    private char sexo;
    private String fechaNacimiento;
    
    public Trabajador(){
        this.nombre="";
        this.apellido="";
        this.rut="";
        this.dv_rut="";
        this.nacionalidad="";
        this.sexo=' ';
        this.fechaNacimiento="";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDv_rut() {
        return dv_rut;
    }

    public void setDv_rut(String dv_rut) {
        this.dv_rut = dv_rut;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + ", dv_rut=" + dv_rut + ", nacionalidad=" + nacionalidad + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
    
}
