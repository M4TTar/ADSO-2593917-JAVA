public class Personas{

    // Atributos - caracteristicas
     public int cedula;
     public String nombres;
     public String apellidos;
     public String direccion;
     public String telefono;
     public String email;
     public int altura;
     private String password;
   
     // Metodos - acciones o funciones 
     //constructores...
     public Personas(){
       this.cedula = 0;
       this.nombres = "";
       this.apellidos = "";
       this.direccion = "";
       this.telefono = "";
       this.email = ""; 
       this.altura = 0;
       this.password = "";
   
     }
   
     public Personas(int cedula, String nombres, String apellidos, String direccion, String telefono, String email, int altura){
       this.cedula = cedula;
       this.nombres = nombres;
       this.apellidos =  apellidos;
       this.direccion = direccion;
       this.telefono = telefono;
       this.email = email;
       this.altura = altura;
       this.password = String.valueOf(cedula);
   
     }
     public Personas(int cedula, String nombres, String apellidos){
       this.cedula = cedula;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.direccion = "";
       this.telefono = "";
       this.email = "";
       this.altura = 0;
   
     }
     public int getCedula(){
        return this.cedula;
      }
      public void setCedula(int new_cedula){
        this.cedula = new_cedula;
      }
      public String getNombres(){
        return this.nombres;
      }
      public void setNombres(String new_nombres){
        this.nombres = new_nombres;
      }
      public String getApellidos(){
        return this.apellidos;
      }
      public void setApellidos(String new_apellidos){
        this.apellidos = new_apellidos;
      }
      public String getDireccion(){
        return this.direccion;
      }
      public void setDireccion(String new_direccion){
        this.direccion = new_direccion;
      }
      public String getTelefono(){
        return this.telefono;
      }
      public void setTelefono(String new_telefono){
        this.telefono = new_telefono;
      }
      public String getEmail(){
        return this.email;
      }
      public void setEmail(String new_email){
        this.email = new_email;
      }
      public int getAltura(){
        return this.altura;
      }
      public void setAltura(int new_altura){
        this.altura = new_altura;
      }
      public boolean setPassword(String old_pass, String new_pass) {
        if (old_pass.equals(this.password)) {
          this.password = new_pass;
          return true;

        }else{
          System.out.println(" -> contraseña incorrecta ");
          return false;
        }
      }
   
     public void imprimirPresentacion(){
       System.out.println("----------------------------");
       System.out.println("--DATOS PERSONA           --");
       System.out.println("----------------------------");
       System.out.println("| cedula:"+this.cedula);
       System.out.println("| nombres:"+this.nombres);
       System.out.println("| apellidos:"+this.apellidos);
       System.out.println("| direcion:"+this.direccion);
       System.out.println("| telefono:"+this.telefono);
       System.out.println("| email:"+this.email);
       System.out.println("| altura:"+this.altura);
       System.out.println("-----------------------------");
         
     }
     public void imprimirResumen(){
      System.out.println(this.cedula + this.nombres + this.apellidos);

     }
   
   }
