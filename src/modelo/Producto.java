package modelo;

public class Producto {

    private String codigo;
    private String descripcion;
    private int precioCosto;
    
    public Producto(){
        this.codigo="";
        this.descripcion="";
        this.precioCosto=0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(int precioCosto) {
        this.precioCosto = precioCosto;
    }
    
}
