package ModuloFacturas;

import Clases.Factura;
import Clases.Persona;
import Clases.Producto;
import Clases.itemsFactura;
import Principal.Alert;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;
import Principal.Menu;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class CrearFactura extends JFrame{
    private JLabel etqTemporal;
    Menu ventanaMenu;
    private int contador = 0;
    private int total;
    private String idFactura;
    private int num = 0;
    private itemsFactura itemsFactura [];
    private int iteradora;
    
    // Metodos
    public CrearFactura(Menu ventanaMenu, Persona[] listaClientes, Persona[] listaVendedores, Producto[] listaProductos){
        this.ventanaMenu = ventanaMenu;
        this.listaClientes = listaClientes;
        this.listaVendedores = listaVendedores;
        this.listaProductos = listaProductos;
        this.itemsFactura = new itemsFactura [100];
        this.iteradora = 0;
        this.total =0;
        this.idFactura = this.ventanaMenu.database.extraerID();
        initComponent(); 
    }

    public void initComponent(){
        Toolkit sistema = Toolkit.getDefaultToolkit();
        Dimension tamanio = sistema.getScreenSize();

        setTitle("FACTURA");
        setSize( ((int) (tamanio.width*0.4)) , ((int) (tamanio.height*0.9)) );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLocationRelativeTo(null);
        
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );

        JPanel contPrincipal = new JPanel();
        contPrincipal.setLayout(new GridBagLayout());
        contPrincipal.setBorder( BorderFactory.createEmptyBorder(20, 20, 20, 10) );
        GridBagConstraints restriccion = new GridBagConstraints();

        etq_datos_cliente = new JLabel("DATOS CLIENTE:");
        etq_datos_cliente.setFont( new Font("Arial", Font.BOLD, 20) );
        etq_datos_cliente.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
        restriccion.gridy = 0;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 2;
        restriccion.weightx = 90;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_datos_cliente, restriccion );
        
     
        
        etq_cedula_cliente = new JLabel("CEDULA:");
        restriccion.gridy = 1;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_cedula_cliente, restriccion );

        input_cedula_cliente = new JTextField();
        input_cedula_cliente.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
        restriccion.gridy = 1;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 2;
        restriccion.weighty = 2;
        restriccion.weightx = 80;
        restriccion.insets = new Insets(0, 10, 0, 10);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( input_cedula_cliente, restriccion );

        btn_buscar_cliente = new JButton("BUSCAR");
        restriccion.gridy = 1;
        restriccion.gridx = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( btn_buscar_cliente, restriccion );
     

        etq_nombres_cliente = new JLabel("NOMBRES:");
        restriccion.gridy = 2;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(10, 0, 10, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_nombres_cliente, restriccion );

        input_nombres_cliente = new JTextField();
        input_nombres_cliente.setEditable(false);
        input_nombres_cliente.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
        restriccion.gridy = 2;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 3;
        restriccion.weighty = 2;
        restriccion.weightx = 90;
        restriccion.insets = new Insets(10, 10, 10, 10);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( input_nombres_cliente, restriccion );

        etq_direccion_cliente = new JLabel("DIRECCION:");
        restriccion.gridy = 3;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 0, 10, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_direccion_cliente, restriccion );

        input_direccion_cliente = new JTextField();
        input_direccion_cliente.setEditable(false);
        input_direccion_cliente.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
        restriccion.gridy = 3;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 3;
        restriccion.weighty = 2;
        restriccion.weightx = 90;
        restriccion.insets = new Insets(0, 10, 10, 10);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( input_direccion_cliente, restriccion );

        /*
                - Seccion vendedor
        */
        etq_datos_vendedor = new JLabel("DATOS VENDEDOR:");
        etq_datos_vendedor.setFont( new Font("Arial", Font.BOLD, 20) );
        etq_datos_vendedor.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
        restriccion.gridy = 4;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 2;
        restriccion.weightx = 100;
        restriccion.insets = new Insets(10, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_datos_vendedor, restriccion );

        etq_vendedor_cliente = new JLabel("CEDULA:");
        restriccion.gridy = 5;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_vendedor_cliente, restriccion );

        input_cedula_vendedor = new JTextField();
        input_cedula_vendedor.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
        restriccion.gridy = 5;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 2;
        restriccion.weighty = 2;
        restriccion.weightx = 80;
        restriccion.insets = new Insets(0, 10, 0, 10);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( input_cedula_vendedor, restriccion );

        btn_buscar_vendedor = new JButton("BUSCAR");
        restriccion.gridy = 5;
        restriccion.gridx = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( btn_buscar_vendedor, restriccion );

        etq_nombres_vendedor = new JLabel("NOMBRES:");
        restriccion.gridy = 6;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(10, 0, 10, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_nombres_vendedor, restriccion );

        input_nombres_vendedor = new JTextField();
        input_nombres_vendedor.setEditable(false);
        input_nombres_vendedor.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
        restriccion.gridy = 6;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 3;
        restriccion.weighty = 2;
        restriccion.weightx = 90;
        restriccion.insets = new Insets(10, 10, 10, 10);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( input_nombres_vendedor, restriccion );

        /*
                - Seccion Productos
        */
        etq_datos_productos = new JLabel("LISTA PRODUCTOS FACTURADOS:");
        etq_datos_productos.setFont( new Font("Arial", Font.BOLD, 20) );
        etq_datos_productos.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
        restriccion.gridy = 7;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 2;
        restriccion.weightx = 100;
        restriccion.insets = new Insets(10, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_datos_productos, restriccion );

        etq_id_producto = new JLabel("ID");
        etq_id_producto.setHorizontalAlignment( JLabel.CENTER );
        restriccion.gridy = 8;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_id_producto, restriccion );

        etq_nombre_producto = new JLabel("NOMBRE");
        etq_nombre_producto.setHorizontalAlignment( JLabel.CENTER );
        restriccion.gridy = 8;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 70;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_nombre_producto, restriccion );

        etq_cant_producto = new JLabel("CANT.");
        etq_cant_producto.setHorizontalAlignment( JLabel.CENTER );
        restriccion.gridy = 8;
        restriccion.gridx = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_cant_producto, restriccion );

        etq_btn_producto = new JLabel();
        restriccion.gridy = 8;
        restriccion.gridx = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_btn_producto, restriccion );


        input_id_producto = new JTextField();
        input_id_producto.setHorizontalAlignment(JLabel.CENTER);
        restriccion.gridy = 9;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( input_id_producto, restriccion );

        input_nombre_producto = new JTextField();
        input_nombre_producto.setEditable(false);
        input_nombre_producto.setHorizontalAlignment(JLabel.CENTER);
        restriccion.gridy = 9;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 70;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( input_nombre_producto, restriccion );

        input_cant_producto = new JTextField();
        input_cant_producto.setHorizontalAlignment(JLabel.CENTER);
        restriccion.gridy = 9;
        restriccion.gridx = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( input_cant_producto, restriccion );

        btn_add_producto = new JButton("ADD");
        restriccion.gridy = 9;
        restriccion.gridx = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 10, 0, 10);
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( btn_add_producto, restriccion );
        
        
        //Seccion factura
        
        etq_resultado = new JTextArea();
        etq_resultado.setEditable(false);
        etq_resultado.setLayout( new BoxLayout(  etq_resultado, BoxLayout.Y_AXIS) );
        etq_resultado.setOpaque(true);
        etq_resultado.setBackground(Color.white);

        JScrollPane scrollPane = new JScrollPane(etq_resultado);
        scrollPane.setPreferredSize( contPrincipal.getSize() );

        restriccion.gridx = 0;
        restriccion.gridy = 10;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 90;
        restriccion.weightx = 100;
        restriccion.fill = (GridBagConstraints.BOTH);
        restriccion.insets = new Insets(10,0,0,10);
        contPrincipal.add(scrollPane, restriccion);

 

        etq_total = new JLabel();
        etq_total.setHorizontalAlignment( JLabel.RIGHT );
        etq_total.setFont( new Font("Arial", Font.BOLD, 20) );
        etq_total.setOpaque(true);
        etq_total.setBackground( Color.white );
        etq_total.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
        restriccion.gridy = 11;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 2;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 0, 10);
        contPrincipal.add( etq_total, restriccion );
        
        etq_id_factura = new JTextField(idFactura);
        etq_id_factura.setEditable(false);
        etq_id_factura.setFont( new Font("Arial", Font.BOLD, 20) );
        etq_id_factura.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
        restriccion.gridy = 12;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add( etq_id_factura, restriccion );
        
        
        
        
        JButton btn_atras = new JButton("ATRAS");
        restriccion.gridy = 12;
        restriccion.gridx = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(10, 0, 0, 0);
        contPrincipal.add(btn_atras, restriccion);
        
        JButton btn_registrar = new JButton("REGISTRAR");
        restriccion.gridy = 12;
        restriccion.gridx = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 2;
        restriccion.weightx = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(10, 10, 0, 10);
        contPrincipal.add(btn_registrar, restriccion);
        add( contPrincipal );
        setResizable(false);
        setVisible(true);
        revalidate();
        repaint();
        
        
        ActionListener eventoAtras = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaMenu.setVisible(true);
                dispose();
            }
        };
        btn_atras.addActionListener(eventoAtras); 
        
                KeyListener eventoKeyBuscarProducto = new KeyListener(){
            public void keyPressed(KeyEvent e){
            }

            public void keyReleased(KeyEvent e){
                String texto = input_id_producto.getText();
                if(texto.equalsIgnoreCase("")){
                    input_nombre_producto.setText("");
                    input_cant_producto.setText("");
                }

                if (e.getKeyCode()==10) {
                    buscarProducto();
                }else if (e.getKeyCode()==8) {
                        input_nombre_producto.setText("");
                    input_cant_producto.setText("");
                    deshabilitarInput(input_nombre_producto);
                }else if (e.getKeyCode()!=16){
                        input_nombre_producto.setText("");
                    input_cant_producto.setText("");
                    deshabilitarInput(input_nombre_producto);
                    buscarProducto();
                }
            }

            public void keyTyped(KeyEvent e){
            }
        };
        input_id_producto.addKeyListener(eventoKeyBuscarProducto);
        
        
        
        
        btn_buscar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_clienteActionPerformed(evt);
            }
        });
        
        btn_buscar_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_vendedorActionPerformed(evt);
            }
        });
        
        btn_add_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               btn_add_productoActionPerformed(evt);
            }
        });
        
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
       
    }

    public boolean validarNumero(String texto){
        int contador = 0;
        for (int i=0; i<texto.length(); i++) {
                int codigo = (int) texto.charAt(i);
                if ((codigo<48 || codigo>57) && codigo!=44 && codigo!=45 && codigo!=46){
                        return false;
                }
                if (codigo==44 || codigo==46){
                        contador++;
                }
        }
        return (contador<=1);
    }

    public String formatoMoneda(String texto){
        Double numero = Double.parseDouble(texto.replace(",","."));
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        return formatoMoneda.format(numero).replaceAll(",00","");
    }
    
    //Buscar Clientes en la BD
    private void btn_buscar_clienteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String cedula = input_cedula_cliente.getText();
        Persona temporal = this.ventanaMenu.database.buscarCliente(cedula);
        
        if (temporal != null) {
            input_nombres_cliente.setText(temporal.getNombres());
            input_direccion_cliente .setText(temporal.getDireccion());
            this.input_cedula_vendedor.requestFocus();
        }else{
            Alert alerta = new Alert("NO EXISTE", "La cedula no esta registrada.", "error");
            input_cedula_cliente.setText("");
            input_nombres_cliente.setText("");
            input_direccion_cliente.setText("");
            this.input_cedula_cliente.requestFocus();
        }
    } 
    
    
    //Metodo para buscra vendedor en la BD
    private void btn_buscar_vendedorActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String cedula = input_cedula_vendedor.getText();
        Persona temporal = this.ventanaMenu.database.buscarVendedor(cedula);
        
        if (temporal != null) {
            input_nombres_vendedor.setText(temporal.getNombres());
            this.input_id_producto.requestFocus();
        }else{
            Alert alerta = new Alert("NO EXISTE", "La cedula no esta registrada.", "error");
            input_cedula_vendedor.setText("");
            input_nombres_vendedor.setText("");;
            this.input_cedula_vendedor.requestFocus();
        }
    } 
    
    
    //Metodo para buscar producto en la BD
    public void buscarProducto(){
        String id = input_id_producto.getText();
        Producto temporal =this.ventanaMenu.database.buscarProducto(Integer.valueOf( id));
        
        if (temporal != null) {
            input_nombre_producto.setText(temporal.getNombre());
            this.input_cant_producto.requestFocus();
        }else{
            input_id_producto.setText("");
            input_nombre_producto.setText("NO EXISTE");
            input_cant_producto.setText("");
            input_id_producto.requestFocus();
        }
    }
    
    private void  btn_add_productoActionPerformed(java.awt.event.ActionEvent evt) {  
        String id= input_id_producto.getText();
        String nombre = input_nombre_producto.getText();
        String cantidad = input_cant_producto.getText();
        String productos [];
        if(id!=null && nombre!=null && cantidad!=null){
            contador++;
            Producto precio =   this.ventanaMenu.database.buscarProducto(Integer.valueOf(id));
            int subtotal = precio.getPrecio();
            total += Integer.valueOf(cantidad)  * subtotal;
            String todo = contador+"="+id+"-"+nombre+"-"+cantidad+"-"+subtotal+"\n";
            etq_total.setText(String.valueOf(total));
            etq_resultado.append(todo);
            itemsFactura factura_productos = new itemsFactura(this.idFactura, id, cantidad, String.valueOf(subtotal)); 
            itemsFactura[iteradora] = factura_productos;
            iteradora++;
            input_id_producto.setText("");
            input_nombre_producto.setText("");
            input_cant_producto.setText("");
            input_id_producto.requestFocus();
        } 
    } 
    
  
    
    private void  btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fechaActual = new Date();
        String fechaFormateada = dateFormat.format(fechaActual);
        
        String id =etq_id_factura.getText();
        String cedula_cliente = input_cedula_cliente.getText();
        String cedula_vendedor =  input_cedula_vendedor.getText();
        String fecha = fechaFormateada;
        String total = this.etq_total.getText();
        
        if (!id.equals("") && !cedula_cliente.equals("") && !cedula_vendedor.equals("") && !fecha.equals("") && !total.equals("")) {
            boolean repetido =false;
            if (!repetido) {
                boolean proceso = this.ventanaMenu.database.insertarFactura(id, cedula_cliente,cedula_vendedor,fecha,total);
                this.ventanaMenu.setVisible(true);
                Alert alerta = new Alert("CORRECTO", "LA FACTURA A SIDO CREADA.", "success");
                dispose();
            }
            
        }else{
            Alert alerta = new Alert("Datos Inválidos", "Todos los campos son obligatorios.", "error");
            validarTodosInputs();
        }
        this.ventanaMenu.database.insertarItemsFactura(itemsFactura);
    }  
    
    
    public void validarTodosInputs(){
        validarInput( input_cedula_cliente);
        validarInput( input_cedula_cliente);
        //validarInput(input_id_producto);
        //validarInput( input_cant_producto);
    }
    
        
    public void validarInput(JTextField campo){
        if (campo.getText().equals("")) {
            Border borderColor = new LineBorder(Color.RED, 1, true);
            Border borderPadding = new EmptyBorder(2,5,2,5);
            Border borderRojo = new CompoundBorder(borderColor, borderPadding);
            campo.setBorder(borderRojo);
            campo.requestFocus();
        }else{
            JTextField referencia = new JTextField();
            campo.setBorder( referencia.getBorder() );
        }
    }

    public void deshabilitarInput(JTextField input){
        input.setEditable(false);
        input.setEnabled(false);
        input.setDisabledTextColor(Color.black);
    }

    public void habilitarInput(JTextField input){
        input.setText("");
        input.setEditable(true);
        input.setEnabled(true);
    }
    
 
    // Atributos
    private Persona listaClientes [];
    private Persona listaVendedores [];
    private Producto listaProductos [];
    private JLabel etq_datos_cliente;
    private JLabel etq_cedula_cliente;
    private JLabel etq_nombres_cliente;
    private JLabel etq_direccion_cliente;
    private JLabel etq_datos_vendedor;
    private JLabel etq_vendedor_cliente;
    private JLabel etq_nombres_vendedor;
    private JLabel etq_datos_productos;
    private JLabel etq_id_producto;
    private JLabel etq_nombre_producto;
    private JLabel etq_cant_producto;
    private JLabel etq_btn_producto;
    private JTextArea etq_resultado;
    private JLabel etq_total;
    private JTextField etq_id_factura;
    private JTextField input_cedula_cliente;
    private JTextField input_nombres_cliente;
    private JTextField input_direccion_cliente;
    private JTextField input_cedula_vendedor;
    private JTextField input_nombres_vendedor;
    private JTextField input_id_producto;
    private JTextField input_nombre_producto;
    private JTextField input_cant_producto;
    private JButton btn_buscar_cliente;
    private JButton btn_buscar_vendedor;
    private JButton btn_add_producto;
    

}