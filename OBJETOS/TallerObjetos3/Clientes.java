public class Clientes {
    // Atributos
    private long cedula;
    private String nombres;
    private String apellidos;
    private long telefono; 
    
    // Metodos

    public Clientes(long cedula, String nombres, String apellidos, long telefono){
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public long getCedula(){
        return this.cedula;
    }

    public String getNombres(){
        return this.nombres;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public long getTelefono(){
        return this.telefono;
    }

    public void setCedula(long cedula){
        this.cedula = cedula;
    }

    public void setNombres(String nombres){
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public void setTelefono(long telefono){
        this.telefono = telefono;
    }

    // public boolean serPassword(String old_pass, String new_pass){
    // }

    public void mostrarDatosPersonales(){
        System.out.print("| cedula: "+this.cedula);
        System.out.print("| nombres: "+this.nombres);
        System.out.print("| apellidos: "+this.apellidos);
        System.out.print("| telefono: "+this.telefono);
    }

    public void resumen(){
        System.out.println("|| ========================================================================================== ||");
        System.out.println("|| = Identificado con cedula: "+this.cedula+ " Nombre: "+this.nombres.concat(" "+this.apellidos)+" = ||");
        System.out.println("|| ========================================================================================== ||");
    }

}