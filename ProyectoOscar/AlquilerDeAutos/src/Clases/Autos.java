
package Clases;

public class Autos {
    private String id;
    private String marca;
    private String modelo;
    private String kilometraje;
    private String valorAlquiler;
    private String color;
    private String placa;
    private String transmision;
    private String tamaño;
    private String aire_acondicionado;
    private String fecha;
    private String estado;

    public Autos(String id,String marca, String modelo, String kilometraje, String valorAlquiler, String color, String placa, String transmision, String tamaño, String aire_acondicionado, String fecha,String estado){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.valorAlquiler = valorAlquiler;
        this.color = color;
        this.placa = placa;
        this.transmision = transmision;
        this.tamaño = tamaño;
        this.aire_acondicionado = aire_acondicionado;
        this.fecha = fecha;
        this.estado = estado;
    }
    
    public String getId() {
        return id;
    }
    
     public void setId(String id) {
        this.id = id;
    }
      
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getValorAlquiler() {
        return valorAlquiler;
    }

    public void setValorAlquiler(String valorAlquiler) {
        this.valorAlquiler = valorAlquiler;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getAire_acondicionado() {
        return aire_acondicionado;
    }

    public void setAire_acondicionado(String aire_acondicionado) {
        this.aire_acondicionado = aire_acondicionado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
