package Clases;

public class Administrador {
    
    private String cedula;
    private String nombre;
    private String contrasena;
    private String estado;

    public Administrador(String cedula, String nombre, String contrasena, String estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.estado = estado;
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

    public String getContraseña() {
        return contrasena;
    }

    public void setContraseña(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
