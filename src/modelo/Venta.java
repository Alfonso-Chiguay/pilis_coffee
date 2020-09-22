
package modelo;

public class Venta {
    private String fecha;
    private int boleta;
    private int transbank;
    private int total;
    
    public Venta(){
        this.fecha="01-01-2000";
        this.boleta=0;
        this.transbank=0;
        this.total=0;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getBoleta() {
        return boleta;
    }

    public void setBoleta(int boleta) {
        if (boleta>=0)
            this.boleta = boleta;
    }

    public int getTransbank() {
        return transbank;
    }

    public void setTransbank(int transbank) {
        if(transbank>=0)
            this.transbank = transbank;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        if(total>=0)
            this.total = total;
    }

    @Override
    public String toString() {
        return "Venta{" + "boleta=" + boleta + ", transbank=" + transbank + ", total=" + total + '}';
    }
    
    
}
