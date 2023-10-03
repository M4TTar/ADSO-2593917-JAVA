package Clases;
import java.sql.*;

public class DataBase {
    Statement manipularDB;
    
    public DataBase(){
        String hostname = "localhost";
        String puerto = "3306";
        String database_name = "alquiler";
        String database_user = "root";
        String database_password = "";
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+database_name;
        
        try{
            Connection conexion = DriverManager.getConnection(url, database_user, database_password);
            this.manipularDB = conexion.createStatement();
            System.out.println("Conexion Exitosa a: "+database_name);
        }catch(SQLException e){
            System.out.println("Error en conexion: "+e.getMessage());
            this.manipularDB = null;
        }
    }
  
    //--------------------------------------------SECCIÒN AUTOS-------------------------------------------//

    /* Metodo para ingresar un auto a la BD*/
    public boolean insertarAuto(String marca, String modelo, String kilometraje,String ValorAlquiler,  String color,  String numero_placa,  String transmision,String tamaño,String aire_acondicionado,String fecha,String estado){
        String consulta = "INSERT INTO autos(marca, modelo,kilometraje,ValorAlquiler,color, numero_placa,transmision,tamaño,aire_acondicionado,fecha,estado) VALUES ('"+marca+"','"+modelo+"','"+kilometraje+"','"+ValorAlquiler+"','"+color+"','"+numero_placa+"','"+transmision+"','"+tamaño+"','"+aire_acondicionado+"','"+fecha+"','"+estado+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    
    /*Metodo Para buscar un auto que esta ya registrado en la BD*/
    public Autos buscarAuto(String placa){
        Autos temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM autos WHERE numero_placa='"+placa+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Autos (registros.getString("id"), registros.getString("marca"),registros.getString("modelo"), registros.getString("kilometraje"), registros.getString("valorAlquiler"), registros.getString("color"), registros.getString("id"), registros.getString("transmision"), registros.getString("tamaño"), registros.getString("aire_acondicionado"), registros.getString("fecha"), registros.getString("estado"));
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    /*Metodo para editar productos*/
    public boolean editarAutos(Autos auto){
       boolean respuesta = false; 
       String id = auto.getId();
       String marca = auto.getMarca();
       String modelo = auto.getModelo();
       String kilometraje = auto.getKilometraje();
       String ValorAlquiler = auto.getValorAlquiler();
       String color = auto.getColor();
       String numero_placa = auto.getPlaca();
       String transmision = auto.getTransmision();
       String tamaño= auto.getTamaño();
       
       String aire_acondicionado = auto.getAire_acondicionado();
       String fecha= auto.getFecha();
        try {
            String consulta = "UPDATE autos SET id='"+id+"',marca='"+marca+"',modelo='"+modelo+"', kilometraje='"+kilometraje+"', ValorAlquiler='"+ValorAlquiler+"', color='"+color+"', numero_placa='"+numero_placa+"',transmision='"+transmision+"',tamaño='"+tamaño+"',aire_acondicionado='"+aire_acondicionado+"', fecha='"+fecha+"' WHERE numero_placa='"+numero_placa+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    /*Metodo para editar estado del auto*/
    public boolean editarEstado(Autos auto){
       boolean respuesta = false; 
       String id = auto.getId();
       String marca = auto.getMarca();
       String modelo = auto.getModelo();
       String kilometraje = auto.getKilometraje();
       String ValorAlquiler = auto.getValorAlquiler();
       String color = auto.getColor();
       String numero_placa = auto.getPlaca();
       String transmision = auto.getTransmision();
       String tamaño= auto.getTamaño();
       String aire_acondicionado = auto.getAire_acondicionado();
       String fecha= auto.getFecha();
       String estado = "A";
       
        try {
            String consulta = "UPDATE autos SET id='"+id+"', marca='"+marca+"',modelo='"+modelo+"', kilometraje='"+kilometraje+"', ValorAlquiler='"+ValorAlquiler+"', color='"+color+"', numero_placa='"+numero_placa+"',transmision='"+transmision+"',tamaño='"+tamaño+"',aire_acondicionado='"+aire_acondicionado+"', fecha='"+fecha+"', estado='"+estado+"' WHERE id='"+id+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    /*Metodo para editar estado del auto al momento de alquilar*/
    public boolean editarEstadoAlquilado(Autos auto){
       boolean respuesta = false; 
       String id = auto.getId();
       String marca = auto.getMarca();
       String modelo = auto.getModelo();
       String kilometraje = auto.getKilometraje();
       String ValorAlquiler = auto.getValorAlquiler();
       String color = auto.getColor();
       String numero_placa = auto.getPlaca();
       String transmision = auto.getTransmision();
       String tamaño= auto.getTamaño();
       String aire_acondicionado = auto.getAire_acondicionado();
       String fecha= auto.getFecha();
       String estado = "I";
       
        try {
            String consulta = "UPDATE autos SET id='"+id+"', marca='"+marca+"',modelo='"+modelo+"', kilometraje='"+kilometraje+"', ValorAlquiler='"+ValorAlquiler+"', color='"+color+"', numero_placa='"+numero_placa+"',transmision='"+transmision+"',tamaño='"+tamaño+"',aire_acondicionado='"+aire_acondicionado+"', fecha='"+fecha+"', estado='"+estado+"' WHERE numero_placa='"+numero_placa+"'";
            System.out.println(id);
            int resp = manipularDB.executeUpdate(consulta);
            System.out.println("2"+id);
            if (resp>0) {
                respuesta = true;
            }
            System.out.println("1"+numero_placa);
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    /*Metoodo Para Eliminar Un Auto De La BD*/
    public boolean eliminarAutos(Autos Auto){
        boolean respuesta=false;
        String placa =Auto.getPlaca();
        try {
                String consulta = "DELETE FROM autos WHERE numero_placa='"+placa+"' ";
                int resp_consulta = manipularDB.executeUpdate(consulta);
               if (resp_consulta==1) {
              respuesta = true;
       }
        } catch (SQLException ex) {
            System.out.println("--> Error Delete: " + ex.getMessage());
         }

        if (respuesta){
            System.out.println("Eliminado con exito");
         }else{
            System.out.println("No se pudo Eliminar");
        }
        return true;
    }
    
    /* Metodo Para listar los autos que ya estan registrados*/ 
    public Autos[] listaAutos(){
        Autos [] listaAutos = new Autos [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM autos");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Autos temp = new Autos( registros.getString("id"),registros.getString("marca"), registros.getString("modelo"), registros.getString("kilometraje"), registros.getString("valorAlquiler"), registros.getString("color"), registros.getString("numero_placa"), registros.getString("transmision"), registros.getString("tamaño"), registros.getString("aire_acondicionado"),registros.getString("fecha"),registros.getString("estado"));
                    listaAutos[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaAutos;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaAutos;
        }
    }
    
    /* Metodo Para listar los autos que estan ocupados*/ 
    public Autos[] listaAutosOcupados(){
        Autos [] listaAutos = new Autos [100];
        try{
            String I = "I";
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM autos WHERE estado='"+I+"'");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Autos temp = new Autos( registros.getString("id"),registros.getString("marca"), registros.getString("modelo"), registros.getString("kilometraje"), registros.getString("valorAlquiler"), registros.getString("color"), registros.getString("numero_placa"), registros.getString("transmision"), registros.getString("tamaño"), registros.getString("aire_acondicionado"),registros.getString("fecha"),registros.getString("estado"));
                    listaAutos[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaAutos;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaAutos;
        }
    }
    
    /* Metodo Para listar los autos que estan libres*/ 
    public Autos[] listaAutosLibres(){
        Autos [] listaAutos = new Autos [100];
        try{
            String A = "A";
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM autos WHERE estado='"+A+"'");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Autos temp = new Autos( registros.getString("id"),registros.getString("marca"), registros.getString("modelo"), registros.getString("kilometraje"), registros.getString("valorAlquiler"), registros.getString("color"), registros.getString("numero_placa"), registros.getString("transmision"), registros.getString("tamaño"), registros.getString("aire_acondicionado"),registros.getString("fecha"),registros.getString("estado"));
                    listaAutos[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaAutos;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaAutos;
        }
    }
    
    // Metodo para ingresarregistro de un alquiler a la BD
    public boolean insertarAlquiler( String nombre,String marca,String cedula, String telefono,String tiempo,String valor){
        String consulta = "INSERT INTO autos_clientes (nombre, marca_vehiculo, cedula,telefono,tiempo_alquiler,total_valor) VALUES ('"+nombre+"','"+marca+"','"+cedula+"','"+telefono+"','"+tiempo+"','"+valor+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    
    
    
    /*
    ------------------------------------------------------------ SECCION ADMINISTRADOR ------------------------------------------------------------
    */
    // Metodo para ingresar un administrador a la BD
    public boolean insertarAdmin(String cedula, String nombre, String contrasena,  String estado){
        String consulta = "INSERT INTO administrador (cedula, nombre,contrasena,estado) VALUES ('"+cedula+"','"+nombre+"','"+contrasena+"','"+estado+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }

    
    //Metodo Para buscar un administrador que ya esta registrado en la BD
    public Administrador buscarAdmin(String cedula){
        Administrador temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM administrador WHERE cedula='"+cedula+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Administrador ( registros.getString("cedula"),registros.getString("nombre"), registros.getString("contrasena"), registros.getString("estado"));
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public boolean validarAdmin(String cedula,String contrasena){
        boolean temp = false;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM administrador WHERE cedula='"+cedula+"' AND contrasena = '"+contrasena+"' " );
            registros.next();
            if (registros.getRow()==1) {
                temp =true;
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    //Metodo para editar administrador
    public boolean editarAdmin(Administrador admin){
        boolean respuesta = false;
        String cedula = admin.getCedula();
        String nombre = admin.getNombre();
        String contraseña = admin.getContraseña();
        String estado = admin.getEstado();
        
        try {
            String consulta = "UPDATE administrador SET  cedula='"+cedula+"', nombre='"+nombre+"', contrasena='"+contraseña+"', estado='"+estado+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    //Metoodo para eliminar un administrador de la BD
    public boolean eliminarAdmin (Administrador admin){
        boolean respuesta=false;
        String cedula =admin.getCedula();
        try {
             String consulta = "DELETE FROM administrador WHERE cedula='"+cedula+"' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
            respuesta = true;
        }
        } catch (SQLException e) {
         System.out.println("--> Error Delete: " + e.getMessage());
       }

         if (respuesta){
            System.out.println("Eliminado con exito");
          }else{
             System.out.println("No se pudo Eliminar");
          }
        return  true;
    }
    
    //Metodo para listar las facturas
    public Administrador[] listaAdmin(){
        Administrador listaAdministradores[] = new Administrador[100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM administrador");
            registros.next();
            
            if (registros.getRow()==1) {
               int  indice=0;
                do{
                    Administrador temp = new Administrador( registros.getString("cedula"),registros.getString("nombre"), registros.getString("contrasena"), registros.getString("estado"));
                    listaAdministradores[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaAdministradores;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaAdministradores;
        }   
    }
    
    /*
    ------------------------------------------------------------ SECCION CLIENTE ------------------------------------------------------------
    */
    
    // Metodo para ingresar un cliente a la BD
    public boolean insertarCliente(String cedula, String nombre, String telefono,  String correo, String direccion){
        String consulta = "INSERT INTO clientes (cedula, nombre,telefono,correo,direccion) VALUES ('"+cedula+"','"+nombre+"','"+telefono+"','"+correo+"','"+direccion+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    
    /* Metodo Para listar los autos que hemos usado*/ 
    public ListaAutosAlquilados[] listaAutosAlquilados(String nombre){
        ListaAutosAlquilados [] listaAutos = new ListaAutosAlquilados [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM autos_clientes WHERE cedula='"+nombre+"' ");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    ListaAutosAlquilados temp = new ListaAutosAlquilados(registros.getString("marca_vehiculo"), registros.getString("nombre"), registros.getString("cedula"), registros.getString("telefono"), registros.getString("tiempo_alquiler"), registros.getString("total_valor"));
                    listaAutos[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaAutos;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaAutos;
        }
    }
    
    //Metodo Para buscar un cliente que ya esta registrado en la BD
    public Persona buscarCliente(String cedula){
        Persona temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes WHERE cedula='"+cedula+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Persona ( registros.getString("cedula"),registros.getString("nombre"), registros.getString("telefono"), registros.getString("correo"), registros.getString("direccion"));
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    public Registro buscarClienteingresado(String nombre){
        Registro temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes WHERE cedula='"+nombre+"' ");
            registros.next();
            if (registros.getRow()==1) {
                    temp = new Registro ( registros.getString("nombre"));
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    
    public boolean validarCliente(String cedula,String contrasena){
        boolean temp = false;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes WHERE cedula='"+cedula+"' AND cedula = '"+contrasena+"' " );
            registros.next();
            if (registros.getRow()==1) {
                temp =true;
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    //Metodo para editar cliente
    public boolean editarCliente(Persona cliente){
        boolean respuesta = false;
        String cedula = cliente.getCedula();
        String nombre = cliente.getNombre();
        String telefono = cliente.getTelefono();
        String correo = cliente.getCorreo();
        String direccion = cliente.getDireccion();
        
        try {
            String consulta = "UPDATE clientes SET  cedula='"+cedula+"', nombre='"+nombre+"', telefono='"+telefono+"', correo='"+correo+"', direccion='"+direccion+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    //Metoodo para eliminar un cliente de la BD
    public boolean eliminarCliente (Persona cliente){
        boolean respuesta=false;
        String cedula =cliente.getCedula();
        try {
             String consulta = "DELETE FROM clientes WHERE cedula='"+cedula+"' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
            respuesta = true;
        }
        } catch (SQLException e) {
         System.out.println("--> Error Delete: " + e.getMessage());
       }

         if (respuesta){
            System.out.println("Eliminado con exito");
          }else{
             System.out.println("No se pudo Eliminar");
          }
        return  true;
    }
    
    //Metodo para listar las facturas
    public Persona[] listaPersona(){
        Persona listaPersona[] = new Persona[100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes");
            registros.next();
            
            if (registros.getRow()==1) {
               int  indice=0;
                do{
                    Persona temp = new Persona( registros.getString("cedula"),registros.getString("nombre"), registros.getString("telefono"), registros.getString("correo"), registros.getString("direccion"));
                    listaPersona[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaPersona;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaPersona;
        }   
    }
 
    
   
    
    /*
    public Producto buscarFacturas(){
        Producto temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM facturas");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Producto ( registros.getInt("id"),registros.getString("nombre"), registros.getString("descripcion"), registros.getInt("precio"), registros.getInt("cantidad"));
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    } 
    */
    
    /*Metoodo para agregar las facturas a la BD */
    public boolean insertarFactura(String id,String cedula_cliente,String cedula_vendedor, String fecha,String total){
        String consulta = "INSERT INTO facturas (id,cedula_cliente,cedula_vendedor,fecha,total)  VALUES ('"+id+"','"+cedula_cliente+"','"+cedula_vendedor+"','"+fecha+"','"+total+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("FACTURA REGISTRADA CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al registar: "+e.getMessage());
            return false;
        }
    }
    
    /*Metoodo para agregar  datos a items_factura a la BD */
    /*
    public boolean insertarItemsFactura(itemsFactura factura_productos []){
           
        try{
            for (int i = 0; i < factura_productos.length; i++) {
                if (factura_productos[i] != null) {
                    itemsFactura var = factura_productos[i];
                    String id_factura = var.getId_factura();
                    String id_producto = var.getId_producto();
                    String cantidad = var.getCantidad();
                    String id_subtotal = var.getSubtotal();
                    String consulta = "INSERT INTO items_factura(id_factura, id_producto,cantidad,subtotal)  VALUES ('"+id_factura+"','"+id_producto+"','"+cantidad+"','"+id_subtotal+"') ";
                    int respuesta = manipularDB.executeUpdate(consulta);
                } else {
                    break;
                } 
            }
        }catch(SQLException e){
            System.out.println("Error al registar: "+e.getMessage());
            return false;
        }
        return false;
    }
    */
    
    /*Extraer id de las facturas en orden Decendente*/
    public String extraerID(){
        
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM autos ORDER BY id DESC");
            registros.next();
            if (registros.getRow()==1) {
              return String.valueOf(registros.getInt("id")+1);
            }
            return "1";
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return "1"; 
        }  
    }
    
    /*
    public itemsFactura[] imprimirProductos(String id_factura){
        itemsFactura temp = null;
        itemsFactura prod [] = new itemsFactura [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM items_Factura WHERE id_factura='"+id_factura+"' ");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    temp = new itemsFactura( registros.getString("id_factura"),registros.getString("id_producto"), registros.getString("cantidad"),registros.getString("subtotal"));
                    prod[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return prod;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return prod;
        }
    }
*/
}
