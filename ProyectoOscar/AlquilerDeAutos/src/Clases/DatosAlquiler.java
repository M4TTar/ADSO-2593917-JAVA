package Clases;

public class DatosAlquiler {
    private String cedula;
    private String nombre;
    private String telefono;
    private String tiempoUso;
    private String valorTotal;
    private String metodoPago;

    public DatosAlquiler(String cedula, String nombre, String telefono, String tiempoUso, String valorTotal, String metodoPago) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.tiempoUso = tiempoUso;
        this.valorTotal = valorTotal;
        this.metodoPago = metodoPago;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTiempoUso() {
        return tiempoUso;
    }

    public void setTiempoUso(String tiempoUso) {
        this.tiempoUso = tiempoUso;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

}
