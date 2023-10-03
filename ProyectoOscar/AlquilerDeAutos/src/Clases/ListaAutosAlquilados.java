
package Clases;

public class ListaAutosAlquilados {

    private String marca_vehiculo;
    private String nombre;
    private String cedula;
    private String telefono;
    private String tiempo_alquiler;
    private String total_valor;
    
    public ListaAutosAlquilados(String marca_vehiculo, String nombre, String cedula, String telefono, String tiempo_alquiler, String total_valor) {
        this.marca_vehiculo = marca_vehiculo;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.tiempo_alquiler = tiempo_alquiler;
        this.total_valor = total_valor;
    }
    
    
    public String getMarca_vehiculo() {
        return marca_vehiculo;
    }

    public void setMarca_vehiculo(String marca_vehiculo) {
        this.marca_vehiculo = marca_vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTiempo_alquiler() {
        return tiempo_alquiler;
    }

    public void setTiempo_alquiler(String tiempo_alquiler) {
        this.tiempo_alquiler = tiempo_alquiler;
    }

    public String getTotal_valor() {
        return total_valor;
    }

    public void setTotal_valor(String total_valor) {
        this.total_valor = total_valor;
    }

}
