package Clases;

import java.sql.*;

public class DataBase {
    
    Statement manipularDB;
    
    public DataBase(){
        String hostname = "localhost";
        String puerto = "3306";
        String database_name = "almacenes";
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
    
    public Persona[] listaClientes(){
        Persona [] listaClientes = new Persona [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Persona temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
                    listaClientes[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaClientes;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaClientes;
        }
    }
    
    public Persona[] listaVendedores(){
        Persona [] listaClientes = new Persona [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM vendedores");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Persona temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
                    listaClientes[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaClientes;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaClientes;
        }
    }
    
    /* Metodo para listar los productos que estan en la base de datos */
    public Producto [] listaProductos(){
        Producto [] listaProductos = new Producto [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM productos");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Producto temporal = new Producto( registros.getInt("id"),registros.getString("nombre"), registros.getString("descripcion"), registros.getInt("precio"), registros.getInt("cantidad") );
                    listaProductos[indice] = temporal;
                    indice++;
                }while(registros.next());
            }
            return listaProductos;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaProductos;
        }
    }
    
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
    
    public Persona buscarCliente(String cedula){
        Persona temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes WHERE cedula='"+cedula+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public Persona buscarVendedor(String cedula){
        Persona temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM vendedores WHERE cedula='"+cedula+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    /*Buscar Producto */
    public Producto buscarProducto(int id){
        Producto temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM productos WHERE id='"+id+"' ");
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
    
    public boolean editarCliente(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String nombres = persona.getNombres();
        String apellidos = persona.getApellidos();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String email = persona.getEmail();
        
        try {
            String consulta = "UPDATE clientes SET nombres='"+nombres+"', apellidos='"+apellidos+"', telefono='"+telefono+"', direccion='"+direccion+"', email='"+email+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean editarVendedor(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String nombres = persona.getNombres();
        String apellidos = persona.getApellidos();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String email = persona.getEmail();
        
        try {
            String consulta = "UPDATE vendedores SET nombres='"+nombres+"', apellidos='"+apellidos+"', telefono='"+telefono+"', direccion='"+direccion+"', email='"+email+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    /*Metodo para editar productos*/
    public boolean editarProductos(Producto producto){
        boolean respuesta = false;
        int id = producto.getId();
        String nombre = producto.getNombre();
        String descripcion = producto.getDescripcion();
        int  precio = producto.getPrecio();
        int   cantidad = producto.getCantidad();
        
        try {
            String consulta = "UPDATE productos SET  nombre='"+nombre+"', descripcion='"+descripcion+"', precio='"+precio+"', cantidad='"+cantidad+"' WHERE id='"+id+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean insertarCliente(String cedula, String nombres, String apellidos, String telefono, String direccion, String email){
        String consulta = "INSERT INTO clientes(cedula, nombres, apellidos, telefono, direccion, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"') ";    
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
    
    public boolean insertarVendedor(String cedula, String nombres, String apellidos, String telefono, String direccion, String email){
        String consulta = "INSERT INTO vendedores(cedula, nombres, apellidos, telefono, direccion, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"') ";    
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
    
    
    /*Metoodo para agregar un producto  a la BD */
    public boolean insertarProducto(String id,String nombre,String descripcion, String precio,String cantidad){
        String consulta = "INSERT INTO productos (id, nombre,descripcion,precio,cantidad)  VALUES ('"+id+"','"+nombre+"','"+descripcion+"','"+precio+"','"+cantidad+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("PRODUCTO REGISTRADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al registar: "+e.getMessage());
            return false;
        }
    }
    
    
    
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
    
    
    
  
    /*Metoodo para eliminar un cliente de la BD */
    public boolean eliminarCliente (Persona persona){
        boolean respuesta=false;
        String cedula =persona.getCedula();
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
        
    
    
    /*Metoodo Para Eliminar Un Vendedor De La BD */
    public boolean eliminarVendedor (Persona persona){
        boolean respuesta=false;
         String cedula =persona.getCedula();
        try {
                String consulta = "DELETE FROM vendedores WHERE cedula='"+cedula+"' ";
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
    /*Metoodo para eliminar un producto de la BD */
    public boolean eliminarProducto (Producto producto){
        boolean respuesta=false;
        int id =producto.getId();
        try {
            String consulta = "DELETE FROM productos WHERE id='"+id+"' ";
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
    
    
    /*Metodo para listar las facturas*/
    public Factura[] listarFacturas(){
        Factura listaFactura[] = new Factura [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM facturas");
            registros.next();
            
            if (registros.getRow()==1) {
               int  indice=0;
                do{
                    Factura temp = new Factura( registros.getString("id"),registros.getString("cedula_cliente"), registros.getString("cedula_vendedor"), registros.getString("fecha"), registros.getString("total"));
                    listaFactura[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaFactura;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaFactura;
        }   
    }
    
    /*Extraer id de las facturas en orden Decendente*/
    public String extraerID(){
        
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM facturas ORDER BY id DESC");
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
    
}

